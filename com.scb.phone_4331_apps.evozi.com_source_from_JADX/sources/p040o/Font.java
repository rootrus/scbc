package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Font */
public final class Font {
    @SerializedName("remark1")
    public final String IconCompatParcelizer;
    @SerializedName("remark2")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Font)) {
            return false;
        }
        Font font = (Font) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) font.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) font.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
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
        sb.append("HmlRemark(remark1=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remark2=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
