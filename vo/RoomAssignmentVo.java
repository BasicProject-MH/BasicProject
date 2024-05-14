package vo;

import lombok.Data;

@Data
public class RoomAssignmentVo {
	private String room_no;
	private int res_no;
	private String room_checkin;
	private String room_checkout;
}
