package com.cloud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.Models.CloudVender;
 
@Repository
public interface CloudVenderRepository extends JpaRepository<CloudVender, String>{
	
	

}
