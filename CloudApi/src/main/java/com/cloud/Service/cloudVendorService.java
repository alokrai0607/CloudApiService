package com.cloud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloud.Models.CloudVender;

@Service
public interface cloudVendorService {

	public String createCloudvendor(CloudVender cloudVender);

	public String updateCloudvendor(CloudVender cloudVender);

	public String deleteCloudvendor(String cloudVender);

	public CloudVender getCloudvendor(String cloudVender);

	public List<CloudVender> getAllcloudVender();
}
