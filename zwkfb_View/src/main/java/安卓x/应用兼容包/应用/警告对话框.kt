package 安卓x.应用兼容包.应用

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

/**
 * 创建时间：2025年12月2日.
 *
 * 描述：警告对话框
 *
 * 版本：0.1.5
 * @author dxyc
 */
open class 警告对话框 : AlertDialog {
    constructor(context: Context) : super(context)
    constructor(context: Context, themeResId: Int) : super(context, themeResId)
    constructor(
        context: Context,
        cancelable: Boolean,
        cancelListener: DialogInterface.OnCancelListener?,
    ) : super(context, cancelable, cancelListener)
}