package p040o;

import p040o.LinkedListMultimap;

/* renamed from: o.LinkedListMultimap$MultisetView$1$MediaBrowserCompat$CustomActionResultReceiver */
final class C9776x93e03892 extends CheckEligibilityActivity implements FundFactSheetActivity<setOnPlaceSelectedListener, readElement> {
    private /* synthetic */ LinkedListMultimap.MultisetView.C35811 MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9776x93e03892(LinkedListMultimap.MultisetView.C35811 r1) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setOnPlaceSelectedListener setonplaceselectedlistener = (setOnPlaceSelectedListener) obj;
        onGetStartedClick.write((Object) setonplaceselectedlistener, "it");
        return this.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver(setonplaceselectedlistener);
    }
}
