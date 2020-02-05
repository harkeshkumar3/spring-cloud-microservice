package com.resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.model.CustomPrincipal;

@RestController
public class ResourceController {
	
	@GetMapping("/admins")
	@PreAuthorize("hasAuthority('ROLE_CREATE_NOTE')")
	public String context() {
		CustomPrincipal principal = (CustomPrincipal) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		return principal.getUsername() + " " + principal.getEmail();
	}

	@GetMapping("/users")
	@PreAuthorize("hasAnyAuthority('ROLE_CREATE_NOTE','ROLE_VIEW_NOTE')")
	public String secured(CustomPrincipal principal) {
		return principal.getUsername() + " " + principal.getEmail();
	}

	@GetMapping("/common")
	public String general() {
		return "common api success";
	}

}
