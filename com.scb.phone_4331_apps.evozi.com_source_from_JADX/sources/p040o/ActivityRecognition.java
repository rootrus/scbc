package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.zzjx;

/* renamed from: o.ActivityRecognition */
public enum ActivityRecognition {
    SUBMISSION,
    RESUBMISSION;

    /* renamed from: o.ActivityRecognition$zza */
    public final class zza {
        public final zzjx.zze.zza IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final OffsetDateTime read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.read;
            int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            zzjx.zze.zza zza = this.IconCompatParcelizer;
            int hashCode3 = zza != null ? zza.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSuccess(referenceId=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", loanDate=");
            sb.append(this.read);
            sb.append(", setup=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", receivingAccount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", receivingAccountName=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, OffsetDateTime offsetDateTime, zzjx.zze.zza zza, String str2, String str3) {
            onGetStartedClick.write((Object) str, "referenceId");
            onGetStartedClick.write((Object) offsetDateTime, "loanDate");
            onGetStartedClick.write((Object) zza, "setup");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = offsetDateTime;
            this.IconCompatParcelizer = zza;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = str3;
        }
    }
}
