package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.LogFileManager$MediaBrowserCompat$CustomActionResultReceiver */
public final class LogFileManager$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ createServiceInterface IconCompatParcelizer;

    private LogFileManager$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ LogFileManager$MediaBrowserCompat$CustomActionResultReceiver(createServiceInterface createserviceinterface) {
        this.IconCompatParcelizer = createserviceinterface;
    }

    public final Object IconCompatParcelizer(Object obj) {
        ShapeTrimPath shapeTrimPath = (ShapeTrimPath) obj;
        getGeofencingClient getgeofencingclient = new getGeofencingClient();
        getgeofencingclient.MediaBrowserCompat$CustomActionResultReceiver = shapeTrimPath.IconCompatParcelizer;
        getgeofencingclient.IconCompatParcelizer = FragmentBuilder_BindSummaryFragment.write(shapeTrimPath.write, OffsetDateTime.now());
        getgeofencingclient.read = FragmentBuilder_BindSummaryFragment.write(shapeTrimPath.read, OffsetDateTime.now());
        getgeofencingclient.MediaBrowserCompat$ItemReceiver = shapeTrimPath.MediaBrowserCompat$ItemReceiver;
        getgeofencingclient.write = shapeTrimPath.MediaBrowserCompat$CustomActionResultReceiver;
        return getgeofencingclient;
    }
}
