package com.dxyc.zwkfbcs

import android.os.Bundle
import android.widget.Button
import 商业.谷歌.安卓.材质.提示栏.提示栏
import 安卓.视图.置内边距
import 安卓.视图.置单击回调监听事件
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
        视图兼容.置应用窗口边距回调监听器(查找视图Id(R.id.main)) { 视图, 边距 ->
            val 系统栏 = 边距.取边距(窗口边距兼容.类型.系统栏())
            视图.置内边距(系统栏.left, 系统栏.top, 系统栏.right, 系统栏.bottom)
            边距
        }

        查找视图Id<Button>(R.id.bt1).置单击回调监听事件{
            提示栏.make(it, "欢迎使用",1).show()
        }


    }

}