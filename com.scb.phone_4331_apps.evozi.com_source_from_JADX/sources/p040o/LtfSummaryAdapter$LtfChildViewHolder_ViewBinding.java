package p040o;

/* renamed from: o.LtfSummaryAdapter$LtfChildViewHolder_ViewBinding */
public final class LtfSummaryAdapter$LtfChildViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder implements FixedTransferSubDepositAdapter$SubDepositViewHolder {
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read;
    private C10402xc503e64f write;

    public LtfSummaryAdapter$LtfChildViewHolder_ViewBinding(AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder) {
        this.read = accountDetailsAdapter$ItemViewHolder;
        this.write = accountDetailsAdapter$ItemViewHolder.MediaBrowserCompat$MediaItem();
    }

    public LtfSummaryAdapter$LtfChildViewHolder_ViewBinding(C10427x422b304e suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding) {
        this.read = suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding;
        this.write = new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, suitabilityAssessmentAdapter$SuitabilityItemViewHolder_ViewBinding);
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.write;
    }
}
