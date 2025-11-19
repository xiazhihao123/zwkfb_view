package 安卓.视图

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
open class 视图组 : ViewGroup {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ) : super(context, attrs, defStyleAttr, defStyleRes)

    override fun onLayout(
        changed: Boolean,
        l: Int,
        t: Int,
        r: Int,
        b: Int,
    ) {
        布局回调(changed, l, t, r, b)
    }



    open fun 布局回调(
        changed: Boolean, l: Int, t: Int, r: Int, b: Int,
    ) {

    }

}

//==============================================================
/**
 * 版本：0.0.7
 *
 * 添加视图。
 * @param 视图 视图。
 */
fun ViewGroup.添加视图(视图: View) = this.addView(视图)
/**
 * 版本：0.0.7
 *
 * 添加视图。
 * @param 视图 视图。
 * @param 索引 索引。
 */
fun ViewGroup.添加视图(视图: View, 索引: Int) =
    this.addView(视图,索引)
/**
 * 版本：0.0.7
 *
 * 添加视图。
 * @param 视图 视图。
 * @param 宽度 宽度。
 * @param 高度 高度。
 */
fun ViewGroup.添加视图(视图: View, 宽度: Int, 高度: Int) =
    this.addView(视图,宽度,高度)
/**
 * 版本：0.0.7
 *
 * 添加视图。
 * @param 视图 视图。
 * @param 布局参数 布局参数。
 */
fun ViewGroup.添加视图(视图: View, 布局参数: ViewGroup.LayoutParams) =
    this.addView(视图,布局参数)
/**
 * 版本：0.0.7
 *
 * 添加视图。
 * @param 视图 视图。
 * @param 索引 索引。
 * @param 布局参数 布局参数。
 */
fun ViewGroup.添加视图(视图: View, 索引: Int, 布局参数: ViewGroup.LayoutParams) =
    this.addView(视图,索引,布局参数)

//==============================================================

/**
 * 版本：0.0.7
 *
 * 更新视图布局。
 * @param 视图 视图。
 * @param 布局参数 布局参数。
 */
fun ViewGroup.更新视图布局(视图: View, 布局参数: ViewGroup.LayoutParams) =
    this.updateViewLayout(视图,布局参数)
