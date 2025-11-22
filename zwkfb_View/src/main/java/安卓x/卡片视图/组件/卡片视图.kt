package 安卓x.卡片视图.组件

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView

/**
 * 创建时间：2025年11月22日.
 *
 * 描述：卡片视图
 *
 * 版本：0.0.9
 * @author dxyc
 */
class 卡片视图 : CardView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}
