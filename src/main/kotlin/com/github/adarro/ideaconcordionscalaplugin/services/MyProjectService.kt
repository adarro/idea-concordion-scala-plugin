package com.github.adarro.ideaconcordionscalaplugin.services

import com.intellij.openapi.project.Project
import com.github.adarro.ideaconcordionscalaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
