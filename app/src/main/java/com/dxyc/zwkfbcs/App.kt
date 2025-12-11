package com.dxyc.zwkfbcs

import 安卓.应用.应用程序

class App : 应用程序() {
    override fun 创建回调() {
        super.创建回调()

//        // 1. 带 token 的 OkHttpClient
//        val okClient = OkHttpClient.Builder()
//            .addInterceptor { chain ->
//                val request = chain.request().newBuilder()
//                    .addHeader("Authorization", "Bearer c8f265bf11b2e7421bd06867d9c843a9")
//                    .build()
//                chain.proceed(request)
//            }
//            .followRedirects(true)
//            .build()
//
//        // 2. 把 OkHttp 装进 ExoPlayer
//        dataSourceFactory = OkHttpDataSource.Factory(okClient)
    }

    companion object{
//        private lateinit var dataSourceFactory: OkHttpDataSource.Factory
//
//        @OptIn(UnstableApi::class)
//        fun 用网址播放视频(url: String) : ProgressiveMediaSource{
//            return ProgressiveMediaSource.Factory(dataSourceFactory)
//                .createMediaSource(MediaItem.fromUri(url))
//        }
    }
}

