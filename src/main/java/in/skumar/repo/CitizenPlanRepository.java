package in.skumar.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.skumar.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan,Integer>{
		
 @Query("select distinct(planName) from CitizenPlan")
 List<String> getPlanNames();
		
 @Query("select distinct(planStatus) from CitizenPlan")
 List<String> getPlanStatus();
		

}
