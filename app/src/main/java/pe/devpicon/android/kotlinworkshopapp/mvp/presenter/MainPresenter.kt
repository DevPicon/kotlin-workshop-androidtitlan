package pe.devpicon.android.kotlinworkshopapp.mvp.presenter

import pe.devpicon.android.kotlinworkshopapp.data.client.CraftRepository
import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity
import pe.devpicon.android.kotlinworkshopapp.data.mapper.CraftDataMapper
import pe.devpicon.android.kotlinworkshopapp.mvp.view.MainView

/**
 * Created by Armando on 7/5/2017.
 */
class MainPresenter : Presenter {

    lateinit var view: MainView

    fun loadCrafts() {
        var repository = CraftRepository()
        repository.getCrafts(this@MainPresenter)
    }

    override fun onLoadSuccess(craftEntityList: MutableList<CraftEntity>?) {

        if (craftEntityList != null) {
            val list = craftEntityList.map { CraftDataMapper().mapFromEntity(it) }
            view.showCrafts(list)
        } else {
            view.showEmptyList()
        }

    }

    override fun onFailure() {
        view.showErrorMessage()
    }
}

