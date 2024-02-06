package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStartFrame */
public final class getStartFrame {
    @SerializedName("colorCode")
    public final String IconCompatParcelizer;
    @SerializedName("labelName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartFrame)) {
            return false;
        }
        getStartFrame getstartframe = (getStartFrame) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartframe.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstartframe.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositLabelEntity(labelName=");
        sb.append(this.write);
        sb.append(", colorCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
