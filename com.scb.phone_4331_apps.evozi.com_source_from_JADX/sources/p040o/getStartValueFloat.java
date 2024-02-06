package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStartValueFloat */
public final class getStartValueFloat {
    @SerializedName("newFlag")
    public final String IconCompatParcelizer;
    @SerializedName("cardImageUrl")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("prepaidCardType")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("newFee")
    public final Keyframe read;
    @SerializedName("productType")
    public final getStartValueInt write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartValueFloat)) {
            return false;
        }
        getStartValueFloat getstartvaluefloat = (getStartValueFloat) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstartvaluefloat.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstartvaluefloat.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstartvaluefloat.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstartvaluefloat.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartvaluefloat.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Keyframe keyframe = this.read;
        int hashCode4 = keyframe != null ? keyframe.hashCode() : 0;
        getStartValueInt getstartvalueint = this.write;
        if (getstartvalueint != null) {
            i = getstartvalueint.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardTypeEntity(newFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", prepaidCardType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardImageUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", newFee=");
        sb.append(this.read);
        sb.append(", productType=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
