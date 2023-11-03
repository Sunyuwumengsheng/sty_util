package com.sty.sty_uti.extensions

import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext



suspend fun<T> withMain(block: suspend CoroutineScope.() -> T) = withContext(Dispatchers.Main,block)


suspend fun<T> withIO(block: suspend CoroutineScope.() -> T) = withContext(Dispatchers.IO,block)

suspend fun<T> withDefault(block: suspend CoroutineScope.() -> T) = withContext(Dispatchers.Default,block)

suspend fun<T> withUnconfined(block: suspend CoroutineScope.() -> T) = withContext(Dispatchers.Unconfined,block)


fun runMain(block:()->Unit){
    if(Looper.myLooper() == Looper.getMainLooper()){
        block.invoke()
    }else{
        Handler(Looper.getMainLooper()).post{
            block()
        }
    }
}