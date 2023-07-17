package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.Ads;
import ru.skypro.homework.dto.CreateOrUpdateAd;
import ru.skypro.homework.dto.ExtendedAd;

@Service
public class AdService {
    public Object getAllAds() {
        return null;
    }

    public AdDTO addAd(CreateOrUpdateAd properties, MultipartFile file) {
        return null;
    }

    public ExtendedAd getAds(Integer id) {
        return null;
    }

    public void removeAd(Integer id) {
    }

    public AdDTO updateAds(Integer id, CreateOrUpdateAd newAds) {
        return null;
    }

    public Ads getAdsAllUser() {
        return null;
    }

    public AdDTO updateImage(Integer id, MultipartFile image) {
        return null;
    }
}
