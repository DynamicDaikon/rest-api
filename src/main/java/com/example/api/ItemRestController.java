package com.example.api;

import java.util.List;

import com.example.domain.Item;
import com.example.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/items")
public class ItemRestController {
  @Autowired
  ItemService itemService;

  @GetMapping
  List<Item> getItems() {
    List<Item> customers = itemService.findAll();
    return customers;
  }

}
