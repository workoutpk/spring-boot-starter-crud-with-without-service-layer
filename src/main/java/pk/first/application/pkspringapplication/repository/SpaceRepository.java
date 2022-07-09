package pk.first.application.pkspringapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pk.first.application.pkspringapplication.model.Space;

import java.util.Optional;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Long> {

}
