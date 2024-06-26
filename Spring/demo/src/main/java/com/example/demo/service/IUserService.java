package com.example.demo.service;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserGetREsponseDto;
import com.example.demo.dto.response.UserPostResponseDto;

import java.util.List;

public class IUserService {

    public UserRequestDto getUserById(Integer id);
    public List<UserGetREsponseDto> getAllUsers();

    public UserRequestDto updateUser(UserRequestDto userRequestDto);

    public UserRequestDto updatePartialUser(UserRequestDto userRequestDto);

    public UserPostResponseDto createUser(UserRequestDto userRequestDto);
}
