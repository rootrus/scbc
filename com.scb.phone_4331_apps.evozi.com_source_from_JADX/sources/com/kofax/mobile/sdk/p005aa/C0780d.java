package com.kofax.mobile.sdk.p005aa;

import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.Arrays;

/* renamed from: com.kofax.mobile.sdk.aa.d */
public class C0780d {

    /* renamed from: SY */
    private static C0785i f1875SY = C0785i.UNDEFINED;

    /* renamed from: SZ */
    private static int f1876SZ = 0;

    /* renamed from: Ta */
    private static boolean[] f1877Ta = null;

    /* renamed from: Tb */
    private static final int f1878Tb = -1;

    /* renamed from: Tc */
    private static final int f1879Tc = 0;

    /* renamed from: Td */
    private static final int f1880Td = 1;

    /* renamed from: Te */
    private static final int f1881Te = 2;

    /* renamed from: Tf */
    private static final int f1882Tf = 7;

    /* renamed from: Tg */
    private static final int f1883Tg = 5;

    /* renamed from: aB */
    public static boolean m1854aB(String str) {
        boolean[] zArr = f1877Ta;
        if (zArr != null) {
            return zArr[C0781e.f1885Ti.get(str).intValue()];
        }
        return false;
    }

    public static int getDaysRemaining() {
        return f1876SZ;
    }

    /* renamed from: p */
    public static void m1857p(int i) {
        f1876SZ = i;
    }

    /* renamed from: aC */
    public static ErrorInfo m1855aC(String str) {
        ErrorInfo errorInfo = ErrorInfo.KMC_EV_LICENSING;
        if (str != null && ErrorInfo.KMC_SUCCESS == (errorInfo = m1856aD(str))) {
            byte[] bytes = str.getBytes();
            boolean[] zArr = new boolean[5];
            f1877Ta = zArr;
            Arrays.fill(zArr, true);
            if (C0785i.ATALASOFT == f1875SY) {
                m1853a(f1877Ta, Licensing.LicenseType.IMAGE_CAPTURE.name(), bytes);
                m1853a(f1877Ta, Licensing.LicenseType.IMAGE_PROCESSING.name(), bytes);
                m1853a(f1877Ta, Licensing.LicenseType.BARCODE_CAPTURE.name(), bytes);
                m1852a(f1877Ta, Licensing.LicenseType.LOGISTICS.name(), false);
                m1852a(f1877Ta, Licensing.LicenseType.ID_EXTRACTION.name(), false);
            }
        }
        return errorInfo;
    }

    /* renamed from: a */
    private static void m1853a(boolean[] zArr, String str, byte[] bArr) {
        zArr[C0781e.f1885Ti.get(str).intValue()] = bArr[C0781e.f1886Tj.get(str).intValue()] == 49;
    }

    /* renamed from: a */
    private static void m1852a(boolean[] zArr, String str, boolean z) {
        zArr[C0781e.f1885Ti.get(str).intValue()] = z;
    }

    /* renamed from: qM */
    public static void m1858qM() {
        f1875SY = C0785i.UNDEFINED;
        f1877Ta = null;
        f1876SZ = 0;
    }

    /* renamed from: aD */
    public static ErrorInfo m1856aD(String str) {
        int i;
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        try {
            i = Integer.parseInt(new StringBuilder(str.substring(0, 3)).reverse().toString(), 2);
        } catch (Exception e) {
            errorInfo = ErrorInfo.KMC_EV_LICENSING;
            errorInfo.setErrCause(e.getMessage());
            i = -1;
        }
        if (ErrorInfo.KMC_SUCCESS != errorInfo) {
            return errorInfo;
        }
        if (i == 0 || 7 == i || 1 == i) {
            f1875SY = C0785i.KOFAX;
            return errorInfo;
        } else if (2 != i) {
            return ErrorInfo.KMC_EV_LICENSING;
        } else {
            f1875SY = C0785i.ATALASOFT;
            return errorInfo;
        }
    }
}
