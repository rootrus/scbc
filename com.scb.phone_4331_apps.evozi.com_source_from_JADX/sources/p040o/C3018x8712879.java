package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3018x8712879 {
    @SerializedName("thaiLastName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("citizenship")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("citizenId")
    public final String read;
    @SerializedName("thaiFirstName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3018x8712879)) {
            return false;
        }
        C3018x8712879 animatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver = (C3018x8712879) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatableTransform$read$MediaBrowserCompat$CustomActionResultReceiver.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpouseInfo(citizenship=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", thaiFirstName=");
        sb.append(this.write);
        sb.append(", thaiLastName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", citizenId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
