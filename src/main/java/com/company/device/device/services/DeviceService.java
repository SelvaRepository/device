package com.company.device.device.services;

import com.company.device.device.domain.Device;
import com.company.device.device.domain.enums.State;
import com.company.device.device.repository.DeviceRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
	private final DeviceRepository deviceRepository;

	public DeviceService(DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}

	public List<Device> getAll() {
		return deviceRepository.findAll();
	}

	public Device getDeviceById(Long id) {
		return deviceRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public List<Device> getDeviceByState(State state) {
		return deviceRepository.findDeviceByState(state);
	}
	public List<Device> getDeviceByBrand(String brand) {
		return deviceRepository.findDeviceByBrand(brand);
	}
	public Device createDevice(Device device){
		return deviceRepository.save(device);
	}
}
