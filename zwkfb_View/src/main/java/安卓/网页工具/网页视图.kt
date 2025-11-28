@file:Suppress("DEPRECATION")

package 安卓.网页工具

import android.content.Context
import android.util.AttributeSet
import android.webkit.DownloadListener
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
open class 网页视图 : WebView {
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
 * 获取x坐标
 *
 * 版本：0.1.3
 */
var WebView.x: Float
    get() = this.x
    set(值) {this.x = 值}

/**
 * 获取x坐标
 *
 * 版本：0.1.3
 */
fun WebView.取x(): Float = this.getX()
/**
 * 置x坐标
 *
 * 版本：0.1.3
 */
fun WebView.置x(值: Float) = this.setX(值)

//======================================================================

/**
 * 获取x坐标
 *
 * 版本：0.1.3
 */
var WebView.y: Float
    get() = this.y
    set(值) {this.y = 值}

/**
 * 获取y坐标
 *
 * 版本：0.1.3
 */
fun WebView.取y(): Float = this.getY()
/**
 * 置y坐标
 *
 * 版本：0.1.3
 */
fun WebView.置y(值: Float) = this.setY(值)

//======================================================================

/**
 * 滑动x坐标
 *
 * 版本：0.1.3
 */
var WebView.滑动x: Int
    get() = this.scrollX
    set(值) {this.scrollX = 值}
/**
 * 获取滑动x坐标
 *
 * 版本：0.1.3
 */
fun WebView.取滑动x(): Int = this.getScrollX()
/**
 * 置滑动x坐标
 *
 * 版本：0.1.3
 */
fun WebView.置滑动x(值: Int) = this.setScrollX(值)

//======================================================================
/**
 * 滑动y坐标
 *
 * 版本：0.1.3
 */
var WebView.滑动y: Int
    get() = this.scrollY
    set(值) {this.scrollY = 值}
/**
 * 获取滑动y坐标
 *
 * 版本：0.1.3
 */
fun WebView.取滑动y(): Int = this.getScrollY()
/**
 * 置滑动y坐标
 *
 * 版本：0.1.3
 */
fun WebView.置滑动y(值: Int) = this.setScrollY(值)

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

//======================================================================

/**
 * 版本：0.1.3
 *
 * 请求网址
 * @param 网址 网址
 * @param 请求数据 请求数据
 */
fun WebView.请求网址(网址: String, 请求数据: ByteArray) =
    this.postUrl(网址, 请求数据)

//======================================================================

/**
 * 版本：0.1.3
 *
 * 加载数据
 * @param 数据 数据
 * @param 媒体类型 媒体类型
 * @param 编码 编码
 */
fun WebView.加载数据(数据: String, 媒体类型: String , 编码: String ) =
    this.loadData(数据, 媒体类型, 编码)

//======================================================================

/**
 * 版本：0.1.3
 *
 * 加载数据基础网址
 * @param 数据 数据
 * @param 编码 编码
 * @param 模式 模式
 * @param 历史网址 历史网址
 */
fun WebView.加载数据基础网址(基础网址: String,数据: String, 编码: String, 模式: String,历史网址: String) =
    this.loadDataWithBaseURL(基础网址, 数据, 编码, 模式, 历史网址)

//======================================================================
/**
 * 版本：0.1.3
 *
 * 是否可前进
 * @return Boolean
 */
fun WebView.可前进(): Boolean = this.canGoForward()

/**
 * 版本：0.1.3
 *
 * 前进
 * @return Boolean
 */
fun WebView.前进() = this.goForward()

/**
 * 版本：0.1.3
 *
 * 是否可后退
 * @return Boolean
 */
fun WebView.可后退(): Boolean = this.canGoBack()

/**
 * 版本：0.1.3
 *
 * 后退
 * @return Boolean
 */
fun WebView.后退() = this.goBack()

//======================================================================

/**
 * 版本：0.1.3
 *
 * 是否可后退或前进
 * @param 步 步
 * @return Boolean
 */
fun WebView.取可后退或前进(步: Int): Boolean = this.canGoBackOrForward(步)


/**
 * 版本：0.1.3
 *
 * 后退或前进
 * @param 步数 步
 */
fun WebView.置可后退或前进(步数: Int) = this.goBackOrForward(步数)

//======================================================================
/**
 * 版本：0.1.3
 *
 * 重载
 */
fun WebView.重载() = this.reload()

/**
 * 版本：0.1.3
 *
 * 销毁
 */
fun WebView.摧毁() = this.destroy()
/**
 * 版本：0.1.3
 *
 * 停止加载
 */
fun WebView.停止加载() = this.stopLoading()

/**
 * 版本：0.1.3
 *
 * 移除所有视图
 */
fun WebView.移除所有视图() = this.removeAllViews()

//======================================================================

/**
 * 版本：0.1.3
 *
 * 执行JS脚本
 * @param 脚本 脚本
 * @param 结果回调 结果回调
 */
fun WebView.执行JS脚本(脚本: String, 结果回调: ValueCallback<String>) {
    this.evaluateJavascript(脚本, 结果回调)
}

/**
 * 版本：0.1.3
 *
 * 添加JS接口
 * @param 接口对象 接口对象
 * @param 名称 名称
 */
fun WebView.添加JS接口(接口对象: Any, 名称: String) {
    this.addJavascriptInterface(接口对象, 名称)
}

//======================================================================

/**
 * 网页视图客户端
 *
 * 版本：0.1.3
 */
var WebView.网页视图客户端: WebViewClient
    get() = this.webViewClient
    set(值) {this.webViewClient = 值}

/**
 * 获取网页视图客户端
 *
 * 版本：0.1.3
 */
fun WebView.取网页视图客户端() : WebViewClient =
    this.getWebViewClient()

/**
 * 置网页视图客户端
 *
 * 版本：0.1.3
 */
fun WebView.置网页视图客户端(事件: WebViewClient)  =
    this.setWebViewClient(事件)

//======================================================================
/**
 * 网页浏览器客户端
 *
 * 版本：0.1.3
 */
var WebView.网页浏览器客户端 : WebChromeClient
    get() = this.webChromeClient!!
    set(值) {this.webChromeClient = 值}

/**
 * 获取网页浏览器客户端
 *
 * 版本：0.1.3
 */
fun WebView.取网页浏览器客户端() : WebChromeClient =
    this.getWebChromeClient()!!

/**
 * 置网页浏览器客户端
 *
 * 版本：0.1.3
 */
fun WebView.置网页浏览器客户端(事件: WebChromeClient)  =
    this.setWebChromeClient(事件)

//======================================================================
/**
 * 版本：0.1.3
 *
 * 下载监听事件
 * @param 事件 事件
 */
fun WebView.置下载监听事件(事件: DownloadListener) =
    this.setDownloadListener(事件)



