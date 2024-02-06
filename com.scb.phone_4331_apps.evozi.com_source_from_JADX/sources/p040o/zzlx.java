package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzlx */
public final class zzlx extends zzlw {
    @SerializedName("documentId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationId")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlx)) {
            return false;
        }
        zzlx zzlx = (zzlx) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzlx.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzlx.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashDeleteAdditionDocumentRequest(applicationId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", documentId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.zzlx$zza */
    public final class zza {
        @SerializedName("taxId")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("accountNo")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("JuristicResetPinRequest(taxId=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", accountNo=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, String str2) {
            onGetStartedClick.write((Object) str, "taxId");
            onGetStartedClick.write((Object) str2, "accountNo");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzlx(String str, String str2) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentId");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}
