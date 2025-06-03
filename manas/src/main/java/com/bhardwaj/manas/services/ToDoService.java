package com.bhardwaj.manas.services;

import com.bhardwaj.manas.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ToDoService {

    private final List<ToDo> toDoList = new CopyOnWriteArrayList<>();

    public synchronized ToDo create(ToDo toDo){
        toDoList.add(toDo);
        return toDo;
    }

    public List<ToDo> getAllToDos(){
        return toDoList;
    }
}
