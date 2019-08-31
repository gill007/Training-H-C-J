package com.echain.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.echain.model.LoginBean;
import com.echain.service.LoginService;

@RestController
public class LoginController {

   @Autowired
   private LoginService loginService;

   /*---Add new book---*/
   @PostMapping("/login")
   public ResponseEntity<?> save(@RequestBody LoginBean login) {
      String id = loginService.save(login);
      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
   }

   /*---Get a book by id---*/
   @GetMapping("/login/{id}")
   public ResponseEntity<LoginBean> get(@PathVariable("id") String id) {
      LoginBean login = loginService.get(id);
      return ResponseEntity.ok().body(login);
   }

   /*---get all books---*/
   @GetMapping("/login")
   public ResponseEntity<List<LoginBean>> list() {
      List<LoginBean> books = loginService.list();
      return ResponseEntity.ok().body(books);
   }

   /*---Update a book by id---*/
   @PutMapping("/login/{id}")
   public ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody LoginBean login) {
      loginService.update(id, login);
      return ResponseEntity.ok().body("Book has been updated successfully.");
   }

   /*---Delete a book by id---*/
   @DeleteMapping("/login/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") String id) {
      loginService.delete(id);
      return ResponseEntity.ok().body("Book has been deleted successfully.");
   }
}

