package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course/*要操作的表所对应的model class*/, Long/*primary key data type*/> {
    //根据jpa命名规则命名函数，hibernate就能帮你根据函数的名字生成对应的sql
    Optional<Course> findOneByCourseName(String courseName);
}
