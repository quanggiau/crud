package brc.com.ihp.skill.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class SkillEntity {
    /**
     * Skill Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillID;

    /**
     * Skill Name
     */
    @Column(name = "skill_name", nullable = false)
    private String skillName;

    /**
     * Skill Code
     */
    @Column(name = "skill_code", nullable = false, length = 40)
    private String skillCode;

    /**
     * Skill Description
     */
    @Column(name = "skill_description", length = 2000)
    private String skillDescription;

    @Column(name = "company_id", nullable = false)
    private int companyID;

    @Column(name = "is_delete", columnDefinition = "boolean default false")
    private boolean isDelete;

    /**
     * @return Long return the skillID
     */
    public Long getSkillID() {
        return skillID;
    }

    /**
     * @param skillID the skillID to set
     */
    public void setSkillID(Long skillID) {
        this.skillID = skillID;
    }

    /**
     * @return String return the skillName
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * @param skillName the skillName to set
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * @return String return the skillCode
     */
    public String getSkillCode() {
        return skillCode;
    }

    /**
     * @param skillCode the skillCode to set
     */
    public void setSkillCode(String skillCode) {
        this.skillCode = skillCode;
    }

    /**
     * @return String return the skillDescription
     */
    public String getSkillDescription() {
        return skillDescription;
    }

    /**
     * @param skillDescription the skillDescription to set
     */
    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    /**
     * @return int return the companyID
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * @param companyID the companyID to set
     */
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    /**
     * @return boolean return the isDelete
     */
    public boolean isIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete the isDelete to set
     */
    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

}
