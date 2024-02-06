package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.cast */
public class cast {
    @SerializedName("merchantInfo")
    private GoogleMap.OnPolylineClickListener MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("paymentInfo")
    private List<SupportStreetViewPanoramaFragment> MediaBrowserCompat$ItemReceiver;
    @SerializedName("callbackUrl")
    private String read;

    public cast(List<SupportStreetViewPanoramaFragment> list, GoogleMap.OnPolylineClickListener onPolylineClickListener, String str) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = onPolylineClickListener;
        this.read = str;
    }
}
