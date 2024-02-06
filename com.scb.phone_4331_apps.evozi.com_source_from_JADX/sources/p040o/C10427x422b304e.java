package p040o;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding */
public final class C10427x422b304e extends HmlBanksGridAdapter$HmlBankViewHolder {
    public FundSearchListAdapter$FundHolder_ViewBinding IconCompatParcelizer;
    private SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder MediaBrowserCompat$ItemReceiver;
    public AccountDetailsAdapter$ItemViewHolder write;

    public C10427x422b304e(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        int i;
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 3) {
            if (!(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding)) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0);
                if (read instanceof AccountDetailsAdapter$ItemViewHolder) {
                    accountDetailsAdapter$ItemViewHolder = (AccountDetailsAdapter$ItemViewHolder) read;
                } else {
                    accountDetailsAdapter$ItemViewHolder = read != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read)) : null;
                }
                this.write = accountDetailsAdapter$ItemViewHolder;
                i = 1;
            } else {
                i = 0;
            }
            while (i != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver()) {
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i));
                if (write2.IconCompatParcelizer == 0) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, false);
                    this.IconCompatParcelizer = write3 != null ? new FundSearchListAdapter$FundHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write3)) : null;
                } else if (write2.IconCompatParcelizer == 1) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write4 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, false);
                    this.MediaBrowserCompat$ItemReceiver = write4 != null ? new SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write4)) : null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Bad tag number: ");
                    sb.append(write2.IconCompatParcelizer);
                    throw new IllegalArgumentException(sb.toString());
                }
                i++;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bad sequence size: ");
        sb2.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
        throw new IllegalArgumentException(sb2.toString());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = this.write;
        if (accountDetailsAdapter$ItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(accountDetailsAdapter$ItemViewHolder);
        }
        FundSearchListAdapter$FundHolder_ViewBinding fundSearchListAdapter$FundHolder_ViewBinding = this.IconCompatParcelizer;
        if (fundSearchListAdapter$FundHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, fundSearchListAdapter$FundHolder_ViewBinding));
        }
        SuitabilityAssessmentAdapter$SuitabilityFooterViewHolder suitabilityAssessmentAdapter$SuitabilityFooterViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (suitabilityAssessmentAdapter$SuitabilityFooterViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, suitabilityAssessmentAdapter$SuitabilityFooterViewHolder));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
