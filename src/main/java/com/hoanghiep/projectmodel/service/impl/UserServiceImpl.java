package com.hoanghiep.projectmodel.service.impl;

import com.hoanghiep.projectmodel.model.Dto.UserDto;
import com.hoanghiep.projectmodel.model.Entity.User;
import com.hoanghiep.projectmodel.repo.UserRepository;
import com.hoanghiep.projectmodel.service.UserService;
import com.hoanghiep.projectmodel.transformer.UserTransformer;
import com.hoanghiep.projectmodel.transformer.UserTransformerImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserTransformer userTransformer;

    @Override
    public List<UserDto> list() {
        return null;
//        return userRepository.findAll().stream().map(userTransformer::toModel).collect(Collectors.toList());
    }

    @Override
    public UserDto findById(long id) {
        return null;
//        return userTransformer.toModel(userRepository.getById(id));
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = userTransformer.toEntity(userDto);
        User userSaved = userRepository.save(user);
        return userTransformer.toModel(userSaved);
    }
}
