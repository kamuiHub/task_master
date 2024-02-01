package dev.kamui.taskmaster.service;

import dev.kamui.taskmaster.dto.user.UserCreationRequest;
import dev.kamui.taskmaster.dto.user.UserResponse;
import dev.kamui.taskmaster.dto.user.UserUpdateRequest;
import dev.kamui.taskmaster.model.User;

import java.util.Optional;

public interface UserService {
    UserResponse createUser(UserCreationRequest user);

    UserResponse updateUserData(UserUpdateRequest user);

    void deleteUser(long id);

    Optional<User> findUserById(long id);

}
