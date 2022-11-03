package Models;

public class Codigo {
    private String codeType;
    private String name;
    private String amountToGenerate;
    private String codeRedemption;

    public Codigo() {
    }

    public Codigo(String codeType, String name, String amountToGenerate, String codeRedemption) {
        this.codeType = codeType;
        this.name = name;
        this.amountToGenerate = amountToGenerate;
        this.codeRedemption = codeRedemption;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountToGenerate() {
        return amountToGenerate;
    }

    public void setAmountToGenerate(String amountToGenerate) {
        this.amountToGenerate = amountToGenerate;
    }

    public String getCodeRedemption() {
        return codeRedemption;
    }

    public void setCodeRedemption(String codeRedemption) {
        this.codeRedemption = codeRedemption;
    }
}
