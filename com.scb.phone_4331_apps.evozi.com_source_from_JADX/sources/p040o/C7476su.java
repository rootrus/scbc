package p040o;

import p040o.AppMeasurementSdk;
import p040o.Interners;
import p040o.child;
import p040o.writeUInt64NoTag;

/* renamed from: o.su */
public final class C7476su extends C5168qN {
    final child IconCompatParcelizer;
    final AppMeasurementSdk.ConditionalUserProperty MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat;
    final getServiceName read;
    private final include write;

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    /* renamed from: o.su$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ setFrames IconCompatParcelizer;

        IconCompatParcelizer(setFrames setframes) {
            this.IconCompatParcelizer = setframes;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaMetadataCompat, requestLocationUpdates.BILLPAYMENT);
        }
    }

    /* renamed from: o.su$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).write();
        }
    }

    /* renamed from: o.su$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).AlertController$RecycleListView();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C7476su(include include, child child, getServiceName getservicename, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) include, "billPaymentCase");
        onGetStartedClick.write((Object) child, "historyDisplayMapper");
        onGetStartedClick.write((Object) getservicename, "billPaymentRepeatDisplayMapper");
        onGetStartedClick.write((Object) conditionalUserProperty, "transferAndPayCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = include;
        this.IconCompatParcelizer = child;
        this.read = getservicename;
        this.MediaBrowserCompat$ItemReceiver = conditionalUserProperty;
    }

    public final void onDestroy() {
        super.onDestroy();
        include include = this.write;
        if (!include.MediaBrowserCompat$MediaItem.isDisposed()) {
            include.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = false;
        this.MediaDescriptionCompat = 0;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            this.RatingCompat.Keep();
        }
        child child = this.IconCompatParcelizer;
        child.read read2 = child.read.BILLPAYMENT;
        onGetStartedClick.write((Object) read2, "historyFlow");
        child.MediaBrowserCompat$ItemReceiver = read2;
        this.write.MediaBrowserCompat$CustomActionResultReceiver(Integer.valueOf(this.MediaDescriptionCompat));
        this.write.IconCompatParcelizer(new su$MediaBrowserCompat$CustomActionResultReceiver(this));
    }

    public final void write() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        this.write.MediaBrowserCompat$CustomActionResultReceiver(Integer.valueOf(this.MediaDescriptionCompat));
        this.write.IconCompatParcelizer(new su$MediaBrowserCompat$CustomActionResultReceiver(this));
    }

    public final void IconCompatParcelizer(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "transaction");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.write;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        include include = this.write;
        Interners.WeakInterner.InternReference internReference = new Interners.WeakInterner.InternReference();
        String str = setframes.MediaMetadataCompat;
        onGetStartedClick.write((Object) str, "paymentId");
        internReference.write = str;
        include.IconCompatParcelizer(internReference);
        this.write.IconCompatParcelizer(new su$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void write(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "transaction");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(setframes);
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(C7476su suVar) {
        if (suVar.RatingCompat != null) {
            suVar.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C7476su suVar) {
        if (suVar.RatingCompat != null) {
            suVar.RatingCompat.ay_();
        }
    }
}
