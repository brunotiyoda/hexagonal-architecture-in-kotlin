
plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":persistence"))
}