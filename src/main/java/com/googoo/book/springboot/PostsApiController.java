package com.googoo.book.springboot;

import com.googoo.book.springboot.dto.PostsResponseDto;
import com.googoo.book.springboot.dto.PostsSaveRequestDto;
import com.googoo.book.springboot.dto.PostsUpdateRequestDto;
import com.googoo.book.springboot.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto postsSaveRequestDto){
        return postsService.save(postsSaveRequestDto);
    }

    @PutMapping("/api/v1/posts")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto postsUpdateRequestDto){
        return postsService.update(id, postsUpdateRequestDto);
    }

    @GetMapping("/api/v1/posts")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
