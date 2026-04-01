plugins {
    kotlin("jvm") version "2.0.20"
    id("io.ktor.plugin") version "2.3.4"
}

group = "com.akilincarslan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.4")
    implementation("io.ktor:ktor-server-netty:2.3.4")
    testImplementation("io.ktor:ktor-server-tests:2.3.4")
    testImplementation(kotlin("test"))
    implementation("ch.qos.logback:logback-classic:1.4.11")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}
application {
    mainClass.set("ApplicationKt")
}