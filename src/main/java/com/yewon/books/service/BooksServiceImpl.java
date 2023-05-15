package com.yewon.books.service;

import com.yewon.books.dto.BooksInfoDTO;
import com.yewon.books.dto.PageRequestDTO;
import com.yewon.books.dto.PageResultDTO;
import com.yewon.books.entity.BooksInfo;
import com.yewon.books.repository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;

    @Override
    public PageResultDTO<BooksInfoDTO, BooksInfo> getList(PageRequestDTO requestDTO) {
        Pageable pageable = requestDTO.getPageable(Sort.by("bno").descending());

        Page<BooksInfo> result = booksRepository.findAll(pageable);

        Function<BooksInfo, BooksInfoDTO> fn = (entity -> entityToDTO(entity));

        return new PageResultDTO<>(result, fn);
    }
}
