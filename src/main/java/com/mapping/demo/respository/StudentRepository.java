package com.mapping.demo.respository;

import com.mapping.demo.dto.CustomStudent;
import com.mapping.demo.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

           @Query(value="select id,psp,name from student",nativeQuery = true)
           List<Student> findAllPspAndName();
           @Query(value="select psp,name from student",nativeQuery = true)
           List<CustomStudent> findPspAndName();
}
