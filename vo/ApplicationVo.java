package vo;

import lombok.Data;

@Data
public class ApplicationVo {
	private int app_no;
	private String admin_id;
	private int res_no;
	private String app_gubun;
	private String app_content;
	private String app_startdate;
	private String app_enddate;
	private String app_date;
	private String app_permit;
}
