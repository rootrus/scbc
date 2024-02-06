package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzvc */
public final class zzvc {
    @SerializedName("pseudoSid")
    private final String IconCompatParcelizer;
    @SerializedName("e2eeSid")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("pseudoPin")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("deviceId")
    private final String read;
    @SerializedName("encryptPin")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvc)) {
            return false;
        }
        zzvc zzvc = (zzvc) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzvc.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvc.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzvc.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzvc.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzvc.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PinChangeRequest(encryptPin=");
        sb.append(this.write);
        sb.append(", e2eeSid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", deviceId=");
        sb.append(this.read);
        sb.append(", pseudoPin=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", pseudoSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzvc(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str3, "deviceId");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.IconCompatParcelizer = str5;
    }
}
