package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.UserDTO;
import ru.skypro.homework.model.User;
import ru.skypro.homework.repository.UserRepository;
import ru.skypro.homework.service.UserMapperService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapperService userMapperService;

    public UserService(UserRepository userRepository, UserMapperService userMapperService) {
        this.userRepository = userRepository;
        this.userMapperService = userMapperService;
    }

    public UserDTO getUser(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        return userMapperService.mapToDto(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapperService::mapToDto)
                .collect(Collectors.toList());
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapperService.mapToEntity(userDTO);
        user = userRepository.save(user);
        return userMapperService.mapToDto(user);
    }

    public UserDTO updateUser(Integer id, UserDTO userDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        user = userMapperService.updateEntityFromDto(userDTO, user);
        user = userRepository.save(user);
        return userMapperService.mapToDto(user);
    }

    public void deleteUser(Integer id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }

    // ... остальные методы сервиса
}
