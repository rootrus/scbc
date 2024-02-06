package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.bg */
public final class C4098bg extends writeUInt64NoTag<ServerProjectProvider.IconCompatParcelizer> {
    public final forcePut IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final setCvv MediaBrowserCompat$ItemReceiver;
    public ChequeInquiryDeepLinkActivity read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4098bg(RegularImmutableBiMap regularImmutableBiMap, setCvv setcvv, forcePut forceput, ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setcvv, "loginRepositoryContractor");
        onGetStartedClick.write((Object) forceput, "prerequestValidationOtpCase");
        onGetStartedClick.write((Object) chequeInquiryDeepLinkActivity, "disposable");
        this.MediaBrowserCompat$ItemReceiver = setcvv;
        this.IconCompatParcelizer = forceput;
        this.read = chequeInquiryDeepLinkActivity;
    }

    /* renamed from: o.bg$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements ActivateChequeDeepLinkActivity<Boolean> {
        final /* synthetic */ C4098bg MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String write;

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            onGetStartedClick.write((Object) bulkTransferDeepLinkActivity, KtaJsonExactionHelper.OBJECT);
        }

        /* renamed from: o.bg$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        static final class C10814IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.IconCompatParcelizer> {
            public static final C10814IconCompatParcelizer IconCompatParcelizer = new C10814IconCompatParcelizer();

            C10814IconCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ServerProjectProvider.IconCompatParcelizer) obj).read();
            }
        }

        public IconCompatParcelizer(C4098bg bgVar, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bgVar;
            this.write = str;
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            C4098bg.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            C4098bg bgVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer bg_iconcompatparcelizer_mediabrowsercompat_customactionresultreceiver = new C9868xe5d43ace(this, th);
            if (bgVar.RatingCompat != null) {
                bg_iconcompatparcelizer_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(bgVar.RatingCompat);
            }
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            C4098bg.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(this.write);
            C4098bg bgVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10814IconCompatParcelizer.IconCompatParcelizer;
            if (bgVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(bgVar.RatingCompat);
            }
        }
    }

    public final void onDestroy() {
        if (!this.read.isDisposed()) {
            this.read.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4098bg bgVar) {
        if (bgVar.RatingCompat != null) {
            bgVar.RatingCompat.aj_();
        }
    }
}
