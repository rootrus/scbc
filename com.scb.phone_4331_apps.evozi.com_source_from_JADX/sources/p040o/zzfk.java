package p040o;

import okhttp3.ResponseBody;

/* renamed from: o.zzfk */
public final /* synthetic */ class zzfk implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzfk read = new zzfk();

    private /* synthetic */ zzfk() {
    }

    public final Object write(Object obj) {
        return ((ResponseBody) obj).string();
    }

    /* renamed from: o.zzfk$zza */
    public final class zza {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlExtendedCitizenId(number=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", laserCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", issueDate=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "number");
            onGetStartedClick.write((Object) str2, "laserCode");
            onGetStartedClick.write((Object) str3, "issueDate");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
        }
    }
}
