plugins {
    kotlin("jvm") version "1.3.61"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val ktorVersion: String by project

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.daveanthonythomas.moshipack:moshipack:1.0.0-beta") //https://github.com/davethomas11/MoshiPack
    compile("io.ktor:ktor-server-netty:${ktorVersion}")
    testCompile("junit:junit:4.12")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}