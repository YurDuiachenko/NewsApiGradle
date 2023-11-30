package com.example.newsapigradle.services;

import com.example.newsapigradle.dtos.NewDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface NewService {
    List<NewDTO> searchAll(String query);

    List<NewDTO> search(String query, int page);

    List<NewDTO> findAll(String query, Sort sort);

    List<NewDTO> findAll(String query);

    List<NewDTO> find(String query, int page, Sort sort);

    List<NewDTO> find(String query, int page);

    List<NewDTO> findRatingAll();

    List<NewDTO> searchRatingAll();

}
