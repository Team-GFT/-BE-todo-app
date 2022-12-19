package api.todoapp.domain

import javax.persistence.*

@Entity
@Table(name="tb_todo")
class Todo (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column
        var content: String = "",

        @Column
        var position: Long = 0,
)
