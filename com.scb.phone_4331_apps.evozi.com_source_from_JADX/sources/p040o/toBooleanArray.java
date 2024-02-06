package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;

/* renamed from: o.toBooleanArray */
public final class toBooleanArray extends constrainedListMultimap {
    @HmlPinActivity
    public toBooleanArray(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final setUuidFromUtf8Bytes write(MapView mapView, setSymbol setsymbol, double d, String str, boolean z, String str2) {
        String str3;
        if (mapView == null) {
            return null;
        }
        setUuidFromUtf8Bytes read = setUuidFromUtf8Bytes.RatingCompat().read(mapView.MediaBrowserCompat$ItemReceiver);
        if (mapView.MediaBrowserCompat$CustomActionResultReceiver == null) {
            str3 = "";
        } else {
            str3 = IconCompatParcelizer("dd MMM yyyy", mapView.MediaBrowserCompat$CustomActionResultReceiver);
        }
        read.AppCompatDelegateImpl$ListMenuDecorView = str3;
        read.setVisibility = write(setsymbol.MediaBrowserCompat$ItemReceiver, setsymbol.write);
        read.MenuItemImpl = setsymbol.MediaBrowserCompat$ItemReceiver;
        read.AbsActionBarView = getICheckDeserializerRtti.IconCompatParcelizer(false, z, str);
        read.ActionBarContainer = z ? "MOB" : "CID";
        CrashlyticsReport.Session.Application.read read2 = new CrashlyticsReport.Session.Application.read();
        read2.IconCompatParcelizer = write(Double.valueOf(d));
        read.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read2, (byte) 0);
        read.setForceShowIcon = str2;
        setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = read.MediaMetadataCompat("rtp.requester").MediaBrowserCompat$MediaItem(write(Double.valueOf(mapView.read)));
        MediaBrowserCompat$MediaItem.ActionMenuItemView = mapView.write;
        return MediaBrowserCompat$MediaItem;
    }
}
