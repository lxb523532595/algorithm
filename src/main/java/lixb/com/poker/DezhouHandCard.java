package lixb.com.poker;

import java.util.List;

public class DezhouHandCard {
    private List<Card> cards;
    /**
     * 牌型
     */
    private HandPatternEnum handPatternEnum;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public HandPatternEnum getHandPatternEnum() {
        return handPatternEnum;
    }

    public void setHandPatternEnum(HandPatternEnum handPatternEnum) {
        this.handPatternEnum = handPatternEnum;
    }

    public int compare(DezhouHandCard card){
        if(handPatternEnum.getValue()>card.getHandPatternEnum().getValue()){
            return 1;
        }else if(handPatternEnum.getValue()==card.getHandPatternEnum().getValue()){
            return 0;
        }else{
            return -1;
        }
    }


    /**
     * 是否是同花大顺
     * @return
     */
    public boolean isBigFlush(){
        return isFlush(true);
    }

    /**
     * 是否同花顺
     * @return
     */
    public boolean isFlush(){
        return isFlush(false);
    }

    /**
     * 是否同花顺
     * @param isBigFlush 是否是同花大顺
     * @return
     */
    private boolean isFlush(boolean isBigFlush) {
        int type = -1;//花色
        int point = -1; //点数
        for (Card card : cards) {
            if (type == -1) {
                type = card.getType();
                point = card.getPoint();
            } else {
                if (type != card.getType()){
                    return false;
                }
                if(point+1!=card.getPoint()){
                    if(point==1&&card.getPoint()==10){
                        point = card.getPoint();
                    }else{
                        return false;
                    }
                }else{
                    point = card.getPoint();
                }
            }
        }
        if(isBigFlush){
            if(cards.get(0).getPoint()==1&&cards.get(cards.size()-1).getPoint()==13){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
