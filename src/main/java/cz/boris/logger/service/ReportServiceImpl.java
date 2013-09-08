package cz.boris.logger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.boris.logger.domain.Report;
import cz.boris.logger.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;

	public Report getReport(String id) {
		if (id == null) {
			throw new IllegalArgumentException("ID should not be null");
		}
		return reportRepository.findOne(id);
	}

	public List<Report> getAllReports() {
		List<Report> result = (List<Report>) reportRepository.findAll();
		return result;
	}

	public Report findByAttribute(String key, String value) {
		if (key != null && value != null)
			return reportRepository.findByAttributes(key, value);
		throw new IllegalArgumentException("KEY or VALUE should not be null");
	}

	public void createReport(Report report) {
		if(report != null) {
			reportRepository.save(report);
		}
	}

	public void deleteReport(String id) {
		Report report = reportRepository.findOne(id);
		if(report == null) return;
		reportRepository.delete(report);
	}

}
