package 安卓.组件

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.CheckedTextView

/**
 * 创建时间：2025年11月19日.

 * 版本：0.0.8
 * @author dxyc
 */
@SuppressLint("AppCompatCustomView")
class 复选文本视图 : CheckedTextView {
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
}