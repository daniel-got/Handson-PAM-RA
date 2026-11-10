import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    kotlin("jvm") version "2.1.10" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    configure<KotlinJvmProjectExtension> {
        jvmToolchain(21)
    }
}

