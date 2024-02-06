package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.moveCamera */
public final class moveCamera {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public OffsetDateTime MediaBrowserCompat$SearchResultReceiver;
    public String MediaMetadataCompat;
    public String read;
    public String write;

    public moveCamera(String str, String str2, String str3, OffsetDateTime offsetDateTime, String str4, String str5, String str6, String str7) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$SearchResultReceiver = offsetDateTime;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.read = str6;
        this.MediaMetadataCompat = str7;
    }

    public moveCamera() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        moveCamera movecamera = (moveCamera) obj;
        String str = this.write;
        if (str == null ? movecamera.write != null : !str.equals(movecamera.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? movecamera.MediaBrowserCompat$ItemReceiver != null : !str2.equals(movecamera.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? movecamera.IconCompatParcelizer != null : !str3.equals(movecamera.IconCompatParcelizer)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$SearchResultReceiver;
        if (offsetDateTime == null ? movecamera.MediaBrowserCompat$SearchResultReceiver != null : !offsetDateTime.equals(movecamera.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 == null ? movecamera.MediaBrowserCompat$MediaItem != null : !str4.equals(movecamera.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str5 = this.read;
        if (str5 == null ? movecamera.read != null : !str5.equals(movecamera.read)) {
            return false;
        }
        String str6 = this.MediaMetadataCompat;
        if (str6 == null ? movecamera.MediaMetadataCompat != null : !str6.equals(movecamera.MediaMetadataCompat)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str8 = movecamera.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 != null) {
            return str7.equals(str8);
        }
        if (str8 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }
}
