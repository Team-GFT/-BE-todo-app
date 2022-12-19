package api.todoapp

import api.todoapp.repository.TodoJpaRepository
import api.todoapp.repository.TodoRepository
import api.todoapp.service.TodoService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager

@Configuration
class SpringConfig(private val entityManager: EntityManager) {
    @Bean
    fun todoRepository(): TodoRepository {
        return TodoJpaRepository(entityManager)
    }

    @Bean
    fun todoService(): TodoService {
        return TodoService(todoRepository())
    }
}
