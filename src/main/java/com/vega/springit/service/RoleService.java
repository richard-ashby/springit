package com.vega.springit.service;

import org.springframework.stereotype.Service;

import com.vega.springit.domain.Role;
import com.vega.springit.repository.RoleRepository;

@Service
public class RoleService {

	private final RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}
}
