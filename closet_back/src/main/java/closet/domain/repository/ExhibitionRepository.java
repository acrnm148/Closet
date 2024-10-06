package closet.domain.repository;

import closet.domain.display.entity.ExhibitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhibitionRepository extends JpaRepository<ExhibitionEntity, Long> {
}
