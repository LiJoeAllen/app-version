package top.joeallen.app.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import top.joeallen.app.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
