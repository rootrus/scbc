package p040o;

import com.google.gson.annotations.SerializedName;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.MapView */
public final class MapView extends zzuk {
    public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    /* renamed from: o.MapView$zzb */
    public final class zzb {
        public final String MediaBrowserCompat$ItemReceiver;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzb = (zzb) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzb.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ResetPin(registrationMethod=");
            sb.append(this.write);
            sb.append(", migrationFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zzb(String str, String str2) {
            onGetStartedClick.write((Object) str, "registrationMethod");
            onGetStartedClick.write((Object) str2, "migrationFlag");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }
    }

    /* renamed from: o.MapView$zza */
    public class zza {
        @SerializedName("recipientId")
        public long IconCompatParcelizer;
        @SerializedName("amount")
        public String MediaBrowserCompat$ItemReceiver;

        public zza(String str, long j) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.IconCompatParcelizer != zza.IconCompatParcelizer) {
                return false;
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            String str2 = zza.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.IconCompatParcelizer;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }
    }

    public static MapView MediaBrowserCompat$CustomActionResultReceiver() {
        return new MapView();
    }
}
