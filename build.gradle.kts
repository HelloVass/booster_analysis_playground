plugins {
    id("com.android.application") version "7.0.2" apply false
    id("com.android.library") version "7.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("com.didiglobal.booster") version "4.15.0-alpha1" apply false
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        classpath("com.didiglobal.booster:booster-task-analyser:4.15.0-alpha1")
    }
}

val clean by tasks.registering(Delete::class) {
    delete(rootProject.buildDir)
}