package ru.skypro.homework.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.CommentDTO;
import ru.skypro.homework.dto.Comments;
import ru.skypro.homework.dto.CreateOrUpdateComment;

@Service
public class CommentsService {
    public Comments getCommentsById(Integer id) {
        return null;
    }

    public CommentDTO addComment(Integer id, CreateOrUpdateComment text) {
        return null;
    }

    public void deleteComment(Integer adId, Integer commentId) {
    }

    public CommentDTO updateComment(Integer adId, Integer commentId, CreateOrUpdateComment newComment) {
        return null;
    }
}
