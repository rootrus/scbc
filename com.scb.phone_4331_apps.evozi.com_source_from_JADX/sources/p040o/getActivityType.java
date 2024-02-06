package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getActivityType */
public final class getActivityType {
    @SerializedName("acceptanceFlag")
    public final String IconCompatParcelizer;
    @SerializedName("offerId")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("applicationUuid")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getActivityType)) {
            return false;
        }
        getActivityType getactivitytype = (getActivityType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getactivitytype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getactivitytype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getactivitytype.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfferAcceptance(applicationUuid=");
        sb.append(this.write);
        sb.append(", acceptanceFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", offerId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getActivityType(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "acceptanceFlag");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }
}
