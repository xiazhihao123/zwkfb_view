package com.dxyc.zwkfbcs

import android.os.Bundle
import 安卓x.应用兼容包.应用.应用兼容活动
import 安卓x.应用兼容包.应用.置内容视图
import 安卓x.活动.启用边缘到边缘
import kotlinx.coroutines.Job
import 安卓.视图.置内边距
import 安卓.视图.置单击回调监听事件
import 安卓x.应用兼容包.应用.查找视图Id
import 安卓x.核心.视图.取边距
import 安卓x.核心.视图.窗口边距兼容
import 安卓x.核心.视图.视图兼容


class MainActivity : 应用兼容活动() {

    override fun 创建回调(保存实例状态: Bundle?) {
        super.创建回调(保存实例状态)
        启用边缘到边缘()
        置内容视图(R.layout.player_activity)
        视图兼容.置应用窗口边距回调监听器(查找视图Id(R.id.main)) { 视图, 边距 ->
            val 系统栏 = 边距.取边距(窗口边距兼容.类型.系统栏())
            视图.置内边距(系统栏.left, 系统栏.top, 系统栏.right, 系统栏.bottom)
            边距
        }

        查找视图Id<android.widget.Button>(R.id.btn3).置单击回调监听事件{
            商业.谷歌.安卓.材质.时间选择器.材质时间选择器.构建器()
                .setHour(12)
                .setMinute(30)
                .setTitleText("选择时间")
                .build()
                .show(supportFragmentManager, "timePicker")
        }


//        playerView = findViewById(R.id.playerView)
//        playBtn = findViewById(R.id.btnPlay)
//        progressBar = findViewById(R.id.seekBar)
//        tvTime = findViewById(R.id.tvTime)

//        // 1. 创建播放器
//        player = ExoPlayer.Builder(this).build()
//        playerView.player = player
//
//        // 2. 组装媒体源（可换本地 file:///sdcard/abc.mp4）
////        "https://gitee.com/dxycw/shuju/raw/master/%E8%A7%86%E9%A2%91/1.mp4"
//        // 将原链接改为raw格式
//        val giteeurl = "https://gitee.com/dxycw/shuju/raw/master/视频/1.mp4"
//
////        val videoUri = "android.resource://" + getPackageName() + "/" + R.raw.aaa
//        val mediaItem = MediaItem.fromUri(giteeurl)
//        player.setMediaItem(mediaItem)
//
//        // 3. 准备 & 播放
//        player.prepare()
//        player.playWhenReady = true

//
//        // 3. 播放
//        player = ExoPlayer.Builder(this).build()
//        playerView.player = player
//        player.setMediaSource(App.用网址播放视频("https://gitee.com/dxycw/shuju/raw/master/视频/2.mp4"))
//        player.prepare()
//        player.playWhenReady = true
//
//
//        查找视图Id<android.widget.Button>(R.id.btn1).置单击回调监听事件{
//            player.setMediaSource(App.用网址播放视频("https://gitee.com/dxycw/shuju/raw/master/视频/1.mp4"))
//        }
//
//        查找视图Id<android.widget.Button>(R.id.btn2).置单击回调监听事件{
//            player.setMediaSource(App.用网址播放视频("https://gitee.com/dxycw/shuju/raw/master/视频/2.mp4"))
//        }

        // 4. 把进度条跑起来
        updateProgress()

//        playBtn.setOnClickListener {
//            onPlayPauseClick()
//        }
//
//        progressBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onProgressChanged(
//                seekBar: SeekBar?,
//                progress: Int,
//                fromUser: Boolean,
//            ) {
//                onProgressChanged(progress, fromUser)
//                tvTime.text = "${取总秒数转时间格式(player.currentPosition)} / ${取总秒数转时间格式(player.duration)}" //
//            }
//
//            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//
//            }
//
//            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//
//            }
//        })


    }



    private fun updateProgress() {
        if (isUpdating) return
        isUpdating = true

//        val delayMs = 500L
//        progressBar.postDelayed({
//            if (player.isPlaying) {
//                progressBar.max = player.duration.toInt()
//                progressBar.progress = player.currentPosition.toInt()
//                updateProgress()   // 循环
//            }
//        }, delayMs)

//        updateJob = lifecycleScope.launch {
//            while (isUpdating && this.isActive) {
//                if (player.isPlaying) {
//                    progressBar.max = player.duration.toInt()
//                    progressBar.progress = player.currentPosition.toInt()
//                    tvTime.text = "${取总秒数转时间格式(player.currentPosition)} / ${取总秒数转时间格式(player.duration)}"
//                }
//                delay(500)
//            }
//        }
    }

    // 播放/暂停按钮
    fun onPlayPauseClick() {
//        player.playWhenReady = !player.playWhenReady
//        playBtn.setBackgroundResource(
//            if (player.playWhenReady) zwkfb.view.R.drawable.ic_search
//            else zwkfb.view.R.drawable.ic_search
//        )
//        // 在 onCreate 回调中添加
//        player.addListener(object : Player.Listener {
//            override fun onIsPlayingChanged(isPlaying: Boolean) {
//                // 根据实际播放状态更新按钮图标
//                playBtn.setBackgroundResource(
//                    if (isPlaying) zwkfb.view.R.drawable.ic_search
//                    else zwkfb.view.R.drawable.ic_search
//                )
//            }
//        })

    }

    // 进度条拖动
    fun onProgressChanged(progress: Int, fromUser: Boolean) {
//        if (fromUser) player.seekTo(progress.toLong())
    }
    private var isUpdating = false
    private var updateJob: Job? = null

    override fun onStop() {
        super.onStop()
//        player.pause()
    }



    override fun onPause() {
        super.onPause()
//        player.pause()
    }

    override fun onResume() {
        super.onResume()
//        player.play()
    }

    override fun onDestroy() {
        super.onDestroy()
        isUpdating = false
        updateJob?.cancel()
//        player.release()
    }

//    private lateinit var player: ExoPlayer
//    private lateinit var playerView: PlayerView
//    private lateinit var playBtn: Button       // 你自己画的按钮
//    private lateinit var progressBar: SeekBar
//
//    private lateinit var tvTime: TextView

}