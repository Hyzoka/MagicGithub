package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers();   //recupère le user via l'interface apiService
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();  //genère le user via l'interface apiService
    }

    public void deleteUser(User user) { //genère le user via l'interface apiService
        apiService.deleteUser(user);
    }
}
