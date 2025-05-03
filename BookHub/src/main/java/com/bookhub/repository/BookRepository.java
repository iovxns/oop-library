// BookRepository.java
package com.bookhub.repository;

import com.bookhub.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods can be added here
}

// UserRepository.java
package com.bookhub.repository;

import com.bookhub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

// TransactionRepository.java
package com.bookhub.repository;

import com.bookhub.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}