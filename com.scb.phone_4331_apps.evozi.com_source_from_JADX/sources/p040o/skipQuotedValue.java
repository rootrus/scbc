package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.skipQuotedValue */
public final class skipQuotedValue {
    @SerializedName("sortSequence")
    public final Integer IconCompatParcelizer;
    @SerializedName("descriptionTH")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("descriptionEN")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("subCategory")
    public final List<containsKey> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("code")
    public final String read;
    @SerializedName("id")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipQuotedValue)) {
            return false;
        }
        skipQuotedValue skipquotedvalue = (skipQuotedValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) skipquotedvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) skipquotedvalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) skipquotedvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) skipquotedvalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) skipquotedvalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) skipquotedvalue.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Integer num = this.IconCompatParcelizer;
        int hashCode2 = num != null ? num.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        List<containsKey> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CategoryInfoEntity(id=");
        sb.append(this.write);
        sb.append(", sortSequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", code=");
        sb.append(this.read);
        sb.append(", descriptionTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", descriptionEN=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subCategory=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
