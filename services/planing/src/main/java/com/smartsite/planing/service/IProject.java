package com.smartsite.planing.service;

public interface IProject {
    Project getProjectById(Long id);
    void DeleteProject(Long id);
    Project updateProject(Project project,Long id);
    Project AddProject(Project project);
}
