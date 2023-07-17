package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.model.Ad;
import ru.skypro.homework.model.User;

@Service
public class AdMapperService {

    public Ad mapToEntity(AdDTO adDTO, User user) {
        Ad adEntity = new Ad();
        adEntity.setPk(adDTO.getPk());
        adEntity.setUser(user);
        adEntity.setImageAddress(adDTO.getImage());
        adEntity.setPrice(adDTO.getPrice());
        adEntity.setTitle(adDTO.getTitle());
                adEntity.setDescription("default description");
        return adEntity;
    }

    public AdDTO mapToDto(Ad adEntity) {
        AdDTO adDTO = new AdDTO();
        adDTO.setPk(adEntity.getPk());
        adDTO.setAuthor(adEntity.getUser().getUserId());
        adDTO.setImage(adEntity.getImageAddress());
        adDTO.setPrice(adEntity.getPrice());
        adDTO.setTitle(adEntity.getTitle());
        return adDTO;
    }
}
