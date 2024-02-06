package p040o;

import p040o.CrashlyticsController;
import p040o.FloatingActionButton;

/* renamed from: o.getPersonalShortCuts */
public class getPersonalShortCuts extends writeUInt64NoTag<PassportCaptureModule_GetIJsonExactionHelperRttiFactory> {
    public final FloatingActionButton.Behavior IconCompatParcelizer;
    final newTreeSet MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    public CrashlyticsController.C322720 read;
    /* access modifiers changed from: package-private */
    public final setItemIconTintList write;

    @HmlPinActivity
    public getPersonalShortCuts(RegularImmutableBiMap regularImmutableBiMap, newTreeSet newtreeset, FloatingActionButton.Behavior behavior, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = newtreeset;
        this.IconCompatParcelizer = behavior;
        this.write = setitemicontintlist;
    }

    static /* synthetic */ CharSequence MediaBrowserCompat$ItemReceiver(getIdentifierUtf8Bytes getidentifierutf8bytes) {
        StringBuilder sb = new StringBuilder();
        sb.append(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(" ");
        sb.append(getidentifierutf8bytes.read);
        return sb.toString();
    }

    public void onDestroy() {
        FloatingActionButton.Behavior behavior = this.IconCompatParcelizer;
        if (!behavior.MediaBrowserCompat$MediaItem.isDisposed()) {
            behavior.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void write(getPersonalShortCuts getpersonalshortcuts) {
        if (getpersonalshortcuts.RatingCompat != null) {
            getpersonalshortcuts.RatingCompat.aj_();
        }
    }
}
