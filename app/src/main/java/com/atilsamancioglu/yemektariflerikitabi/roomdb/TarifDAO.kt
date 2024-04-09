package com.atilsamancioglu.yemektariflerikitabi.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.atilsamancioglu.yemektariflerikitabi.model.Tarif
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface TarifDAO {
    @Query("SELECT * FROM Tarif")
    fun getAll(): Flowable<List<Tarif>>

    @Query("SELECT * FROM Tarif WHERE id = :id")
    fun findById(id: Int) : Flowable<Tarif>

    @Insert
    fun insert(tarif: Tarif): Completable
    //fun insert(tarif: Tarif)

    @Delete
    fun delete(tarif: Tarif): Completable

}