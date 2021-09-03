package com.hoanghiep.projectmodel.transformer;

import com.hoanghiep.projectmodel.model.Dto.UserDto;
import com.hoanghiep.projectmodel.model.Entity.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserTransformer {

    UserDto toModel(User user);

    User toEntity(UserDto userDto);
}
