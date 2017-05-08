package pe.devpicon.android.kotlinworkshopapp.mvp.view

import pe.devpicon.android.kotlinworkshopapp.mvp.model.CraftModel

/**
 * Created by Armando on 7/5/2017.
 */
interface MainView {
    fun showCrafts(list: List<CraftModel>)
    fun showErrorMessage()
    fun showEmptyList()
}