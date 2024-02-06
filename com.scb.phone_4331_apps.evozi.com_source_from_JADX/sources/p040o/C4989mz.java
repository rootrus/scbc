package p040o;

import p040o.C10178z;
import p040o.Multimaps;
import p040o.QuickExtractorAgent;
import p040o.Suppliers;
import p040o.access$2300;

/* renamed from: o.mz */
public class C4989mz extends writeUInt64NoTag<QuickExtractorAgent.C70191> {
    public final setUserPropertyInternal IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    private final Splitter MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final getInheritableThreadLocalsField f2893x50fd9e4a;
    public final getRootCause MediaDescriptionCompat;
    public final Suppliers.MemoizingSupplier MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final Multimaps.CustomSetMultimap MediaSessionCompat$Token;
    public final snippet read;
    public final memoize write;

    @HmlPinActivity
    public C4989mz(snippet snippet, memoize memoize, Splitter splitter, setUserPropertyInternal setuserpropertyinternal, Multimaps.CustomSetMultimap customSetMultimap, RegularImmutableBiMap regularImmutableBiMap, getInheritableThreadLocalsField getinheritablethreadlocalsfield, getRootCause getrootcause, Suppliers.MemoizingSupplier memoizingSupplier, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(regularImmutableBiMap);
        this.read = snippet;
        this.write = memoize;
        this.MediaBrowserCompat$MediaItem = splitter;
        this.IconCompatParcelizer = setuserpropertyinternal;
        this.MediaSessionCompat$Token = customSetMultimap;
        this.f2893x50fd9e4a = getinheritablethreadlocalsfield;
        this.MediaDescriptionCompat = getrootcause;
        this.MediaMetadataCompat = memoizingSupplier;
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    public void onDestroy() {
        snippet snippet = this.read;
        if (!snippet.MediaBrowserCompat$MediaItem.isDisposed()) {
            snippet.MediaBrowserCompat$MediaItem.dispose();
        }
        Splitter splitter = this.MediaBrowserCompat$MediaItem;
        if (!splitter.MediaBrowserCompat$MediaItem.isDisposed()) {
            splitter.MediaBrowserCompat$MediaItem.dispose();
        }
        memoize memoize = this.write;
        if (!memoize.MediaBrowserCompat$MediaItem.isDisposed()) {
            memoize.MediaBrowserCompat$MediaItem.dispose();
        }
        getRootCause getrootcause = this.MediaDescriptionCompat;
        if (!getrootcause.MediaBrowserCompat$MediaItem.isDisposed()) {
            getrootcause.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4989mz mzVar) {
        if (mzVar.RatingCompat != null) {
            mzVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4989mz mzVar) {
        if (mzVar.RatingCompat != null) {
            mzVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4989mz mzVar) {
        if (mzVar.RatingCompat != null) {
            mzVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(C4989mz mzVar) {
        if (mzVar.RatingCompat != null) {
            mzVar.RatingCompat.aj_();
        }
    }

    public void MediaBrowserCompat$ItemReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaDescriptionCompat.write.MediaBrowserCompat$CustomActionResultReceiver((String) null);
        this.MediaBrowserCompat$MediaItem.read();
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzvf>() {
            public final void onError(Throwable th) {
                C4989mz.IconCompatParcelizer(C4989mz.this);
                C4989mz.this.MediaBrowserCompat$ItemReceiver(C4989mz.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                C4989mz mzVar = C4989mz.this;
                C10178z.C1018422 r0 = C10178z.C1018422.MediaBrowserCompat$CustomActionResultReceiver;
                if (mzVar.RatingCompat != null) {
                    r0.IconCompatParcelizer(mzVar.RatingCompat);
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                getFileSHA getfilesha;
                C4989mz.MediaDescriptionCompat(C4989mz.this);
                if (C4989mz.this.MediaBrowserCompat$ItemReceiver) {
                    getfilesha = getFileSHA.DEAD_CARD;
                } else {
                    getfilesha = getFileSHA.REGULAR;
                }
                boolean z = false;
                if (C4989mz.this.f2893x50fd9e4a.MediaBrowserCompat$ItemReceiver(false)) {
                    C4989mz mzVar = C4989mz.this;
                    ImageCapturedBusEvent imageCapturedBusEvent = new ImageCapturedBusEvent(getfilesha);
                    if (mzVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        imageCapturedBusEvent.IconCompatParcelizer(mzVar.RatingCompat);
                        return;
                    }
                    return;
                }
                C4989mz mzVar2 = C4989mz.this;
                C10001hM hMVar = new C10001hM(getfilesha);
                if (mzVar2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    hMVar.IconCompatParcelizer(mzVar2.RatingCompat);
                }
            }
        });
    }
}
