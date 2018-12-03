package lixb.com.number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {
    private Integer count;
    private Integer[] randoms;
    private Integer randomsCount;
    private String[] randomValues;

    public Game(Integer[] randoms){
        this.randoms = randoms;
        count = 100;
        randomsCount = 3;
        randomValues = new String[]{"Fizz","Buzz","Whizz"};
    }

    public String[] number() {
        validateParam();
        String[] result = new String[count];
        for(int i=0;i<count;i++){
            int userValue = i+1;
            if(String.valueOf(userValue).contains(String.valueOf(randoms[0]))){
                result[i] = randomValues[0];
                continue;
            }
            for(int randomIndex = 0; randomIndex<randoms.length;randomIndex++){
                if(userValue%randoms[randomIndex]==0){
                    if(result[i]==null){
                        result[i]=randomValues[randomIndex];
                    }else{
                        result[i]+=randomValues[randomIndex];
                    }
                }
            }
            if(result[i]==null){
                result[i]=String.valueOf(userValue);
            }

        }
        return result;
    }

    private void validateParam() {
        if(randoms==null||randoms.length!=randomsCount){
            throw new BusinessException("param is error");
        }
        List<Integer> greaterList = Stream.of(randoms).filter(e->e>9).collect(Collectors.toList());
        if(greaterList.size()>0){
            throw new BusinessException("param value is not single digit");
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(randoms));
        if(set.size()<3){
            throw new BusinessException("param value is the same with another");
        }

    }
}
