package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.setClassificationAlternatives */
public final /* synthetic */ class setClassificationAlternatives implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPersonalShortCuts IconCompatParcelizer;
    private final /* synthetic */ CrashlyticsController.C322720 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setClassificationAlternatives(getPersonalShortCuts getpersonalshortcuts, CrashlyticsController.C322720 r2) {
        this.IconCompatParcelizer = getpersonalshortcuts;
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPersonalShortCuts getpersonalshortcuts = this.IconCompatParcelizer;
        ((PassportCaptureModule_GetIJsonExactionHelperRttiFactory) obj).IconCompatParcelizer(getpersonalshortcuts.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$ItemReceiver, (String) null));
    }
}
