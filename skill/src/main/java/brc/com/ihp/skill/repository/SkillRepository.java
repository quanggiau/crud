package brc.com.ihp.skill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import brc.com.ihp.skill.entity.SkillEntity;
import java.util.Optional;


@Repository
public interface SkillRepository extends JpaRepository<SkillEntity, Long> {
    Optional<SkillEntity> findBySkillID(Long skillID);

}
