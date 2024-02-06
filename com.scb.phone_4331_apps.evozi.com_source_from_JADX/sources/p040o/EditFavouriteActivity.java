package p040o;

import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import org.apache.http.HttpException;
import p040o.OPRRewardAdapter;

@Deprecated
/* renamed from: o.EditFavouriteActivity */
public abstract class EditFavouriteActivity implements PrepaidRequestSuccessActivity {
    private PaginationViewFooterHolder IconCompatParcelizer = null;
    private OPRRewardTiersAdapter$TierViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = null;
    private PullSlipActivity_ViewBinding MediaBrowserCompat$ItemReceiver = null;
    private OPRRewardAdapter.RewardViewHolder_ViewBinding<PrivacyConsentActivity> MediaBrowserCompat$MediaItem = null;
    private PaginationViewFooterHolder_ViewBinding<ScbPrivacyPolicyActivity> MediaBrowserCompat$SearchResultReceiver = null;
    private OPRRewardTiersAdapter$TierViewHolder RatingCompat = null;
    private final C9708xd76b084 read = new C9708xd76b084(new DeejungInstallmentsReviewAdapter$ReviewBottomViewHolder());
    private final DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder write = new DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder(new C9707x820291bd());

    /* access modifiers changed from: protected */
    public abstract void MediaMetadataCompat() throws IllegalStateException;

    /* access modifiers changed from: protected */
    public PaginationViewFooterHolder_ViewBinding<ScbPrivacyPolicyActivity> MediaBrowserCompat$CustomActionResultReceiver(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ManageAccountInboundActivity_ViewBinding manageAccountInboundActivity_ViewBinding, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        return new CategoriesListAdapter$CategoryViewHolder_ViewBinding(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, manageAccountInboundActivity_ViewBinding, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding, OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (OPRRewardTiersAdapter$TierViewHolder_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Input session buffer");
        this.RatingCompat = (OPRRewardTiersAdapter$TierViewHolder) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder, "Output session buffer");
        if (oPRRewardTiersAdapter$TierViewHolder_ViewBinding instanceof PaginationViewFooterHolder) {
            this.IconCompatParcelizer = (PaginationViewFooterHolder) oPRRewardTiersAdapter$TierViewHolder_ViewBinding;
        }
        this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, ScanPaymentActivity.IconCompatParcelizer, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
        this.MediaBrowserCompat$MediaItem = new UnbilledTransactionsAdapter$TransactionViewHolder(oPRRewardTiersAdapter$TierViewHolder);
        oPRRewardTiersAdapter$TierViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        oPRRewardTiersAdapter$TierViewHolder.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$ItemReceiver = new PullSlipActivity_ViewBinding();
    }

    public final boolean write(int i) throws IOException {
        MediaMetadataCompat();
        try {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write(i);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    public void MediaBrowserCompat$ItemReceiver(PrivacyConsentActivity privacyConsentActivity) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyConsentActivity, "HTTP request");
        MediaMetadataCompat();
        this.MediaBrowserCompat$MediaItem.write(privacyConsentActivity);
        this.MediaBrowserCompat$ItemReceiver.read++;
    }

    public final void read(PrepaidResetPinSuccessActivity_ViewBinding prepaidResetPinSuccessActivity_ViewBinding) throws HttpException, IOException {
        OutputStream outputStream;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetPinSuccessActivity_ViewBinding, "HTTP request");
        MediaMetadataCompat();
        if (prepaidResetPinSuccessActivity_ViewBinding.IconCompatParcelizer() != null) {
            C9708xd76b084 deejungInstallmentsReviewAdapter$ReviewBottomViewHolder_ViewBinding = this.read;
            OPRRewardTiersAdapter$TierViewHolder oPRRewardTiersAdapter$TierViewHolder = this.RatingCompat;
            PrepaidResetOtpActivity IconCompatParcelizer2 = prepaidResetPinSuccessActivity_ViewBinding.IconCompatParcelizer();
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder, "Session output buffer");
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetPinSuccessActivity_ViewBinding, "HTTP message");
            DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(IconCompatParcelizer2, "HTTP entity");
            long MediaBrowserCompat$CustomActionResultReceiver2 = deejungInstallmentsReviewAdapter$ReviewBottomViewHolder_ViewBinding.write.MediaBrowserCompat$CustomActionResultReceiver(prepaidResetPinSuccessActivity_ViewBinding);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == -2) {
                outputStream = new ExportCardStatementSelectionAdapter$TitleViewHolder_ViewBinding(oPRRewardTiersAdapter$TierViewHolder);
            } else if (MediaBrowserCompat$CustomActionResultReceiver2 == -1) {
                outputStream = new EligiblePrivilegesAdapter$ItemViewHolder_ViewBinding(oPRRewardTiersAdapter$TierViewHolder);
            } else {
                outputStream = new UnbilledTransactionsAdapter$TransactionViewHolder_ViewBinding(oPRRewardTiersAdapter$TierViewHolder, MediaBrowserCompat$CustomActionResultReceiver2);
            }
            IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(outputStream);
            outputStream.close();
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$ResultReceiverWrapper() throws IOException {
        this.RatingCompat.write();
    }

    public final void write() throws IOException {
        MediaMetadataCompat();
        this.RatingCompat.write();
    }

    public ScbPrivacyPolicyActivity MediaBrowserCompat$ItemReceiver() throws HttpException, IOException {
        MediaMetadataCompat();
        ScbPrivacyPolicyActivity write2 = this.MediaBrowserCompat$SearchResultReceiver.write();
        if (write2.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver() >= 200) {
            this.MediaBrowserCompat$ItemReceiver.write++;
        }
        return write2;
    }

    public final void write(ScbPrivacyPolicyActivity scbPrivacyPolicyActivity) throws HttpException, IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP response");
        MediaMetadataCompat();
        DeejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder deejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder = this.write;
        OPRRewardTiersAdapter$TierViewHolder_ViewBinding oPRRewardTiersAdapter$TierViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, "Session input buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(scbPrivacyPolicyActivity, "HTTP message");
        CardPaySelectedActivity cardPaySelectedActivity = new CardPaySelectedActivity();
        long MediaBrowserCompat$CustomActionResultReceiver2 = deejungInstallmentsReviewAdapter$InstallmentsSummaryViewHolder.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(scbPrivacyPolicyActivity);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == -2) {
            cardPaySelectedActivity.MediaBrowserCompat$CustomActionResultReceiver = true;
            cardPaySelectedActivity.read = -1;
            cardPaySelectedActivity.IconCompatParcelizer = new ExportCardStatementSelectionAdapter$MonthViewHolder_ViewBinding(oPRRewardTiersAdapter$TierViewHolder_ViewBinding);
        } else if (MediaBrowserCompat$CustomActionResultReceiver2 == -1) {
            cardPaySelectedActivity.MediaBrowserCompat$CustomActionResultReceiver = false;
            cardPaySelectedActivity.read = -1;
            cardPaySelectedActivity.IconCompatParcelizer = new EligiblePrivilegesAdapter$ItemViewHolder(oPRRewardTiersAdapter$TierViewHolder_ViewBinding);
        } else {
            cardPaySelectedActivity.MediaBrowserCompat$CustomActionResultReceiver = false;
            cardPaySelectedActivity.read = MediaBrowserCompat$CustomActionResultReceiver2;
            cardPaySelectedActivity.IconCompatParcelizer = new ExportCardStatementSelectionAdapter$TitleViewHolder(oPRRewardTiersAdapter$TierViewHolder_ViewBinding, MediaBrowserCompat$CustomActionResultReceiver2);
        }
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver3 = scbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Type");
        if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
            cardPaySelectedActivity.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver3;
        }
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver4 = scbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Encoding");
        if (MediaBrowserCompat$CustomActionResultReceiver4 != null) {
            cardPaySelectedActivity.write = MediaBrowserCompat$CustomActionResultReceiver4;
        }
        scbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver(cardPaySelectedActivity);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (!IconCompatParcelizer()) {
            return true;
        }
        PaginationViewFooterHolder paginationViewFooterHolder = this.IconCompatParcelizer;
        if (paginationViewFooterHolder != null && paginationViewFooterHolder.IconCompatParcelizer()) {
            return true;
        }
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(1);
            PaginationViewFooterHolder paginationViewFooterHolder2 = this.IconCompatParcelizer;
            if (paginationViewFooterHolder2 == null || !paginationViewFooterHolder2.IconCompatParcelizer()) {
                return false;
            }
            return true;
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }
}
