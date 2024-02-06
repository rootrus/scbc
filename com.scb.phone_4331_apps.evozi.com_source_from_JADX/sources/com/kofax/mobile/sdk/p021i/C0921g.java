package com.kofax.mobile.sdk.p021i;

import com.kofax.mobile.sdk.p016b.C0863d;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.i.g */
public class C0921g implements C0863d {

    /* renamed from: zb */
    private static final String f2201zb = "_DeviceType_2_Do90DegreeRotation_4_DoCropCorrection__DoScaleImageToDPI_500_DoSkewCorrectionPage__LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value=\"0\" />";

    /* renamed from: zc */
    private static final String f2202zc = m2389a(C0922a.ID1);

    /* renamed from: zd */
    private static final String f2203zd = "_DeviceType_2_DoCropCorrection__DoSkewCorrectionAlt__Do90DegreeRotation_4_DoScaleImageToDPI_500_DocDimLarge_4.921_DocDimSmall_3.465";

    /* renamed from: ze */
    private final Map<String, C0922a> f2204ze = new HashMap();

    /* renamed from: zf */
    private final Map<String, String> f2205zf = new HashMap();

    /* renamed from: com.kofax.mobile.sdk.i.g$b */
    enum C0923b {
        ENABLED,
        DISABLED
    }

    @HmlPinActivity
    public C0921g() {
        m2390a(C0922a.ID2, C0923b.ENABLED, "Belgium (BEL) Special Identity Card (2000)", "Czech Republic (CZE) Identification Card (2005)", "Czech Republic (CZE) Identification Card (2005) - Back", "Finland (FIN) Driver License (1990)", "Finland (FIN) Driver License (2000)", "France (FRA) Eu Residence Permit, Family, Temporary (2002)", "France (FRA) Identification Card (1994)", "France (FRA) Identification Card (1994) - Back", "France (FRA) Residence Permit (2002)", "France (FRA) Resident ID Card, Algerian, EU Temporary (2000)", "Germany (D) Identification Card (1995)", "Germany (D) Identification Card (1995) - Back", "Germany (D) Residence Permit TA,TN (2006)", "Luxembourg (LUX) Identification Card (2004)", "Romania (ROU) Identity Card (2002,2010)", "Slovakia (SVK) Identification Card (1999)", "Slovakia (SVK) Identification Card (1999) - Back", "UK (Citizen) (GBR) Residence Documentation (2)", "UK (Citizen) (GBR) Residence Documentation (2012A)", "UK (Citizen) (GBR) Residence Permit (3)");
        m2390a(C0922a.TUR_ID_2004, C0923b.ENABLED, "Turkey (TUR) Identity Card - Female (2001)", "Turkey (TUR) Identity Card - Female (2001) - Back", "Turkey (TUR) Identity Card - Male (2001)", "Turkey (TUR) Identity Card - Male (2001) - Back");
        m2390a(C0922a.PRT_ID_2004, C0923b.ENABLED, "Portugal (PRT) Identity Card (2004)", "Portugal (PRT) Identity Card (2004) - Back");
        m2390a(C0922a.BAH_ID_2009, C0923b.ENABLED, "Bahrain (BHR) Identity Card (1)");
        m2390a(C0922a.BRA_ID, C0923b.ENABLED, "Brazil (BRA) Sao Paulo Identification Card (1) - Back");
        m2390a(C0922a.BRA_DL, C0923b.ENABLED, "Brazil (BRA) Driver License (2000)", "Brazil (BRA) Driver License (2006)");
        m2390a(C0922a.BRA_AID_2001, C0923b.ENABLED, "Brazil (BRA) Alien Identification Card (2001)", "Brazil (BRA) Alien Identification Card (2001) - Back");
        m2390a(C0922a.ZAF_ID_GB, C0923b.ENABLED, "South Africa (ZAF) Greenbook");
    }

    /* renamed from: L */
    public String mo12129L(String str) {
        if (str.equals(C8340a.f4877vM)) {
            return f2203zd;
        }
        return f2202zc;
    }

    /* renamed from: l */
    public String mo12130l(String str, String str2) {
        return this.f2205zf.get(str2);
    }

    /* renamed from: m */
    public String mo12131m(String str, String str2) {
        return m2391t(str, str2).toString();
    }

    /* renamed from: a */
    private void m2390a(C0922a aVar, C0923b bVar, String... strArr) {
        for (String str : strArr) {
            this.f2204ze.put(str, aVar);
            if (bVar == C0923b.ENABLED) {
                this.f2205zf.put(str, m2389a(aVar));
            }
        }
    }

    /* renamed from: t */
    private C0922a m2391t(String str, String str2) {
        if (str.equals(C8340a.f4877vM)) {
            return C0922a.PASSPORT;
        }
        return (C0922a) m2388a(this.f2204ze, str2, C0922a.ID1);
    }

    /* renamed from: a */
    private static String m2389a(C0922a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(f2201zb);
        sb.append(aVar);
        return sb.toString();
    }

    /* renamed from: a */
    private static <K, V> V m2388a(Map<K, V> map, K k, V v) {
        V v2 = map.get(k);
        return (v2 != null || map.containsKey(k)) ? v2 : v;
    }

    /* renamed from: com.kofax.mobile.sdk.i.g$a */
    enum C0922a {
        ID1(3.375d, 2.125d),
        ID2(4.134d, 2.913d),
        PASSPORT(4.921d, 3.465d),
        TUR_ID_2004(3.78d, 2.795d),
        PRT_ID_2004(4.275d, 3.044d),
        BAH_ID_2009(3.3d, 2.1d),
        BRA_ID(4.016d, 2.677d),
        BRA_DL(2.46d, 1.732d),
        BRA_AID_2001(3.937d, 2.559d),
        ZAF_ID_GB(4.3d, 3.1d);
        

        /* renamed from: zq */
        private final double f2217zq;

        /* renamed from: zr */
        private final double f2218zr;

        private C0922a(double d, double d2) {
            if (d >= d2) {
                this.f2217zq = d;
                this.f2218zr = d2;
                return;
            }
            throw new AssertionError();
        }

        public final String toString() {
            return String.format(Locale.US, "_DocDimLarge_%.3f_DocDimSmall_%.3f", new Object[]{Double.valueOf(this.f2217zq), Double.valueOf(this.f2218zr)});
        }
    }
}
