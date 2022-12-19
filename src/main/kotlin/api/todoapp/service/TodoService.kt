package api.todoapp.service

import api.todoapp.domain.Todo
import api.todoapp.repository.TodoRepository
import org.springframework.transaction.annotation.Transactional

@Transactional
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo(todo: Todo): Todo {
        return todoRepository.save(todo)
    }

    fun getTodo(todoId: Long): Todo? {
        return todoRepository.findById(todoId)
    }

    fun getTodos(): List<Todo>? {
        return todoRepository.findAll()
    }
}
