
import lixb.com.number.util.HttpUtil;

public class CardTest {
    public static void  main(String[] args){
        getCardDetailByCardId();
    }

    public static void getCardDetailByCardId(){
        String cardId="pBpenv2BJ86fGMcupuPGH-ir_API";
        Long brandId = 8469L;
        String secret = "5199f96c318836fc235cbd394766f3c8";
        String param = "{\"cardId:\":"+cardId+",\"brandId:\""+brandId+",\"secret:\""+secret+"}";
        String url = "https://weixin.keruyun.com/weixinapi/getCardDetailByCardId";
        String result = HttpUtil.getJSONContent(url,"POST",param);
        System.out.println(result);
    }


}
