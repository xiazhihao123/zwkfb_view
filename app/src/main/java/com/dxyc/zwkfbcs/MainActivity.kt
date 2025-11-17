package com.dxyc.zwkfbcs

import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import 安卓x.应用兼容包.应用.应用兼容活动
import 安卓x.活动.启用边缘到边缘

class MainActivity : 应用兼容活动() {
    override fun 创建回调(保存实例状态: Bundle?) {
        super.创建回调(保存实例状态)
        启用边缘到边缘()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}