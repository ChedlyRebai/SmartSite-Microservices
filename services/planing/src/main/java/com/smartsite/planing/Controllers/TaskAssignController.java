package com.smartsite.planing.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsite.planing.domain.entity.Task;
import com.smartsite.planing.service.ITaskAssigne;

import lombok.NoArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/taskassigne")
@CrossOrigin(origins = "*")
public class TaskAssignController {
    
    private final ITaskAssigne taskAssigneService;
    public TaskAssignController(ITaskAssigne taskAssigneService) {
        this.taskAssigneService = taskAssigneService;

    }

    @PostMapping("/{taskId}")
    public ResponseEntity<Task> postTaskAssign(@RequestBody Task task,@PathVariable Long taskId) {
        return ResponseEntity.ok().body(null);
    }
    

    
    
}
