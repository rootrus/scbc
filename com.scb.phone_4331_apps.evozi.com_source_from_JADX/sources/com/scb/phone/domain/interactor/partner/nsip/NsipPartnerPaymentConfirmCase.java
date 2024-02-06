package com.scb.phone.domain.interactor.partner.nsip;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.scb.phone.domain.ScbException;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.CloseAccountReviewActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlAdditionalDocumentActivity;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.ServerProjectProvider;
import p040o.frequency;
import p040o.onGetStartedClick;
import p040o.zoomByWithFocus;

public final class NsipPartnerPaymentConfirmCase extends frequency<zoomByWithFocus, NsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver> {

    public static final class NsipConfirmException extends ScbException {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public NsipPartnerPaymentConfirmCase(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final ServerProjectProvider.C70684 r4) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<NsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<zoomByWithFocus>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                NsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver nsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver = (NsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) nsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver, "param");
                BScanCNotificationDeepLinkActivity<zoomByWithFocus> IconCompatParcelizer = r4.IconCompatParcelizer(nsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, nsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, nsipPartnerPaymentConfirmCase$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = C29804.IconCompatParcelizer;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "resumeFunctionInCaseOfError is null");
                HmlAdditionalDocumentActivity hmlAdditionalDocumentActivity = new HmlAdditionalDocumentActivity(IconCompatParcelizer, directDebitDeepLinkActivity);
                onGetStartedClick.IconCompatParcelizer((Object) hmlAdditionalDocumentActivity, "nsipRepositoryContractor…le)\n                    }");
                return hmlAdditionalDocumentActivity;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) r4, "nsipRepositoryContractor");
    }

    @HmlSetNTBPinActivity
    public static final class IconCompatParcelizer {
        public final SharedPreferences MediaBrowserCompat$ItemReceiver;
        public final Gson write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(SharedPreferences sharedPreferences, Gson gson) {
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) gson, "gson");
            this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
            this.write = gson;
        }
    }
}
