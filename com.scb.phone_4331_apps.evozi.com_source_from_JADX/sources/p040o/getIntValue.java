package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getIntValue */
public final class getIntValue {
    @SerializedName("isicDescription")
    public final String IconCompatParcelizer;
    @SerializedName("recommendOrder")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("isicCode")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIntValue)) {
            return false;
        }
        getIntValue getintvalue = (getIntValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getintvalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getintvalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getintvalue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (num != null) {
            i = num.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBussinessIndustryEntity(isicCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isicDescription=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", recommendOrder=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
