plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.allopen")
    id("org.springframework.boot")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":application"))

    implementation("com.h2database:h2:1.4.200")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}
