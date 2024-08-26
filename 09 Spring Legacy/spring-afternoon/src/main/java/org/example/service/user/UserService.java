package org.example.service.user;


import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.example.repository.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);

    }

    public boolean isPasswordValid(User user, String rawPassword) {
        return rawPassword.equals(user.getPassword());
    }

    public User save(User user) {
        user.setRoles("ROLE_MEMBER");
        return userRepository.save(user);
    }
}
