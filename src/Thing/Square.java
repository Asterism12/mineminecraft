package Thing;

import java.awt.Image;

public abstract class Square {
	int id;
	int break_level;
	protected Image pic;//���������е�ͼƬ
	protected Image toolBarPic;//�����е�ͼƬ
    public Image getPic(){
        return pic;
    }
    public Image getToolBarPic() {
        return toolBarPic;
    }
	static String realimgpath="src\\realimages";
	static String bagimgpath="src\\bagimages";
	
	boolean weight=false;//�Ƿ�������
	boolean liquid=false;//�Ƿ���Һ��
	boolean pile=true;//�Ƿ��ܶѵ�
	boolean food=false;//�Ƿ�������
	boolean takeup=true;//�Ƿ��ܼ���
	boolean through=false;//�Ƿ��ܴ���
	boolean putdown=true;//�Ƿ��ܷ���
}
