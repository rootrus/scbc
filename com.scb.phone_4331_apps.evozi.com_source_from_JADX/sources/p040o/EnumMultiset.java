package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.EvictionListeners;

/* renamed from: o.EnumMultiset */
public final class EnumMultiset {
    @SerializedName("maritalStatusCode")
    private final String IconCompatParcelizer;
    @SerializedName("spouseInfo")
    private final EvictionListeners.C97301 read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnumMultiset)) {
            return false;
        }
        EnumMultiset enumMultiset = (EnumMultiset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) enumMultiset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) enumMultiset.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        EvictionListeners.C97301 r2 = this.read;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SCBSMaritalStatusRequest(maritalStatusCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", spouseInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public EnumMultiset(String str, EvictionListeners.C97301 r3) {
        onGetStartedClick.write((Object) str, "maritalStatusCode");
        this.IconCompatParcelizer = str;
        this.read = r3;
    }
}
