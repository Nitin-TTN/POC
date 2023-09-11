package com.poc.elasticsearch.ElasticSearch.repo;

import com.poc.elasticsearch.ElasticSearch.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ElasticsearchRepository<Student,Long> {
}
