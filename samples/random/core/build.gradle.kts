import oolong.Dependencies

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
}

kotlin {
    js()
    jvm()
    iosX64("ios")
    linuxX64("linux")
    macosX64("macOS")
    mingwX64("windows")

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":oolong"))
                implementation(Dependencies.Kotlin.StdLib.Common)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(Dependencies.Kotlin.StdLib.JS)
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(Dependencies.Kotlin.StdLib.JDK8)
            }
        }
    }
}

// workaround for https://youtrack.jetbrains.com/issue/KT-27170
configurations {
    create("compileClasspath")
}
