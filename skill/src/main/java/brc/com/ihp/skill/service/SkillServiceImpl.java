package brc.com.ihp.skill.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import brc.com.ihp.skill.repository.SkillRepository;
import brc.com.ihp.skill.entity.SkillEntity;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<SkillEntity> getAll() {
        return skillRepository.findAll();
    }

    @Override
    public Optional<SkillEntity> getDetail(long id) {
        return skillRepository.findBySkillID(id);
    }

    @Override
    public String save(SkillEntity skillEntity) {
        skillRepository.save(skillEntity);
        return "Save ok";
    }

    @Override
    public String delete(Long id) {
        skillRepository.deleteById(id);
        return "Delete SkillID " + id + " OK";
    }

    @Override
    public SkillEntity updateSkill(SkillEntity skillEntity) {
        return skillRepository.save(skillEntity);
    }

}
