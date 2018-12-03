package lixb.com.poker;

public class Card {
    /**
     * 花色，1，红桃；2，梅花；3，黑桃；4，方块
     */
    private int type;
    /**
     * 点数，1对应A，11对应J，以此类推
     */
    private int point;

    public Card(){

    }
    public Card(int type,int point){
        this.type = type;
        this.point = point;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public int compare(Card card){
        if(point==card.getPoint()){
            return 0;
        }else if(point>card.getPoint()){
            return 1;
        }else{
            return -1;
        }
    }
}
