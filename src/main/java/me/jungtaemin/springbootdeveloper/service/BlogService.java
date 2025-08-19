package me.jungtaemin.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jungtaemin.springbootdeveloper.domain.Article;
import me.jungtaemin.springbootdeveloper.dto.AddArticleRequest;
import me.jungtaemin.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
