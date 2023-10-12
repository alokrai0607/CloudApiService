package com.cloud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloud.Exception.CloudVendorNotFoundException;
import com.cloud.Models.CloudVender;
import com.cloud.Repository.CloudVenderRepository;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVenderRepository cloudVenderRepository;

	public CloudVendorServiceImpl(CloudVenderRepository cloudVenderRepository) {
		super();
		this.cloudVenderRepository = cloudVenderRepository;
	}

	// createCloudvendor

	@Override
	public String createCloudvendor(CloudVender cloudVender) {

		cloudVenderRepository.save(cloudVender);

		return "Cloudvendor created Sucessfully";
	}

	// updateCloudvendor
	@Override
	public String updateCloudvendor(CloudVender cloudVender) {

		cloudVenderRepository.save(cloudVender);

		return "Cloudvendor updated Sucessfully";
	}

	// deleteCloudvendor

	@Override
	public String deleteCloudvendor(String cloudVender) {

		cloudVenderRepository.deleteById(cloudVender);

		return "vendor deleted Sucessfully";
	}

	// getCloudvendor
	@Override
	public CloudVender getCloudvendor(String cloudVenderId) {
		if (cloudVenderRepository.findById(cloudVenderId).isEmpty())
			throw new CloudVendorNotFoundException("Cloud Vendor does not Exsits");
		return cloudVenderRepository.findById(cloudVenderId).get();
	}

	// getCloudvendor

	@Override
	public List<CloudVender> getAllcloudVender() {

		return cloudVenderRepository.findAll();
	}

}
