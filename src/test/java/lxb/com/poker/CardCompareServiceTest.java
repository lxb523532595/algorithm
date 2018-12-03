package lxb.com.poker;

import lixb.com.poker.Card;
import lixb.com.poker.CardCompareService;
import lixb.com.poker.DezhouHandCard;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CardCompareServiceTest {
    private CardCompareService cardCompareService =new CardCompareService();

    /**
     * 1是同花大顺
     * 2是同花大顺
     */
    @Test
    public void compare1(){
        //give
        DezhouHandCard dezhouHandCard1 = new DezhouHandCard();
        List<Card> list = new ArrayList<>();
        dezhouHandCard1.setCards(list);
        list.add(new Card(1,10));
        list.add(new Card(1,11));
        list.add(new Card(1,12));
        list.add(new Card(1,13));
        list.add(new Card(1,1));

        DezhouHandCard dezhouHandCard2 = new DezhouHandCard();
        list = new ArrayList<>();
        dezhouHandCard2.setCards(list);
        list.add(new Card(2,10));
        list.add(new Card(2,11));
        list.add(new Card(2,12));
        list.add(new Card(2,13));
        list.add(new Card(2,1));
        //when
        int result = cardCompareService.compare(dezhouHandCard1,dezhouHandCard2);
        //then
        assertThat(result, is(0));
    }

    /**
     * 1是同花大顺
     * 2是同花顺
     */
    @Test
    public void compare2(){
        //give
        DezhouHandCard dezhouHandCard1 = new DezhouHandCard();
        List<Card> list = new ArrayList<>();
        dezhouHandCard1.setCards(list);
        list.add(new Card(1,10));
        list.add(new Card(1,11));
        list.add(new Card(1,12));
        list.add(new Card(1,13));
        list.add(new Card(1,1));

        DezhouHandCard dezhouHandCard2 = new DezhouHandCard();
        list = new ArrayList<>();
        dezhouHandCard2.setCards(list);
        list.add(new Card(2,10));
        list.add(new Card(2,11));
        list.add(new Card(2,12));
        list.add(new Card(2,13));
        list.add(new Card(2,9));
        //when
        int result = cardCompareService.compare(dezhouHandCard1,dezhouHandCard2);
        //then
        assertThat(result, is(1));
    }

    /**
     * 1是同花顺
     * 2是同花顺
     */
    @Test
    public void compare3(){
        //give
        DezhouHandCard dezhouHandCard1 = new DezhouHandCard();
        List<Card> list = new ArrayList<>();
        dezhouHandCard1.setCards(list);
        list.add(new Card(1,10));
        list.add(new Card(1,11));
        list.add(new Card(1,7));
        list.add(new Card(1,8));
        list.add(new Card(1,9));

        DezhouHandCard dezhouHandCard2 = new DezhouHandCard();
        list = new ArrayList<>();
        dezhouHandCard2.setCards(list);
        list.add(new Card(2,10));
        list.add(new Card(2,11));
        list.add(new Card(2,12));
        list.add(new Card(2,13));
        list.add(new Card(2,9));
        //when
        int result = cardCompareService.compare(dezhouHandCard1,dezhouHandCard2);
        //then
        assertThat(result, is(-1));
    }

    /**
     * 1是同花顺
     * 2是同花大顺
     */
    @Test
    public void compare4(){
        //give
        DezhouHandCard dezhouHandCard1 = new DezhouHandCard();
        List<Card> list = new ArrayList<>();
        dezhouHandCard1.setCards(list);
        list.add(new Card(1,10));
        list.add(new Card(1,11));
        list.add(new Card(1,12));
        list.add(new Card(1,8));
        list.add(new Card(1,9));

        DezhouHandCard dezhouHandCard2 = new DezhouHandCard();
        list = new ArrayList<>();
        dezhouHandCard2.setCards(list);
        list.add(new Card(2,10));
        list.add(new Card(2,11));
        list.add(new Card(2,12));
        list.add(new Card(2,13));
        list.add(new Card(2,1));
        //when
        int result = cardCompareService.compare(dezhouHandCard1,dezhouHandCard2);
        //then
        assertThat(result, is(-1));
    }

}
