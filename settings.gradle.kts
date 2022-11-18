pluginManagement{
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
    plugins {
        kotlin("jvm") version "1.7.10"
    }
}

include(":slack_protos")

rootProject.name = "slack-multiplatform-generate-protos"

