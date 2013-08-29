package cz.boris.logger.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import cz.boris.logger.domain.Report;

@Repository
public interface ReportRepository extends
		PagingAndSortingRepository<Report, String> {

	@Query("{?0 : ?1}")
	Report findByAttributes(String key, String value);

}
