package com.smartsite.planing.service;

public interface IResourceNeed {
    ResourceNeed addRessource(ResourceNeed resourceNeed);
    void DeleteRessource(long id);
    ResourceNeed updateResourceNeed(ResourceNeed ressourceNeed,Long id);
    ResourceNeed getById(Long id);
}
