package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.PlatformVersion */
public final /* synthetic */ class PlatformVersion implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ getChimeraLifecycleFragmentImpl MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ PlatformVersion(getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getchimeralifecyclefragmentimpl;
    }

    public final Object write(Object obj) {
        FillContent fillContent = (FillContent) obj;
        setZoomGesturesEnabled setzoomgesturesenabled = new setZoomGesturesEnabled();
        setzoomgesturesenabled.MediaBrowserCompat$ItemReceiver = fillContent.MediaBrowserCompat$ItemReceiver;
        setzoomgesturesenabled.read = FragmentBuilder_BindSummaryFragment.write(fillContent.read, (OffsetDateTime) null);
        setzoomgesturesenabled.IconCompatParcelizer = fillContent.IconCompatParcelizer;
        return setzoomgesturesenabled;
    }
}
