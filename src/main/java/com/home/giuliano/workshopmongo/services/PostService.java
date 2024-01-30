package com.home.giuliano.workshopmongo.services;

import com.home.giuliano.workshopmongo.domain.Post;
import com.home.giuliano.workshopmongo.domain.User;
import com.home.giuliano.workshopmongo.dto.UserDTO;
import com.home.giuliano.workshopmongo.repository.PostRepository;
import com.home.giuliano.workshopmongo.repository.UserRepository;
import com.home.giuliano.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }


}
