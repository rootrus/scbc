package p040o;

import com.scb.phone.view.activity.ntb.touchpoint.C5678xe38d8869;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointInstructionActivity;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.addPolygon */
public final class addPolygon extends zzuk {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<C5678xe38d8869> MediaBrowserCompat$MediaItem;
    public final TouchPointInstructionActivity.write MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2797x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final int MediaSessionCompat$QueueItem;
    public final OffsetDateTime MediaSessionCompat$ResultReceiverWrapper;
    public final int MediaSessionCompat$Token;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public addPolygon(int i, String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, int i2, String str7, String str8, TouchPointInstructionActivity.write write2, List<C5678xe38d8869> list) {
        this.MediaSessionCompat$QueueItem = i;
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.RatingCompat = str3;
        this.MediaMetadataCompat = str4;
        this.MediaSessionCompat$ResultReceiverWrapper = offsetDateTime;
        this.f2797x50fd9e4a = str5;
        this.read = str6;
        this.MediaSessionCompat$Token = i2;
        this.write = str7;
        this.MediaBrowserCompat$CustomActionResultReceiver = str8;
        this.MediaBrowserCompat$SearchResultReceiver = write2;
        this.MediaBrowserCompat$MediaItem = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        addPolygon addpolygon = (addPolygon) obj;
        if (this.MediaSessionCompat$QueueItem != addpolygon.MediaSessionCompat$QueueItem || this.MediaSessionCompat$Token != addpolygon.MediaSessionCompat$Token) {
            return false;
        }
        String str = this.MediaDescriptionCompat;
        if (str == null ? addpolygon.MediaDescriptionCompat != null : !str.equals(addpolygon.MediaDescriptionCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? addpolygon.MediaBrowserCompat$ItemReceiver != null : !str2.equals(addpolygon.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.RatingCompat;
        if (str3 == null ? addpolygon.RatingCompat != null : !str3.equals(addpolygon.RatingCompat)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? addpolygon.MediaMetadataCompat != null : !str4.equals(addpolygon.MediaMetadataCompat)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.MediaSessionCompat$ResultReceiverWrapper;
        if (offsetDateTime == null ? addpolygon.MediaSessionCompat$ResultReceiverWrapper != null : !offsetDateTime.equals(addpolygon.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str5 = this.f2797x50fd9e4a;
        if (str5 == null ? addpolygon.f2797x50fd9e4a != null : !str5.equals(addpolygon.f2797x50fd9e4a)) {
            return false;
        }
        String str6 = this.read;
        if (str6 == null ? addpolygon.read != null : !str6.equals(addpolygon.read)) {
            return false;
        }
        String str7 = this.write;
        if (str7 == null ? addpolygon.write != null : !str7.equals(addpolygon.write)) {
            return false;
        }
        String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str8 == null ? addpolygon.MediaBrowserCompat$CustomActionResultReceiver != null : !str8.equals(addpolygon.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        TouchPointInstructionActivity.write write2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (write2 == null ? addpolygon.MediaBrowserCompat$SearchResultReceiver != null : !write2.equals(addpolygon.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        List<C5678xe38d8869> list = this.MediaBrowserCompat$MediaItem;
        List<C5678xe38d8869> list2 = addpolygon.MediaBrowserCompat$MediaItem;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.MediaSessionCompat$QueueItem;
        String str = this.MediaDescriptionCompat;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode5 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        String str5 = this.f2797x50fd9e4a;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        int i3 = this.MediaSessionCompat$Token;
        String str7 = this.write;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        TouchPointInstructionActivity.write write2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode10 = write2 != null ? write2.hashCode() : 0;
        List<C5678xe38d8869> list = this.MediaBrowserCompat$MediaItem;
        if (list != null) {
            i2 = list.hashCode();
        }
        return (((((((((((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i3) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i2;
    }
}
