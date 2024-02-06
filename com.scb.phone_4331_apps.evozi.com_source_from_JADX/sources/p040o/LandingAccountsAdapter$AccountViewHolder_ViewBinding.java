package p040o;

import java.util.Enumeration;

/* renamed from: o.LandingAccountsAdapter$AccountViewHolder_ViewBinding */
public final class LandingAccountsAdapter$AccountViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public LtfSummaryAdapter$SsfChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private InvestmentDetailsClientListAdapter$ExpandableChildViewHolder read;

    public LandingAccountsAdapter$AccountViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 2) {
            Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
            Object nextElement = write.nextElement();
            if (nextElement instanceof LtfSummaryAdapter$SsfChildViewHolder) {
                ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) nextElement;
            } else {
                ltfSummaryAdapter$SsfChildViewHolder = nextElement != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement)) : null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = ltfSummaryAdapter$SsfChildViewHolder;
            this.read = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver(write.nextElement());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
        throw new IllegalArgumentException(sb.toString());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$CustomActionResultReceiver);
        companyItemViewHolder_ViewBinding.write.addElement(this.read);
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
