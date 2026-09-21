package com.ascanze.expense.tracker.repository;

import com.ascanze.expense.tracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUserId(Long userId);

    List<Transaction> findByUserIdAndDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    List<Transaction> findByUserIdAndCategoryId(Long userId, Long categoryId);
}