package pe.devpicon.android.kotlinworkshopapp.data.mapper

import pe.devpicon.android.kotlinworkshopapp.data.entity.CraftEntity
import pe.devpicon.android.kotlinworkshopapp.mvp.model.CraftModel

/**
 * Created by Armando on 7/5/2017.
 */
class CraftDataMapper {
    fun mapFromEntity(craftEntity: CraftEntity): CraftModel = CraftModel(
            craftEntity.name,
            craftEntity.creator,
            craftEntity.quantity,
            craftEntity.state,
            craftEntity.country,
            craftEntity.imageUrl,
            craftEntity.story)

}