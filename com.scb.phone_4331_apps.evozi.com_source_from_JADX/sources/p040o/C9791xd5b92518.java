package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;

/* renamed from: o.OnBoardingTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding */
public final class C9791xd5b92518 extends ExportCardStatementSelectionAdapter$ItemSelectionViewHolder<ScbPrivacyPolicyActivity> {
    private final PrepaidTravelCoachMarkActivity_ViewBinding IconCompatParcelizer = PrepaidOtpActivity.write((Class) getClass());
    private final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private final ManageAccountInboundActivity_ViewBinding read;

    @Deprecated
    public C9791xd5b92518(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ManageAccountInboundActivity_ViewBinding manageAccountInboundActivity_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        super(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, (AmountDetailsAdapter$SuccessRow_ViewBinding) null, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(manageAccountInboundActivity_ViewBinding, "Response factory");
        this.read = manageAccountInboundActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(128);
    }

    public final /* synthetic */ PrivacyManagementLandingActivity IconCompatParcelizer(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding) throws IOException, HttpException, ParseException {
        int i = 0;
        while (true) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
            int read2 = oPRRewardTiersAdapter$TierViewHolder_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (read2 == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, this.MediaBrowserCompat$CustomActionResultReceiver.length());
            if (this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver, radioButtonGroupAdapter$RadioButtonViewGroup)) {
                return this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver, radioButtonGroupAdapter$RadioButtonViewGroup));
            } else if (read2 != -1) {
                if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                    PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = this.IconCompatParcelizer;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Garbage in response: ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
                    prepaidTravelCoachMarkActivity_ViewBinding.write(sb.toString());
                }
                i++;
            } else {
                throw new ProtocolException("The server failed to respond with a valid HTTP response");
            }
        }
    }
}
