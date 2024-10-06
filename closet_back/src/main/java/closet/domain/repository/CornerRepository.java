package closet.domain.repository;

import closet.domain.display.entity.CornerEntity;
import closet.domain.display.entity._Corner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CornerRepository extends JpaRepository<CornerEntity, Long> {
}
