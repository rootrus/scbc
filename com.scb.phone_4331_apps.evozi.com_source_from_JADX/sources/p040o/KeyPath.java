package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.KeyPath */
public final class KeyPath {
    @SerializedName("thaiFullTitle")
    private final String IconCompatParcelizer;
    @SerializedName("sortSequence")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("engTitle")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("thaiTitle")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("engFullTitle")
    private final String read;
    @SerializedName("gender")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPath)) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keyPath.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) keyPath.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) keyPath.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keyPath.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) keyPath.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keyPath.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlTitleEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", thaiTitle=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", thaiFullTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", engTitle=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", engFullTitle=");
        sb.append(this.read);
        sb.append(", gender=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
