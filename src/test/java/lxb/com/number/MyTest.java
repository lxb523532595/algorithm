package lxb.com.number;

import lixb.com.number.Game;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyTest {


//    @Test(expected = BusinessException.class)
//    public void testNumber_should_throw_execption_when_param_is_greater_than_9(){
//        //given
//        Integer[] integers = new Integer[]{1,2,10};
//        //when
//        Game game = new Game(integers);
//        String[] result = game.number();
//        //then
//    }
//
//    @Test(expected = BusinessException.class)
//    public void testNumber_should_throw_execption_when_param_is_same_with_another(){
//        //given
//        Integer[] integers = new Integer[]{1,2,2};
//        //when
//        Game game = new Game(integers);
//        String[] result = game.number();
//        //then
//    }
//    @Test(expected = BusinessException.class)
//    public void testNumber_should_throw_execption_when_param_is_null(){
//        //given
//        Integer[] integers = null;
//        //when
//        Game game = new Game(integers);
//        String[] result = game.number();
//        //then
//    }
//
//    @Test(expected = BusinessException.class)
//    public void testNumber_should_throw_execption_when_param_is_not_3(){
//        //given
//        Integer[] integers = new Integer[]{1,2,2,4};
//        //when
//        Game game = new Game(integers);
//        String[] result = game.number();
//        //then
//    }

    @Test
    public void testNumber_should_return_value_1_when_param_1(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[0], is("1"));

    }

    @Test
    public void testNumber_should_return_value_Fizz_when_param_2(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[1], is("Fizz"));

    }
    @Test
    public void testNumber_should_return_value_Buzz_when_param_3(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[2], is("Buzz"));

    }
    @Test
    public void testNumber_should_return_value_Whizz_when_param_5(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[4], is("Whizz"));

    }
    @Test
    public void testNumber_should_return_value_FizzBuzz_when_param_6(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[5], is("FizzBuzz"));

    }
    @Test
    public void testNumber_should_return_value_FizzBuzzWhizz_when_param_30(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[29], is("FizzBuzzWhizz"));

    }
    @Test
    public void testNumber_should_return_value_Fizz_when_param_20(){
        //give
        Integer[] integers = new Integer[]{2,3,5};
        //when
        Game game = new Game(integers);
        String[] result = game.number();
        //then
        assertThat(result[19], is("Fizz"));

    }



}











