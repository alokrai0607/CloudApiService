package com.cloud.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloud.Models.CloudVender;
 

public interface CloudVenderRepository extends JpaRepository<CloudVender, String>{
	List<CloudVender> findByVenderName(String VendorName);
	
	

}
