package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.removePage */
public final /* synthetic */ class removePage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsController.C322720 IconCompatParcelizer;
    private final /* synthetic */ getPersonalShortCuts MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ removePage(getPersonalShortCuts getpersonalshortcuts, CrashlyticsController.C322720 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getpersonalshortcuts;
        this.IconCompatParcelizer = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPersonalShortCuts getpersonalshortcuts = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((PassportCaptureModule_GetIJsonExactionHelperRttiFactory) obj).MediaBrowserCompat$CustomActionResultReceiver(getpersonalshortcuts.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer, getpersonalshortcuts.write.read.MediaBrowserCompat$SearchResultReceiver()));
    }
}
