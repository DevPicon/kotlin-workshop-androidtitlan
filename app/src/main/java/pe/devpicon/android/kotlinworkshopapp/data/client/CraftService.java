package pe.devpicon.android.kotlinworkshopapp.data.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity;
import pe.devpicon.android.kotlinworkshopapp.data.entity.ListWrapper;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Armando on 5/5/2017.
 */

public interface CraftService {
    Gson gson = new GsonBuilder()
            .setLenient()
            .create();
    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://www.mocky.io/v2/590fc3fc100000be1c8be930/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

    @GET(".")
    Call<List<CraftEntity>> getCrafts();

}
