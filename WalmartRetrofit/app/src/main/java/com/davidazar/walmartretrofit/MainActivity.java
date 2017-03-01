package com.davidazar.walmartretrofit;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.davidazar.walmartretrofit.model.ProductRequest;
import com.davidazar.walmartretrofit.model.ProductResponse;
import com.davidazar.walmartretrofit.model.ProductSearchResponse;
import com.davidazar.walmartretrofit.network.ApiServiceGenerator;
import com.davidazar.walmartretrofit.network.WalmartApi;
import com.davidazar.walmartretrofit.util.StringUtils;
import com.davidazar.walmartretrofit.views.adapters.SearchResultAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements TextView.OnEditorActionListener {


    private ProgressBar mProgressBar;
    private EditText mSearchQueryEditText;

    private RecyclerView mList;
    private SearchResultAdapter mListAdapter;


    /**
     * Referencia a la interfaz de los endpoints REST
     */
    private WalmartApi mClient;


    /**
     * Objeto que nos permite cancelar peticiones, entre otros..
     */
    private Call<ProductSearchResponse> mCall;


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);


        mClient = ApiServiceGenerator.createService(WalmartApi.class);

        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mSearchQueryEditText = (EditText) findViewById(R.id.search_query_edit_text);
        mList = (RecyclerView) findViewById(R.id.productList);

        mListAdapter = new SearchResultAdapter();
        mList.setAdapter(mListAdapter);
        mList.setLayoutManager(new GridLayoutManager(this,3, LinearLayoutManager.VERTICAL,false));

        mSearchQueryEditText.setOnEditorActionListener(this);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mCall.cancel();
    }

    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_SEARCH) {
            search();
            dismissKeyboard();
            return true;
        }
        return false;
    }


    private void search() {

        mProgressBar.setVisibility(View.VISIBLE);
        mList.setVisibility(View.INVISIBLE);

        String timestamp = StringUtils.getTimestamp();
        String query = mSearchQueryEditText.getText().toString();
        ProductRequest productRequest = new ProductRequest(query);
        mCall = mClient.searchProductInGR(timestamp, productRequest);
        mCall.enqueue(mRetrofitCallback);

    }

    private void dismissKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != getCurrentFocus())
            imm.hideSoftInputFromWindow(getCurrentFocus().getApplicationWindowToken(), 0);
    }


    /**
     * Clase anonima que manejara las respuestas de Retrofit. Separar esta implementacion de mCall.equeue()
     * permite tener metodos mas limpios.
     */
    private Callback mRetrofitCallback = new Callback<ProductSearchResponse>() {
        @Override
        public void onResponse(Call<ProductSearchResponse> call, Response<ProductSearchResponse> response) {

            mProgressBar.setVisibility(View.INVISIBLE);
            mList.setVisibility(View.VISIBLE);

            Log.d(TAG, "onResponse");

            if (response.isSuccessful()) {

                if(response.body().getCodeMessage() == -1){
                    Toast.makeText(MainActivity.this,"Articulo no encontrado",Toast.LENGTH_SHORT).show();
                    return;
                }
                List<ProductResponse> data = response.body().getResponseArray();
                mListAdapter.setData(data);
            }

        }

        @Override
        public void onFailure(Call<ProductSearchResponse> call, Throwable t) {

            mProgressBar.setVisibility(View.INVISIBLE);
            t.printStackTrace();
            Toast.makeText(MainActivity.this, "Favor de intentarlo de nuevo", Toast.LENGTH_SHORT).show();

        }
    };

}
