package p040o;

import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.C5572x5c6e7578;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;
import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.TaskRunner;
import p040o.writeUInt64NoTag;

/* renamed from: o.getInstanceType */
public final /* synthetic */ class getInstanceType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DebitCardResetPinActivity.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ TaskRunner.C3843b.C38441 write;

    public /* synthetic */ getInstanceType(TaskRunner.C3843b.C38441 r1, DebitCardResetPinActivity.read read) {
        this.write = r1;
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder;
        TaskRunner.C3843b.C38441 r1 = this.write;
        DebitCardResetPinActivity.read read = this.MediaBrowserCompat$ItemReceiver;
        IdExtractionParameters idExtractionParameters = (IdExtractionParameters) obj;
        boolean z = false;
        r1.IconCompatParcelizer = false;
        if (r1.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r1.RatingCompat.aj_();
        }
        UnmodifiableListIterator unmodifiableListIterator = r1.write;
        EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver = r1.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) read, "entity");
        onGetStartedClick.write((Object) easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver, "mwReviewDisplay");
        String str = read.read;
        String str2 = read.MediaBrowserCompat$ItemReceiver;
        String IconCompatParcelizer = unmodifiableListIterator.IconCompatParcelizer("dd MMM yyyy - HH:mm", read.MediaBrowserCompat$CustomActionResultReceiver);
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = "-";
        }
        String str3 = IconCompatParcelizer;
        onGetStartedClick.write((Object) easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver, "mwReviewDisplay");
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionEncoder(easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.read, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.write, easycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
        DeejungTermsAndConditionsActivity.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = null;
        if (iconCompatParcelizer != null) {
            C5572x5c6e7578 eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver != null) {
                crashlyticsReportSessionEncoder = new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEncoder(eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
            String c_ = unmodifiableListIterator.mo26549c_(iconCompatParcelizer.read);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(entity.gmbImageURL)");
            crashlyticsReportSessionDeviceEncoder = new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionDeviceEncoder(c_, crashlyticsReportSessionEncoder, iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        } else {
            crashlyticsReportSessionDeviceEncoder = null;
        }
        idExtractionParameters.MediaBrowserCompat$CustomActionResultReceiver(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder(str, str2, str3, crashlyticsReportSessionEventApplicationExecutionEncoder, crashlyticsReportSessionDeviceEncoder));
    }
}
