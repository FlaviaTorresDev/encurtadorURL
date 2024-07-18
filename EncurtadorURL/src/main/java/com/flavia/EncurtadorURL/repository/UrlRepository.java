package com.flavia.EncurtadorURL.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flavia.EncurtadorURL.entitty.UrlEntity;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
