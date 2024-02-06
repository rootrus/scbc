package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.readFirstLine */
public final class readFirstLine extends toStringBuilder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public readFirstLine(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str2) {
        super(resources, sharedPreferences, str, str2);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "language");
        onGetStartedClick.write((Object) str2, "baseAssetsURL");
    }

    public static boolean read(PlacePhotoMetadataResult placePhotoMetadataResult) {
        String str;
        if ((!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) placePhotoMetadataResult.setItemInvoker, (Object) "GROUP") && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) placePhotoMetadataResult.setItemInvoker, (Object) "SHORTCUT")) || (str = placePhotoMetadataResult.setShortcut) == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2131401768:
                if (!str.equals("FUNCTION")) {
                    return false;
                }
                break;
            case -1842543390:
                if (!str.equals("CARD_TILE_CAROUSEL")) {
                    return false;
                }
                List<zzvm> list = placePhotoMetadataResult.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) list, "tile.adsList");
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    zzvm zzvm = (zzvm) next;
                    onGetStartedClick.write((Object) zzvm, "ad");
                    if (zzvm.MediaBrowserCompat$MediaItem == zzvm$MediaBrowserCompat$CustomActionResultReceiver.IMAGE) {
                        arrayList.add(next);
                    }
                }
                if (((List) arrayList).isEmpty()) {
                    return false;
                }
                break;
            case 465373944:
                if (!str.equals("CARD_TILE_VERTICAL")) {
                    return false;
                }
                break;
            case 1729844006:
                if (!str.equals("CARD_TILE_HORIZONTAL")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        Collection collection = placePhotoMetadataResult.setGroupDividerEnabled;
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }
}
