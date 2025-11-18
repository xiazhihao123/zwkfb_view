package 安卓x.应用兼容包.应用

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class 应用兼容活动 : AppCompatActivity(){

    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        创建回调(savedInstanceState)
    }


    open fun 创建回调(保存实例状态: Bundle?){
        super.onCreate(保存实例状态)
    }

}


fun AppCompatActivity.置内容视图(布局ID: Int)=
    this.setContentView(布局ID)

