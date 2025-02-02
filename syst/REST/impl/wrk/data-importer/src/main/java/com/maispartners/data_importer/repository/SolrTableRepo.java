package com.maispartners.data_importer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maispartners.data_importer.domain.datasets.*;

@RepositoryRestResource(collectionResourceRel = "solrtable", path = "solrtable")
public interface SolrTableRepo extends CrudRepository<SolrTable, Long> {

}
