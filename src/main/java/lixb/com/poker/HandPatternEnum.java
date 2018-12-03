package lixb.com.poker;

public enum HandPatternEnum {
    BIG_FLUSH(1000,"同花大顺"),FLUSH(900,"同花顺"),

    ;
    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    private HandPatternEnum(int value, String name){
        this.value = value;
        this.name = name;
    }

}
