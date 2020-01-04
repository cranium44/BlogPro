package com.decagon.blogpro

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Blogger (
    @PrimaryKey
    val id: Int,

    @ColumnInfo
    val f_name: String,

    @ColumnInfo
    val l_name: String,

    @ColumnInfo
    val date_of_birth: String,

    @ColumnInfo
    val password: String,

    @ColumnInfo
    val email: String,

    @ColumnInfo
    val imageURI: String
)