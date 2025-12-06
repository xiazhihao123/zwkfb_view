package com.dxyc.zwkfbcs

import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import 安卓.应用.创建
import 安卓.应用.取按钮
import 安卓.应用.显示
import 安卓.应用.置单选项目
import 安卓.应用.置取消按钮
import 安卓.应用.置图标
import 安卓.应用.置忽略按钮
import 安卓.应用.置标题
import 安卓.应用.置确定按钮
import 安卓.组件.置文本颜色
import 安卓.视图.置内边距
import 安卓.视图.置单击回调监听事件
import 安卓x.应用兼容包.应用.应用兼容活动
import 安卓x.应用兼容包.应用.查找视图Id
import 安卓x.应用兼容包.应用.置内容视图
import 安卓x.核心.视图.取边距
import 安卓x.核心.视图.窗口边距兼容
import 安卓x.核心.视图.视图兼容
import 安卓x.活动.启用边缘到边缘
import 科特林.应用

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

        查找视图Id<android.widget.Button>(R.id.bt1).置单击回调监听事件{
//            商业.谷歌.安卓.材质.时间选择器.材质时间选择器.构建器()
//                .setHour(12)
//                .setMinute(30)
//                .setTitleText("选择时间")
//                .build()
//                .show(supportFragmentManager, "timePicker")




            val a = 安卓.应用.警告对话框.构建器(this)
                .置图标(zwkfb.view.R.drawable.png_ic_lingge)
                .置标题("消息")
//                .置消息("这是消息")
                .置单选项目(arrayOf("项目1", "项目2", "项目3"), 0) { dialog, which ->

                }
//                .置多选项目(arrayOf("项目1", "项目2", "项目3"), booleanArrayOf(true, false, true)
//                ) { dialog, which, isChecked ->
//
//                }
                .置确定按钮("确定") { dialog, which ->
                    dialog.dismiss() //关闭对话框
                }
                .置取消按钮("取消") { dialog, which ->
                    dialog.dismiss()  //关闭对话框
                }
                .置忽略按钮("忽略") { dialog, which ->
                    dialog.dismiss() //关闭对话框
                }
                .创建()
                .应用{
                    显示()
                    取按钮(DialogInterface.BUTTON_POSITIVE) // 
                        .置文本颜色(Color.RED)
                    取按钮(DialogInterface.BUTTON_NEGATIVE) // DialogInterface.BUTTON_POSITIVE
                        .置文本颜色(Color.RED)
                }

//            安卓.应用.警告对话框.构建器(this).show()

        }

//        androidx.constraintlayout.widget.VirtualLayout

    }


}