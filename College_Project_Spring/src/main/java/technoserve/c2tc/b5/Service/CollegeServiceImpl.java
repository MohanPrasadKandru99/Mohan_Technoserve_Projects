package technoserve.c2tc.b5.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import technoserve.c2tc.b5.entity.College;
import technoserve.c2tc.b5.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	private CollegeRepository cr;

	
	public CollegeServiceImpl(CollegeRepository cr) {
		super();
		this.cr = cr;
	}

	@Override
	public College saveCollege(College college) {
		return cr.save(college);
	}

	@Override
	public List<College> getAllColleges() {
		return cr.findAll();
	}

	@Override
	public College getCollegeById(int Id) {
		College college= cr.findById(Id).get();
		return college;
	}

	@Override
	public College updateCollege(int Id){//, String Location) 
		College college= cr.findById(Id).get();
		college.setCollegeLocation("Online");
		cr.save(college);
		return college;
	}

	@Override
	public String deleteCollege(int Id) {
		College college= cr.findById(Id).get();
		cr.delete(college);
		return college + "deleted successfully";
	}

}
