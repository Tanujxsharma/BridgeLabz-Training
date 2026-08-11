package com.contactApp.service;

import com.contactApp.dto.ContactRequestDto;
import com.contactApp.dto.ContactResponseDto;
import com.contactApp.entity.Contact;
import com.contactApp.repository.ContactRepository;
import com.contactApp.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactResponseDto createContact(ContactRequestDto requestDto) {

        Contact contact = Contact.builder()
                .name(requestDto.getName())
                .phone(requestDto.getPhone())
                .email(requestDto.getEmail())
                .build();

        Contact savedContact = contactRepository.save(contact);

        return convertToResponseDto(savedContact);
    }

    @Override
    public List<ContactResponseDto> getAllContacts() {

        return contactRepository.findAll()
                .stream()
                .map(this::convertToResponseDto)
                .toList();
    }

    @Override
    public ContactResponseDto getById(Long id) {
        Contact contact = contactRepository.findById(id).orElseThrow(()->
                new RuntimeException("can Not find "));
        return convertToResponseDto(contact);
    }


    private ContactResponseDto convertToResponseDto(Contact contact) {

        return ContactResponseDto.builder()
                .id(contact.getId())
                .name(contact.getName())
                .phone(contact.getPhone())
                .email(contact.getEmail())
                .build();
    }
}