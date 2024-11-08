package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByStatus(String status);

}
