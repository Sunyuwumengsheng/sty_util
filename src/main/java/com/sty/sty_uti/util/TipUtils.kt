package com.sty.sty_uti.util

import android.content.Context
import android.widget.Toast
import com.sty.sty_uti.extensions.runMain
import java.lang.ref.WeakReference

object TipUtils {

    private var toast:WeakReference<Toast> ?= null


    fun toastShort(context: Context, message:String?){
        message?:return
        runMain {
            toast?.get()?.cancel()
            val newToast = Toast.makeText(context,message,Toast.LENGTH_SHORT)
            newToast.show()
            toast = WeakReference(newToast)
        }
    }


    fun toastLong(context: Context, message:String?){
        message?:return
        runMain {
            toast?.get()?.cancel()
            val newToast = Toast.makeText(context,message,Toast.LENGTH_LONG)
            newToast.show()
            toast = WeakReference(newToast)
        }
    }
}