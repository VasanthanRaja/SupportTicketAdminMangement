package com.example.Suppor.Ticket.Admin.Mangament.service;

import com.example.Suppor.Ticket.Admin.Mangament.entity.ProjectModule;
import com.example.Suppor.Ticket.Admin.Mangament.entity.UserModule;
import com.example.Suppor.Ticket.Admin.Mangament.repostitory.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectModuleService {
    @Autowired
    private ProjectRepository projectRepository;

    public ProjectModule saveProjectModule(ProjectModule projectModules) {
        return projectRepository.save(projectModules);
    }

    public ProjectModule getProjectById(int id) {
        return projectRepository.findById(id).orElse(null);
    }

    public ProjectModule updateProjectModule(ProjectModule projectModule) {
        ProjectModule existingProject = projectRepository.findById(projectModule.getId()).orElse(null);
        existingProject.setProjectName(projectModule.getProjectName());
        existingProject.setDescription(projectModule.getDescription());
        existingProject.setLocation(projectModule.getLocation());

        return projectRepository.save(existingProject);
    }

    public String deleteProjectModuleById(int id) {
        projectRepository.deleteById(id);
        return "Project removed by id " +id;
    }
}
