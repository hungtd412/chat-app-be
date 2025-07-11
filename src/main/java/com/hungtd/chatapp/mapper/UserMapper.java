package com.hungtd.chatapp.mapper;

import com.hungtd.chatapp.dto.request.UserCreationRequest;
import com.hungtd.chatapp.dto.response.UserResponse;
import com.hungtd.chatapp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "isActive", constant = "false")
    @Mapping(target = "isBlocked", constant = "false")
    User toUser(UserCreationRequest userCreationRequest);

    UserResponse toUserResponse(User user);
}
