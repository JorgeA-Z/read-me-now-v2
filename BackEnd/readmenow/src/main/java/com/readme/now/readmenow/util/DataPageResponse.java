package com.readme.now.readmenow.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DataPageResponse {
    private List<?> data;
    private long totalElements;
    private boolean isFirst;
    private boolean isLast;
    private int pageNumber;
    private int totalPages;

    public static DataPageResponse createDataPaging(Page<?> resultPage) {
        DataPageResponse dataPaging = new DataPageResponse();
        dataPaging.setData(resultPage.getContent());
        dataPaging.setTotalElements(resultPage.getTotalElements());
        dataPaging.setFirst(resultPage.isFirst());
        dataPaging.setPageNumber(resultPage.getNumber());
        dataPaging.setTotalPages(resultPage.getTotalPages());
        dataPaging.setLast(resultPage.isLast());
        return dataPaging;
    }
}
