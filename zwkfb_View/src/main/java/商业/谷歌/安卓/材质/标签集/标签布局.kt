package 商业.谷歌.安卓.材质.标签集

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.viewpager2.widget.ViewPager2


/**
 * 创建时间：2025年11月24日.
 *
 * 描述：标签布局
 *
 * 版本：0.1.0
 * @author dxyc
 */
class 标签布局 : TabLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    /**
     * 创建时间：2025年11月24日.
     *
     * 描述：标签视图
     *
     * 版本：0.1.0
     */
    inner class 标签视图 : TabView {
        constructor(context: Context) : super(context)
    }

}

//====================================================================================

/**
 * 描述：方向
 *
 * 版本：0.1.1
 */
var ViewPager2.方向: Int
    get() = orientation
    set(方向) { orientation = 方向 }

/**
 * 描述：取方向
 *
 * 版本：0.1.1
 */
fun ViewPager2.取方向(): Int = getOrientation()
/**
 * 描述：置方向
 *
 * 版本：0.1.1
 */
fun ViewPager2.置方向(方向: Int) = setOrientation(方向)

//====================================================================================

/**
 * 描述：适配器
 *
 * 版本：0.1.1
 */
var ViewPager2.适配器: Adapter<*>?
    get() = adapter
    set(适配器) { adapter = 适配器 }

/**
 * 描述：取适配器
 *
 * 版本：0.1.1
 */
fun ViewPager2.取适配器(): Adapter<*>? = getAdapter()
/**
 * 描述：置适配器
 *
 * 版本：0.1.1
 */
fun ViewPager2.置适配器(适配器: Adapter<*>) = setAdapter(适配器)


