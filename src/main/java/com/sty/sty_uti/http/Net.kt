package com.sty.sty_uti.http

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Net {
    private val retrofit:Retrofit
    init {
     retrofit = createRetrofit()
    }


   private fun createRetrofit():Retrofit{
     return   Retrofit.Builder()
            .baseUrl(NetConfig.baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(NetConfig.okHttpClient)
            .build()
    }

    fun <T> create(serviceClass:Class<T>):T = retrofit.create(serviceClass)

    inline fun <reified T> create():T = create(T::class.java)

}