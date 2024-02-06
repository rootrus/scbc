package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.doFrame */
public final class doFrame {
    @SerializedName("registerVerifyUser")
    public final Boolean IconCompatParcelizer;
    @SerializedName("fatcaStatus")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doFrame)) {
            return false;
        }
        doFrame doframe = (doFrame) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) doframe.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) doframe.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        if (bool != null) {
            i = bool.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointValidateEntity(fatcaStatus=");
        sb.append(this.read);
        sb.append(", registerVerifyUser=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
