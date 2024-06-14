plugins {
    id("com.android.application")
    id("kotlin-android")
    alias(libs.plugins.google.services)
}
android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.viewpump.insidercrash"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        manifestPlaceholders["partner"] = "PARTNER_NAME"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    namespace = "dev.b3nedikt.viewpump.sample"
}

kotlin {
    jvmToolchain(17)
}

dependencies {

    implementation(project(":viewpump"))

    implementation(libs.kotlin.stdlib)

    implementation(libs.appCompat)

    implementation(libs.appLocale)

    implementation(libs.lifecycle.process)
    implementation(libs.security.crypto)

    implementation(libs.firebase.messaging)
    implementation(libs.play.services.location)
    implementation(libs.play.review)

    implementation(libs.insider)
}
