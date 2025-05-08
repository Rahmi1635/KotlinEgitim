// Top-level build file where you can add configuration options common to all sub-projects/modules.



plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
buildscript {
    repositories {
        google() // Google Maven deposu
        mavenCentral() // Maven Central deposu
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0") // AGP sürümünü kontrol et
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22") // Kotlin sürümünü kontrol et
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7") // Safe Args eklentisi
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}