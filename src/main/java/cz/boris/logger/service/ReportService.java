package cz.boris.logger.service;

import java.util.List;

import cz.boris.logger.domain.Report;

public interface ReportService {
	
	Report getReport(String id);
	
	List<Report> getAllReports();
	
	Report findByAttribute(String key, String value);
	
	void createReport(Report report);
	
	void deleteReport(String id);

}
