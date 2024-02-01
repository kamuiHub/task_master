package dev.kamui.taskmaster.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "title not be empty")
    @Column(name = "title", nullable = false)
    private String title;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "todo_id", nullable = false)
    private Todo todoList;

    @Column(name = "description")
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "performer_id")
    private User performer;

    @NotNull
    @NotBlank(message = "state not be empty")
    @Enumerated(value = EnumType.STRING)
    @Column(name = "state", nullable = false)
    private State state;

    @NotNull
    @Column(name = "date_create", nullable = false)
    private LocalDateTime dateCreate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) && Objects.equals(todoList, task.todoList) && Objects.equals(performer, task.performer) && Objects.equals(dateCreate, task.dateCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, todoList, performer, dateCreate);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", todoList=" + todoList +
                ", description='" + description + '\'' +
                ", performer=" + performer +
                ", state=" + state +
                ", dateCreate=" + dateCreate +
                '}';
    }
}
