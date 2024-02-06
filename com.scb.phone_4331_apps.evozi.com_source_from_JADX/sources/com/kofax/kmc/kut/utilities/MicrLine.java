package com.kofax.kmc.kut.utilities;

public class MicrLine {

    /* renamed from: nH */
    private String f3599nH = "";

    /* renamed from: nI */
    private String f3600nI = "";

    /* renamed from: nJ */
    private String f3601nJ = "";

    /* renamed from: nK */
    private String f3602nK = "";

    /* renamed from: nL */
    private String f3603nL = "";

    /* renamed from: nM */
    private String f3604nM = "";

    /* renamed from: nN */
    private String f3605nN = "";

    /* renamed from: nO */
    private boolean f3606nO = false;

    /* renamed from: nP */
    private CheckType f3607nP = CheckType.NONE;

    public enum CheckType {
        NONE,
        PERSONAL_CHECK,
        BUSINESS_CHECK
    }

    public boolean getValueSet() {
        return this.f3606nO;
    }

    public String getAuxiliaryOnUs() {
        return this.f3599nH;
    }

    public void setAuxiliaryOnUs(String str) {
        this.f3599nH = str;
        this.f3606nO = true;
    }

    public String getEPC() {
        return this.f3600nI;
    }

    public void setEPC(String str) {
        this.f3600nI = str;
        this.f3606nO = true;
    }

    public String getTransitNumber() {
        return this.f3601nJ;
    }

    public void setTransitNumber(String str) {
        this.f3601nJ = str;
        this.f3606nO = true;
    }

    public String getOnUs() {
        return this.f3602nK;
    }

    public void setOnUs(String str) {
        this.f3602nK = str;
        this.f3606nO = true;
    }

    public String getOnUs1() {
        return this.f3603nL;
    }

    public void setOnUs1(String str) {
        this.f3603nL = str;
        this.f3606nO = true;
    }

    public String getOnUs2() {
        return this.f3604nM;
    }

    public void setOnUs2(String str) {
        this.f3604nM = str;
        this.f3606nO = true;
    }

    public String getAmount() {
        return this.f3605nN;
    }

    public void setAmount(String str) {
        this.f3605nN = str;
        this.f3606nO = true;
    }

    public void setCheckType(CheckType checkType) {
        this.f3607nP = checkType;
    }

    public CheckType getCheckType() {
        return this.f3607nP;
    }
}
