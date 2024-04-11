package com.arnav.joblisting.repository;

import com.arnav.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findbyText(String text);
}
