package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setCenterTextSize */
public final class setCenterTextSize {
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("optStatus")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCenterTextSize)) {
            return false;
        }
        setCenterTextSize setcentertextsize = (setCenterTextSize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcentertextsize.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcentertextsize.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountEntity(accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", optStatus=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
