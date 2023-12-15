package brc.com.ihp.skill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import brc.com.ihp.common.BaseResponse;
import brc.com.ihp.skill.entity.SkillEntity;
import brc.com.ihp.skill.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public BaseResponse getAll() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(skillRepository.findAll());
        baseResponse.setStatus("success");
        baseResponse.setMessage(null);
        return baseResponse;
    }

    @Override
    public BaseResponse getDetail(long id) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(skillRepository.findById(id));
        baseResponse.setStatus("success");
        baseResponse.setMessage(null);
        return baseResponse;
    }

    @Override
    public BaseResponse save(SkillEntity skillEntity) {
        skillRepository.save(skillEntity);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(99);
        baseResponse.setStatus("success");
        baseResponse.setMessage(null);
        return baseResponse;

    }

    @Override
    public BaseResponse delete(Long id) {
        skillRepository.deleteById(id);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(null);
        baseResponse.setStatus("success");
        baseResponse.setMessage(null);
        return baseResponse;
    }

    @Override
    public BaseResponse updateSkill(SkillEntity skillEntity) {
        skillRepository.save(skillEntity);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(998);
        baseResponse.setStatus("success");
        baseResponse.setMessage(null);
        return baseResponse;
    }

}
