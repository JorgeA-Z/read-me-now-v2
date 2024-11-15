package com.readme.now.readmenow.structure.author.infrastructure.adapter.input.controller.output;

import com.readme.now.readmenow.structure.author.application.input.ManagingAuthors;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.controller.input.ContractAuthor;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestCreate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.request.AuthorRequestUpdate;
import com.readme.now.readmenow.structure.author.infrastructure.adapter.input.response.AuthorResponse;
import com.readme.now.readmenow.util.DataPageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/readmenow/authors")
@AllArgsConstructor
public class AuthorController implements ContractAuthor {
    private final ManagingAuthors managingAuthors;

    @GetMapping
    @Override
    public ResponseEntity<DataPageResponse> getAll(@RequestParam(defaultValue = "0") Integer pageNumber, @RequestParam(defaultValue = "25") Integer pageSize, @RequestParam(required = false) Boolean active) {
        DataPageResponse dataPageResponse = managingAuthors.getAll(pageNumber, pageSize, active);
        return new ResponseEntity<>(dataPageResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AuthorResponse> getById(@PathVariable Integer integer) {
        return null;
    }

    @Override
    public ResponseEntity<AuthorResponse> create(@RequestBody AuthorRequestCreate requestCreate) {
        return null;
    }

    @Override
    public ResponseEntity<AuthorResponse> update(@PathVariable Integer integer, @RequestBody AuthorRequestUpdate requestUpdate) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteById(@PathVariable Integer integer) {
        return null;
    }
}
