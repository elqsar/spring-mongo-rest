package cz.boris.logger.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cz.boris.logger.domain.Report;
import cz.boris.logger.service.ReportService;

@Path("report")
@Component
public class ReportResource {

	private static final String PARAMETER_ID = "id";
	
	@Autowired
	private ReportService reportService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Report> getAllReports() {
		return reportService.getAllReports();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Report getReport(@PathParam(PARAMETER_ID) String id) {
		return reportService.getReport(id);
	}
}
