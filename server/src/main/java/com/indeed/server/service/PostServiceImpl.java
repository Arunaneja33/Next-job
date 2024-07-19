package com.indeed.server.service;

import com.indeed.server.dao.PostDao;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.modal.PostModal;
//import com.indeed.server.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostDao postDao;

    @Override
    public PostModal savePost(PostDTO postDTO) {
        PostModal postModal = new PostModal();

        postModal.setProfile(postDTO.getProfile());
        postModal.setType(postDTO.getType());
        postModal.setDescription(postDTO.getDescription());
        postModal.setExperience(postDTO.getExperience());
        postModal.setTechnology(postDTO.getTechnology());
        postModal.setSalary(postDTO.getSalary());

        return postDao.save(postModal);
    }
}
