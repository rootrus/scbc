package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getSignal;

/* renamed from: o.getEmbeddedIPv4ClientAddress */
public final /* synthetic */ class getEmbeddedIPv4ClientAddress implements findFragmentByWho {
    private final /* synthetic */ isIsatapAddress MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getEmbeddedIPv4ClientAddress(isIsatapAddress isisatapaddress) {
        this.MediaBrowserCompat$CustomActionResultReceiver = isisatapaddress;
    }

    public final Object IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder = (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj;
        if (builder.read() == 12) {
            getSignal getsignal = (getSignal) builder;
            setSignal$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = setSignal.IconCompatParcelizer();
            IconCompatParcelizer.read = getsignal.read();
            IconCompatParcelizer.write = getsignal.MediaBrowserCompat$SearchResultReceiver;
            return new setSignal(IconCompatParcelizer, (byte) 0);
        }
        getSignal getsignal2 = (getSignal) builder;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver2 = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = getsignal2.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver2.read = getsignal2.read;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem = false;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = getsignal2.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = getsignal2.read();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver = getsignal2.MediaDescriptionCompat;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0);
    }
}
