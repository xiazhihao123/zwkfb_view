package com.dxyc.zwkfbcs

import android.os.Bundle
import 安卓x.应用兼容包.应用.应用兼容活动
import 安卓x.应用兼容包.应用.查找视图Id
import 安卓x.应用兼容包.应用.置内容视图
import 安卓x.核心.视图.取边距
import 安卓x.核心.视图.窗口边距兼容
import 安卓x.核心.视图.视图兼容
import 安卓x.活动.启用边缘到边缘


class MainActivity : 应用兼容活动() {

    override fun 创建回调(保存实例状态: Bundle?) {
        super.创建回调(保存实例状态)
        启用边缘到边缘()
        置内容视图(R.layout.activity_main)
        视图兼容.置应用窗口边距回调监听器(查找视图Id(R.id.main)) { v, 边距 ->
            val 系统栏 = 边距.取边距(窗口边距兼容.类型.系统栏())
            v.setPadding(系统栏.left, 系统栏.top, 系统栏.right, 系统栏.bottom)
            边距
        }



//        findViewById<Button>(R.id.button).setOnClickListener {
//            val a = findViewById<ViewStub>(R.id.stub)
////            a.setInflatedId(R.id.inflated)
////                a.setLayoutResource(R.layout.aa)
////            if (a.getLayoutResource() != 0) {
//                a.inflate()
////            }
//
//        }

//        val vv = findViewById<VideoView>(R.id.videoView)
//        val url = "android.resource://" + packageName + "/" + R.raw.aaa   // 放 raw/demo.mp4
//        vv.setVideoURI(Uri.parse(url))
//
//        // 1. 创建控制器
//        val ctrl = MediaController(this)
//        // 2. 双向绑定
//        ctrl.setAnchorView(vv)   // 控制器悬浮在 VideoView 区域
//        vv.setMediaController(ctrl)
//
//        /* 3. 自动播放 + 循环 */
//        vv.setOnPreparedListener {
//            vv.start()
//            it.isLooping = true
//        }

//        /* 4. 全屏切换示例（双击或按钮） */
//        vv.setOnClickListener { toggleFullScreen() }




    }

}


