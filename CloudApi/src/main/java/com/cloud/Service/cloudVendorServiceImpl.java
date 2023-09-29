package com.cloud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloud.Models.CloudVender;
import com.cloud.Repository.CloudVenderRepository;

@Service
public class cloudVendorServiceImpl implements cloudVendorService {

	CloudVenderRepository cloudVenderRepository;

	public cloudVendorServiceImpl(CloudVenderRepository cloudVenderRepository) {
		super();
		this.cloudVenderRepository = cloudVenderRepository;
	}

	@Override
	public String createCloudvendor(CloudVender cloudVender) {

		cloudVenderRepository.save(cloudVender);

		return "Cloudvendor created Sucessfully";
	}

	@Override
	public String updateCloudvendor(CloudVender cloudVender) {
		cloudVenderRepository.save(cloudVender);

		return "Cloudvendor updated Sucessfully";
	}

	@Override
	public String deleteCloudvendor(String cloudVender) {

		cloudVenderRepository.deleteById(cloudVender);

		return "vendor deleted Sucessfully";
	}

	@Override
	public CloudVender getCloudvendor(String cloudVenderId) {

		return cloudVenderRepository.findById(cloudVenderId).get();
	}

	@Override
	public List<CloudVender> getAllcloudVender() {

		return cloudVenderRepository.findAll();
	}

}
