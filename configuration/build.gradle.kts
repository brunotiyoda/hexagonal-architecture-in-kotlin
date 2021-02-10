description = "configuration module"

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
    implementation(project(":api-external"))
    implementation(project(":application"))
    implementation(project(":persistence"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}

