package com.example.usermanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private List<User> users = new ArrayList<>(Arrays.asList(new User(1, "Alan", "Grenspan"),
            new User(2, "Sorhos", "Corcos")));

    // request all users
    public List<User> getAllUsers() {
        return users;
    }

    // request to add a new user
    public void addUser(User user) {
        users.add(user);
    }

    // request to delete a user

    public void deleteUser(int id) {
        users.removeIf(p -> p.getId() == id);
    }

    // request to receive a specific user
    public User getUser(int id) {
        return users.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .get();
    }

    // request to update a specific user
    public void updateUser(int id, User user) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getId() == id) {
                users.set(1, user);
            }
        }
    }

}
