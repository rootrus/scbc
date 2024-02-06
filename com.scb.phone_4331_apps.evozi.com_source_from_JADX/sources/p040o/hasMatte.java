package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.hasMatte */
public final class hasMatte {
    @SerializedName("transactionDateTime")
    public final String IconCompatParcelizer;
    @SerializedName("transactionId")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasMatte)) {
            return false;
        }
        hasMatte hasmatte = (hasMatte) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hasmatte.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hasmatte.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountConfirmationEntity(transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
