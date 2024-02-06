package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.evaluate */
public class evaluate {
    @SerializedName("occupationDescription")
    public String IconCompatParcelizer;
    @SerializedName("customerGroupCode")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("isicCode")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public int MediaBrowserCompat$MediaItem;
    @SerializedName("recommendFlag")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("recommendOrder")
    public int MediaMetadataCompat;
    @SerializedName("occupationGroup")
    public String read;
    @SerializedName("occupationCode")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        evaluate evaluate = (evaluate) obj;
        if (this.MediaBrowserCompat$MediaItem != evaluate.MediaBrowserCompat$MediaItem || this.MediaMetadataCompat != evaluate.MediaMetadataCompat) {
            return false;
        }
        String str = this.write;
        if (str == null ? evaluate.write != null : !str.equals(evaluate.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? evaluate.MediaBrowserCompat$ItemReceiver != null : !str2.equals(evaluate.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? evaluate.IconCompatParcelizer != null : !str3.equals(evaluate.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.read;
        if (str4 == null ? evaluate.read != null : !str4.equals(evaluate.read)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 == null ? evaluate.MediaBrowserCompat$CustomActionResultReceiver != null : !str5.equals(evaluate.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        String str7 = evaluate.MediaBrowserCompat$SearchResultReceiver;
        if (str6 != null) {
            return str6.equals(str7);
        }
        if (str7 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.MediaBrowserCompat$MediaItem;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + this.MediaMetadataCompat;
    }
}
