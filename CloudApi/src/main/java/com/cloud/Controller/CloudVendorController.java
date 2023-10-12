package com.cloud.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.Models.CloudVender;
import com.cloud.Service.CloudVendorService;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController {

	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	// http://localhost:8080/cloudVendor/07 (Get)
	@GetMapping("{vendorId}")
	public CloudVender getCloudVenderdetails(@PathVariable("vendorId") String vendorId) {

		return cloudVendorService.getCloudvendor(vendorId);

	}

	// http://localhost:8080/cloudVendor/07 (Get All)
	@GetMapping()
	public List<CloudVender> getAllCloudVenderdetails() {

		return cloudVendorService.getAllcloudVender();

	}

	// http://localhost:8080/cloudVendor (Post)

	/*
	 * { "vendorId": "07", "vendorName": "Alok", "vendorAddress": "Bhagwanpur",
	 * "vendorPhoneNumber": "90444414580" }
	 */

	@PostMapping
	public String createCloudVenderDetails(@RequestBody CloudVender cloudVender) {

		cloudVendorService.createCloudvendor(cloudVender);

		return "Cloud vender created Successfully";

	}

	// localhost:8080/cloudVendor
	/*
	 * { "vendorId": "07", "vendorName": "Alok Rai Shivam", "vendorAddress":
	 * "Bhagwanpur", "vendorPhoneNumber": "90444414580" }
	 */

	@PutMapping
	public String UpdateCloudVenderDetails(@RequestBody CloudVender cloudVender) {

		cloudVendorService.updateCloudvendor(cloudVender);

		return "Cloud vender updated Successfully";

	}

	// http://localhost:8080/cloudVendor/07 (delete)
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId")  String vendorId) {

		cloudVendorService.deleteCloudvendor(vendorId);

		return "Cloud vender deleted Successfully";

	}

}
