package 安卓.应用

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
open class 活动 : Activity() {
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