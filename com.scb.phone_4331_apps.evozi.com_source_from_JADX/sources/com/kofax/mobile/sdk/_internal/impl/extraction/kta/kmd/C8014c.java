package com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd;

import java.util.AbstractMap;
import java.util.ArrayList;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.kta.kmd.c */
public class C8014c {

    /* renamed from: KM */
    private String f3843KM;

    /* renamed from: KN */
    private String f3844KN;

    /* renamed from: KO */
    private ArrayList<AbstractMap.SimpleEntry<String, String>> f3845KO;

    public C8014c(String str, String str2, String str3, ArrayList<AbstractMap.SimpleEntry<String, String>> arrayList) {
        this.f3843KM = str2;
        this.f3844KN = str3;
        this.f3845KO = arrayList;
    }

    /* renamed from: mM */
    public String mo54413mM() {
        return this.f3843KM;
    }

    /* renamed from: mN */
    public String mo54414mN() {
        return this.f3844KN;
    }

    public ArrayList<AbstractMap.SimpleEntry<String, String>> getFields() {
        return this.f3845KO;
    }
}
