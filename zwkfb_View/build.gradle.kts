@file:Suppress("DEPRECATION")

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    signingConfigs {
        create("release") {
            storeFile = file("../key.jks")
            storePassword = "12345678"
            keyAlias = "key"
            keyPassword = "12345678"
        }
    }
    namespace = "zwkfb.view"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    // 核心库
    api("androidx.core:core-ktx:1.17.0")
    api("androidx.appcompat:appcompat:1.7.1")
    api("com.google.android.material:material:1.13.0")

    api("androidx.activity:activity:1.12.1")
    api("androidx.constraintlayout:constraintlayout:2.2.1")

    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)

    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar", "*.jar"))))

    // 其他依赖库
    implementation("com.google.firebase:firebase-crashlytics-buildtools:3.0.6")

    //下拉刷新框
    api("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // ImmersionBar沉浸式状态栏
    api("com.geyifeng.immersionbar:immersionbar:3.2.2")

    // OkHttp3 网络请求库
    api("com.squareup.okhttp3:okhttp:5.3.2")

    // Json解析,是 Google 官方出品的 Java/Kotlin JSON 解析库 Gson 的 2.13.2 版本，用于把 JSON 字符串 ↔ Java/Kotlin 对象 之间做 序列化 / 反序列化。
    api("com.google.code.gson:gson:2.13.2")

    // Markdown,md解析
    api("io.noties.markwon:core:4.6.2")

}
