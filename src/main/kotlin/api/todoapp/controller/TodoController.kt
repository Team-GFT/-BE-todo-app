package api.todoapp.controller

import api.todoapp.domain.Todo
import api.todoapp.service.TodoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/todos")
class TodoController(private val todoService: TodoService) {
    @GetMapping()
    fun getTodos(): List<Todo> {
        return todoService.getTodos()
    }

    @GetMapping("{todoId}")
    fun getTodo(@PathVariable todoId: Long): Todo {
        return todoService.getTodo(todoId)
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
