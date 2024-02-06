package net.p088sf.scuba.data;

import java.util.ArrayList;
import java.util.Arrays;
import p040o.TouchPointFatcaActivity;
import p040o.TouchPointInstructionActivity_ViewBinding;
import p040o.onFindTouchPointsClick;

/* renamed from: net.sf.scuba.data.Country */
public abstract class Country {
    private static final Class<?>[] SUB_CLASSES = {TouchPointInstructionActivity_ViewBinding.class, TouchPointFatcaActivity.class, onFindTouchPointsClick.class};

    public abstract String getName();

    public abstract String getNationality();

    public abstract String toAlpha2Code();

    public abstract String toAlpha3Code();

    public abstract int valueOf();

    public static Country getInstance(int i) {
        for (Country country : values()) {
            if (country.valueOf() == i) {
                return country;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal country code");
        sb.append(Integer.toHexString(i));
        throw new IllegalArgumentException(sb.toString());
    }

    public static Country getInstance(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            if (length == 2) {
                return fromAlpha2(trim);
            }
            if (length == 3) {
                return fromAlpha3(trim);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal country code ");
            sb.append(trim);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("Illegal country code");
    }

    public static Country[] values() {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : SUB_CLASSES) {
            if (Country.class.isAssignableFrom(cls)) {
                try {
                    arrayList.addAll(Arrays.asList((Country[]) cls.getMethod("values", new Class[0]).invoke((Object) null, new Object[0])));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        Country[] countryArr = new Country[arrayList.size()];
        arrayList.toArray(countryArr);
        return countryArr;
    }

    private static Country fromAlpha2(String str) {
        for (Country country : values()) {
            if (country.toAlpha2Code().equals(str)) {
                return country;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown country code ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private static Country fromAlpha3(String str) {
        for (Country country : values()) {
            if (country.toAlpha3Code().equals(str)) {
                return country;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown country code ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
