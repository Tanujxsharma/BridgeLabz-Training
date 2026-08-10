package com.contactApp.service;

import com.contactApp.dto.ContactRequestDto;
import com.contactApp.dto.ContactResponseDto;

import java.util.List;

public interface ContactService {
    ContactResponseDto createContact(ContactRequestDto requestDto);
    List<ContactResponseDto> getAllContacts();
}
