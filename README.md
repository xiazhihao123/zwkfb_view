# zwkfb_view
[![](https://jitpack.io/v/dxycw/zwkfb_view.svg)](https://jitpack.io/#dxycw/zwkfb_view)

# 项目介绍
本项目是中文开发的开发包项目，适用于Android的View版的xml布局项目。
如果你使用的是Jetpack Compose项目，请使用[zwkfb_compose](https://github.com/dxycw/zwkfb_compose)。
# 使用方法
1、在项目的 settings.gradle 文件中添加 JitPack 仓库：

* Groovy 版本：
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
* Kotlin 版本：
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

2、在项目的 build.gradle 文件中添加依赖项：

* Groovy 版本：
```groovy
dependencies {
    implementation 'com.github.dxycw:zwkfb_view:0.0.7'
}
```

* Kotlin 版本：
```kotlin
dependencies {
    implementation("com.github.dxycw:zwkfb_view:0.0.7")
}
```

3、就可以在项目中使用了。

# 使用的依赖库
## 官方依赖库
* androidx.core:core-ktx:1.17.0
* androidx.appcompat:appcompat:1.7.1
* com.google.android.material:material:1.12.0
## 其他依赖库
* 暂无


# 更新内容
## 0.0.8
* 新增“间隔”、“图像按钮”、“操作菜单视图”、“适配器视图翻转器”、“自动完成文本视图“、“复选文本视图”、“计时器”、“可展开列表视图”、“日期选择器”、“网格视图”、“滚动视图”、“水平滚动视图”、“图像切换器”、“多自动完成文本视图”、“数字选择器”、“单选按钮”、“单选组”、“评分条”、“相对布局”、“搜索视图”、“拖动条”、“下拉列表”、“堆叠视图”、“表面视图”、“开关”、“表格布局”、“表格行”、“文本时钟”、“文本切换器”、“纹理视图”、“时间选择器”、“开关按钮”、“工具栏”、“视频视图”、“视图动画器”、“视图翻转器”、“视图切换器”、“视图存根”、“媒体控制器”、“组件活动”组件；
* 新增TextView组件的“文本大小”属性和“取文本大小()”、“置文本大小()”函数功能；
* 注意：因为Space、ViewStub是不能被继承，所以作者重写了，“间隔”组件就是和Space一样的功能，“视图存根”组件就是和ViewStub一样的功能；
## 0.0.7
* 新增“文本视图”、“编辑文本”、“按钮”、“图像视图”、“网页视图”、“视图兼容”、“线性布局”、“框架布局”、“网格布局”、“日历视图”、“快捷联系人徽章”、“复选框”、“列表视图”、“进度条”、“窗口边距兼容”组件；
* 新增TextView组件的“文本”属性和“取文本()”、“置文本()”函数功能；
* 新增ViewGroup组件的“添加视图()”、“更新视图布局()”函数功能；
* 新增ProgressBar组件的“进度”属性和“取进度()”、“置进度()”函数功能；
* 新增ViewCompat及“视图兼容”的“置应用窗口边距回调监听器()”函数功能；
* 新增WindowInsetsCompat组件的“取边距()”函数功能；
* 新增“窗口边距兼容”组件的“类型”对象和“系统栏()”函数功能；
## 0.0.6
* 修复在其他项目中添加依赖库没有的Bug；
* “AppCompatActivity”窗口添加“置内容视图()”函数；



