package api.todoapp.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/todos")
class TodoController {
    @GetMapping()
    fun getTodos(): String {
        return "to do list"
    }

    @PostMapping()
    fun createTodo(): String {
        return "ok"
    }

    @PutMapping(":id")
    fun updateTodo(): String {
        return "ok"
    }

    @DeleteMapping(":id")
    fun deleteTodo(): String {
        return "ok"
    }
}
