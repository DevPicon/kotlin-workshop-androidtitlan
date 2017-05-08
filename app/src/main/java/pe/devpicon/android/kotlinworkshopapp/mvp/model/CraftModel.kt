package pe.devpicon.android.kotlinworkshopapp.mvp.model

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity

/**
 * Created by Armando on 7/5/2017.
 */
data class CraftModel(
        val name: String,
        val creator: String,
        val quantity: String,
        val state: String,
        val country: String,
        val imageUrl: String,
        val story: String
)