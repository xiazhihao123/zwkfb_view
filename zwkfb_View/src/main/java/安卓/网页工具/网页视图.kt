@file:Suppress("DEPRECATION")

package 安卓.网页工具

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebSettings
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

//======================================================================

/**
 * 版本：0.1.0
 * 
 * 浏览器配置
 * @return WebSettings
 */
val WebView.浏览器配置: WebSettings
    get() = this.settings

/**
 * 版本：0.1.0
 *
 * 浏览器配置
 * @return WebSettings
 */
fun WebView.浏览器配置(): WebSettings = this.getSettings()

//======================================================================

/**
 * 版本：0.1.0
 *
 * 加载网址
 * @param 网址 网址
 * @param 附加HTTP头 附加HTTP头
 */
fun WebView.加载网址(网址: String,附加HTTP头: Map<String, String>){
    this.loadUrl(网址,附加HTTP头)
}

/**
 * 版本：0.1.0
 *
 * 加载网址
 * @param 网址 网址
 */
fun WebView.加载网址(网址: String){
    this.loadUrl(网址)
}

