package com.lionde.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PaginationDTO<T> {

    private List<T> Data;
    private boolean showPrevious;
    private boolean showNext;
    private boolean showFirstPage;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.page = page;
        this.totalPage = totalPage;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0)
                pages.add(0, page - i);
            if (page + i <= totalPage)
                pages.add(page + i);
        }
        showPrevious = !(page == 1);
        showNext = !(page == totalPage);
        showFirstPage = !pages.contains(1);
        showEndPage = !pages.contains(totalPage);
    }
}