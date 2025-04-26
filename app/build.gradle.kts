plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.example.todolist"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.todolist"
=======
    namespace = "com.example.todolistapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.todolistapp"
>>>>>>> 4ad39d22ae6e262a42a7a6d48c4ac404255d95a7
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
<<<<<<< HEAD
    implementation(libs.activity)
    implementation(libs.constraintlayout)
=======
>>>>>>> 4ad39d22ae6e262a42a7a6d48c4ac404255d95a7
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}