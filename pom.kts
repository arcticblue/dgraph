project {

  groupId("se.arcticblue")
  artifactId("dgraph")
  version("0.1.0-SNAPSHOT")
  packaging("pom")

  properties {
    "project.build.sourceEncoding" to "UTF-8"
    "kotlin.version" to "1.3.50"
  }

  modules("dgraph-model", "dgraph-runner", "dgraph-editor")

  dependencies {
    compile("org.jetbrains.kotlin:kotlin-stdlib:\${kotlin.version}")
  }

  build {
    plugins {
      plugin("com.amashchenko.maven.plugin:gitflow-maven-plugin:1.13.0")
    }
  }
}
