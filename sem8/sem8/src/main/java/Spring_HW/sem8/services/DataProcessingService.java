package Spring_HW.sem8.services;

import Spring_HW.sem8.aop.TrackUserAction;
import Spring_HW.sem8.domain.User;
import Spring_HW.sem8.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataProcessingService {
    private final UserRepository userRepository;

    public DataProcessingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @TrackUserAction
    public UserRepository getRepository() {
        return userRepository;
    }
    public List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
    }
    @TrackUserAction
    public List<User> filterUsersByAge(List<User> users, int age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }
    @TrackUserAction
    public double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }
    @TrackUserAction
    public void addUserToList(User user) {
        userRepository.save(user);
        // Используем метод save для добавления пользователя в базу данных
    }
}
