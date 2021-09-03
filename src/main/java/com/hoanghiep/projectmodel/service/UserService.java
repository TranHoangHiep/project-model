package com.hoanghiep.projectmodel.service;

import com.hoanghiep.projectmodel.model.Dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> list();

    UserDto findById(long id);

    UserDto save(UserDto userDto);
}
