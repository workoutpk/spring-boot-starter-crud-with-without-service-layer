package pk.first.application.pkspringapplication.interfaces;

import pk.first.application.pkspringapplication.model.Space;

import java.util.List;
import java.util.Optional;

public interface SpaceInt {
    Space create(Space space);

    List<Space> findAll();

    Optional<Space> findByCode(String universeName);
}
