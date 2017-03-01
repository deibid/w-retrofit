package com.davidazar.walmartretrofit.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.davidazar.walmartretrofit.R;
import com.davidazar.walmartretrofit.model.ProductResponse;
import com.davidazar.walmartretrofit.util.StringUtils;

import java.util.List;

/**
 * Created by David on 28/02/17.
 */

public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder> {


    private List<ProductResponse> mData;


    public void setData(List<ProductResponse> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_search_list_item, parent, false);

        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ProductResponse product = mData.get(position);


        holder.productPrice.setText("$"+StringUtils.formatStringToUnicode(String.valueOf(product.getPrice())));
        holder.productDescription.setText(StringUtils.formatStringToUnicode(product.getDescription()));

        Glide.with(holder.productImage.getContext())
                .load(product.getImageUrl())
                .fitCenter()
                .crossFade()
                .into(holder.productImage);


    }

    @Override
    public int getItemCount() {
        return (mData != null) ? mData.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        ImageView productImage;
        TextView productDescription;
        TextView productPrice;

        public ViewHolder(View itemView) {
            super(itemView);

            productImage = (ImageView) itemView.findViewById(R.id.product_image);
            productDescription = (TextView) itemView.findViewById(R.id.product_description);
            productPrice = (TextView) itemView.findViewById(R.id.product_price);

        }
    }
}
