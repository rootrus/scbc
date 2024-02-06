package p040o;

/* renamed from: o.FundAccountPagerAdapter$ItemViewHolder */
public final class FundAccountPagerAdapter$ItemViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder IconCompatParcelizer;
    public C10426xda980a08 MediaBrowserCompat$CustomActionResultReceiver;
    public LtfSummaryAdapter$SsfChildViewHolder read;
    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder write;

    public FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        C10426xda980a08 suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding;
        this.IconCompatParcelizer = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 3) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0);
            LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder = null;
            if (read2 instanceof C10426xda980a08) {
                suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding = (C10426xda980a08) read2;
            } else {
                suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding = read2 != null ? new C10426xda980a08(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding;
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read3 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1);
            if (read3 instanceof LtfSummaryAdapter$SsfChildViewHolder) {
                ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) read3;
            } else if (read3 != null) {
                ltfSummaryAdapter$SsfChildViewHolder = new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read3));
            }
            this.read = ltfSummaryAdapter$SsfChildViewHolder;
            this.write = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.IconCompatParcelizer;
    }
}
