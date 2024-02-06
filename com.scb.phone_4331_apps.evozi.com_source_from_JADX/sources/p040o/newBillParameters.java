package p040o;

/* renamed from: o.newBillParameters */
public final /* synthetic */ class newBillParameters implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ newBillParameters(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final boolean write(Object obj) {
        return KtaJsonBill_MembersInjector.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, (StreetViewPanoramaFragment) obj);
    }
}
