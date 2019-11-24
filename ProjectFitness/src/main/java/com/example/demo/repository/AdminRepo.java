package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	//...<Student is object......,data type of primary id>.....

}
