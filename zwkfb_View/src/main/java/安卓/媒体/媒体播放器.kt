package 安卓.媒体

import android.content.Context
import android.media.MediaPlayer

/**
 * 创建时间：2025年11月27日.
 *
 * 描述：媒体播放器
 *
 * 版本：0.1.0
 * @author dxyc
 */
open class 媒体播放器 :MediaPlayer{
    constructor() : super()
    constructor(context: Context) : super(context)
}