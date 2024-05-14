package vo;

import lombok.Data;

@Data
public class NoticeVo {
	private int notice_no;
	private String admin_id;
	private String notice_title;
	private String notice_writer;
	private String notice_content;
	private String notice_date;
}
