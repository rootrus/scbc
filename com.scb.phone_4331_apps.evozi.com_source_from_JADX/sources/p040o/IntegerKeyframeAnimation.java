package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.IntegerKeyframeAnimation */
public final class IntegerKeyframeAnimation {
    @SerializedName("verifyKycFlag")
    public final Integer IconCompatParcelizer;
    @SerializedName("verifyEmailFlag")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("actionForReceivingAccount")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegerKeyframeAnimation)) {
            return false;
        }
        IntegerKeyframeAnimation integerKeyframeAnimation = (IntegerKeyframeAnimation) obj;
        return this.MediaBrowserCompat$ItemReceiver == integerKeyframeAnimation.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) integerKeyframeAnimation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) integerKeyframeAnimation.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        Integer num = this.IconCompatParcelizer;
        int i2 = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i2 = str.hashCode();
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCheckPrerequisiteEntity(verifyEmailFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", verifyKycFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", actionForReceivingAccount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
