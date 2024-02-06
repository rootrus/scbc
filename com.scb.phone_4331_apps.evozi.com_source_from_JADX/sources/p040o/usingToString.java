package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.AnalyticsConnectorReceiver;

/* renamed from: o.usingToString */
public final class usingToString extends constrainedSetMultimap<getStringsFileValue, AnalyticsConnectorReceiver> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return read((getStringsFileValue) obj);
    }

    @HmlPinActivity
    public usingToString(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static AnalyticsConnectorReceiver read(getStringsFileValue getstringsfilevalue) {
        double d;
        double d2;
        double d3;
        AnalyticsConnectorReceiver.read read = new AnalyticsConnectorReceiver.read();
        String str = getstringsfilevalue.AppCompatActivity;
        boolean z = true;
        double d4 = 0.0d;
        if (!(str == null || str.length() == 0)) {
            d = Double.parseDouble(getstringsfilevalue.AppCompatActivity);
        } else {
            d = 0.0d;
        }
        read.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(d);
        String str2 = getstringsfilevalue.f2854x50fd9e4a;
        if (!(str2 == null || str2.length() == 0)) {
            d2 = Double.parseDouble(getstringsfilevalue.f2854x50fd9e4a);
        } else {
            d2 = 0.0d;
        }
        read.MediaBrowserCompat$ItemReceiver = Double.valueOf(d2);
        String str3 = getstringsfilevalue.PlaybackStateCompat$CustomAction;
        if (!(str3 == null || str3.length() == 0)) {
            d3 = Double.parseDouble(getstringsfilevalue.PlaybackStateCompat$CustomAction);
        } else {
            d3 = 0.0d;
        }
        read.read = Double.valueOf(d3);
        String str4 = getstringsfilevalue.AlertController$RecycleListView;
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (!z) {
            d4 = Double.parseDouble(getstringsfilevalue.AlertController$RecycleListView);
        }
        read.IconCompatParcelizer = Double.valueOf(d4);
        return new AnalyticsConnectorReceiver(read, (byte) 0);
    }
}
