plugins {
    @Suppress("DSL_SCOPE_VIOLATION")
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.androidLibrary).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlinAndroid).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlinCocoapods).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.jetbrainsCompose).apply(false)
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.resourcesMultiplatform).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}