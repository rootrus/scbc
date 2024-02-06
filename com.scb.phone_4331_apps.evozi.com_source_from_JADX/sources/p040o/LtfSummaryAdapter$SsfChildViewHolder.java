package p040o;

/* renamed from: o.LtfSummaryAdapter$SsfChildViewHolder */
public final class LtfSummaryAdapter$SsfChildViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding write;

    public LtfSummaryAdapter$SsfChildViewHolder(HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessInfoAdapter$BankAccountViewHolder;
        this.write = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
    }

    public LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 0 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
            throw new IllegalArgumentException(sb.toString());
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 2) {
            this.write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1);
        } else {
            this.write = null;
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$CustomActionResultReceiver);
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.write;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
