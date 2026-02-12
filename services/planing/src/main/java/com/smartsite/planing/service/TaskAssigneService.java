package com.smartsite.planing.service;

import org.apache.kafka.streams.processor.assignment.KafkaStreamsAssignment.AssignedTask;
import org.springframework.stereotype.Service;

import com.smartsite.planing.repository.TaskAssigneRepository;
import com.smartsite.planing.repository.TaskRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class TaskAssigneService implements ITaskAssigne {

    private TaskAssigneRepository taskAssignRepository;
    @Override
    public void deleteAssigneTAsk(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAssigneTAsk'");
    }

    @Override
    public AssignedTask AddAssigneTAsk(AssignedTask assignedTask) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AddAssigneTAsk'");
    }

    @Override
    public AssignedTask uPdateAssignedTask(AssignedTask assignedTask, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uPdateAssignedTask'");
    }

    @Override
    public AssignedTask getAssigneTAskByID(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAssigneTAskByID'");
    }
    
}
