package vo;

import lombok.Data;

@Data
public class EntryExitLogVo {
	private int log_no;
	private String dor_id;
	private int res_no;
	private String log_type;
	private String log_date;
}
