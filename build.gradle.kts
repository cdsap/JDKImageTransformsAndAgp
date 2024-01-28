// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.gradle.android.cache-fix") version "3.0" apply false

}

subprojects {
    plugins.withType<com.android.build.gradle.api.AndroidBasePlugin>() {
        apply(plugin = "org.gradle.android.cache-fix")
    }
}
