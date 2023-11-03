package com.sty.sty_uti.http

import okhttp3.OkHttpClient

object NetConfig {

    var baseUrl:String = ""
    var okHttpClient = OkHttpClient.Builder().default().build()

   fun initConfig(
       baseUrl:String ="",
       config:OkHttpClient.Builder.()->Unit={}
   ){
       this.baseUrl = baseUrl
       val builder = OkHttpClient.Builder()
       builder.config()
       okHttpClient = builder.build()
    }


    fun initConfig(
        baseUrl:String =""
    ){
        this.baseUrl = baseUrl
    }
}