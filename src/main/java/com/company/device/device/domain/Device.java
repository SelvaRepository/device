package com.company.device.device.domain;

import com.company.device.device.domain.enums.State;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Entity
@Table(name= "device")
@Getter
@Setter
public class Device {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String brand;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private State state;

	private OffsetDateTime creationTime;
	public Device() { }

	}
