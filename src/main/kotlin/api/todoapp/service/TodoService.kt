package api.todoapp.service

import api.todoapp.domain.Todo
import api.todoapp.repository.TodoRepository
import org.springframework.transaction.annotation.Transactional

@Transactional
class TodoService(private val todoRepository: TodoRepository) {
    fun createTodo(todo: Todo): Todo {
        return todoRepository.save(todo)
    }

    // TODO 값이 없을 경우 어떻게 메시지 내려줄지 고민...
    fun getTodo(todoId: Long): Todo {
        return todoRepository.findById(todoId)
    }

    fun getTodos(): List<Todo> {
        return todoRepository.findAll() ?: listOf()
    }
}
