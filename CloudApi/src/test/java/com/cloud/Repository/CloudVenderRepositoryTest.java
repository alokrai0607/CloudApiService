package com.cloud.Repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cloud.Models.CloudVender;
import com.cloud.Repository.CloudVenderRepository;

@DataJpaTest
public class CloudVenderRepositoryTest {
	
	@Autowired	
	private CloudVenderRepository cloudVenderRepository;

	CloudVender cloudVender ;
	
	
	@BeforeEach
	void setUp() {
		CloudVender cloudVender = new CloudVender("1","Flipkart","USA","xxxxxxxxxx");
		cloudVenderRepository.save(cloudVender);
		
	}
	
	@AfterEach
	void tearDown() {
		cloudVender = null;
		cloudVenderRepository.deleteAll();
	}
	
	@Test
	void TestFindByVenderName_Found() {
		List<CloudVender> cloudVenderlist = cloudVenderRepository.findByVenderName("Flipkart");
		assertThat(cloudVenderlist.get(0).getVendorId()).isEqualTo(cloudVender.getVendorId());
		assertThat(cloudVenderlist.get(0).getVendorAddress()).isEqualTo(cloudVender.getVendorAddress());
		assertThat(cloudVenderlist.get(0).getVendorName()).isEqualTo(cloudVender.getVendorName());
		assertThat(cloudVenderlist.get(0).getVendorPhoneNumber()).isEqualTo(cloudVender.getVendorPhoneNumber());
		
	}
	
}
