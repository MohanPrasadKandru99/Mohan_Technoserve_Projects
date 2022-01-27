package technoserve.c2tc.b5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import technoserve.c2tc.b5.Service.CollegeService;
import technoserve.c2tc.b5.entity.College;

@RestController
@RequestMapping
public class CollController {
	
	@Autowired
	CollegeService cs;
	
	// to get all college records
	@GetMapping("/getcolleges")
	public List<College> getAllColleges(){
		 return cs.getAllColleges();
	}
	
	//to add college record 
	@PostMapping("/addcollege")
	public void addCollege(@RequestBody College college) {
		 cs.saveCollege(college);
	}
	
	//to get college record by id
	@GetMapping("/getcollege/{Id}")
	public College getCollegeById(@PathVariable int Id) {
		return cs.getCollegeById(Id);
	}
	
	//to update record by id
	@PutMapping("/updatecollege/{Id}")
	public College updateCollege(@PathVariable int Id) {//, String Location) {
		return cs.updateCollege(Id);//, Location);
	}
	
	@DeleteMapping("deletemapping/{Id}")
	public String deleteCollege(@PathVariable int Id) {
		return cs.deleteCollege(Id);
	}
}
