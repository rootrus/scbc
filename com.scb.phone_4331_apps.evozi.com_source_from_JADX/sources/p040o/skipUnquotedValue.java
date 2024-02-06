package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.skipUnquotedValue */
public final class skipUnquotedValue {
    @SerializedName("GMBDeeplinkURL")
    public final String IconCompatParcelizer;
    @SerializedName("GMBClientSecret")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("GMBImageURL")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("GMBFlag")
    public final String read;
    @SerializedName("GMBMoreInfo")
    public final equal write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipUnquotedValue)) {
            return false;
        }
        skipUnquotedValue skipunquotedvalue = (skipUnquotedValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) skipunquotedvalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) skipunquotedvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) skipunquotedvalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) skipunquotedvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) skipunquotedvalue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        equal equal = this.write;
        int hashCode2 = equal != null ? equal.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GMBEntity(gmbImageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", gmbMoreInfo=");
        sb.append(this.write);
        sb.append(", gmbDeeplinkURL=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", gmbFlag=");
        sb.append(this.read);
        sb.append(", gmbClientSecret=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
