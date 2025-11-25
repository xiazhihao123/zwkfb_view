package 安卓.媒体.电视.广告

import android.content.Context
import android.media.tv.ad.TvAdView
import android.util.AttributeSet

/**
 * 创建时间：2025年11月24日.
 *
 * 描述：电视广告视图
 *
 * 版本：0.1.0
 * @author dxyc
 */
class 电视广告视图 : TvAdView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}