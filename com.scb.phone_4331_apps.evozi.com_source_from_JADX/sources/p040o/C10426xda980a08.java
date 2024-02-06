package p040o;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder_ViewBinding */
public final class C10426xda980a08 extends HmlBanksGridAdapter$HmlBankViewHolder {
    public DividendSummaryAdapter$ParentViewHolder_ViewBinding IconCompatParcelizer;
    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder MediaBrowserCompat$ItemReceiver;
    public DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$MediaItem;
    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding f5822x50fd9e4a;
    public LtfSummaryAdapter$SsfChildViewHolder MediaDescriptionCompat;
    public SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder MediaMetadataCompat;
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaSessionCompat$Token;
    public LandingAccountsAdapter$AccountViewHolder_ViewBinding RatingCompat;
    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding read;
    public CreditCardDetailsAdapter$ItemViewHolder_ViewBinding write;

    C10426xda980a08(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        int i;
        LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder;
        LandingAccountsAdapter$AccountViewHolder_ViewBinding landingAccountsAdapter$AccountViewHolder_ViewBinding;
        this.MediaSessionCompat$Token = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof ScbsProductAdapter$ScbsProductViewHolder_ViewBinding) {
            this.f5822x50fd9e4a = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0), true);
            i = 0;
        } else {
            this.f5822x50fd9e4a = new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(0);
            i = -1;
        }
        this.read = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 1));
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 2);
        if (read2 instanceof LtfSummaryAdapter$SsfChildViewHolder) {
            ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) read2;
        } else {
            ltfSummaryAdapter$SsfChildViewHolder = read2 != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
        }
        this.MediaDescriptionCompat = ltfSummaryAdapter$SsfChildViewHolder;
        this.IconCompatParcelizer = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 3));
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2 = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 4);
        this.MediaMetadataCompat = SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.read(0));
        this.MediaBrowserCompat$ItemReceiver = SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.read(1));
        this.MediaBrowserCompat$MediaItem = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 5));
        int i2 = i + 6;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read3 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i2);
        if (read3 instanceof LandingAccountsAdapter$AccountViewHolder_ViewBinding) {
            landingAccountsAdapter$AccountViewHolder_ViewBinding = (LandingAccountsAdapter$AccountViewHolder_ViewBinding) read3;
        } else {
            landingAccountsAdapter$AccountViewHolder_ViewBinding = read3 != null ? new LandingAccountsAdapter$AccountViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read3)) : null;
        }
        this.RatingCompat = landingAccountsAdapter$AccountViewHolder_ViewBinding;
        for (int MediaBrowserCompat$ItemReceiver2 = (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() - i2) - 1; MediaBrowserCompat$ItemReceiver2 > 0; MediaBrowserCompat$ItemReceiver2--) {
            ScbsProductAdapter$ScbsProductViewHolder_ViewBinding scbsProductAdapter$ScbsProductViewHolder_ViewBinding = (ScbsProductAdapter$ScbsProductViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i2 + MediaBrowserCompat$ItemReceiver2);
            int i3 = scbsProductAdapter$ScbsProductViewHolder_ViewBinding.IconCompatParcelizer;
            if (i3 == 1) {
                this.MediaBrowserCompat$CustomActionResultReceiver = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) scbsProductAdapter$ScbsProductViewHolder_ViewBinding);
            } else if (i3 == 2) {
                this.MediaBrowserCompat$SearchResultReceiver = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) scbsProductAdapter$ScbsProductViewHolder_ViewBinding);
            } else if (i3 == 3) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(scbsProductAdapter$ScbsProductViewHolder_ViewBinding, true);
                this.write = write2 != null ? new CreditCardDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : null;
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.MediaSessionCompat$Token;
    }
}
