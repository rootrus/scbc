package p040o;

import java.util.List;
import p040o.CodedOutputStream;
import p040o.CrashlyticsReport;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.sx */
public final class C7481sx extends CodedOutputStream.OutOfSpaceException<C1152x3c012820> {
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    private final constrainedBiMap read;

    /* renamed from: o.sx$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<getUserNavigationEnabled, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C7481sx MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(C7481sx sxVar) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = sxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
            onGetStartedClick.write((Object) getusernavigationenabled, "result");
            C7481sx sxVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C74833.IconCompatParcelizer;
            boolean z = false;
            if (sxVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(sxVar.RatingCompat);
            }
            List<StreetViewPanoramaOptions> list = getusernavigationenabled.read;
            onGetStartedClick.IconCompatParcelizer((Object) list, "result.billPaymentBillerList");
            if (!list.isEmpty()) {
                C7481sx sxVar2 = this.MediaBrowserCompat$ItemReceiver;
                getStreetViewPanoramaCamera getstreetviewpanoramacamera = getusernavigationenabled.IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) getstreetviewpanoramacamera, "result.billPaymentBillerPagination");
                String str = getstreetviewpanoramacamera.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "result.billPaymentBillerPagination.scrollId");
                C7481sx.write(sxVar2, str);
                C7481sx sxVar3 = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820>(this) {
                    private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        List<CrashlyticsReport.Session.Event.Application.Execution> MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.setCheckable());
                        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "billPaymentBillerDisplay…ctor.userProfileLanguage)");
                        ((C1152x3c012820) obj).read(MediaBrowserCompat$ItemReceiver);
                    }
                };
                if (sxVar3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    r1.IconCompatParcelizer(sxVar3.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.sx$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C7481sx read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(C7481sx sxVar) {
            super(1);
            this.read = sxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            C7481sx.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            C7481sx sxVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C74845.MediaBrowserCompat$CustomActionResultReceiver;
            if (sxVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(sxVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.sx$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C7481sx read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(C7481sx sxVar) {
            super(1);
            this.read = sxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            C7481sx sxVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C74855.MediaBrowserCompat$CustomActionResultReceiver;
            if (sxVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(sxVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ void write(C7481sx sxVar, String str) {
        onGetStartedClick.write((Object) str, "<set-?>");
        sxVar.write = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C7481sx(RegularImmutableBiMap regularImmutableBiMap, constrainedBiMap constrainedbimap, lessThanUnsigned lessthanunsigned, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) constrainedbimap, "billPaymentSearchListController");
        onGetStartedClick.write((Object) lessthanunsigned, "billPaymentBillerDisplayMapper");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "profileRepositoryContractor");
        this.read = constrainedbimap;
        this.MediaBrowserCompat$ItemReceiver = lessthanunsigned;
        this.MediaDescriptionCompat = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final Iterables.C35317<C5431transform, getUserNavigationEnabled> IconCompatParcelizer() {
        return this.read;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = sx$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        this.read.read(new IconCompatParcelizer(this), new write(this), new C5431transform(this.IconCompatParcelizer, this.write));
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C7481sx sxVar) {
        if (sxVar.RatingCompat != null) {
            sxVar.RatingCompat.ay_();
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "keyword");
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.read.read(new sx$MediaBrowserCompat$CustomActionResultReceiver(this), new read(this), new C5431transform(this.IconCompatParcelizer, this.write));
    }
}
