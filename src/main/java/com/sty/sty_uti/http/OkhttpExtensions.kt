package com.sty.sty_uti.http

import okhttp3.OkHttpClient
import java.time.Duration
import java.util.concurrent.TimeUnit

fun OkHttpClient.Builder.default()=apply {
    connectTimeout(15000L,TimeUnit.MILLISECONDS)
    readTimeout(20000L,TimeUnit.MILLISECONDS)
    writeTimeout(15000L,TimeUnit.MILLISECONDS)
}