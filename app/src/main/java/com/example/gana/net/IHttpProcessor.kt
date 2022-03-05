package com.example.gana.net

interface IHttpProcessor {

    fun post(url: String, params: Map<String, Any>, callback: ICallBack)
}