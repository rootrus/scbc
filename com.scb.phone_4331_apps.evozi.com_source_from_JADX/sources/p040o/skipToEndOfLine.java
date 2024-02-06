package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.skipToEndOfLine */
public final class skipToEndOfLine {
    @SerializedName("descriptionTH")
    public final String IconCompatParcelizer;
    @SerializedName("sortSequence")
    public final Integer MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("descriptionEN")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public final String read;
    @SerializedName("id")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipToEndOfLine)) {
            return false;
        }
        skipToEndOfLine skiptoendofline = (skipToEndOfLine) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) skiptoendofline.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) skiptoendofline.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) skiptoendofline.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) skiptoendofline.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) skiptoendofline.write);
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AvgRevenueInfoEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", code=");
        sb.append(this.read);
        sb.append(", descriptionTH=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", descriptionEN=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", id=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
