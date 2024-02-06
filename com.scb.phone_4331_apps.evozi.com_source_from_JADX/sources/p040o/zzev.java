package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.AdvertisingIdClient;

/* renamed from: o.zzev */
public final /* synthetic */ class zzev implements HmlBaseDeepLinkActivity {
    public static final /* synthetic */ zzev write = new zzev();

    private /* synthetic */ zzev() {
    }

    /* renamed from: o.zzev$zzb */
    public final class zzb {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        private int MediaBrowserCompat$ItemReceiver;
        public String read;

        public zzb(zzev$zzb$MediaBrowserCompat$CustomActionResultReceiver zzev_zzb_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$ItemReceiver = zzev_zzb_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
            this.read = zzev_zzb_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzev_zzb_mediabrowsercompat_customactionresultreceiver.read;
        }

        public final boolean equals(Object obj) {
            String str;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            if (this.MediaBrowserCompat$ItemReceiver == zzb.MediaBrowserCompat$ItemReceiver && ((str = this.read) == null ? zzb.read == null : str.equals(zzb.read))) {
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str2 != null) {
                    if (str2.equals(zzb.MediaBrowserCompat$CustomActionResultReceiver)) {
                        return true;
                    }
                } else if (zzb.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            String str = this.read;
            int i3 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return (((i2 * 31) + i) * 31) + i3;
        }
    }

    /* renamed from: o.zzev$zza */
    public final class zza extends C6961xbba4702b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(str, str2, str3, str4, str5, str6, str7);
            onGetStartedClick.write((Object) str, "accountName");
            onGetStartedClick.write((Object) str2, "accountNo");
            onGetStartedClick.write((Object) str3, "accountSubType");
            onGetStartedClick.write((Object) str4, "accountSubTypeDesc");
            onGetStartedClick.write((Object) str5, "accountType");
            onGetStartedClick.write((Object) str6, "accountTypeDesc");
            onGetStartedClick.write((Object) str7, "nickname");
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return DiskLruCache.VERSION_1.equalsIgnoreCase(((AdvertisingIdClient.Info) obj).IconCompatParcelizer);
    }
}
