package com.readme.now.readmenow.util.interfaces;

import com.readme.now.readmenow.util.DataPageResponse;
import org.springframework.http.ResponseEntity;

public interface Controller <T, ID, RQ, UPD> {
    ResponseEntity<DataPageResponse> getAll(Integer pageNumber, Integer pageSize, Boolean active);
    ResponseEntity<T> getById(ID id);
    ResponseEntity<T> create(RQ requestCreate);
    ResponseEntity<T> update(ID id, UPD requestUpdate);
    ResponseEntity<Void> deleteById(ID id);
}
