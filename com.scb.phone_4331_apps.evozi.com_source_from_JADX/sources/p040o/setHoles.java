package p040o;

import java.util.Comparator;
import java.util.List;
import p040o.zzag;
import p040o.zzbt;

/* renamed from: o.setHoles */
public final class setHoles implements Comparator<setHoles> {
    public zzag.zza IconCompatParcelizer;
    public zzag.zza MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> MediaBrowserCompat$ItemReceiver;
    public zzag.zza MediaBrowserCompat$SearchResultReceiver;
    public zzbt.zza MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int RatingCompat;
    public String read;
    public String write;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((setHoles) obj).MediaMetadataCompat - ((setHoles) obj2).MediaMetadataCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setHoles setholes = (setHoles) obj;
        if (this.RatingCompat != setholes.RatingCompat || this.MediaMetadataCompat != setholes.MediaMetadataCompat || this.MediaDescriptionCompat != setholes.MediaDescriptionCompat) {
            return false;
        }
        zzag.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (zza == null ? setholes.MediaBrowserCompat$CustomActionResultReceiver != null : !zza.equals(setholes.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str = this.write;
        if (str == null ? setholes.write != null : !str.equals(setholes.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? setholes.read != null : !str2.equals(setholes.read)) {
            return false;
        }
        zzag.zza zza2 = this.IconCompatParcelizer;
        if (zza2 == null ? setholes.IconCompatParcelizer != null : !zza2.equals(setholes.IconCompatParcelizer)) {
            return false;
        }
        zzag.zza zza3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (zza3 == null ? setholes.MediaBrowserCompat$SearchResultReceiver != null : !zza3.equals(setholes.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        List<String> list2 = setholes.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzbt.zza zza = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = zza != null ? zza.hashCode() : 0;
        int i2 = this.RatingCompat;
        int i3 = this.MediaMetadataCompat;
        zzag.zza zza2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = zza2 != null ? zza2.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        zzag.zza zza3 = this.IconCompatParcelizer;
        int hashCode5 = zza3 != null ? zza3.hashCode() : 0;
        zzag.zza zza4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = zza4 != null ? zza4.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + i2) * 31) + i3) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }
}
