plugins {
    kotlin("js")
    id("org.jetbrains.compose") version "1.1.0"
}

group = "me.denny"
version = "1.0"

dependencies {
    implementation(compose.web.core)
    implementation(compose.runtime)
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}