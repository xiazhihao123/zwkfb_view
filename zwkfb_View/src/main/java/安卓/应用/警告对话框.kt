package 安卓.应用

import android.app.AlertDialog
import android.app.AlertDialog.Builder
import android.content.Context
import android.content.DialogInterface

/**
 * 创建时间：2025年11月27日.
 *
 * 描述：警告对话框
 *
 * 版本：0.1.0
 * @author dxyc
 */
open class 警告对话框 :AlertDialog{
    constructor(context: Context?) : super(context)
    constructor(
        context: Context?,
        cancelable: Boolean,
        cancelListener: DialogInterface.OnCancelListener?,
    ) : super(context, cancelable, cancelListener)

    constructor(context: Context?, themeResId: Int) : super(context, themeResId)


    open class 构建器 :Builder{
        constructor(context: Context?) : super(context)
        constructor(context: Context?, themeResId: Int) : super(context, themeResId)
    }
}


fun Builder.置标题(标题: CharSequence?) : Builder =
    this.setTitle(标题)

fun Builder.显示() {
    this.show()
}