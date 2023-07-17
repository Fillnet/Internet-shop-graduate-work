package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.CommentDTO;
import ru.skypro.homework.model.Comment;
import ru.skypro.homework.model.Ad;
import ru.skypro.homework.model.User;

@Service
public class CommentMapperService {

    public Comment mapToEntity(CommentDTO commentDTO, User user, Ad ad) {
        Comment commentEntity = new Comment();
        commentEntity.setCommentId(commentDTO.getPk().longValue()); // Convert Integer to Long
        commentEntity.setAuthor(user);
        commentEntity.setAd(ad);
        commentEntity.setText(commentDTO.getText());
        commentEntity.setCreatedTime(commentDTO.getCreatedAt());
        return commentEntity;
    }

    public CommentDTO mapToDto(Comment commentEntity) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setPk(commentEntity.getCommentId().intValue()); // Convert Long to Integer
        commentDTO.setAuthor(commentEntity.getAuthor().getUserId());
        commentDTO.setAuthorFirstName(commentEntity.getAuthor().getFirstName());
        commentDTO.setAuthorImage(commentEntity.getAuthor().getImage());
        commentDTO.setCreatedAt(commentEntity.getCreatedTime());
        commentDTO.setText(commentEntity.getText());
        return commentDTO;
    }
}
