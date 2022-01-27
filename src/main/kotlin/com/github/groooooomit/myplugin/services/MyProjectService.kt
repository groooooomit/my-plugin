package com.github.groooooomit.myplugin.services

import com.intellij.openapi.project.Project
import com.github.groooooomit.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
