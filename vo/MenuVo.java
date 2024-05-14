package vo;

import lombok.Data;

@Data
public class MenuVo {
	private int menu_id;
	private String menu_date;
	private String menu_breakfast;
	private String menu_lunch;
	private String menu_dinner;
	private String menu_remark;
}
