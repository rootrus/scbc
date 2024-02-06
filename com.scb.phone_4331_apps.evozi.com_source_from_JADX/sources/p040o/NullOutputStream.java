package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.getSignal;

/* renamed from: o.NullOutputStream */
public final /* synthetic */ class NullOutputStream implements findFragmentByWho {
    private final /* synthetic */ get6to4IPv4Address IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ NullOutputStream(get6to4IPv4Address get6to4ipv4address, boolean z) {
        this.IconCompatParcelizer = get6to4ipv4address;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Application.C30731 r7 = (AutoValue_CrashlyticsReport_Session_Event_Application.C30731) obj;
        String str = r7.read;
        String str2 = r7.IconCompatParcelizer;
        String str3 = r7.write;
        String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(r7.read, z);
        String str4 = r7.MediaBrowserCompat$CustomActionResultReceiver;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver3 = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver3.MediaDescriptionCompat = 2;
        MediaBrowserCompat$CustomActionResultReceiver3.IconCompatParcelizer = str;
        MediaBrowserCompat$CustomActionResultReceiver3.read = str2;
        MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver = str3;
        MediaBrowserCompat$CustomActionResultReceiver3.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver2;
        MediaBrowserCompat$CustomActionResultReceiver3.write = str4;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver3, (byte) 0);
    }
}
