package com.example.gana.net

class HttpHelper: IHttpProcessor {

    private var processor: IHttpProcessor? = null

    companion object {
        val helper = HttpHelper()
    }


    fun init(processor: IHttpProcessor) {
        this.processor = processor
    }

    override fun post(url: String, params: Map<String, Any>, callback: ICallBack) {
        processor?.post(url, params, callback)
    }
}