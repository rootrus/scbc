package p040o;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder */
public final class SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder IconCompatParcelizer;
    public HmlAboutAdapter$HmlAboutViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessInfoAdapter$BankAccountViewHolder read;
    public LtfSummaryAdapter$SsfChildViewHolder write;

    SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 4 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
            throw new IllegalArgumentException(sb.toString());
        }
        int i = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = HmlAboutAdapter$HmlAboutViewHolder.IconCompatParcelizer((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 4) {
            this.read = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
            i = 1;
        }
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 1);
        if (read2 instanceof LtfSummaryAdapter$SsfChildViewHolder) {
            ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) read2;
        } else {
            ltfSummaryAdapter$SsfChildViewHolder = read2 != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
        }
        this.write = ltfSummaryAdapter$SsfChildViewHolder;
        this.IconCompatParcelizer = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 2));
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$CustomActionResultReceiver);
        HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = this.read;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlBusinessInfoAdapter$BankAccountViewHolder);
        }
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        companyItemViewHolder_ViewBinding.write.addElement(this.IconCompatParcelizer);
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
