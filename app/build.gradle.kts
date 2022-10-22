plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.didiglobal.booster")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "info.hellovass.dependendy_playground"
        minSdk = 21
        targetSdk = 26
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    flavorDimensions += listOf("channel")
    productFlavors {
        // huawei
        @Suppress("UNUSED_VARIABLE")
        val huawei by creating {
            dimension = "channel"
        }
        // xiaomi
        @Suppress("UNUSED_VARIABLE")
        val xiaomi by creating {
            dimension = "channel"
        }
    }
}

dependencies {
    implementation(project(":library"))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.1")
}