package vo;

import lombok.Data;

@Data
public class FinancialTransactionVo {
	private int ft_no;
	private String fee_id;
	private int res_no;
	private String ft_date;
	private String ft_type;
	private int ft_transaction;
}
