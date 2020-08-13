package com.example.corona.geomob.data.Domaines

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "image"
    ,foreignKeys = arrayOf(
        ForeignKey(entity = Pays::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("pays_id"),
            onDelete = ForeignKey.CASCADE)
    )
)
data class Image(

    @ColumnInfo(name = "urlImage") val urlImage: String,

    @ColumnInfo(name = "pays_id") val paysId: Int

) :Serializable {

    @PrimaryKey(autoGenerate = true) var id : Int = 0

}