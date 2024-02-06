package p040o;

import p040o.C7432sG;
import p040o.Multimaps;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.sB */
public final class C7426sB extends writeUInt64NoTag<getTopLeftCornerWidth.setContentView> implements C7432sG.write<getTopLeftCornerWidth.setContentView> {
    private boolean IconCompatParcelizer;
    private final hasMoreElements read;
    final Multimaps.MapMultimap.C36711.C36721 write;

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
    }

    /* renamed from: o.sB$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C7426sB IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(C7426sB sBVar) {
            super(1);
            this.IconCompatParcelizer = sBVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            C7426sB sBVar = this.IconCompatParcelizer;
            sBVar.MediaBrowserCompat$ItemReceiver(sBVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(CheckCaptureModule_GetICheckDeserializerRttiFactory checkCaptureModule_GetICheckDeserializerRttiFactory) {
        super.MediaBrowserCompat$ItemReceiver((getTopLeftCornerWidth.setContentView) checkCaptureModule_GetICheckDeserializerRttiFactory);
    }

    public final /* synthetic */ void write(Object obj) {
        super.MediaBrowserCompat$ItemReceiver((getTopLeftCornerWidth.setContentView) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C7426sB(RegularImmutableBiMap regularImmutableBiMap, hasMoreElements hasmoreelements, Multimaps.MapMultimap.C36711.C36721 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "mErrorDisplayMapper");
        onGetStartedClick.write((Object) hasmoreelements, "mController");
        onGetStartedClick.write((Object) r4, "mDirectDebitScanDisplayMapper");
        this.read = hasmoreelements;
        this.write = r4;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        CharSequence charSequence = str;
        boolean z = false;
        if (charSequence == null || charSequence.length() == 0) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Trying to process an empty barcode", new Object[0]);
            return;
        }
        synchronized (this.read) {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                hasMoreElements hasmoreelements = this.read;
                FundFactSheetActivity sb_mediabrowsercompat_customactionresultreceiver = new sB$MediaBrowserCompat$CustomActionResultReceiver(this);
                FundFactSheetActivity read2 = new read(this);
                newStrongInterner MediaBrowserCompat$ItemReceiver = newStrongInterner.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver(str);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "ScanRequest.create().withBarcode(barcode)");
                onGetStartedClick.write((Object) sb_mediabrowsercompat_customactionresultreceiver, "onSuccess");
                onGetStartedClick.write((Object) read2, "onError");
                onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "request");
                hasmoreelements.IconCompatParcelizer(hasmoreelements.read, sb_mediabrowsercompat_customactionresultreceiver, read2, new Tasks$zzb$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver));
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
