package com.cloud.Service;

import java.util.List;

import com.cloud.Models.CloudVender;


public interface CloudVendorService {

	public String createCloudvendor(CloudVender cloudVender);

	public String updateCloudvendor(CloudVender cloudVender);

	public String deleteCloudvendor(String cloudVender);

	public CloudVender getCloudvendor(String cloudVender);

	public List<CloudVender> getAllcloudVender();
}
