package com.hoanghiep.projectmodel.controller;

import com.hoanghiep.projectmodel.model.Dto.UserDto;
import com.hoanghiep.projectmodel.model.Entity.User;
import com.hoanghiep.projectmodel.repo.UserRepository;
import com.hoanghiep.projectmodel.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @ApiOperation(value = "List all user", response = Optional.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Thành công"),
            @ApiResponse(code = 401, message = "Chưa xác thực"),
            @ApiResponse(code = 403, message = "Truy cập bị cấm"),
            @ApiResponse(code = 404, message = "Không tìm thấy")
    })
    @GetMapping("/users")
    public Optional<List<User>> list() {
        return Optional.of(userRepository.findAll());
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") long id) {
        return userRepository.getById(id);
    }

    @ApiOperation(value = "Add user", response = Optional.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Thành công"),
            @ApiResponse(code = 401, message = "Chưa xác thực"),
            @ApiResponse(code = 403, message = "Truy cập bị cấm"),
            @ApiResponse(code = 404, message = "Không tìm thấy")
    })
    @PostMapping("/users")
    public UserDto add(@RequestBody UserDto user){
        return userService.save(user);
    }
}
