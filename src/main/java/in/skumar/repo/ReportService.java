package in.skumar.repo;

import java.util.List;

import in.skumar.entity.CitizenPlan;
import in.skumar.request.SearchRequest;

public interface ReportService {
	
public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportpdf();
}

	



