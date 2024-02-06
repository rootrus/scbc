package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C3077xfe724d07;

/* renamed from: o.MultiInputStream */
public final /* synthetic */ class MultiInputStream implements findFragmentByWho {
    private final /* synthetic */ get6to4IPv4Address read;

    public /* synthetic */ MultiInputStream(get6to4IPv4Address get6to4ipv4address) {
        this.read = get6to4ipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport_Session_Event_Application.C30731 r3 = (AutoValue_CrashlyticsReport_Session_Event_Application.C30731) obj;
        C3077xfe724d07.write MediaBrowserCompat$CustomActionResultReceiver = C3077xfe724d07.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = 10;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = r3.read;
        MediaBrowserCompat$CustomActionResultReceiver.write = r3.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = r3.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.read = getICheckDeserializerRtti.IconCompatParcelizer(r3.read, r3.MediaBrowserCompat$ItemReceiver);
        return new C3077xfe724d07(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
