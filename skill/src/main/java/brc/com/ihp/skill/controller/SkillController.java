package brc.com.ihp.skill.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import brc.com.ihp.common.BaseResponse;
import brc.com.ihp.skill.entity.SkillEntity;
import brc.com.ihp.skill.service.SkillService;

@RestController
public class SkillController {
    private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skills")
    public ResponseEntity<?> getAll() {
        BaseResponse baseResponse = skillService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
    }

    @GetMapping("/skills/{id}")
    public ResponseEntity<?> getDetail(@PathVariable(value = "id") Long id) {
        BaseResponse baseResponse = skillService.getDetail(id);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);

    }

    @PostMapping("/skills")
    public ResponseEntity<?> save(@RequestBody SkillEntity skillEntity) {
        BaseResponse baseResponse = skillService.save(skillEntity);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);

    }

    @DeleteMapping("skills/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        BaseResponse baseResponse = skillService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);

    }

    @PutMapping("skills/{id}")
    public ResponseEntity<?> updateSkill(@RequestBody SkillEntity skillEntity) {
        BaseResponse baseResponse = skillService.updateSkill(skillEntity);
        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
    }

}
