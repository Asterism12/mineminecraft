package Thing.Tool;

import Thing.Square;

public abstract class Tool extends Square {
    public int animalAtk;   //对生物攻击力
    public int digLevel = 0;    //破坏方块能力
    public int digKind = 0;     //破坏方块类别（0：无 1：石头矿物 2：木头 3：泥土）
    public int digSpeed;    //破坏方块速度
    public int durability;   //耐久度

    Tool() {
        id = -1;
        breakLevel = 0;    //抗破坏等级
        weight = false;//是否有重力
        liquid = false;//是否是液体
        pile = false;//是否能堆叠
        food = false;//是否是食物
        takeUp = true;//是否能捡起
        through = false;//是否能穿过
        putDown = false;//是否能放下
        digType = 0;
    }
}
