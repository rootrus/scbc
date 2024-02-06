package p040o;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder_ViewBinding */
public final class C10424x9307fe96 extends HmlBanksGridAdapter$HmlBankViewHolder {
    private HmlAboutAdapter$HmlAboutViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessInfoAdapter$BankAccountViewHolder write;

    public C10424x9307fe96(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 2) {
            this.write = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
        throw new IllegalArgumentException(sb.toString());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$CustomActionResultReceiver);
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
