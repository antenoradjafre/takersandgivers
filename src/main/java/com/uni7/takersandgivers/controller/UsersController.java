package com.uni7.takersandgivers.controller;

import com.uni7.takersandgivers.Note;
import com.uni7.takersandgivers.Users;
import com.uni7.takersandgivers.exception.ResourceNotFoundException;
import com.uni7.takersandgivers.repository.NoteRepository;
import com.uni7.takersandgivers.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Antenas on 17/09/2018.
 **/
@RestController
@RequestMapping("/api")
public class UsersController {

        @Autowired
        UsersRepository usersRepository;

        // Get All Users
        @GetMapping("/users")
        public List<Users> getAllUsers() {
            return usersRepository.findAll();
        }

        // Create a new Note
        @PostMapping("/users")
        public Users createNote(@Valid @RequestBody Users users) {
            return usersRepository.save(users);
        }

        // Get a Single Users
        public Users getUsersById(@PathVariable(value = "id") Long usersId) {
            return usersRepository.findById(usersId).orElseThrow(() -> new ResourceNotFoundException("Users", "id", usersId));
        }

        // Update a Note
        @PutMapping("/users/{id}")
        public Users updateNote(@PathVariable(value = "id") Long usersId,
                               @Valid @RequestBody Users usersDetails) {

            Users users = usersRepository.findById(usersId)
                    .orElseThrow(() -> new ResourceNotFoundException("Users", "id", usersId));

            users.setName(usersDetails.getName());
            users.setEmail(usersDetails.getEmail());
            users.setItems(usersDetails.getItems());

            return usersRepository.save(users);
        }

        // Delete a Note
        @DeleteMapping("/users/{id}")
        public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long usersId) {
            Users users = usersRepository.findById(usersId)
                    .orElseThrow(() -> new ResourceNotFoundException("Note", "id", usersId));

            usersRepository.delete(users);

            return ResponseEntity.ok().build();
        }
}
