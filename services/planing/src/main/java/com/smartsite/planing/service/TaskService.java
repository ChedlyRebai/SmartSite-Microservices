package com.smartsite.planing.service;

import org.springframework.stereotype.Service;

import com.smartsite.planing.domain.entity.Task;
import com.smartsite.planing.repository.TaskRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class TaskService implements ITaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @Override
    public void DeleteTAsk(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DeleteTAsk'");
    }

    @Override
    public Task AddTAsk(Task task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddTAsk'");
    }

    @Override
    public Task updateTask(Task Task, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTask'");
    }

    @Override
    public Task getTaskById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTaskById'");
    }
    
}
