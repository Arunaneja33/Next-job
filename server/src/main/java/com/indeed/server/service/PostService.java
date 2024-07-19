package com.indeed.server.service;

import com.indeed.server.dto.PostDTO;
import com.indeed.server.modal.PostModal;

public interface PostService {
    public PostModal savePost(PostDTO postDTO);
}
