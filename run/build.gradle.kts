plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.allopen")
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":api"))
    implementation(project(":application"))
    implementation(project(":persistence"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
