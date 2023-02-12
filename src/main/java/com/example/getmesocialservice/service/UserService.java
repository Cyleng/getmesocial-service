package com.example.getmesocialservice.service;
import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("UserService")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public  User saveUser(com.example.getmesocialservice.model.User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserById(String userId){
        return userRepository.findById(userId);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
}
