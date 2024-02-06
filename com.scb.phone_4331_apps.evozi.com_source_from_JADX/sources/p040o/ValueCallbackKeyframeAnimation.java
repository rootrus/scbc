package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ValueCallbackKeyframeAnimation */
public final class ValueCallbackKeyframeAnimation {
    @SerializedName("principal")
    public final double IconCompatParcelizer;
    @SerializedName("duration")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("repaymentStartDate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("installment")
    public final propagateToChildren read;
    @SerializedName("annualInterest")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueCallbackKeyframeAnimation)) {
            return false;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = (ValueCallbackKeyframeAnimation) obj;
        return Double.compare(this.IconCompatParcelizer, valueCallbackKeyframeAnimation.IconCompatParcelizer) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) valueCallbackKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) valueCallbackKeyframeAnimation.read) && Double.compare(this.write, valueCallbackKeyframeAnimation.write) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) valueCallbackKeyframeAnimation.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        propagateToChildren propagatetochildren = this.read;
        int hashCode2 = propagatetochildren != null ? propagatetochildren.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.write);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i3) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLoanInfoValidateOtpEntity(principal=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", installment=");
        sb.append(this.read);
        sb.append(", annualInterest=");
        sb.append(this.write);
        sb.append(", repaymentStartDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
