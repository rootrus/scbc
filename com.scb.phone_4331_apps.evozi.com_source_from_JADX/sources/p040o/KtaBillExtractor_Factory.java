package p040o;

import p040o.AppMeasurementSdk;
import p040o.child;
import p040o.writeUInt64NoTag;

/* renamed from: o.KtaBillExtractor_Factory */
public final class KtaBillExtractor_Factory extends C5168qN {
    final AppMeasurementSdk.ConditionalUserProperty IconCompatParcelizer;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver;
    private final AppMeasurementSdk.OnEventListener MediaDescriptionCompat;
    final child read;
    final ExecutionList write;

    public static final /* synthetic */ void IconCompatParcelizer() {
    }

    /* renamed from: o.KtaBillExtractor_Factory$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).Keep();
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).AlertController$RecycleListView();
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ setFrames MediaBrowserCompat$CustomActionResultReceiver;

        read(setFrames setframes) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setframes;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, requestLocationUpdates.TRANSFER);
        }
    }

    /* renamed from: o.KtaBillExtractor_Factory$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).write();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public KtaBillExtractor_Factory(AppMeasurementSdk.OnEventListener onEventListener, ExecutionList executionList, child child, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) onEventListener, "transferCase");
        onGetStartedClick.write((Object) executionList, "transferRepeatDisplayMapper");
        onGetStartedClick.write((Object) child, "transferHistoryDisplayMapper");
        onGetStartedClick.write((Object) conditionalUserProperty, "transferAndPayCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaDescriptionCompat = onEventListener;
        this.write = executionList;
        this.read = child;
        this.IconCompatParcelizer = conditionalUserProperty;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = false;
        this.MediaBrowserCompat$ItemReceiver = 0;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        child child = this.read;
        child.read read2 = child.read.TRANSFER;
        onGetStartedClick.write((Object) read2, "historyFlow");
        child.MediaBrowserCompat$ItemReceiver = read2;
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        this.MediaDescriptionCompat.IconCompatParcelizer(new KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void write() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.write;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        this.MediaDescriptionCompat.IconCompatParcelizer(new KtaBillExtractor_Factory$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void IconCompatParcelizer(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "transaction");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        AppMeasurementSdk.OnEventListener onEventListener = this.MediaDescriptionCompat;
        Iterables iterables = new Iterables();
        String str = setframes.MediaMetadataCompat;
        onGetStartedClick.write((Object) str, "transferId");
        iterables.MediaBrowserCompat$CustomActionResultReceiver = str;
        onEventListener.MediaBrowserCompat$CustomActionResultReceiver(iterables);
        this.MediaDescriptionCompat.IconCompatParcelizer(new C6923x1eaa23fd(this));
    }

    public final void write(setFrames setframes) {
        onGetStartedClick.write((Object) setframes, "transaction");
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(setframes);
        if (this.RatingCompat != null) {
            read2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(KtaBillExtractor_Factory ktaBillExtractor_Factory) {
        if (ktaBillExtractor_Factory.RatingCompat != null) {
            ktaBillExtractor_Factory.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(KtaBillExtractor_Factory ktaBillExtractor_Factory) {
        if (ktaBillExtractor_Factory.RatingCompat != null) {
            ktaBillExtractor_Factory.RatingCompat.ay_();
        }
    }
}
