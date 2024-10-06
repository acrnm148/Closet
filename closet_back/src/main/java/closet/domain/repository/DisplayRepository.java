package closet.domain.repository;

import closet.domain.display.entity.DisplayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayRepository extends JpaRepository<DisplayEntity, Long> {
}
