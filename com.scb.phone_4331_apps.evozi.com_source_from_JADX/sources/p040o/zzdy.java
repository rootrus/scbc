package p040o;

import java.math.BigDecimal;

/* renamed from: o.zzdy */
public final /* synthetic */ class zzdy implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setForNewAccount MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.zzdy$zzb */
    public final class zzb {
        public String IconCompatParcelizer;
        public String write;
    }

    /* renamed from: o.zzdy$zzc */
    public final class zzc {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public String write;
    }

    /* renamed from: o.zzdy$zzd */
    public final class zzd {
        public String IconCompatParcelizer;
    }

    public /* synthetic */ zzdy(setForNewAccount setfornewaccount) {
        this.MediaBrowserCompat$ItemReceiver = setfornewaccount;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((setSystemAnimationsAreEnabled) obj);
    }

    /* renamed from: o.zzdy$zze */
    public class zze {
        public final BigDecimal IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final BigDecimal MediaMetadataCompat;
        public final String RatingCompat;
        public final BigDecimal read;
        public final BigDecimal write;

        public zze() {
        }

        public zze(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.RatingCompat = str3;
            this.read = bigDecimal;
            this.MediaMetadataCompat = bigDecimal2;
            this.IconCompatParcelizer = bigDecimal3;
            this.write = bigDecimal4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zze zze = (zze) obj;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str == null ? zze.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(zze.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 == null ? zze.MediaBrowserCompat$ItemReceiver != null : !str2.equals(zze.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str3 = this.RatingCompat;
            if (str3 == null ? zze.RatingCompat != null : !str3.equals(zze.RatingCompat)) {
                return false;
            }
            BigDecimal bigDecimal = this.read;
            if (bigDecimal == null ? zze.read != null : !bigDecimal.equals(zze.read)) {
                return false;
            }
            BigDecimal bigDecimal2 = this.MediaMetadataCompat;
            if (bigDecimal2 == null ? zze.MediaMetadataCompat != null : !bigDecimal2.equals(zze.MediaMetadataCompat)) {
                return false;
            }
            BigDecimal bigDecimal3 = this.write;
            if (bigDecimal3 == null ? zze.write != null : !bigDecimal3.equals(zze.write)) {
                return false;
            }
            BigDecimal bigDecimal4 = this.IconCompatParcelizer;
            BigDecimal bigDecimal5 = zze.IconCompatParcelizer;
            if (bigDecimal4 != null) {
                return bigDecimal4.equals(bigDecimal5);
            }
            if (bigDecimal5 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.RatingCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            BigDecimal bigDecimal = this.read;
            int hashCode4 = bigDecimal != null ? bigDecimal.hashCode() : 0;
            BigDecimal bigDecimal2 = this.MediaMetadataCompat;
            int hashCode5 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
            BigDecimal bigDecimal3 = this.IconCompatParcelizer;
            int hashCode6 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
            BigDecimal bigDecimal4 = this.write;
            if (bigDecimal4 != null) {
                i = bigDecimal4.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }
    }
}
