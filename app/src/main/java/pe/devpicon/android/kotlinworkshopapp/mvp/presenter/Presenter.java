package pe.devpicon.android.kotlinworkshopapp.mvp.presenter;

import java.util.List;

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity;

/**
 * Created by Armando on 7/5/2017.
 */

public interface Presenter {
    void onLoadSuccess(List<CraftEntity> craftEntityList);

    void onFailure();
}
