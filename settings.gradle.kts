pluginManagement{
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    plugins {
        kotlin("jvm") version "1.7.20"
    }
}

include(":protos")

rootProject.name = "slack-multiplatform-generate-protos"

