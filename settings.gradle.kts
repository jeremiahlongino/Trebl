
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
//    // Add this version catalog configuration
//    versionCatalogs {
//        create("libs") {
//            from(files("gradle/libs.versions.toml"))
//        }
//    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "Trebl"
include(":app")

// Uncomment these when you have the modules:
// include(":core:data")
// include(":core:designsystem")
// include(":core:domain")
// include(":core:glancewidget")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")