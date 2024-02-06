package p040o;

/* renamed from: o.setMockLocation */
public final class setMockLocation {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMockLocation)) {
            return false;
        }
        setMockLocation setmocklocation = (setMockLocation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setmocklocation.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setmocklocation.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmocklocation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmocklocation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmocklocation.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmocklocation.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmocklocation.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextualMetadata(headerTh=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", headerEn=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", descriptionTh=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", descriptionEn=");
        sb.append(this.write);
        sb.append(", buttonTextTh=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", buttonTextEn=");
        sb.append(this.read);
        sb.append(", formatType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setMockLocation(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.IconCompatParcelizer = str3;
        this.write = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.read = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
    }
}
