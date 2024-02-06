package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.applyValueCallback */
public final class applyValueCallback {
    @SerializedName("accountNo")
    private final String IconCompatParcelizer;
    @SerializedName("id")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("bankCode")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof applyValueCallback)) {
            return false;
        }
        applyValueCallback applyvaluecallback = (applyValueCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) applyvaluecallback.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) applyvaluecallback.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) applyvaluecallback.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlEditAccountInfo(id=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", bankCode=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public applyValueCallback(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) str2, "bankCode");
        onGetStartedClick.write((Object) str3, "accountNo");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
    }
}
