package p040o;

/* renamed from: o.PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding */
public final class PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public HmlBusinessInfoAdapter$BankAccountViewHolder MediaBrowserCompat$ItemReceiver;
    public HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write;

    public PieChartLegendAdapter$ChartEntryViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 0 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
            throw new IllegalArgumentException(sb.toString());
        }
        this.MediaBrowserCompat$ItemReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 1) {
            this.write = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$ItemReceiver);
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = this.write;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }

    public final String toString() {
        C10424x9307fe96 suitabilityAssessmentAdapter$SuitabilityFooterViewHolder_ViewBinding;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Policy information: ");
        stringBuffer.append(this.MediaBrowserCompat$ItemReceiver);
        if (this.write != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i = 0; i < this.write.MediaBrowserCompat$ItemReceiver(); i++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read = this.write.read(i);
                if (read instanceof C10424x9307fe96) {
                    suitabilityAssessmentAdapter$SuitabilityFooterViewHolder_ViewBinding = (C10424x9307fe96) read;
                } else {
                    suitabilityAssessmentAdapter$SuitabilityFooterViewHolder_ViewBinding = read != null ? new C10424x9307fe96(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read)) : null;
                }
                stringBuffer2.append(suitabilityAssessmentAdapter$SuitabilityFooterViewHolder_ViewBinding);
            }
            stringBuffer.append("[");
            stringBuffer.append(stringBuffer2);
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }
}
