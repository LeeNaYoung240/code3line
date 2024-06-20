package sparta.code3line.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sparta.code3line.domain.user.entity.User;

@Repository
public interface SignUpRepository extends JpaRepository<User, Long> {
}
