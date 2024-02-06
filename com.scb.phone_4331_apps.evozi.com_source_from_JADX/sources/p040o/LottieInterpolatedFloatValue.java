package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieInterpolatedFloatValue */
public final class LottieInterpolatedFloatValue {
    @SerializedName("transactionId")
    public final String IconCompatParcelizer;
    @SerializedName("transactionDateTime")
    public final String read;
    @SerializedName("remainingBalance")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieInterpolatedFloatValue)) {
            return false;
        }
        LottieInterpolatedFloatValue lottieInterpolatedFloatValue = (LottieInterpolatedFloatValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lottieInterpolatedFloatValue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieInterpolatedFloatValue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lottieInterpolatedFloatValue.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestOtpConfirmEntity(transactionDateTime=");
        sb.append(this.read);
        sb.append(", transactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remainingBalance=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
