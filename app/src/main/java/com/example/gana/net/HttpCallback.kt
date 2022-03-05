package com.example.gana.net

import com.google.gson.Gson
import java.lang.reflect.ParameterizedType

abstract class HttpCallback<T> : ICallBack {

    override fun onSuccess(result: String) {
        val clz = analysisClassInfo(this)
        val res =  Gson().fromJson(result, clz) as T
        onSuccess(res)
    }

    abstract fun onSuccess(result: T)

    override fun onFail(error: String) {

    }

    private fun analysisClassInfo(obj: Any): Class<*> {
        val type = obj.javaClass.genericSuperclass
        val params = (type as ParameterizedType).actualTypeArguments
        return params[0] as Class<*>
    }
}