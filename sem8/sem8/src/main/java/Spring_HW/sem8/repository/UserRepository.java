package Spring_HW.sem8.repository;

import Spring_HW.sem8.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Интерфейс UserRepository предоставляет методы для взаимодействия с базой данных пользователей.
 * Наследуется от JpaRepository для обеспечения CRUD-операций.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
