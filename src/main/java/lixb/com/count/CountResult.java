package lixb.com.count;

import java.math.BigDecimal;

/**
 * create by lixb
 * on 2017/11/12 下午5:23
 */
public class CountResult {
    private Long brandId;
    private Long commercialId;
    private Integer tableCount;
    private String brandName;
    private String commercialName;
    private String subStationName;
    private Integer dinnerCount;
    private BigDecimal dinnerGvm;
    private BigDecimal mobilePay;

    private String cityName;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCommercialId() {
        return commercialId;
    }

    public void setCommercialId(Long commercialId) {
        this.commercialId = commercialId;
    }

    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public String getSubStationName() {
        return subStationName;
    }

    public void setSubStationName(String subStationName) {
        this.subStationName = subStationName;
    }

    public Integer getDinnerCount() {
        return dinnerCount;
    }

    public void setDinnerCount(Integer dinnerCount) {
        this.dinnerCount = dinnerCount;
    }

    public BigDecimal getDinnerGvm() {
        return dinnerGvm;
    }

    public void setDinnerGvm(BigDecimal dinnerGvm) {
        this.dinnerGvm = dinnerGvm;
    }

    public BigDecimal getMobilePay() {
        return mobilePay;
    }

    public void setMobilePay(BigDecimal mobilePay) {
        this.mobilePay = mobilePay;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
