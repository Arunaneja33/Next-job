package com.indeed.server.controller;

import com.indeed.server.dto.PostDTO;
import com.indeed.server.modal.PostModal;
import com.indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin

public class PostController {
    @Autowired
    final PostService postService;
    @PostMapping("/post")
    public PostModal savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving Post ######");

        return this.postService.savePost(postDTORequest);
    }
}
