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
    api("com.google.android.material:material:1.12.0")

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)

    // 其他依赖库
    implementation("com.google.firebase:firebase-crashlytics-buildtools:3.0.6")

    //下拉刷新框
    api("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")

    // ImmersionBar沉浸式状态栏
    api("com.geyifeng.immersionbar:immersionbar:3.2.2")

    // OkHttp3 网络请求库
    api("com.squareup.okhttp3:okhttp:5.3.0")
}

