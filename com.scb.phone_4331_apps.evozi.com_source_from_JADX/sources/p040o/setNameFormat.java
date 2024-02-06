package p040o;

/* renamed from: o.setNameFormat */
public final class setNameFormat extends remainingCapacity {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String RatingCompat;
    public double read;

    private setNameFormat() {
    }

    public static setNameFormat MediaBrowserCompat$ItemReceiver() {
        return new setNameFormat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setNameFormat setnameformat = (setNameFormat) obj;
        if (this.MediaMetadataCompat != setnameformat.MediaMetadataCompat || this.MediaBrowserCompat$MediaItem != setnameformat.MediaBrowserCompat$MediaItem || Double.compare(setnameformat.read, this.read) != 0 || this.MediaBrowserCompat$SearchResultReceiver != setnameformat.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        if (str == null ? setnameformat.MediaDescriptionCompat != null : !str.equals(setnameformat.MediaDescriptionCompat)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? setnameformat.IconCompatParcelizer != null : !str2.equals(setnameformat.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 == null ? setnameformat.MediaBrowserCompat$CustomActionResultReceiver != null : !str3.equals(setnameformat.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str4 = this.RatingCompat;
        if (str4 == null ? setnameformat.RatingCompat != null : !str4.equals(setnameformat.RatingCompat)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        String str6 = setnameformat.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.MediaBrowserCompat$MediaItem;
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.read);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$SearchResultReceiver;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((((((((((((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + i;
    }
}
