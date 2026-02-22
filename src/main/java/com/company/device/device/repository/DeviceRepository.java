package com.company.device.device.repository;

import com.company.device.device.domain.Device;
import com.company.device.device.domain.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Long> {
	List<Device> findDeviceByState(State state);
	List<Device> findDeviceByBrand(String brandName);
}
