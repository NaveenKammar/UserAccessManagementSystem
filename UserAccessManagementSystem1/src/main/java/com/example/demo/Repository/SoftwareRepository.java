package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Software;

public interface SoftwareRepository extends JpaRepository<Software, Long> {
	
}


