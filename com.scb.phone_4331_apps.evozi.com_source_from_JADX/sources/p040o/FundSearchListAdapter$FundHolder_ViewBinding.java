package p040o;

/* renamed from: o.FundSearchListAdapter$FundHolder_ViewBinding */
public final class FundSearchListAdapter$FundHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public AccountDetailsAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver;
    private InvestmentDetailsClientListAdapter$ExpandableChildViewHolder read;
    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding write;

    FundSearchListAdapter$FundHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 2 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 3) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0);
            if (read2 instanceof AccountDetailsAdapter$ItemViewHolder) {
                accountDetailsAdapter$ItemViewHolder = (AccountDetailsAdapter$ItemViewHolder) read2;
            } else {
                accountDetailsAdapter$ItemViewHolder = read2 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
            }
            this.MediaBrowserCompat$ItemReceiver = accountDetailsAdapter$ItemViewHolder;
            this.write = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
            if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 3) {
                this.read = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(2));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
        throw new IllegalArgumentException(sb.toString());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$ItemReceiver);
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        InvestmentDetailsClientListAdapter$ExpandableChildViewHolder investmentDetailsClientListAdapter$ExpandableChildViewHolder = this.read;
        if (investmentDetailsClientListAdapter$ExpandableChildViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(investmentDetailsClientListAdapter$ExpandableChildViewHolder);
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
