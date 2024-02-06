package com.kofax.mobile.sdk.p005aa;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.Licensing;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.kofax.mobile.sdk.aa.f */
public class C8244f {

    /* renamed from: Tk */
    private static final int f4362Tk = 10;

    /* renamed from: Tl */
    private static final int f4363Tl = 110;

    /* renamed from: Tm */
    private static final int f4364Tm = 210;

    /* renamed from: Tn */
    private static final int f4365Tn = 108;

    /* renamed from: To */
    private static final List<Licensing.VolumeLicenseEventListener> f4366To = new CopyOnWriteArrayList();

    /* renamed from: Tp */
    private static Licensing.VolumeLicenseResultData f4367Tp = null;

    /* renamed from: Tq */
    private static Licensing.VolumeLicenseFailureData f4368Tq = null;

    /* renamed from: Tr */
    private static final String f4369Tr = "SDKDATA_SERVER";

    /* renamed from: Ts */
    private static final String f4370Ts = "SDKDATA_SERVER_TYPE";

    /* renamed from: Tt */
    private static final String f4371Tt = "SDKDATA1";

    /* renamed from: Tu */
    private static final String f4372Tu = "SDKDATA_TOT1";

    /* renamed from: Tv */
    private static final int f4373Tv = -1;

    /* renamed from: aZ */
    static TaskRunner f4374aZ;

    /* renamed from: bb */
    static long f4375bb;
    static CertificateValidatorListener certificateValidatorListener;

    public static ErrorInfo setMobileSDKLicenseServer(String str, Licensing.LicenseServerType licenseServerType) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        m4543a(new C8243c(str, licenseServerType));
        return errorInfo;
    }

    /* renamed from: qN */
    private static SharedPreferences m4550qN() {
        return PreferenceManager.getDefaultSharedPreferences(AppContextProvider.getContext());
    }

    /* renamed from: qO */
    private static C8243c m4551qO() {
        SharedPreferences qN = m4550qN();
        Licensing.LicenseServerType licenseServerType = null;
        String string = qN.getString(f4369Tr, (String) null);
        int i = qN.getInt(f4370Ts, -1);
        if (C0781e.f1884Th.get(Licensing.LicenseServerType.RTTI.name()).intValue() == i) {
            licenseServerType = Licensing.LicenseServerType.RTTI;
        } else if (C0781e.f1884Th.get(Licensing.LicenseServerType.TotalAgility.name()).intValue() == i) {
            licenseServerType = Licensing.LicenseServerType.TotalAgility;
        }
        return new C8243c(string, licenseServerType);
    }

    /* renamed from: a */
    private static void m4543a(C8243c cVar) {
        SharedPreferences.Editor edit = m4550qN().edit();
        if (cVar.f4360SW == null) {
            edit.remove(f4369Tr);
        } else {
            edit.putString(f4369Tr, cVar.f4360SW);
        }
        if (cVar.f4361SX == null) {
            edit.remove(f4370Ts);
        } else {
            edit.putInt(f4370Ts, C0781e.f1884Th.get(cVar.f4361SX.name()).intValue());
        }
        edit.apply();
    }

    public static void acquireVolumeLicenses(Licensing.LicenseType licenseType, int i) {
        int i2;
        int i3 = 0;
        if (licenseType == null) {
            m4542a(ErrorInfo.KMC_UT_LICENSING_NULL_LICENSE_TYPE, 0, (Licensing.LicenseType) null);
        } else if (!m4548c(licenseType)) {
            m4542a(ErrorInfo.KMC_UT_LICENSING_NOT_VOLUME_LICENSE, 0, licenseType);
        } else if (!Licensing.isSdkLicensed(licenseType)) {
            m4542a(ErrorInfo.KMC_UT_LICENSING_FEATURE_NOT_LICENSED, 0, licenseType);
        } else {
            C8243c qO = m4551qO();
            if (qO.f4360SW == null) {
                m4542a(ErrorInfo.KMC_UT_LICENSING_NULL_LICENSE_SERVER, 0, licenseType);
            } else if (qO.f4361SX == null) {
                m4542a(ErrorInfo.KMC_UT_LICENSING_NULL_LICENSE_SERVER_TYPE, 0, licenseType);
            } else {
                String obj = UUID.randomUUID().toString();
                if (licenseType == Licensing.LicenseType.ID_EXTRACTION) {
                    i3 = 110;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(qO.f4360SW);
                if (qO.f4361SX == Licensing.LicenseServerType.RTTI) {
                    sb.append("/api/License");
                    i2 = f4364Tm;
                } else {
                    sb.append("/MobileServices/Lic/?sessionId=0");
                    i2 = 108;
                }
                C8242b bVar = new C8242b();
                bVar.f4358SU = obj;
                ArrayList arrayList = new ArrayList();
                C8241a aVar = new C8241a();
                aVar.f4355SR = i3;
                aVar.f4356SS = i;
                arrayList.add(aVar);
                C8241a aVar2 = new C8241a();
                aVar2.f4355SR = i2;
                aVar2.f4356SS = i;
                arrayList.add(aVar2);
                bVar.f4357ST = arrayList;
                bVar.f4359SV = m4546b((List<C8241a>) arrayList, obj);
                m4544a(sb.toString(), bVar, licenseType);
            }
        }
    }

    public static int getRemainingLicenseCount(Licensing.LicenseType licenseType) {
        int b;
        C8243c qO = m4551qO();
        if (qO.f4360SW == null || qO.f4361SX == null || !m4548c(licenseType) || !Licensing.isSdkLicensed(licenseType) || (b = m4545b(licenseType) + 10) < 0) {
            return 0;
        }
        return b;
    }

    public static void decrementRemainingLicenseCount(Licensing.LicenseType licenseType) {
        m4541a(licenseType, -1);
        m4540a(licenseType);
        int b = m4545b(licenseType);
        if (b < 0) {
            acquireVolumeLicenses(licenseType, -b);
        }
    }

    /* renamed from: a */
    public static void m4540a(Licensing.LicenseType licenseType) {
        String str = licenseType == Licensing.LicenseType.ID_EXTRACTION ? f4372Tu : null;
        if (str != null) {
            SharedPreferences qN = m4550qN();
            int i = qN.getInt(str, 0);
            SharedPreferences.Editor edit = qN.edit();
            edit.putInt(str, i + 1);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static void m4541a(Licensing.LicenseType licenseType, int i) {
        int b = m4545b(licenseType) + i;
        if (b < -10) {
            b = -10;
        }
        m4547b(licenseType, b);
    }

    /* renamed from: b */
    private static int m4545b(Licensing.LicenseType licenseType) {
        String str = licenseType == Licensing.LicenseType.ID_EXTRACTION ? f4371Tt : null;
        if (str != null) {
            return m4550qN().getInt(str, 0);
        }
        return -10;
    }

    /* renamed from: b */
    private static void m4547b(Licensing.LicenseType licenseType, int i) {
        String str = licenseType == Licensing.LicenseType.ID_EXTRACTION ? f4371Tt : null;
        if (str != null) {
            SharedPreferences.Editor edit = m4550qN().edit();
            edit.putInt(str, i);
            edit.apply();
        }
    }

    /* renamed from: m */
    private static TaskRunner m4549m() {
        if (f4374aZ == null) {
            f4374aZ = new TaskRunner(1);
        }
        return f4374aZ;
    }

    /* renamed from: a */
    private static void m4544a(String str, C8242b bVar, Licensing.LicenseType licenseType) {
        C8245g gVar = new C8245g();
        gVar.url = str;
        gVar.f4376Tw = bVar;
        gVar.f4377Tx = "PUT";
        TaskRunner m = m4549m();
        C8246h hVar = new C8246h(gVar);
        hVar.f4385TG = bVar.f4358SU;
        hVar.licenseType = licenseType;
        f4374aZ.addOnTaskCompletedListener(hVar, gVar, false);
        f4375bb = m.submit(gVar);
    }

    /* renamed from: b */
    private static String m4546b(List<C8241a> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (C8241a next : list) {
            sb.append(next.f4355SR);
            sb.append(next.f4356SS);
        }
        sb.append(str);
        String aE = C0781e.m1859aE(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aE);
        sb2.append("8C261B3A-125D-4EC2-990D-33AA824A6890");
        return C0781e.m1859aE(sb2.toString());
    }

    /* renamed from: c */
    private static boolean m4548c(Licensing.LicenseType licenseType) {
        return licenseType == Licensing.LicenseType.ID_EXTRACTION;
    }

    public static void addVolumeLicenseEventListener(Licensing.VolumeLicenseEventListener volumeLicenseEventListener) {
        if (volumeLicenseEventListener == null) {
            throw new NullPointerException("");
        } else if (!f4366To.contains(volumeLicenseEventListener)) {
            f4366To.add(volumeLicenseEventListener);
        }
    }

    public static void removeVolumeLicenseEventListener(Licensing.VolumeLicenseEventListener volumeLicenseEventListener) {
        if (volumeLicenseEventListener != null) {
            f4366To.remove(volumeLicenseEventListener);
        }
    }

    public static void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener2) {
        certificateValidatorListener = certificateValidatorListener2;
    }

    /* renamed from: a */
    static void m4542a(ErrorInfo errorInfo, int i, Licensing.LicenseType licenseType) {
        if (errorInfo == ErrorInfo.KMC_SUCCESS) {
            f4367Tp = new Licensing.VolumeLicenseResultData(errorInfo, i, licenseType);
            for (Licensing.VolumeLicenseEventListener licenseOperationSucceeded : f4366To) {
                licenseOperationSucceeded.licenseOperationSucceeded(f4367Tp);
            }
            return;
        }
        f4367Tp = null;
        f4368Tq = new Licensing.VolumeLicenseFailureData(errorInfo, licenseType);
        for (Licensing.VolumeLicenseEventListener licenseOperationFailed : f4366To) {
            licenseOperationFailed.licenseOperationFailed(f4368Tq);
        }
    }
}
