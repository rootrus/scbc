package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.jo */
public final /* synthetic */ class C4876jo implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setExecution MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4889kC MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4876jo(C4889kC kCVar, setExecution setexecution) {
        this.MediaBrowserCompat$ItemReceiver = kCVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = setexecution;
    }

    public final void IconCompatParcelizer(Object obj) {
        setExecution setexecution = this.MediaBrowserCompat$CustomActionResultReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Application_Execution autoValue_CrashlyticsReport_Session_Event_Application_Execution = setexecution.MediaBrowserCompat$ItemReceiver;
        setUuid$MediaBrowserCompat$ItemReceiver read = setUuid.read();
        read.MediaBrowserCompat$ItemReceiver = setexecution.MediaMetadataCompat;
        read.MediaBrowserCompat$CustomActionResultReceiver = setexecution.IconCompatParcelizer;
        read.write = setexecution.read;
        read.MediaBrowserCompat$ItemReceiver = autoValue_CrashlyticsReport_Session_Event_Application_Execution.MediaBrowserCompat$CustomActionResultReceiver;
        read.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_Event_Application_Execution.MediaBrowserCompat$ItemReceiver;
        read.read = autoValue_CrashlyticsReport_Session_Event_Application_Execution.IconCompatParcelizer;
        read.MediaDescriptionCompat = autoValue_CrashlyticsReport_Session_Event_Application_Execution.write;
        read.MediaBrowserCompat$MediaItem = setexecution.RatingCompat;
        ((getMicr) obj).read(new setUuid(read, (byte) 0));
    }
}
