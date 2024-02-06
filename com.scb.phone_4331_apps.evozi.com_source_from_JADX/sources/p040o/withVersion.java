package p040o;

/* renamed from: o.withVersion */
public class withVersion extends writeUInt64NoTag<C1155xc057a232> {
    /* access modifiers changed from: private */
    public final fillHole IconCompatParcelizer;
    public final logEventInternal MediaBrowserCompat$ItemReceiver;
    public boolean read;

    @HmlPinActivity
    withVersion(RegularImmutableBiMap regularImmutableBiMap, logEventInternal logeventinternal, fillHole fillhole) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = fillhole;
        this.MediaBrowserCompat$ItemReceiver = logeventinternal;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(withVersion withversion) {
        if (withversion.RatingCompat != null) {
            withversion.RatingCompat.aj_();
        }
    }
}
