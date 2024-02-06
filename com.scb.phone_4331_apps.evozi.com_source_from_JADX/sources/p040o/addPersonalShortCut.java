package p040o;

import p040o.access$2300;
import p040o.setBackgroundTintMode;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.addPersonalShortCut */
public final class addPersonalShortCut extends setReadOnly<PointDouble> {
    private final removeAllNodes MediaBrowserCompat$MediaItem;

    /* renamed from: o.addPersonalShortCut$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PointDouble> {
        private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.addPersonalShortCut$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ addPersonalShortCut read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(addPersonalShortCut addpersonalshortcut) {
            super(1);
            this.read = addpersonalshortcut;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            addPersonalShortCut addpersonalshortcut = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<PointDouble>(this) {
                private /* synthetic */ write MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            };
            if (addpersonalshortcut.RatingCompat != null) {
                r1.IconCompatParcelizer(addpersonalshortcut.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public addPersonalShortCut(toLongArray tolongarray, getFieldSetter getfieldsetter, TextRecognizer textRecognizer, removeAllNodes removeallnodes, RegularImmutableBiMap regularImmutableBiMap, setItemIconTintList setitemicontintlist, setTimestampMillis settimestampmillis) {
        super(tolongarray, getfieldsetter, textRecognizer, setitemicontintlist, settimestampmillis, regularImmutableBiMap);
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) getfieldsetter, "hmlConsentDisplayMapper");
        onGetStartedClick.write((Object) textRecognizer, "consentCase");
        onGetStartedClick.write((Object) removeallnodes, "hmlNcbConsentController");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setitemicontintlist, "businessOwnerFlowCase");
        onGetStartedClick.write((Object) settimestampmillis, "easycashSuccessCase");
        this.MediaBrowserCompat$MediaItem = removeallnodes;
    }

    private void IconCompatParcelizer(boolean z, zzfe.zza zza) {
        onGetStartedClick.write((Object) zza, "type");
        boolean z2 = true;
        if (zza == zzfe.zza.NCB_CONSENT) {
            removeAllNodes removeallnodes = this.MediaBrowserCompat$MediaItem;
            FundFactSheetActivity write2 = new write(this);
            FundActionsSuccessActivity fundActionsSuccessActivity = addPersonalShortCut$MediaBrowserCompat$ItemReceiver.write;
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "onSuccess");
            onGetStartedClick.write((Object) write2, "onError");
            removeallnodes.MediaBrowserCompat$ItemReceiver(removeallnodes.read, fundActionsSuccessActivity, write2, new setBackgroundTintMode.read(z));
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4013x11b69594.write;
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(z);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        IconCompatParcelizer(true, zza);
    }

    public final void IconCompatParcelizer() {
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        IconCompatParcelizer(false, zza);
    }
}
