package com.company.device.device.domain;

import com.company.device.device.domain.enums.State;
import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name= "device")
@Getter
@Setter
@Builder
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


	public Device(Long id, String name, State state, String brand) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.brand = brand;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public State getState() { return state; }
	public void setState(State state) { this.state = state; }

	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }

	}
