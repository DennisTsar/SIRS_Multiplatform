buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.android.tools.build:gradle:4.1.2")
    }
}

group = "me.denny"
version = "1.0"

allprojects {
    repositories {
        mavenCentral()
    }
}