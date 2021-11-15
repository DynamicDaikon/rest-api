package com.example.repository;

import com.example.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.sql.*;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
