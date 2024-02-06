package p040o;

import java.util.List;

/* renamed from: o.obtainMessage */
public final class obtainMessage extends zzuk {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<String> MediaBrowserCompat$ItemReceiver;
    public double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$Token;
    public double RatingCompat;
    public String read;
    public List<String> write;

    public obtainMessage(double d, double d2, String str, String str2, String str3, String str4, List<String> list, List<String> list2, String str5, String str6) {
        this.MediaBrowserCompat$MediaItem = d;
        this.RatingCompat = d2;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.MediaSessionCompat$Token = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaMetadataCompat = str4;
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }
}
