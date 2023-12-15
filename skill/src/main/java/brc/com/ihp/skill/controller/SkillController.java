package brc.com.ihp.skill.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import brc.com.ihp.skill.entity.SkillEntity;
import brc.com.ihp.skill.service.SkillService;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class SkillController {
    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skill/getall")
    public List<SkillEntity> getAll() {
        return skillService.getAll();
    }

    @GetMapping("/skill/{id}")
    public Optional<SkillEntity> getDetail(@PathVariable(value = "id") Long id) {
        return skillService.getDetail(id);

    }

    @PostMapping("/skill/save")
    public String save(@RequestBody SkillEntity skillEntity) {
       return skillService.save(skillEntity);
        
    }

    @GetMapping("skill/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id) {
        return skillService.delete(id);
    }
    
    @PutMapping("skill/update")
    public SkillEntity updateSkill(@RequestBody SkillEntity skillEntity) {
        return skillService.updateSkill(skillEntity);
    }
    

}
