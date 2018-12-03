package lixb.com.poker;

import java.util.Collections;
import java.util.Comparator;

public class CardCompareService {

    public int compare(DezhouHandCard cardA, DezhouHandCard cardB){
        if(cardA.getCards()==null||cardA.getCards().size()!=5){
            return -2;
        }
        if(cardB.getCards()==null||cardB.getCards().size()!=5){
            return -2;
        }
        sort(cardA);
        sort(cardB);
        setHandPattern(cardA);
        setHandPattern(cardB);
        if(cardA.getHandPatternEnum()==null||cardB.getHandPatternEnum()==null){
            return -2;
        }
        int result = cardA.compare(cardB);
        if(result==0){
            if(cardA.isFlush()){//同花顺，比点子大小
                return cardA.getCards().get(0).compare(cardB.getCards().get(0));
            }
        }
        return result;
    }

    private void sort(DezhouHandCard card){
        Collections.sort(card.getCards(), new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.compare(o2);
            }
        });
    }

    private void setHandPattern(DezhouHandCard dezhouHandCard){
        if(dezhouHandCard.isBigFlush()){
            dezhouHandCard.setHandPatternEnum(HandPatternEnum.BIG_FLUSH);
        }else if(dezhouHandCard.isFlush()){
            dezhouHandCard.setHandPatternEnum(HandPatternEnum.FLUSH);
        }

    }
}
