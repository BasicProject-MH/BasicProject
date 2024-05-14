package vo;

import lombok.Data;

@Data
public class ComplaintsVo {
	private int com_no;
	private int res_no;
	private String admin_id;
	private String com_title;
	private String com_content;
	private String com_indate;
	private String com_state;
}
