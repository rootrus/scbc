package p040o;

import java.io.IOException;
import java.net.InetAddress;

@Deprecated
/* renamed from: o.RequesterReviewActivity */
public interface RequesterReviewActivity {
    void MediaBrowserCompat$CustomActionResultReceiver(DealsSuccessActivity dealsSuccessActivity, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;

    DealsSuccessActivity MediaBrowserCompat$ItemReceiver();

    void read(DealsSuccessActivity dealsSuccessActivity, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, InetAddress inetAddress, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException;
}
