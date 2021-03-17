package com.github.irof.jig.erd;

import jig.erd.JigErd;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JigErdPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().register("greet", task -> {
            task.doLast(s -> {
                System.out.println("Hello from plugin 'com.example.plugin.greeting'");
                System.out.println(JigErd.class.toString());
            });
        });
    }
}
