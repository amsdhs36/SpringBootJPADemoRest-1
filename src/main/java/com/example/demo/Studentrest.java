package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentrest {
@Autowired
	StudentDAO dao;


@PostMapping("/insert")
public Student insert(@RequestBody Student s) {
	return dao.insert(s);
}
@PostMapping("/insertall")
public List<Student> insertall(@RequestBody List<Student> s){
	return dao.insertall(s);
}
@GetMapping("/getall")
public List<Student> getAll(){
	return dao.getAll();
}
@GetMapping("/getbyid/{id}")
public Optional<Student> getbyid(@PathVariable("id") int id){
	return dao.getbyid(id);
}
@PutMapping("/update")
public Student updatebyname(@RequestBody Student s) {
return	dao.updatebyname(s);
	
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id) {
	dao.delete(id);	
	return "deleted value is " + id;
}
@GetMapping("getbyname/{name}")
public List<Student> getbyname(@PathVariable String name){
	return	dao.getbyname(name);
	}



}
