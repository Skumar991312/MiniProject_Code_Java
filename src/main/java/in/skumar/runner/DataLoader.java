package in.skumar.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.skumar.entity.CitizenPlan;
import in.skumar.repo.CitizenPlanRepository;
	
	
@Component
public class DataLoader implements ApplicationRunner {

   @Autowired
   private CitizenPlanRepository repo;
		
@Override
public void run(ApplicationArguments args) throws Exception {
	
		repo.deleteAll();
	 
		//Cash plan Date
		CitizenPlan c1=new CitizenPlan();
		c1.setCitizenName("Sandeep");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		
		CitizenPlan c2=new CitizenPlan();
		c2.setCitizenName("Pradeep");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
	 	c2.setDenialReason("Rental Income");
	 	
	 	
	 	CitizenPlan c3=new CitizenPlan();
		c3.setCitizenName("Mohan");
		c3.setGender("Male");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated"); 
	 	c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6 ));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationRsn("Employed");
		
		
		
		//Food Plan Data
		CitizenPlan c4=new CitizenPlan();
		c4.setCitizenName("David");
		c4.setGender("Male");
		c4.setPlanName("Food Plan");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(4000.00);
		
		
		CitizenPlan c5=new CitizenPlan();
		c5.setCitizenName("Pradeep");
		c5.setGender("Male");
		c5.setPlanName("Food Plan");
		c5.setPlanStatus("Denied");
	 	c5.setDenialReason("Property Name");
	 	
	 	
	 	CitizenPlan c6=new CitizenPlan();
		c6.setCitizenName("Catthy");
		c6.setGender("Fe-male");
		c6.setPlanName("Food Plan");
		c6.setPlanStatus("Terminated"); 
	 	c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6 ));
		c6.setBenefitAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationRsn("House Made");
		
		
		    //Medical Plan Data
			CitizenPlan c7=new CitizenPlan();
			c7.setCitizenName("Charls");
			c7.setGender("Male");
			c7.setPlanName("Medical Plan");
			c7.setPlanStatus("Approved");
			c7.setPlanStartDate(LocalDate.now());
			c7.setPlanEndDate(LocalDate.now().plusMonths(6));
			c7.setBenefitAmt(8000.00);
			
			
			CitizenPlan c8=new CitizenPlan();
			c8.setCitizenName("Piter");
			c8.setGender("Male");
			c8.setPlanName("Medical Plan");
			c8.setPlanStatus("Denied");
		 	c8.setDenialReason("Worker");
		 	
		 	
		 	CitizenPlan c9=new CitizenPlan();
			c9.setCitizenName("Rohan");
			c9.setGender("male");
			c9.setPlanName("Medical Plan");
			c9.setPlanStatus("Terminated"); 
		 	c9.setPlanStartDate(LocalDate.now().minusMonths(4));
			c9.setPlanEndDate(LocalDate.now().plusMonths(6 ));
			c9.setBenefitAmt(5000.00);
			c9.setTerminatedDate(LocalDate.now());
			c9.setTerminationRsn("Govt Jobs");
		
			
			
			 //Employment Plan Data
			
			CitizenPlan c10=new CitizenPlan();
			c10.setCitizenName("Nil");
			c10.setGender("Male");
			c10.setPlanName("Employement Plan");
			c10.setPlanStatus("Approved");
			c10.setPlanStartDate(LocalDate.now());
			c10.setPlanEndDate(LocalDate.now().plusMonths(6));
			c10.setBenefitAmt(3000.00);
			
			
			CitizenPlan c11=new CitizenPlan();
			c11.setCitizenName("Sita");
			c11.setGender("Fe-Male");
			c11.setPlanName("Employement Plan");
			c11.setPlanStatus("Denied");
		 	c11.setDenialReason("Social Worker");
		 	
		 	
		 	CitizenPlan c12=new CitizenPlan();
			c12.setCitizenName("Satish");
			c12.setGender("male");
			c12.setPlanName("Employement Plan");
			c12.setPlanStatus("Terminated"); 
		 	c12.setPlanStartDate(LocalDate.now().minusMonths(4));
			c12.setPlanEndDate(LocalDate.now().plusMonths(6 ));
			c12.setBenefitAmt(6000.00);
			c12.setTerminatedDate(LocalDate.now());
			c12.setTerminationRsn("Student Person");
		
			
		List<CitizenPlan> list=Arrays.asList(c1,c2,c3,c4,c5,c5,c6,c7,c8,c9,c10,c11,c12);
		
		     repo.saveAll(list);
	}
	}
			
