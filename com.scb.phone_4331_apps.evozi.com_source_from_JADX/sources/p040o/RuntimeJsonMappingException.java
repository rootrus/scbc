package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.RuntimeJsonMappingException */
public final class RuntimeJsonMappingException {
    @SerializedName("allowTag")
    private final List<String> IconCompatParcelizer;
    @SerializedName("cardMask")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("cardStatus")
    private final String MediaDescriptionCompat;
    @SerializedName("sortSequence")
    public final int read;
    @SerializedName("cardRefNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuntimeJsonMappingException)) {
            return false;
        }
        RuntimeJsonMappingException runtimeJsonMappingException = (RuntimeJsonMappingException) obj;
        return this.read == runtimeJsonMappingException.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) runtimeJsonMappingException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) runtimeJsonMappingException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) runtimeJsonMappingException.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) runtimeJsonMappingException.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) runtimeJsonMappingException.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredDebitEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", cardRefNo=");
        sb.append(this.write);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardStatus=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", allowTag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
