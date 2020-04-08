package vs.lc.lc_001_1.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LC_001_1_VO {

	private String lc_index;	//�Խñ� ��ȣ
	private String m_index;		//�ۼ��� ��� ��ȣ
	private String lc_title;	//�Խñ� ����
	private String lc_type;		//�Խñ� ����(������, ����)
	private String lc_distance;	//�Ÿ�
	private String lc_run;		//���� �ð�
	private String lc_cycle;	//������ �ð�
	private String lc_area1;	//����1 (��)
	private String lc_area2;	//����2 (��)
	private String lc_area3;	//����3 (��)
	private String lc_thumbnail;	//�����
	private String lc_text;		//����
	private String lc_date;		//�ۼ� ��¥
	private int lc_good;		//���ƿ� ��
	private int lc_see;			//��ȸ��
	private String lc_record;	//��� ���
	private String lc_address;	//���ּ�
	private String lc_xy_arr;	//��ǥ ��ġ
	
}
