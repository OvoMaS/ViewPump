plugins {
  alias(libs.plugins.google.services) apply false
}

subprojects {
  tasks.withType<Javadoc>().all { enabled = false }
}

tasks.register<Delete>("clean") {
  delete(rootProject.buildDir)
}