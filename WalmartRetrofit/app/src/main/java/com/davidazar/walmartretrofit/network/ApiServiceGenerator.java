package com.davidazar.walmartretrofit.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by David Azar
 *
 * Clase que inicializa el cliente REST de Retrofit.
 * Al exponerlo de esta manera, solo se crea un objeto, el cual puede ser accesado desde toda
 * el app.
 * Todas las peticiones pasan por aqui y eso nos permite tener un codigo mas ordenado y eficiente.
 *
 * Esta clase puede desarrollarse para cumplir sus necesidades, pero ya incluyo un Interceptor para
 * poder loggear las transacciones e incluyo ejemplo de como configurar a Retrofit para peticiones en
 * paralelo. Les recomiedo que prueben con esta implementacion, sin agregar mas peticiones en paralelo
 * y vean como les funciona, Retrofit maneja inteligentemente los procesos de cada peticion
 */

public class ApiServiceGenerator {


    private static final String BASE_URL = "https://www.walmartmobile.com.mx";


    private static Retrofit retrofit;

    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create());


    /**
     * Clase que permite registrar y loggear cada transacción de http que pase por Retrofit
     */
    private static HttpLoggingInterceptor logging =
            new HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient.Builder httpClient =
            new OkHttpClient.Builder();


    /**
     * Esta clase nos permite modificar el numero de procesos en paralelo que se realizan en OkHttp
     * en caso de ser necesario.
     * En la sesión de Background platicaremos de esto y de otras estrategias para lograr peticiones
     * en paralelo de to_do tipo.
     */
//    private static Dispatcher dispatcher = new Dispatcher();


    /**
     * Metodo generico que devuelve un cliente a cualquier interface que le pasemos.
     * Para casos en donde se deseen tener multiples Interfaces con diferentes servicios
     *
     * @param serviceClass interface que contiene los metodos de http a realizar
     * @param <S>          variable generica
     * @return cliente accionable con Retrofit
     */
    public static <S> S createService(Class<S> serviceClass) {

        if (retrofit == null) {
            httpClient.addInterceptor(logging);         //agremos el interceptor para logs
            // dispatcher.setMaxRequests(numero_de_peticiones); //asignamos el numero maximo de requests en paralelo
//            httpClient.dispatcher(dispatcher);          //asignamos el Dispatcher al cliente de OkHttp
            builder.client(httpClient.build());         //construimos nuestro cliente con los parametros anteriores
            retrofit = builder.build();
        }

        return retrofit.create(serviceClass);
    }

}
