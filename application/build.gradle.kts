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

    implementation("org.springframework.boot:spring-boot-starter-web")
}
