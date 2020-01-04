package com.decagon.blogpro

import androidx.room.*


@Dao
interface BloggerDAO {

    @Query("SELECT * FROM blogger")
    fun getAllBloggers(): List<Blogger>

    @Query("SELECT * FROM blogger where id=:id")
    fun getBlogger(id: Int): Blogger

    @Insert
    fun addBlogger(blogger: Blogger)

    @Update
    fun editBlogger(blogger: Blogger)

    @Delete
    fun deleteBlogger(id: Int)
}