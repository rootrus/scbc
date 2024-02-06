package p040o;

import android.util.SparseArray;

/* renamed from: o.loadTranslate */
public abstract class loadTranslate {

    /* renamed from: o.loadTranslate$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        public static final SparseArray<IconCompatParcelizer> zzv = null;
        public final int zzw;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new IconCompatParcelizer("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new IconCompatParcelizer("GPRS", 1, 1);
            EDGE = new IconCompatParcelizer("EDGE", 2, 2);
            UMTS = new IconCompatParcelizer("UMTS", 3, 3);
            CDMA = new IconCompatParcelizer("CDMA", 4, 4);
            EVDO_0 = new IconCompatParcelizer("EVDO_0", 5, 5);
            EVDO_A = new IconCompatParcelizer("EVDO_A", 6, 6);
            RTT = new IconCompatParcelizer("RTT", 7, 7);
            HSDPA = new IconCompatParcelizer("HSDPA", 8, 8);
            HSUPA = new IconCompatParcelizer("HSUPA", 9, 9);
            HSPA = new IconCompatParcelizer("HSPA", 10, 10);
            IDEN = new IconCompatParcelizer("IDEN", 11, 11);
            EVDO_B = new IconCompatParcelizer("EVDO_B", 12, 12);
            LTE = new IconCompatParcelizer("LTE", 13, 13);
            EHRPD = new IconCompatParcelizer("EHRPD", 14, 14);
            HSPAP = new IconCompatParcelizer("HSPAP", 15, 15);
            GSM = new IconCompatParcelizer("GSM", 16, 16);
            TD_SCDMA = new IconCompatParcelizer("TD_SCDMA", 17, 17);
            IWLAN = new IconCompatParcelizer("IWLAN", 18, 18);
            LTE_CA = new IconCompatParcelizer("LTE_CA", 19, 19);
            COMBINED = new IconCompatParcelizer("COMBINED", 20, 100);
            SparseArray<IconCompatParcelizer> sparseArray = new SparseArray<>();
            zzv = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            zzv.put(1, GPRS);
            zzv.put(2, EDGE);
            zzv.put(3, UMTS);
            zzv.put(4, CDMA);
            zzv.put(5, EVDO_0);
            zzv.put(6, EVDO_A);
            zzv.put(7, RTT);
            zzv.put(8, HSDPA);
            zzv.put(9, HSUPA);
            zzv.put(10, HSPA);
            zzv.put(11, IDEN);
            zzv.put(12, EVDO_B);
            zzv.put(13, LTE);
            zzv.put(14, EHRPD);
            zzv.put(15, HSPAP);
            zzv.put(16, GSM);
            zzv.put(17, TD_SCDMA);
            zzv.put(18, IWLAN);
            zzv.put(19, LTE_CA);
        }

        private IconCompatParcelizer(int i) {
            this.zzw = i;
        }
    }

    /* renamed from: o.loadTranslate$read */
    public enum read {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        public static final SparseArray<read> zzt = null;
        public final int zzu;

        static {
            MOBILE = new read("MOBILE", 0, 0);
            WIFI = new read("WIFI", 1, 1);
            MOBILE_MMS = new read("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new read("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new read("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new read("MOBILE_HIPRI", 5, 5);
            WIMAX = new read("WIMAX", 6, 6);
            BLUETOOTH = new read("BLUETOOTH", 7, 7);
            DUMMY = new read("DUMMY", 8, 8);
            ETHERNET = new read("ETHERNET", 9, 9);
            MOBILE_FOTA = new read("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new read("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new read("MOBILE_CBS", 12, 12);
            WIFI_P2P = new read("WIFI_P2P", 13, 13);
            MOBILE_IA = new read("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new read("MOBILE_EMERGENCY", 15, 15);
            PROXY = new read("PROXY", 16, 16);
            VPN = new read("VPN", 17, 17);
            NONE = new read("NONE", 18, -1);
            SparseArray<read> sparseArray = new SparseArray<>();
            zzt = sparseArray;
            sparseArray.put(0, MOBILE);
            zzt.put(1, WIFI);
            zzt.put(2, MOBILE_MMS);
            zzt.put(3, MOBILE_SUPL);
            zzt.put(4, MOBILE_DUN);
            zzt.put(5, MOBILE_HIPRI);
            zzt.put(6, WIMAX);
            zzt.put(7, BLUETOOTH);
            zzt.put(8, DUMMY);
            zzt.put(9, ETHERNET);
            zzt.put(10, MOBILE_FOTA);
            zzt.put(11, MOBILE_IMS);
            zzt.put(12, MOBILE_CBS);
            zzt.put(13, WIFI_P2P);
            zzt.put(14, MOBILE_IA);
            zzt.put(15, MOBILE_EMERGENCY);
            zzt.put(16, PROXY);
            zzt.put(17, VPN);
            zzt.put(-1, NONE);
        }

        private read(int i) {
            this.zzu = i;
        }
    }

    /* renamed from: o.loadTranslate$write */
    public static abstract class write {
        public abstract loadTranslate IconCompatParcelizer();

        public abstract write MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer);

        public abstract write MediaBrowserCompat$ItemReceiver(read read);
    }

    public abstract read MediaBrowserCompat$CustomActionResultReceiver();

    public abstract IconCompatParcelizer write();
}
