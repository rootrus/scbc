package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.Callables */
public final class Callables extends constrainedListMultimap {
    @HmlPinActivity
    public Callables(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static List<CrashlyticsReport.Session.OperatingSystem.Builder> write(setOnCameraMoveStartedListener setoncameramovestartedlistener) {
        ArrayList arrayList = new ArrayList();
        if (!(setoncameramovestartedlistener == null || setoncameramovestartedlistener.MediaBrowserCompat$ItemReceiver == null || setoncameramovestartedlistener.MediaBrowserCompat$ItemReceiver.isEmpty())) {
            for (setOnIndoorStateChangeListener next : setoncameramovestartedlistener.MediaBrowserCompat$ItemReceiver) {
                arrayList.add(new CrashlyticsReport.Session.OperatingSystem.Builder(next.MediaDescriptionCompat, next.IconCompatParcelizer, next.write, next.MediaBrowserCompat$CustomActionResultReceiver, next.MediaBrowserCompat$ItemReceiver, next.read));
            }
        }
        return arrayList;
    }
}
