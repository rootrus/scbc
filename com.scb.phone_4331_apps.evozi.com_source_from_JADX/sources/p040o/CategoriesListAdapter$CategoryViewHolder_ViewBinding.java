package p040o;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;

/* renamed from: o.CategoriesListAdapter$CategoryViewHolder_ViewBinding */
public final class CategoriesListAdapter$CategoryViewHolder_ViewBinding extends ExportCardStatementSelectionAdapter$ItemSelectionViewHolder<ScbPrivacyPolicyActivity> {
    private final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(128);
    private final ManageAccountInboundActivity_ViewBinding write;

    @Deprecated
    public CategoriesListAdapter$CategoryViewHolder_ViewBinding(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ManageAccountInboundActivity_ViewBinding manageAccountInboundActivity_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        super(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, (AmountDetailsAdapter$SuccessRow_ViewBinding) null, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        this.write = (ManageAccountInboundActivity_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(manageAccountInboundActivity_ViewBinding, "Response factory");
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ PrivacyManagementLandingActivity IconCompatParcelizer(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding) throws IOException, HttpException, ParseException {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = 0;
        if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver) != -1) {
            return this.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$CustomActionResultReceiver, new RadioButtonGroupAdapter$RadioButtonViewGroup(0, this.MediaBrowserCompat$CustomActionResultReceiver.length())));
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
