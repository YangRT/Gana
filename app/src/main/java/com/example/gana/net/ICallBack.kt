package com.example.gana.net

interface ICallBack {

    fun onSuccess(result: String)

    fun onFail(error: String)
}