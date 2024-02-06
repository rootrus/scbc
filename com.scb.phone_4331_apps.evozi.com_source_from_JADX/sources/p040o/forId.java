package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.forId */
public final class forId {
    @SerializedName("header")
    public final String IconCompatParcelizer;
    @SerializedName("description")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("confirmButtonType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof forId)) {
            return false;
        }
        forId forid = (forId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forid.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forid.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forid.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentNotificationInfoEntity(header=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", confirmButtonType=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
