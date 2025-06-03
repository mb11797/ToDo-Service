package com.bhardwaj.manas.controllers;

import com.bhardwaj.manas.models.ToDo;
import com.bhardwaj.manas.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @PostMapping
    public ToDo createToDo(@RequestBody ToDo toDo){
        return toDoService.create(toDo);
    }

    @GetMapping
    public List<ToDo> getAllToDos(){
        return toDoService.getAllToDos();
    }

}
