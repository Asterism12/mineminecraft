package Thing;

import java.awt.Image;

public abstract class Square {
    public int id;
    public int breakLevel;
    protected Image pic;//���������е�ͼƬ
    protected Image toolBarPic;//�����е�ͼƬ
    public Image getPic(){
        return pic;
    }
    public Image getToolBarPic() {
        return toolBarPic;
    }
    public static String realimgpath="src\\realimages";
    public static String bagimgpath="src\\bagimages";

    public boolean weight=false;//�Ƿ�������
    public boolean liquid=false;//�Ƿ���Һ��
    public boolean pile=true;//�Ƿ��ܶѵ�
    public boolean food=false;//�Ƿ�������
    public boolean takeUp=true;//�Ƿ��ܼ���
    public boolean through=false;//�Ƿ��ܴ���
    public boolean putDown=true;//�Ƿ��ܷ���
}
