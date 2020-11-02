package com.che.assignmentmaven.repository;

import com.che.assignmentmaven.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Students,Integer> {
}
