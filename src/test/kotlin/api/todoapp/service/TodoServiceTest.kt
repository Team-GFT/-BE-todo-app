package api.todoapp.service

import api.todoapp.domain.Todo
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
class TodoServiceTest (@Autowired private val todoService: TodoService) {
    @Test
    fun `Todo가 생성된다`() {
        // given
        val testTodo = Todo(content="test1", position=1)

        // when
        val todo = todoService.createTodo(testTodo)

        // then
        assertThat(todo.id).isEqualTo(1)
    }

    @Test
    fun `1개의 Todo를 가져온다`() {
        // given
        val testTodo = Todo(content="test1", position=1)
        todoService.createTodo(testTodo)

        // when
        val todo = todoService.getTodo(todoId=1)

        // then
        assertThat(todo).isNotNull
    }

    @Test
    fun `Todo가 존재하지 않는다`() {
        // given
        val testTodo = Todo(content="test1", position=1)
        todoService.createTodo(testTodo)

        // when
        val todo = todoService.getTodo(todoId=2)

        // then
        assertThat(todo).isNull()
    }

}
