package p040o;

/* renamed from: o.RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding */
public final class RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    private static LtfSummaryAdapter$SsfChildViewHolder MediaBrowserCompat$CustomActionResultReceiver = new LtfSummaryAdapter$SsfChildViewHolder(RecommendRecyclerAdapter$RecommendViewHolder.MediaSessionCompat$QueueItem, MediaBrowserCompat$ItemReceiver);
    private static LtfSummaryAdapter$SsfChildViewHolder MediaBrowserCompat$ItemReceiver = new LtfSummaryAdapter$SsfChildViewHolder(HighlightRecycleAdapter$MyViewHolder_ViewBinding.write, InvestmentDetailsClientListAdapter$NoFundViewHolder.write);
    private static HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding read = new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(1);
    private static HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding write = new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(20);
    public LtfSummaryAdapter$SsfChildViewHolder IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding MediaBrowserCompat$MediaItem = write;
    private LtfSummaryAdapter$SsfChildViewHolder MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding RatingCompat = read;

    public static RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj instanceof RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding) {
            return (RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding) obj;
        }
        if (obj != null) {
            return new RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    public RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding() {
    }

    private RecommendRecyclerAdapter$RecommendViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        for (int i = 0; i != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver(); i++) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i);
            int i2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer;
            LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder = null;
            if (i2 == 0) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, true);
                this.IconCompatParcelizer = write2 != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : ltfSummaryAdapter$SsfChildViewHolder;
            } else if (i2 == 1) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, true);
                this.MediaDescriptionCompat = write3 != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write3)) : ltfSummaryAdapter$SsfChildViewHolder;
            } else if (i2 == 2) {
                this.MediaBrowserCompat$MediaItem = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, true);
            } else if (i2 == 3) {
                this.RatingCompat = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        if (!this.IconCompatParcelizer.equals(MediaBrowserCompat$ItemReceiver)) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 0, this.IconCompatParcelizer));
        }
        if (!this.MediaDescriptionCompat.equals(MediaBrowserCompat$CustomActionResultReceiver)) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 1, this.MediaDescriptionCompat));
        }
        if (!this.MediaBrowserCompat$MediaItem.equals(write)) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 2, this.MediaBrowserCompat$MediaItem));
        }
        if (!this.RatingCompat.equals(read)) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, 3, this.RatingCompat));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
