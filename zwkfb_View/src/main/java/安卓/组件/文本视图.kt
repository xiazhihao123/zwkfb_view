package 安卓.组件

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import zwkfb.view.R

/**
 * 创建时间：2025年11月18日.

 * 版本：0.0.7
 * @author dxyc
 */
@SuppressLint("AppCompatCustomView")
class 文本视图 : TextView {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
//        init(attrs)
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr){
//        init(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?,
        defStyleAttr: Int, defStyleRes: Int,
    ) : super(context, attrs, defStyleAttr, defStyleRes){
//        init(attrs)
    }

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
 * 版本：0.0.7
 *
 * 显示的文本。
 */
var TextView.文本: CharSequence
    get() = this.text
    set(文本) { this.text = 文本 }

/**
 * 版本：0.0.7
 *
 * 取文本
 * @return TextView 显示的文本。
 */
fun TextView.取文本(): CharSequence =
    this.getText()

/**
 * 版本：0.0.7
 *
 * 置文本
 * @param 文本 显示的文本。
 */
fun TextView.置文本(文本: CharSequence) {
    this.setText(文本)
}

//==============================================================


