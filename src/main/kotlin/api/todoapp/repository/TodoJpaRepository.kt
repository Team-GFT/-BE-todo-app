package api.todoapp.repository

import api.todoapp.domain.Todo
import javax.persistence.EntityManager

class TodoJpaRepository(private val entityManager: EntityManager) : TodoRepository {
    override fun save(todo: Todo): Todo {
        entityManager.persist(todo)
        return todo
    }

    override fun findById(todoId: Long): Todo? {
        return entityManager.find(Todo::class.java, todoId)
    }

    override fun findAll(): List<Todo>? {
        return entityManager.createQuery("select t from Todo t", Todo::class.java).resultList
    }

}
