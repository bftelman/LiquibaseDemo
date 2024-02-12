package az.bftelman.LiquibaseDemo.repositories;

import az.bftelman.LiquibaseDemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
