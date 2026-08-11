package com.contactApp.controller;

import com.contactApp.dto.ContactRequestDto;
import com.contactApp.dto.ContactResponseDto;
import com.contactApp.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/create")
    public ResponseEntity<ContactResponseDto> createContact(
            @RequestBody ContactRequestDto requestDto) {

        ContactResponseDto response =
                contactService.createContact(requestDto);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<ContactResponseDto>> getAllContacts() {

        return ResponseEntity.ok(
                contactService.getAllContacts()
        );
    }
    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDto> getById( @PathVariable Long id){
        return ResponseEntity.ok(contactService.getById(id));
    }

}
