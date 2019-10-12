
project("dgraph") {

  groupId("se.arcticblue")
  artifactId("dgraph")
  version("0.1.0-SNAPSHOT")
  packaging("pom")

  val kotlinVersion = "1.3.50"

  properties {
    "project.build.sourceEncoding" to "UTF-8"
  }

  modules("dgraph-model", "dgraph-runner", "dgraph-editor")

  dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
  }

  build {
    sourceDirectory("src/main/kotlin")
    testSourceDirectory("/src/test/kotlin")
  }
}
