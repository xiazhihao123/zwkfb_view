package 安卓x.应用兼容包.应用

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
open class 应用兼容活动 : AppCompatActivity(){

    /**
     * 版本：0.0.7
     */
    @SuppressLint("MissingSuperCall")
    override fun onCreate(savedInstanceState: Bundle?) {
        创建回调(savedInstanceState)
    }


    /**
     * 版本：0.0.7
     */
    open fun 创建回调(保存实例状态: Bundle?){
        super.onCreate(保存实例状态)
    }

}

//================================================================================

/**
 * 版本：0.0.7
 *
 * 设置内容视图。
 * @param 布局ID 布局ID。
 */
fun AppCompatActivity.置内容视图(布局ID: Int)=
    this.setContentView(布局ID)

//================================================================================

/**
 * 版本：0.0.7
 *
 * 获取视图。
 * @param id 视图ID。
 * @return 视图。
 */
fun <T : View> AppCompatActivity.查找视图Id(id: Int): T =
    this.findViewById(id)

//================================================================================

