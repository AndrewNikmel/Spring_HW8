package Spring_HW.sem8.services;

import Spring_HW.sem8.aop.TrackUserAction;
import Spring_HW.sem8.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //@Autowired
    private NotificationService notificationService;


    // Внедрение зависимости через конструктор
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @TrackUserAction
    public User createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        // Отправляем уведомление о создании нового пользователя
        notificationService.notifyUser(user);
        return user;
    }
    @TrackUserAction
    public void deleteUser(Long userId) {

    }
}
