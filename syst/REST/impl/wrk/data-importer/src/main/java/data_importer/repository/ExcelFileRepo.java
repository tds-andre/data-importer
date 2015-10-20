package data_importer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import data_importer.domain.datasets.ExcelFile;

@RepositoryRestResource(collectionResourceRel = "excel", path = "excel")
public interface ExcelFileRepo extends CrudRepository<ExcelFile, Long> {

}
