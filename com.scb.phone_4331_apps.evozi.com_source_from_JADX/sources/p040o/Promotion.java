package p040o;

import p040o.zzqj;

/* renamed from: o.Promotion */
public final class Promotion extends FragmentBuilder_BindSummaryFragment {
    public static zzqj.zzd MediaBrowserCompat$CustomActionResultReceiver(beginSection beginsection) {
        onGetStartedClick.write((Object) beginsection, "entity");
        zzqj.zzd zzd = new zzqj.zzd();
        String str = beginsection.MediaBrowserCompat$MediaItem;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        zzd.MediaDescriptionCompat = str;
        String str3 = beginsection.write;
        if (str3 == null) {
            str3 = str2;
        }
        zzd.MediaBrowserCompat$CustomActionResultReceiver = str3;
        String str4 = beginsection.IconCompatParcelizer;
        if (str4 == null) {
            str4 = str2;
        }
        zzd.MediaBrowserCompat$ItemReceiver = str4;
        String str5 = beginsection.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            str5 = str2;
        }
        zzd.IconCompatParcelizer = str5;
        String str6 = beginsection.read;
        if (str6 == null) {
            str6 = str2;
        }
        zzd.write = str6;
        String str7 = beginsection.MediaBrowserCompat$SearchResultReceiver;
        if (str7 == null) {
            str7 = str2;
        }
        zzd.MediaBrowserCompat$SearchResultReceiver = str7;
        zzd.read = beginsection.MediaBrowserCompat$CustomActionResultReceiver;
        String str8 = beginsection.RatingCompat;
        if (str8 == null) {
            str8 = str2;
        }
        zzd.RatingCompat = str8;
        String str9 = beginsection.MediaMetadataCompat;
        if (str9 == null) {
            str9 = str2;
        }
        zzd.MediaMetadataCompat = str9;
        String str10 = beginsection.MediaDescriptionCompat;
        if (str10 != null) {
            str2 = str10;
        }
        zzd.MediaBrowserCompat$MediaItem = str2;
        return zzd;
    }
}
