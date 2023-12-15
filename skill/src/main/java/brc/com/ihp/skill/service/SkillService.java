package brc.com.ihp.skill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import brc.com.ihp.skill.entity.SkillEntity;

@Service
public interface SkillService {

    List<SkillEntity> getAll();

    Optional<SkillEntity> getDetail(long id);

    String save(SkillEntity skillEntity);

    String delete(Long id);

    SkillEntity updateSkill(SkillEntity skillEntity);

}