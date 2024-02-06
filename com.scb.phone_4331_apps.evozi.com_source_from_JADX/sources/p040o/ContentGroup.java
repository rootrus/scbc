package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ContentGroup */
public class ContentGroup {
    @SerializedName("accountNickname")
    public String IconCompatParcelizer;
    @SerializedName("limitStepSize")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("limitAmount")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("minAmount")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("maxAmount")
    public String MediaMetadataCompat;
    @SerializedName("accountNo")
    public String read;
    @SerializedName("fastpayFlag")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentGroup)) {
            return false;
        }
        ContentGroup contentGroup = (ContentGroup) obj;
        String str = this.write;
        if (str == null ? contentGroup.write != null : !str.equals(contentGroup.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? contentGroup.read != null : !str2.equals(contentGroup.read)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? contentGroup.IconCompatParcelizer != null : !str3.equals(contentGroup.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 == null ? contentGroup.MediaBrowserCompat$ItemReceiver != null : !str4.equals(contentGroup.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 == null ? contentGroup.MediaBrowserCompat$MediaItem != null : !str5.equals(contentGroup.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str6 = this.MediaMetadataCompat;
        if (str6 == null ? contentGroup.MediaMetadataCompat != null : !str6.equals(contentGroup.MediaMetadataCompat)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            return str7.equals(contentGroup.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (contentGroup.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.write;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.read;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        String str6 = this.MediaMetadataCompat;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i7 = str7.hashCode();
        }
        return (((((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7;
    }
}
