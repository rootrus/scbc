package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.getSignal;

/* renamed from: o.getResource */
public final /* synthetic */ class getResource implements findFragmentByWho {
    private final /* synthetic */ get6to4IPv4Address MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getResource(get6to4IPv4Address get6to4ipv4address) {
        this.MediaBrowserCompat$ItemReceiver = get6to4ipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport_Session_Event_Application.C30731 r5 = (AutoValue_CrashlyticsReport_Session_Event_Application.C30731) obj;
        String str = r5.read;
        String str2 = r5.write;
        String MediaDescriptionCompat = getICheckDeserializerRtti.MediaDescriptionCompat(r5.read);
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 4;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = str;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = str2;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = MediaDescriptionCompat;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
