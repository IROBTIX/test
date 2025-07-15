// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.0"
    alias(libs.plugins.android.library) apply false
}

subprojects {
    apply(plugin = "io.gitlab.arturbosch.detekt")

    detekt {
        config.setFrom(files("$rootDir/config/detekt-config.yml"))
        buildUponDefaultConfig = true
    }

//    apply(plugin = "kotlin-android")
//    apply(plugin = "kotlin-android-extensions")

}
