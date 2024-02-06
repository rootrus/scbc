package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetPinSuccessActivity;
import p040o.ByteStreams;
import p040o.Iterables;
import p040o.access$2300;

/* renamed from: o.cn */
public class C4199cn extends writeUInt64NoTag<KtaJsonCheck$MediaBrowserCompat$SearchResultReceiver> {
    public String IconCompatParcelizer;
    public logEventInternalNoInterceptor MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public AutoValue_CrashlyticsReport_FilesPayload_File MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final ByteStreams.ByteArrayDataOutputStream MediaDescriptionCompat;
    public Iterables.C352212 read;
    public String write;

    public void read(getFiles getfiles) {
    }

    @HmlPinActivity
    public C4199cn(RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r4) {
        super(regularImmutableBiMap);
        this.MediaDescriptionCompat = byteArrayDataOutputStream;
        this.MediaBrowserCompat$ItemReceiver = logeventinternalnointerceptor;
        this.read = r4;
    }

    public void onDestroy() {
        logEventInternalNoInterceptor logeventinternalnointerceptor = this.MediaBrowserCompat$ItemReceiver;
        if (!logeventinternalnointerceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            logeventinternalnointerceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.cn$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PrepaidResetPinSuccessActivity.write> {
        public IconCompatParcelizer() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            PrepaidResetPinSuccessActivity.write write = (PrepaidResetPinSuccessActivity.write) obj;
            C4199cn.MediaBrowserCompat$CustomActionResultReceiver(C4199cn.this);
            if (write != null) {
                C4199cn cnVar = C4199cn.this;
                ByteStreams.ByteArrayDataOutputStream unused = cnVar.MediaDescriptionCompat;
                AutoValue_CrashlyticsReport_FilesPayload_File read = AutoValue_CrashlyticsReport_FilesPayload_File.read();
                read.read = write.read;
                AutoValue_CrashlyticsReport_FilesPayload_File unused2 = cnVar.MediaBrowserCompat$SearchResultReceiver = read;
                C4199cn cnVar2 = C4199cn.this;
                C4147cF cFVar = new C4147cF(this);
                boolean z = true;
                if (cnVar2.RatingCompat != null) {
                    cFVar.IconCompatParcelizer(cnVar2.RatingCompat);
                }
                C4199cn cnVar3 = C4199cn.this;
                C4154cN cNVar = C4154cN.write;
                if (cnVar3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cNVar.IconCompatParcelizer(cnVar3.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4199cn.IconCompatParcelizer(C4199cn.this);
            C4199cn.this.MediaBrowserCompat$ItemReceiver(C4199cn.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            C4199cn cnVar = C4199cn.this;
            C4153cM cMVar = C4153cM.MediaBrowserCompat$ItemReceiver;
            if (cnVar.RatingCompat != null) {
                cMVar.IconCompatParcelizer(cnVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4199cn cnVar) {
        if (cnVar.RatingCompat != null) {
            cnVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4199cn cnVar) {
        if (cnVar.RatingCompat != null) {
            cnVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4199cn cnVar) {
        if (cnVar.RatingCompat != null) {
            cnVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(C4199cn cnVar) {
        if (cnVar.RatingCompat != null) {
            cnVar.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        containsRow containsrow = new containsRow();
        initialCapacity IconCompatParcelizer2 = initialCapacity.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = this.write;
        expiration MediaBrowserCompat$ItemReceiver2 = expiration.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer = this.IconCompatParcelizer;
        containsrow.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer2;
        containsrow.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver2;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(containsrow);
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new cn$MediaBrowserCompat$CustomActionResultReceiver(this));
    }
}
