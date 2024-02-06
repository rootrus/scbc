package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.zzca;

/* renamed from: o.setExpandedTitleMargin */
public final class setExpandedTitleMargin extends IndoorBuilding {
    final refreshIfEmpty IconCompatParcelizer;
    final getAncestor MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.setExpandedTitleMargin$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
        private /* synthetic */ setExpandedTitleMargin MediaBrowserCompat$ItemReceiver;

        read(setExpandedTitleMargin setexpandedtitlemargin) {
            this.MediaBrowserCompat$ItemReceiver = setexpandedtitlemargin;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "appUuid");
            return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaMetadataCompat(str);
        }
    }

    /* renamed from: o.setExpandedTitleMargin$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ setExpandedTitleMargin MediaBrowserCompat$ItemReceiver;

        write(setExpandedTitleMargin setexpandedtitlemargin) {
            this.MediaBrowserCompat$ItemReceiver = setexpandedtitlemargin;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "uuid");
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setExpandedTitleMargin(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepo");
        onGetStartedClick.write((Object) refreshifempty, "hmlBusinessRepo");
        this.MediaBrowserCompat$CustomActionResultReceiver = getancestor;
        this.IconCompatParcelizer = refreshifempty;
    }

    public final DebitCardResetOtpActivity<zzca.zzf.zza> MediaBrowserCompat$ItemReceiver() {
        DebitCardResetOtpActivity debitCardResetOtpActivity;
        int i = setExpandedTitleMarginEnd.read[this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i != 1) {
            if (i == 2) {
                BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
                DirectDebitDeepLinkActivity read2 = new read(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
                debitCardResetOtpActivity = new FriendsLandingActivity_ViewBinding(new ReviewDeviceActivity(IconCompatParcelizer2, read2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView() != null) {
            debitCardResetOtpActivity = DebitCardResetOtpActivity.just(this.MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView());
        } else {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer3 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            DirectDebitDeepLinkActivity write2 = new write(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
            debitCardResetOtpActivity = new NTBLandingActivity_ViewBinding(IconCompatParcelizer3, write2);
        }
        DebitCardResetOtpActivity<zzca.zzf.zza> doOnNext = debitCardResetOtpActivity.doOnNext(new C5303x76419938(this));
        write(doOnNext);
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "when (customerType) {\n  …so { withObservable(it) }");
        return doOnNext;
    }
}
