package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.writeUInt64NoTag;

/* renamed from: o.ah */
public final class C4025ah extends writeUInt64NoTag<KtaPassportExtractor_Factory> {
    /* access modifiers changed from: private */
    public final setItemIconTintList IconCompatParcelizer;
    private final setBackgroundTintList read;
    private final getAngle write;

    /* renamed from: o.ah$a */
    public final /* synthetic */ class C4026a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C4026a write = new C4026a();

        private /* synthetic */ C4026a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getBottomLeftCornerWidth) obj).write(getFileSHA.REGULAR);
        }
    }

    /* renamed from: o.ah$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaPassportExtractor_Factory> {
        private /* synthetic */ C4025ah write;

        read(C4025ah ahVar) {
            this.write = ahVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaPassportExtractor_Factory) obj).IconCompatParcelizer(this.write.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver());
        }
    }

    /* renamed from: o.ah$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaPassportExtractor_Factory> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            KtaPassportExtractor_Factory ktaPassportExtractor_Factory = (KtaPassportExtractor_Factory) obj;
            ktaPassportExtractor_Factory.write("consumer");
            ktaPassportExtractor_Factory.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4025ah(getAngle getangle, setBackgroundTintList setbackgroundtintlist, setItemIconTintList setitemicontintlist, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) getangle, "checkLandingCoachMarkCase");
        onGetStartedClick.write((Object) setbackgroundtintlist, "saveLandingCoachMarkCase");
        onGetStartedClick.write((Object) setitemicontintlist, "getCustomerTypeCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = getangle;
        this.read = setbackgroundtintlist;
        this.IconCompatParcelizer = setitemicontintlist;
    }

    public final void read() {
        boolean z;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
        boolean z2 = false;
        if (this.RatingCompat != null) {
            read2.IconCompatParcelizer(this.RatingCompat);
        }
        getAngle getangle = this.write;
        int i = Line.read[getangle.write.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1) {
            z = getangle.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem();
        } else if (i == 2) {
            z = getangle.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            IconCompatParcelizer();
            return;
        }
        setBackgroundTintList setbackgroundtintlist = this.read;
        int i2 = setCircularRevealScrimColor.MediaBrowserCompat$ItemReceiver[setbackgroundtintlist.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i2 == 1) {
            setbackgroundtintlist.read.setChecked();
        } else if (i2 == 2) {
            setbackgroundtintlist.read.setContentView();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        writeUInt64NoTag.IconCompatParcelizer ah_mediabrowsercompat_customactionresultreceiver = new ah$MediaBrowserCompat$CustomActionResultReceiver(this);
        if (this.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            ah_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        int i = C4022ag.IconCompatParcelizer[this.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        boolean z = false;
        if (i == 1) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 2) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = ah$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
