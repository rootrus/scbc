package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.rotateRight */
public final class rotateRight {
    @SerializedName("en")
    private final String read;
    @SerializedName("th")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rotateRight)) {
            return false;
        }
        rotateRight rotateright = (rotateRight) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) rotateright.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) rotateright.write);
    }

    public final int hashCode() {
        String str = this.read;
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
        sb.append("MerchantTermsAndConditionsDataEntity(en=");
        sb.append(this.read);
        sb.append(", th=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
