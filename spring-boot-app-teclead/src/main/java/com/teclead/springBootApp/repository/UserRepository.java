package com.teclead.springBootApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teclead.springBootApp.model.User;

/**
 * @author edibi
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFirstName(@Param("firstName") String firstName);

}
