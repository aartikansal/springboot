package com.zipcode.moneymanager.WebMVC.Repository;


import com.zipcode.moneymanager.WebMVC.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByName(String name);
}
