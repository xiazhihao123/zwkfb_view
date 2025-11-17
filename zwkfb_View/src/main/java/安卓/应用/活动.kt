package 安卓.应用

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle

open class 活动 : Activity() {
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        创建回调(savedInstanceState)
    }


    open fun 创建回调(保存实例状态: Bundle?){
        super.onCreate(保存实例状态)
    }
}