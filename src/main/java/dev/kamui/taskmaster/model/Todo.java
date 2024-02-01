package dev.kamui.taskmaster.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "title not be empty")
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @NotNull
    @Column(name = "access_code", nullable = false, unique = true)
    private UUID accessCode;

    @NotNull
    @Column(name = "date_create", nullable = false)
    private LocalDateTime dateCreate;

    @OneToMany(mappedBy = "todoList")
    private List<Task> myTask;

    @ManyToMany
    @JoinTable(name = "member_list",
            joinColumns = @JoinColumn(name = "todo_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> participants;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(title, todo.title) && Objects.equals(owner, todo.owner) && Objects.equals(accessCode, todo.accessCode) && Objects.equals(dateCreate, todo.dateCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, owner, accessCode, dateCreate);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", owner=" + owner +
                ", accessCode=" + accessCode +
                ", dateCreate=" + dateCreate +
                '}';
    }
}