package brc.com.ihp.skill.service;

import org.springframework.stereotype.Service;

import brc.com.ihp.common.BaseResponse;
import brc.com.ihp.skill.entity.SkillEntity;

@Service
public interface SkillService {

    BaseResponse getAll();

    BaseResponse getDetail(long id);

    BaseResponse save(SkillEntity skillEntity);

    BaseResponse delete(Long id);

    BaseResponse updateSkill(SkillEntity skillEntity);

}