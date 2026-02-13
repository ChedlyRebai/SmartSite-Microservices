package com.smartsite.planing.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartsite.planing.domain.entity.Task;
import com.smartsite.planing.domain.entity.TaskAssigne;
import com.smartsite.planing.service.ITaskAssigne;

import lombok.NoArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/taskassigne")
@CrossOrigin(origins = "*")
public class TaskAssignController {
    
    private final ITaskAssigne taskAssigneService;
    public TaskAssignController(ITaskAssigne taskAssigneService) {
        this.taskAssigneService = taskAssigneService;
    }

    @PostMapping("/{taskId}")
    public ResponseEntity<TaskAssigne> postTaskAssign(@RequestBody TaskAssigne taskAssigne,@PathVariable Long taskId) {
        return ResponseEntity.ok(this.taskAssigneService.create(taskId, taskAssigne));
    }

    @GetMapping("/{taskid}")
    public ResponseEntity<TaskAssigne> getTaskAssign(@PathVariable Long taskid) {
        return ResponseEntity.ok(this.taskAssigneService.getById(taskid));
    }

    

    
}
