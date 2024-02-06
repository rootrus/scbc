package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.GradientType */
public final class GradientType {
    @SerializedName("nickname")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    private final String read;
    @SerializedName("sortSequence")
    private final Integer write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradientType)) {
            return false;
        }
        GradientType gradientType = (GradientType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gradientType.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gradientType.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gradientType.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Integer num = this.write;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentDetailsCardEntity(sortSequence=");
        sb.append(this.write);
        sb.append(", cardRefNo=");
        sb.append(this.read);
        sb.append(", nickname=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
