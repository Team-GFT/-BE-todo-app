package api.todoapp.repository

import api.todoapp.domain.Todo

interface TodoRepository {
    fun save(todo: Todo): Todo
    fun findById(todoId: Long): Todo?
    fun findAll(): List<Todo>?
}
