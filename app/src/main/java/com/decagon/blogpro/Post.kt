package com.decagon.blogpro

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Post(
    @PrimaryKey
    val post_id: Int,

    @ColumnInfo
    val post_date: String,

    @ColumnInfo
    val post_content: String,

    @ColumnInfo
    val blogger_id: Int
)