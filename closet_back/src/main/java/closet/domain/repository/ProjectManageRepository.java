package closet.domain.repository;

import closet.domain.display.entity.ProjectManageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectManageRepository extends JpaRepository<ProjectManageEntity, Long> {
}
