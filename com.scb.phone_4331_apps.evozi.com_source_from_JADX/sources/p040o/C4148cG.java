package p040o;

import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.cG */
public final /* synthetic */ class C4148cG implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C4148cG(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(Object obj) {
        return ((AutoValue_CrashlyticsReport_FilesPayload.C30601) obj).IconCompatParcelizer.toLowerCase().contains(this.MediaBrowserCompat$CustomActionResultReceiver.toLowerCase());
    }
}
