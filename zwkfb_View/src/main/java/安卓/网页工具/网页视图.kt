@file:Suppress("DEPRECATION")

package 安卓.网页工具

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
class 网页视图 : WebView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        privateBrowsing: Boolean,
    ) : super(context, attrs, defStyleAttr, privateBrowsing)

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) : super(context, attrs, defStyleAttr, defStyleRes)
}