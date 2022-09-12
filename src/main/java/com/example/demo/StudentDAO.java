
package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	@Autowired
	Studentrepo repo;

	public Student insert(Student s) {
	return	repo.save(s);
	}
	public List<Student> insertall(List<Student> s){
		return repo.saveAll(s);
	}

	
	public List<Student> getAll(){
		return repo.findAll();
	}
	public List<Student> getbyname(String name){
		return	repo.findbyname(name);
		}

	
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	//getby id-dao
	public Optional<Student> getbyid(int id){
			return repo.findById(id);
		}


	
		public Student updatebyname(Student s) {
		/* >find the id ->Student record
		 * >store the details into an object of student
		 * >set the value what u want to change
		 * >do the insertion 
		 * 
		 * */
		Student ss=repo.findById(s.getSid()).orElse(null);
		ss.setName(s.getName());
	    return	repo.save(ss);
		
	}
	
	
}
