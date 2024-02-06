package p040o;

/* renamed from: o.setCroppingTetragon */
public class setCroppingTetragon extends writeUInt64NoTag<C1158xd0c06e23> {
    private final detect IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final NaturalOrdering MediaBrowserCompat$ItemReceiver;
    private final getStartFinalizer read;
    /* access modifiers changed from: private */
    public final nullsFirst write;

    @HmlPinActivity
    public setCroppingTetragon(detect detect, nullsFirst nullsfirst, NaturalOrdering naturalOrdering, RegularImmutableBiMap regularImmutableBiMap, getStartFinalizer getstartfinalizer) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = detect;
        this.write = nullsfirst;
        this.MediaBrowserCompat$ItemReceiver = naturalOrdering;
        this.read = getstartfinalizer;
    }

    static /* synthetic */ void read(setCroppingTetragon setcroppingtetragon) {
        if (setcroppingtetragon.RatingCompat != null) {
            setcroppingtetragon.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read.write.read() == null);
        detect detect = this.IconCompatParcelizer;
        if (this.read.write.read() != null) {
            z = false;
        }
        detect.IconCompatParcelizer(new setCroppingTetragon$MediaBrowserCompat$ItemReceiver(this, z));
    }

    public final void read(boolean z, boolean z2) {
        boolean z3 = true;
        if (!(this.read.write.read() == null) || (z && !z2)) {
            MediaBrowserCompat$ItemReceiver();
            return;
        }
        getRotateType getrotatetype = getRotateType.write;
        if (this.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            getrotatetype.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
