package 安卓.视图

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

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