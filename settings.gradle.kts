pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.enterprise") version "3.16.1"

}

gradleEnterprise {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
        isUploadInBackground = System.getenv("CI") == null
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "JDKImageTransformsAndAgp"
include(":app")
