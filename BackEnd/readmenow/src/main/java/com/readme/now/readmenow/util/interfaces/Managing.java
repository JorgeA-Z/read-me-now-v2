package com.readme.now.readmenow.util.interfaces;

import com.readme.now.readmenow.util.DataPageResponse;

public interface Managing<T, ID, RQ, UPD> {
    DataPageResponse getAll(Integer pageNumber, Integer pageSize, Boolean active);
    T create(RQ requestCreate);
    T findById(ID id);
    T update(ID id, UPD requestUpdate);
    void deleteById(ID id);
}
