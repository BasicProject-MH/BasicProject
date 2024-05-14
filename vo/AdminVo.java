package vo;

import lombok.Data;

@Data
public class AdminVo {
	private String admin_id;
	private String admin_password;
	private String admin_name;
	private String admin_role;
	private String admin_telno1;
	private String admin_telno2;
	private String admin_email;
	private String admin_address;
}
