package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setValueCallback */
public final class setValueCallback {
    @SerializedName("accountNo")
    public final String IconCompatParcelizer;
    @SerializedName("bankLogo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("id")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("bankCode")
    public final String read;
    @SerializedName("bankAbbrev")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setValueCallback)) {
            return false;
        }
        setValueCallback setvaluecallback = (setValueCallback) obj;
        return this.MediaBrowserCompat$ItemReceiver == setvaluecallback.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setvaluecallback.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setvaluecallback.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setvaluecallback.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setvaluecallback.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessAccountEntity(id=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", bankCode=");
        sb.append(this.read);
        sb.append(", bankAbbrev=");
        sb.append(this.write);
        sb.append(", bankLogo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
