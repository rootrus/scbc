package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.SignedBytes;

/* renamed from: o.LineProcessor */
public final class LineProcessor extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public LineProcessor(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public List<AutoValue_CrashlyticsReport_Session_Event_Application> MediaBrowserCompat$CustomActionResultReceiver(List<GoogleMap.OnCameraMoveCanceledListener> list) {
        onGetStartedClick.write((Object) list, "toWallet");
        Iterable<GoogleMap.OnCameraMoveCanceledListener> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener : iterable) {
            String str = onCameraMoveCanceledListener.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = onCameraMoveCanceledListener.MediaBrowserCompat$ItemReceiver;
            String c_ = mo26549c_(onCameraMoveCanceledListener.MediaMetadataCompat);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(it.flagImage)");
            String write = write(Double.valueOf(onCameraMoveCanceledListener.write));
            onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(it.amount)");
            String write2 = write(Double.valueOf(onCameraMoveCanceledListener.MediaDescriptionCompat));
            onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(it.thbEquivalentAmount)");
            arrayList.add(new AutoValue_CrashlyticsReport_Session_Event_Application(str, str2, c_, write, write2, onCameraMoveCanceledListener.MediaBrowserCompat$MediaItem, onCameraMoveCanceledListener.IconCompatParcelizer, 0, 0));
        }
        return (List) arrayList;
    }

    public static List<C3071x65de3bd5> read(List<GoogleMap.OnCameraChangeListener.IconCompatParcelizer> list) {
        onGetStartedClick.write((Object) list, "toWallet");
        Iterable<GoogleMap.OnCameraChangeListener.IconCompatParcelizer> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (GoogleMap.OnCameraChangeListener.IconCompatParcelizer iconCompatParcelizer : iterable) {
            arrayList.add(new C3071x65de3bd5(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.write, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.read));
        }
        return (List) arrayList;
    }
}
