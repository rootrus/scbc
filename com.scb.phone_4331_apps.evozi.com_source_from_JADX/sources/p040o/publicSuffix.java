package p040o;

/* renamed from: o.publicSuffix */
public final /* synthetic */ class publicSuffix implements findFragmentByWho {
    private final /* synthetic */ lexicographicalComparator MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ publicSuffix(lexicographicalComparator lexicographicalcomparator) {
        this.MediaBrowserCompat$ItemReceiver = lexicographicalcomparator;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getMapAsync getmapasync = (getMapAsync) obj;
        AutoValue_CrashlyticsReport_Session_Event_Device autoValue_CrashlyticsReport_Session_Event_Device = new AutoValue_CrashlyticsReport_Session_Event_Device();
        autoValue_CrashlyticsReport_Session_Event_Device.IconCompatParcelizer = getmapasync.write;
        autoValue_CrashlyticsReport_Session_Event_Device.read = getmapasync.MediaBrowserCompat$ItemReceiver;
        return autoValue_CrashlyticsReport_Session_Event_Device;
    }
}
