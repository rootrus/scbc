package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzlv */
public final class zzlv extends zzlw {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("documentId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlv)) {
            return false;
        }
        zzlv zzlv = (zzlv) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzlv.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzlv.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
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
        sb.append("HmlDeleteAdditionDocumentRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzlv(String str, String str2) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "documentId");
        this.IconCompatParcelizer = str;
        this.read = str2;
    }
}
