plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

android {
    compileSdk = 32
}

kotlin {
    android()
    sourceSets {
        commonMain {
            dependencies {
                implementation(project(":feature:common"))
            }
        }
        val androidMain by getting {
            dependencies {
            }
        }
    }
}
