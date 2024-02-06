package p040o;

import p040o.C10827Iterators;
import p040o.IdExtractor;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.isAspectRatioWithinLimits */
public final class isAspectRatioWithinLimits extends writeUInt64NoTag<IdExtractor.C69112> {
    public final C10827Iterators.C353813 IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Iterables.C352212 read;

    /* renamed from: o.isAspectRatioWithinLimits$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ isAspectRatioWithinLimits MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(isAspectRatioWithinLimits isaspectratiowithinlimits) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = isaspectratiowithinlimits;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            isAspectRatioWithinLimits isaspectratiowithinlimits = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IdExtractor.C69112>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((IdExtractor.C69112) obj).mo42665a_(th);
                }
            };
            if (isaspectratiowithinlimits.RatingCompat != null) {
                r1.IconCompatParcelizer(isaspectratiowithinlimits.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isAspectRatioWithinLimits(C10827Iterators.C353813 r2, Iterables.C352212 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "openAccountEtbNoActiveCasaDeepLinkController");
        onGetStartedClick.write((Object) r3, "ekycEntryPointCase");
        this.IconCompatParcelizer = r2;
        this.read = r3;
    }
}
