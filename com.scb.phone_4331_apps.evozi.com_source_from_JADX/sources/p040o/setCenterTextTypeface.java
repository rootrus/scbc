package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setCenterTextTypeface */
public final class setCenterTextTypeface {
    @SerializedName("tcAcceptDate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tcAcceptRequired")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("etbActiveCasa")
    public final Boolean read;
    @SerializedName("registerVerifyUser")
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCenterTextTypeface)) {
            return false;
        }
        setCenterTextTypeface setcentertexttypeface = (setCenterTextTypeface) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcentertexttypeface.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcentertexttypeface.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcentertexttypeface.read) && this.write == setcentertexttypeface.write;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Boolean bool = this.read;
        if (bool != null) {
            i = bool.hashCode();
        }
        boolean z = this.write;
        if (z) {
            z = true;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifiedUserEntity(tcAcceptRequired=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tcAcceptDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", etbActiveCasa=");
        sb.append(this.read);
        sb.append(", registerVerifyUser=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
