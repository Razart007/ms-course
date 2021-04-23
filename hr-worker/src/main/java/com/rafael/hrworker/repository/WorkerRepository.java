package com.rafael.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
