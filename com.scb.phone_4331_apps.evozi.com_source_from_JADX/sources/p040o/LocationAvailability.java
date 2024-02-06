package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LocationAvailability */
public class LocationAvailability {
    @SerializedName("dateOfMonth")
    public String IconCompatParcelizer;
    @SerializedName("scheduleType")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("months")
    public List<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("day")
    public String read;
    @SerializedName("date")
    public String write;

    public /* synthetic */ LocationAvailability(C3597xa9335a5d locationAvailability$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
        this(locationAvailability$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private LocationAvailability(C3597xa9335a5d locationAvailability$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = locationAvailability$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = locationAvailability$MediaBrowserCompat$CustomActionResultReceiver.read;
        this.IconCompatParcelizer = locationAvailability$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = locationAvailability$MediaBrowserCompat$CustomActionResultReceiver.write;
        this.read = locationAvailability$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static C3597xa9335a5d write() {
        return new C3597xa9335a5d((byte) 0);
    }
}
