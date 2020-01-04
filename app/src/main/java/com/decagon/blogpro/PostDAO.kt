package com.decagon.blogpro

import androidx.room.*

@Dao
interface PostDAO {
    @Query("select * from post")
    fun getAllPosts(): List<Post>

    @Query("select * from post where post_id= :post_id")
    fun getPostById(post_id: Int): Post

    @Query("select * from post where blogger_id= :blogger_id")
    fun getPostByBlogger(blogger_id: Int): List<Post>

    @Update
    fun editPost(post: Post)

    @Insert
    fun addPost(post: Post)

    @Delete
    fun deletePost(post_id: Int)

}