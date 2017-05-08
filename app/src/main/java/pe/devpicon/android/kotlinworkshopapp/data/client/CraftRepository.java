package pe.devpicon.android.kotlinworkshopapp.data.client;

import android.util.Log;

import java.util.List;

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity;
import pe.devpicon.android.kotlinworkshopapp.data.entity.ListWrapper;
import pe.devpicon.android.kotlinworkshopapp.mvp.presenter.Presenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Armando on 7/5/2017.
 */

public class CraftRepository {

    public static final String TAG = CraftRepository.class.getSimpleName();

    public void getCrafts(final Presenter presenter) {

        CraftService service = CraftService.retrofit.create(CraftService.class);
        Call<List<CraftEntity>> call = service.getCrafts();

        call.enqueue(new Callback<List<CraftEntity>>() {
            @Override
            public void onResponse(Call<List<CraftEntity>> call, Response<List<CraftEntity>>
                    response) {
                if (response.isSuccessful()) {
                    List<CraftEntity> craftEntityList = response.body();

                    if (craftEntityList.size() < 0) {
                        Log.d(TAG, "onResponse: La lista vino con menos elementos");
                        presenter.onFailure();
                    } else {
                        presenter.onLoadSuccess(craftEntityList);
                    }


                } else {
                    Log.d(TAG, "onResponse: " + response.message());
                    presenter.onFailure();

                }
            }

            @Override
            public void onFailure(Call<List<CraftEntity>> call, Throwable t) {
                Log.e(TAG, "onFailure: ", t );
                presenter.onFailure();
            }
        });

    }

}
