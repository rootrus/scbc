package p040o;

import p040o.setHideMotionSpec;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.setProperty */
public final class setProperty extends setReadOnly<PassportCaptureModule_GetIJsonExactionHelperKtaFactory> {
    private final ChequeInquiryDeepLinkActivity MediaBrowserCompat$MediaItem = new ChequeInquiryDeepLinkActivity();
    private final setHideMotionSpec MediaSessionCompat$ResultReceiverWrapper;

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    /* renamed from: o.setProperty$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIJsonExactionHelperKtaFactory> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetIJsonExactionHelperKtaFactory) obj).MediaDescriptionCompat();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setProperty(setHideMotionSpec sethidemotionspec, toLongArray tolongarray, getFieldSetter getfieldsetter, RegularImmutableBiMap regularImmutableBiMap, TextRecognizer textRecognizer, setItemIconTintList setitemicontintlist, setTimestampMillis settimestampmillis) {
        super(tolongarray, getfieldsetter, textRecognizer, setitemicontintlist, settimestampmillis, regularImmutableBiMap);
        onGetStartedClick.write((Object) sethidemotionspec, "sensitiveConsentCase");
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) getfieldsetter, "hmlConsentDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) textRecognizer, "consentCase");
        onGetStartedClick.write((Object) setitemicontintlist, "businessOwnerFlowCase");
        onGetStartedClick.write((Object) settimestampmillis, "easycashSuccessCase");
        this.MediaSessionCompat$ResultReceiverWrapper = sethidemotionspec;
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        setHideMotionSpec sethidemotionspec = this.MediaSessionCompat$ResultReceiverWrapper;
        FundActionsSuccessActivity read2 = new read(this, z);
        FundFactSheetActivity setproperty_mediabrowsercompat_itemreceiver = new setProperty$MediaBrowserCompat$ItemReceiver(this);
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        sethidemotionspec.MediaBrowserCompat$ItemReceiver(read2, setproperty_mediabrowsercompat_itemreceiver, new setHideMotionSpec.read(zza, write(), z ? "Y" : "N"), this.MediaBrowserCompat$MediaItem);
    }

    public final void onDestroy() {
        TextRecognizer MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        if (!MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.isDisposed()) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.dispose();
        }
        this.MediaBrowserCompat$MediaItem.dispose();
        super.onDestroy();
    }

    /* renamed from: o.setProperty$read */
    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ setProperty IconCompatParcelizer;
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(setProperty setproperty, boolean z) {
            super(0);
            this.IconCompatParcelizer = setproperty;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* synthetic */ Object invoke() {
            boolean z = true;
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                setProperty setproperty = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C53532.write;
                if (setproperty.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setproperty.RatingCompat);
                }
            } else {
                setProperty setproperty2 = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C53544.MediaBrowserCompat$ItemReceiver;
                if (setproperty2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(setproperty2.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
