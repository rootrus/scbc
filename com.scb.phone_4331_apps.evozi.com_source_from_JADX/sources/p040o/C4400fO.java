package p040o;

import com.scb.phone.domain.interactor.PinCase;
import java.util.concurrent.TimeUnit;

/* renamed from: o.fO */
public class C4400fO extends writeUInt64NoTag<getBlackStreakCount> {
    public String IconCompatParcelizer;
    public DebitCardResetOtpActivity<PlaceBuffer> MediaBrowserCompat$ItemReceiver;
    DebitCardResetOtpActivity<Long> MediaDescriptionCompat;
    public fO$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    public final PinCase read;
    public String write;

    @HmlPinActivity
    public C4400fO(RegularImmutableBiMap regularImmutableBiMap, PinCase pinCase, performActionWithResponse performactionwithresponse, FileBackedOutputStream fileBackedOutputStream) {
        super(regularImmutableBiMap);
        this.read = pinCase;
    }

    public void onDestroy() {
        super.onDestroy();
        PinCase pinCase = this.read;
        if (!pinCase.MediaBrowserCompat$MediaItem.isDisposed()) {
            pinCase.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.fO$3 */
    public static /* synthetic */ class C44013 {
        public static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.fO$MediaBrowserCompat$ItemReceiver[] r0 = p040o.fO$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.fO$MediaBrowserCompat$ItemReceiver r1 = p040o.fO$MediaBrowserCompat$ItemReceiver.CURRENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.fO$MediaBrowserCompat$ItemReceiver r1 = p040o.fO$MediaBrowserCompat$ItemReceiver.NEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.fO$MediaBrowserCompat$ItemReceiver r1 = p040o.fO$MediaBrowserCompat$ItemReceiver.CONFIRM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4400fO.C44013.<clinit>():void");
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.read();
        getblackstreakcount.MediaMetadataCompat();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.MediaMetadataCompat();
        getblackstreakcount.MediaSessionCompat$ResultReceiverWrapper();
    }

    static /* synthetic */ void IconCompatParcelizer(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.write();
        getblackstreakcount.MediaMetadataCompat();
        getblackstreakcount.RatingCompat();
        getblackstreakcount.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void read(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.MediaMetadataCompat();
        getblackstreakcount.MediaBrowserCompat$SearchResultReceiver();
        getblackstreakcount.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.aj_();
        getblackstreakcount.MediaMetadataCompat();
        getblackstreakcount.MediaSessionCompat$QueueItem();
        getblackstreakcount.MediaSessionCompat$Token();
        getblackstreakcount.read();
        getblackstreakcount.write();
    }

    public final void write(fO$MediaBrowserCompat$ItemReceiver fo_mediabrowsercompat_itemreceiver) {
        findSubsetIndex findsubsetindex;
        if (fo_mediabrowsercompat_itemreceiver == fO$MediaBrowserCompat$ItemReceiver.CURRENT) {
            findsubsetindex = new findSubsetIndex(this.read.write.MediaBrowserCompat$CustomActionResultReceiver());
        } else {
            findsubsetindex = new findSubsetIndex(this.read.write.IconCompatParcelizer());
        }
        this.MediaDescriptionCompat = DebitCardResetOtpActivity.timer(1, TimeUnit.SECONDS).cache();
        DebitCardResetOtpActivity<PlaceBuffer> doOnComplete = this.read.write.read(findsubsetindex).cache().doOnComplete(new C4397fB(this));
        this.MediaBrowserCompat$ItemReceiver = doOnComplete;
        this.read.write(doOnComplete, new IndoorBuilding$MediaBrowserCompat$ItemReceiver());
    }

    static /* synthetic */ void write(getBlackStreakCount getblackstreakcount) {
        getblackstreakcount.write();
        getblackstreakcount.read();
    }

    public final void write() {
        boolean z = true;
        if (this.MediaMetadataCompat == fO$MediaBrowserCompat$ItemReceiver.CONFIRM) {
            this.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.NEW;
            C4399fH fHVar = C4399fH.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                fHVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C4405fQ fQVar = C4405fQ.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            fQVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void write(C4400fO fOVar) {
        fOVar.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.NEW;
        C4399fH fHVar = C4399fH.write;
        if (fOVar.RatingCompat != null) {
            fHVar.IconCompatParcelizer(fOVar.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4400fO fOVar) {
        fOVar.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.CURRENT;
        C4398fG fGVar = C4398fG.MediaBrowserCompat$CustomActionResultReceiver;
        if (fOVar.RatingCompat != null) {
            fGVar.IconCompatParcelizer(fOVar.RatingCompat);
        }
        fOVar.write(fOVar.MediaMetadataCompat);
    }

    static /* synthetic */ void read(C4400fO fOVar) {
        if (fOVar.RatingCompat != null) {
            fOVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C4400fO fOVar) {
        if (fOVar.RatingCompat != null) {
            fOVar.RatingCompat.aj_();
        }
    }
}
