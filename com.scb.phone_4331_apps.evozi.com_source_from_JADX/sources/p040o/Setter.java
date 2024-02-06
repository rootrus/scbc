package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Setter */
public final class Setter {
    @SerializedName("logo")
    public final String IconCompatParcelizer;
    @SerializedName("name")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Setter)) {
            return false;
        }
        Setter setter = (Setter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setter.read);
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
        sb.append("BillPaymentHistoryBillerEntity(logo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
