package org.jmrtd.lds.icao;

import net.p088sf.scuba.data.Country;

public class ICAOCountry extends Country {

    /* renamed from: DE */
    public static final ICAOCountry f6387DE = new ICAOCountry("DE", "D<<", "Germany", "German");
    public static final ICAOCountry GBD = new ICAOCountry("GB", "GBD", "British Dependent territories citizen");
    public static final ICAOCountry GBN = new ICAOCountry("GB", "GBN", "British National (Overseas)");
    public static final ICAOCountry GBO = new ICAOCountry("GB", "GBO", "British Overseas citizen");
    public static final ICAOCountry GBP = new ICAOCountry("GB", "GBP", "British Protected person");
    public static final ICAOCountry GBS = new ICAOCountry("GB", "GBS", "British Subject");
    public static final ICAOCountry UNA = new ICAOCountry("UN", "UNA", "United Nations Agency");
    public static final ICAOCountry UNK = new ICAOCountry("UN", "UNK", "United Nations Interim Administration Mission in Kosovo");
    public static final ICAOCountry UNO = new ICAOCountry("UN", "UNO", "United Nations Organization");
    private static ICAOCountry[] VALUES;
    public static final ICAOCountry XCC = new ICAOCountry("XC", "XCC", "Carribean Community");
    public static final ICAOCountry XOM = new ICAOCountry("XO", "XOM", "Sovereign Military Order of Malta");
    public static final ICAOCountry XPO = new ICAOCountry("XP", "XPO", "Interpol");
    public static final ICAOCountry XXA = new ICAOCountry("XX", "XXA", "Stateless person", "Stateless");
    public static final ICAOCountry XXB = new ICAOCountry("XX", "XXB", "Refugee", "Refugee");
    public static final ICAOCountry XXC = new ICAOCountry("XX", "XXC", "Refugee (other)", "Refugee (other)");
    public static final ICAOCountry XXX;
    private String alpha2Code;
    private String alpha3Code;
    private String name;
    private String nationality;

    public int valueOf() {
        return -1;
    }

    static {
        ICAOCountry iCAOCountry = new ICAOCountry("XX", "XXX", "Unspecified", "Unspecified");
        XXX = iCAOCountry;
        VALUES = new ICAOCountry[]{f6387DE, GBD, GBN, GBO, GBP, GBS, UNO, UNA, UNK, XOM, XCC, XXA, XXB, XXC, iCAOCountry};
    }

    public static Country getInstance(String str) {
        for (ICAOCountry iCAOCountry : VALUES) {
            if (iCAOCountry.alpha3Code.equals(str)) {
                return iCAOCountry;
            }
        }
        try {
            return Country.getInstance(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal ICAO country alpha 3 code ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private ICAOCountry() {
    }

    private ICAOCountry(String str, String str2, String str3) {
        this(str, str2, str3, str3);
    }

    private ICAOCountry(String str, String str2, String str3, String str4) {
        this.alpha2Code = str;
        this.alpha3Code = str2;
        this.name = str3;
        this.nationality = str4;
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String toAlpha2Code() {
        return this.alpha2Code;
    }

    public String toAlpha3Code() {
        return this.alpha3Code;
    }
}
