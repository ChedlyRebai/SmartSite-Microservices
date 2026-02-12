package com.smartsite.planing.service;

import org.springframework.stereotype.Service;

import com.smartsite.planing.repository.ResourcesREpository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ResourceNeedService implements IResourceNeed {

    private ResourcesREpository resourcesREpository; 
    @Override
    public ResourceNeedService addRessource(ResourceNeedService resourceNeed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addRessource'");
    }

    @Override
    public void DeleteRessource(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DeleteRessource'");
    }

    @Override
    public ResourceNeedService updateResourceNeed(ResourceNeedService ressourceNeed, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateResourceNeed'");
    }

    @Override
    public ResourceNeedService getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }
    
}
