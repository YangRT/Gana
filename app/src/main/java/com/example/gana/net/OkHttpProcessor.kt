package com.example.gana.net

import android.os.Handler
import android.os.Looper
import okhttp3.OkHttpClient

class OkHttpProcessor: IHttpProcessor {

    private val okHttpClient = OkHttpClient()
    private val handler = Handler(Looper.getMainLooper())

    init {

    }

    override fun post(url: String, params: Map<String, Any>, callback: ICallBack) {
        // 网络请求具体实现
    }
}