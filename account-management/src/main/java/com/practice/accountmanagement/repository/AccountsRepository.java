package com.practice.accountmanagement.repository;

import com.practice.accountmanagement.domain.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findByCustomerId(Long customerId);
    void deleteByCustomerId(Long customerId);
}
