package com.argentinaP.PortafolioAP.Repository;

import com.argentinaP.PortafolioAP.Model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill,Integer>{
    @Query(value = "SELECT * FROM skill ORDER BY id_skill DESC", nativeQuery = true)
    List<Skill> getUltimoSkill();
}
