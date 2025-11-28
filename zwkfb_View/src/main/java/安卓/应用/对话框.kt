package 安卓.应用

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface

/**
 * 创建时间：2025年11月27日.
 *
 * 描述：对话框
 *
 * 版本：0.1.0
 * @author dxyc
 */
open class 对话框 :Dialog{
    constructor(context: Context) : super(context)
    constructor(
        context: Context,
        cancelable: Boolean,
        cancelListener: DialogInterface.OnCancelListener?,
    ) : super(context, cancelable, cancelListener)

    constructor(context: Context, themeResId: Int) : super(context, themeResId)
}