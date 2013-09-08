package cz.boris.logger.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cz.boris.logger.domain.Report;
import cz.boris.logger.repository.ReportRepository;

public class ReportRepositoryTest extends AbstractTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ReportRepository reportRepository;
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void getReports() {
		List<Report> result = (List<Report>) reportRepository.findAll();
		logger.info("Result first id: {}", result.get(0).getId());
		assertNotNull(result);
		assertEquals(2, result.size());
	}
	
	@Test
	public void findByAttributeTest() {
		Report report = (Report) reportRepository.findByAttributes("device", "HTC One");
		logger.info(report.toString());
		assertNotNull(report);
	}
	
	@Test
	@Ignore
	public void cleanUp() {
		reportRepository.deleteAll();
	}

}
