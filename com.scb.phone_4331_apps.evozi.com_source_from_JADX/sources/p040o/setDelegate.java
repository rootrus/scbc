package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDelegate */
public final class setDelegate {
    @SerializedName("businessExpansion")
    public final String IconCompatParcelizer;
    @SerializedName("workingCapital")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDelegate)) {
            return false;
        }
        setDelegate setdelegate = (setDelegate) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdelegate.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdelegate.read);
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
        sb.append("HmlLoanPurposeEntity(businessExpansion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", workingCapital=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
