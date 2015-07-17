package data_importer.domain.fields;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;

import data_importer.domain.Version;

@Entity
public abstract class Mapping extends Version {	
	
	@OneToMany(mappedBy="mapping", targetEntity=Field.class, fetch=FetchType.LAZY)
	private List<Field> fields;

}