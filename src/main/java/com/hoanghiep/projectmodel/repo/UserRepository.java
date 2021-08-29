package com.hoanghiep.projectmodel.repo;

import com.hoanghiep.projectmodel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
