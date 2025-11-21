package 安卓.组件

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.RemoteViews.RemoteView
import android.widget.TextView

/**
 * 创建时间：2025年11月18日.
 *
 * 描述：文本视图
 *
 * 版本：0.0.7
 * @author dxyc
 */
@SuppressLint("AppCompatCustomView")
@RemoteView
class 文本视图 : TextView {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int,
    ) : super(context, attrs, defStyleAttr, defStyleRes)

//    private var 文本 : CharSequence = ""
//    private fun init(attrs: AttributeSet?) {
//        val a = context.obtainStyledAttributes(attrs,R.styleable.文本视图)
//        文本 = a.getString(R.styleable.文本视图_文本) ?: ""
//        a.recycle()
//
//        setText(this.文本)
//
//    }

}

//==============================================================
/**
 * 创建时间：2025年11月18日.
 *
 * 描述：文本
 *
 * 版本：0.0.7
 * @return 文本视图所显示的文本。
 */
var TextView.文本: CharSequence
    get() = this.text
    set(文本) { this.text = 文本 }

/**
 * 创建时间：2025年11月18日.
 *
 * 描述：取文本
 *
 * 版本：0.0.7
 * @return 文本视图所显示的文本。
 */
fun TextView.取文本(): CharSequence =
    this.getText()

/**
 * 创建时间：2025年11月18日.
 *
 * 描述：置文本
 *
 * 版本：0.0.7
 * @param 文本 显示的文本。
 */
fun TextView.置文本(文本: CharSequence) {
    this.setText(文本)
}

//==============================================================

/**
 * 创建时间：2025年11月20日.
 *
 * 描述：文本大小
 *
 * 版本：0.0.8
 */
var TextView.文本大小: Float
    get() = this.textSize
    set(大小) { this.textSize = 大小 }

/**
 * 创建时间：2025年11月20日.
 *
 * 描述：取文本大小
 *
 * 版本：0.0.8
 * @return 文本大小 显示的文本大小。
 */
fun TextView.取文本大小(): Float =
    this.getTextSize()

/**
 * 创建时间：2025年11月20日.
 *
 * 描述：置文本大小
 *
 * 版本：0.0.8
 * @param 大小 文本大小。
 */
fun TextView.置文本大小(大小: Float) {
    this.setTextSize(大小)
}

//==============================================================



