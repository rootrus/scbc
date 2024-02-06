package p040o;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityItemViewHolder */
public final class SuitabilityAssessmentAdapter$SuitabilityItemViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder implements C10430x204d6df4, RecommendRecyclerAdapter$RecommendViewHolder {
    public DividendSummaryAdapter$ParentViewHolder_ViewBinding AppCompatActivity;
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder AppCompatDialogFragment;
    public DividendSummaryAdapter$ParentViewHolder_ViewBinding setBackgroundResource;

    public static SuitabilityAssessmentAdapter$SuitabilityItemViewHolder write(Object obj) {
        if (obj != null) {
            return new SuitabilityAssessmentAdapter$SuitabilityItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    private SuitabilityAssessmentAdapter$SuitabilityItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        int i;
        this.AppCompatDialogFragment = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof ScbsProductAdapter$ScbsProductViewHolder_ViewBinding) {
            HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0), true);
            i = 0;
        } else {
            new HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding(0);
            i = -1;
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 1));
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 2);
        if (!(read instanceof LtfSummaryAdapter$SsfChildViewHolder) && read != null) {
            new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read));
        }
        this.AppCompatActivity = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 3));
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2 = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 4);
        SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.read(0));
        SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder2.read(1));
        this.setBackgroundResource = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i + 5));
        int i2 = i + 6;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i2);
        if (!(read2 instanceof LandingAccountsAdapter$AccountViewHolder_ViewBinding) && read2 != null) {
            new LandingAccountsAdapter$AccountViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2));
        }
        for (int MediaBrowserCompat$ItemReceiver = (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() - i2) - 1; MediaBrowserCompat$ItemReceiver > 0; MediaBrowserCompat$ItemReceiver--) {
            ScbsProductAdapter$ScbsProductViewHolder_ViewBinding scbsProductAdapter$ScbsProductViewHolder_ViewBinding = (ScbsProductAdapter$ScbsProductViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i2 + MediaBrowserCompat$ItemReceiver);
            int i3 = scbsProductAdapter$ScbsProductViewHolder_ViewBinding.IconCompatParcelizer;
            if (i3 == 1) {
                InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) scbsProductAdapter$ScbsProductViewHolder_ViewBinding);
            } else if (i3 == 2) {
                InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) scbsProductAdapter$ScbsProductViewHolder_ViewBinding);
            } else if (i3 == 3) {
                SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder.read(scbsProductAdapter$ScbsProductViewHolder_ViewBinding);
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.AppCompatDialogFragment;
    }
}
