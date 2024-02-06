package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.next */
public final class next {
    @SerializedName("income")
    public final String IconCompatParcelizer;
    @SerializedName("jobTitle")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("companyName")
    public final String read;
    @SerializedName("workAddress")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof next)) {
            return false;
        }
        next next = (next) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) next.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) next.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) next.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) next.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpOccupationEntity(companyName=");
        sb.append(this.read);
        sb.append(", jobTitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", income=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", workAddress=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
