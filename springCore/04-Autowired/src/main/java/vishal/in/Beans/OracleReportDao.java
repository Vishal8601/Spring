package vishal.in.Beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleReportDao implements ReportDao{
	
	public void getData() {
		System.out.println("Getting Data Form Oracle Report Dao....");
	}

}
