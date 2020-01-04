package com.decagon.blogpro

import androidx.room.Database


@Database(entities = [Post::class, Blogger::class], version = 1)
abstract class BlogDB {
    abstract fun postDAO(): PostDAO
    abstract fun bloggerDAO(): BloggerDAO
}