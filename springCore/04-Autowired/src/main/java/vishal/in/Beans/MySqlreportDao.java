package vishal.in.Beans;


import org.springframework.stereotype.Repository;

@Repository("mySqlDao")

public class MySqlreportDao implements ReportDao{
	
	public void getData() {
		System.out.println("Getting date from MySqlreportDao....");
	}

}
