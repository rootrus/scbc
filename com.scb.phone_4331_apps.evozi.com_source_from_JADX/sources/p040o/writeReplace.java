package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.writeReplace */
public final class writeReplace {
    @SerializedName("description")
    private final rotateRight IconCompatParcelizer;
    @SerializedName("version")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeReplace)) {
            return false;
        }
        writeReplace writereplace = (writeReplace) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writereplace.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writereplace.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        rotateRight rotateright = this.IconCompatParcelizer;
        if (rotateright != null) {
            i = rotateright.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantTermsAndConditionsEntity(version=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
