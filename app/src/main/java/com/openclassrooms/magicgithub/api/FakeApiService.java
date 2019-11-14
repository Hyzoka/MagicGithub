package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    

    @Override
    public List<User> getUsers() {
        return users; //return la liste
    }


    @Override
    public void generateRandomUser() {
        User randomUser ;                         //initialisation
        do { randomUser = User.random();}           //  génère un random user
        while (users.contains(randomUser));         // check si l'élément exist via containts
        users.add(randomUser);                      // add l'élément crée à la liste
    }


    @Override
    public void deleteUser(User user) {
        users.remove(user); // delete via la fonction remove();
    }
}
