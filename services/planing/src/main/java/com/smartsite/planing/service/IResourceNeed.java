package com.smartsite.planing.service;

public interface IResourceNeed {
    ResourceNeedService addRessource(ResourceNeedService resourceNeed);
    void DeleteRessource(long id);
    ResourceNeedService updateResourceNeed(ResourceNeedService ressourceNeed,Long id);
    ResourceNeedService getById(Long id);
}
