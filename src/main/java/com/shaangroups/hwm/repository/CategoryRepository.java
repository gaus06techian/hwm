package com.shaangroups.hwm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shaangroups.hwm.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
