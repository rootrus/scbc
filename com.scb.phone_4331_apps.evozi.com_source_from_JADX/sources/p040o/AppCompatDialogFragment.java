package p040o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Process;
import android.util.Log;
import java.util.Calendar;

/* renamed from: o.AppCompatDialogFragment */
public final class AppCompatDialogFragment {
    public static AppCompatDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final Context MediaBrowserCompat$ItemReceiver;
    private final LocationManager read;
    private final read write = new read();

    public AppCompatDialogFragment(Context context, LocationManager locationManager) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = locationManager;
    }

    public final boolean write() {
        read read2 = this.write;
        if (read2.MediaBrowserCompat$ItemReceiver > System.currentTimeMillis()) {
            return read2.IconCompatParcelizer;
        }
        Location IconCompatParcelizer = IconCompatParcelizer();
        if (IconCompatParcelizer != null) {
            write(IconCompatParcelizer);
            return read2.IconCompatParcelizer;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }

    private Location IconCompatParcelizer() {
        Context context = this.MediaBrowserCompat$ItemReceiver;
        Location location = null;
        Location IconCompatParcelizer = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(context, "android.permission.ACCESS_COARSE_LOCATION", Process.myPid(), Process.myUid(), context.getPackageName()) == 0 ? IconCompatParcelizer("network") : null;
        Context context2 = this.MediaBrowserCompat$ItemReceiver;
        if (AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(context2, "android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid(), context2.getPackageName()) == 0) {
            location = IconCompatParcelizer("gps");
        }
        return (location == null || IconCompatParcelizer == null) ? location != null ? location : IconCompatParcelizer : location.getTime() > IconCompatParcelizer.getTime() ? location : IconCompatParcelizer;
    }

    private Location IconCompatParcelizer(String str) {
        try {
            if (this.read.isProviderEnabled(str)) {
                return this.read.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private void write(Location location) {
        long j;
        read read2 = this.write;
        long currentTimeMillis = System.currentTimeMillis();
        if (AlertController$RecycleListView.read == null) {
            AlertController$RecycleListView.read = new AlertController$RecycleListView();
        }
        AlertController$RecycleListView alertController$RecycleListView = AlertController$RecycleListView.read;
        AlertController$RecycleListView alertController$RecycleListView2 = alertController$RecycleListView;
        alertController$RecycleListView2.IconCompatParcelizer(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        AlertController$RecycleListView alertController$RecycleListView3 = alertController$RecycleListView;
        alertController$RecycleListView.IconCompatParcelizer(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = true;
        if (alertController$RecycleListView3.RatingCompat != 1) {
            z = false;
        }
        long j2 = alertController$RecycleListView3.MediaBrowserCompat$SearchResultReceiver;
        long j3 = alertController$RecycleListView3.MediaDescriptionCompat;
        AlertController$RecycleListView alertController$RecycleListView4 = alertController$RecycleListView3;
        alertController$RecycleListView4.IconCompatParcelizer(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = alertController$RecycleListView3.MediaBrowserCompat$SearchResultReceiver;
        if (j2 == -1 || j3 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            if (currentTimeMillis > j3) {
                j2 = j4;
            } else if (currentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        read2.IconCompatParcelizer = z;
        read2.MediaBrowserCompat$ItemReceiver = j;
    }

    /* renamed from: o.AppCompatDialogFragment$read */
    static class read {
        boolean IconCompatParcelizer;
        long MediaBrowserCompat$ItemReceiver;

        read() {
        }
    }
}
