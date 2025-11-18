# zwkfb_view
[![](https://jitpack.io/v/dxycw/zwkfb_view.svg)](https://jitpack.io/#dxycw/zwkfb_view)

# 项目介绍
本项目是中文开发的开发包项目，适用于Android开发及View版。

# 添加依赖
    implementation("com.github.dxycw:zwkfb_view:最新版本")


# 使用方法
1、在项目的 settings.gradle 文件中添加 JitPack 仓库：

Groovy 版本：
```groovy
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
```
Kotlin 版本：
```kotlin
repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}
```

2、在项目的 build.gradle 文件中添加依赖项：

Groovy 版本：
```groovy
dependencies {
    implementation 'com.github.dxycw:zwkfb_view:0.0.5'
}
```

Kotlin 版本：
```kotlin
dependencies {
    implementation("com.github.dxycw:zwkfb_view:0.0.5")
}
```

3、就可以在项目中使用了。



# 更新内容
## 0.0.6
1、修复在其他项目中添加依赖库没有的Bug；

2、“AppCompatActivity”窗口添加“置内容视图()”函数；
