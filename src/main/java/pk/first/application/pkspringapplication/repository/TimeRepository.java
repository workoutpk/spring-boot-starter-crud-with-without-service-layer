package pk.first.application.pkspringapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.first.application.pkspringapplication.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long > {
}
