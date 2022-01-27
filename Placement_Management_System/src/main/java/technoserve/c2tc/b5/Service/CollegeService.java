package technoserve.c2tc.b5.Service;

import java.util.List;

import technoserve.c2tc.b5.entity.College;

public interface CollegeService {
	College saveCollege(College college);
	List<College> getAllColleges();
	College getCollegeById(int Id);
	College updateCollege(int Id);//, String location);
	String deleteCollege(int Id);
}