package pe.devpicon.android.kotlinworkshopapp.data.client;

import java.util.List;

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

/**
 * Created by Armando on 5/5/2017.
 */

public interface CraftService {

    public static final Retrofit retrofit = new Retrofit.Builder().baseUrl("").build();

    @GET("")
    Call<List<CraftEntity>> getCrafts();

}
