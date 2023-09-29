package com.cloud.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.Models.CloudVender;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorApiService {

	CloudVender cloudVender;

	// http://localhost:8080/cloudVendor/07 (Get)
	@GetMapping("{vendorId}")
	public CloudVender getCloudVenderdetails(String vendorId) {

		return cloudVender;

	}

	// http://localhost:8080/cloudVendor (Post)

	/*
	 * { "vendorId": "07", "vendorName": "Alok", "vendorAddress": "Bhagwanpur",
	 * "vendorPhoneNumber": "90444414580" }
	 */

	@PostMapping
	public String createCloudVenderDetails(@RequestBody CloudVender cloudVender) {

		this.cloudVender = cloudVender;

		return "Cloud vender created Successfully";

	}
     
	//localhost:8080/cloudVendor
	/*{
	    "vendorId": "07",
	    "vendorName": "Alok Rai Shivam",
	    "vendorAddress": "Bhagwanpur",
	    "vendorPhoneNumber": "90444414580"
	}*/
	
	@PutMapping
 	public String UpdateCloudVenderDetails(@RequestBody CloudVender cloudVender) {

		this.cloudVender = cloudVender;

		return "Cloud vender updated Successfully";

	}
	//http://localhost:8080/cloudVendor/07 (delete)
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {

		this.cloudVender = null;

		return "Cloud vender deleted Successfully";

	}

}
