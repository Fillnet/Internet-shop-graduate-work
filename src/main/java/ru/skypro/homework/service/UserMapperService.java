package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.UserDTO;
import ru.skypro.homework.model.User;

@Service
public class UserMapperService {

    public User mapToEntity(UserDTO userDto) {
        User userEntity = new User();
        userEntity.setUserId(userDto.getId());
        userEntity.setLogin(userDto.getEmail());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setImage(userDto.getImage());
        return userEntity;
    }

    public UserDTO mapToDto(User userEntity) {
        UserDTO userDto = new UserDTO();
        userDto.setId(userEntity.getUserId());
        userDto.setEmail(userEntity.getLogin());
        userDto.setFirstName(userEntity.getFirstName());
        userDto.setLastName(userEntity.getLastName());
        userDto.setPhone(userEntity.getPhone());
        userDto.setImage(userEntity.getImage());
        return userDto;
    }
}
