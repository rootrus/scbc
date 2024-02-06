package p040o;

import java.util.Enumeration;

/* renamed from: o.HighlightRecycleAdapter$MyViewHolder */
public final class HighlightRecycleAdapter$MyViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder implements RecommendRecyclerAdapter$RecommendViewHolder {
    private boolean AppCompatActivity = true;
    private HmlBusinessInfoAdapter$BankAccountViewHolder AppCompatDialogFragment;
    private HmlAboutAdapter$HmlAboutViewHolder_ViewBinding setBackgroundResource;

    HighlightRecycleAdapter$MyViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        this.AppCompatDialogFragment = (HmlBusinessInfoAdapter$BankAccountViewHolder) write.nextElement();
        if (write.hasMoreElements()) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = ((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) write.nextElement()).MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
            } else {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
            }
            this.setBackgroundResource = hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        }
        this.AppCompatActivity = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder instanceof InsurersAdapter$InsurersViewHolder_ViewBinding;
    }

    public HighlightRecycleAdapter$MyViewHolder(HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        this.AppCompatDialogFragment = hmlBusinessInfoAdapter$BankAccountViewHolder;
        this.setBackgroundResource = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.AppCompatDialogFragment);
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = this.setBackgroundResource;
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new PolicyCardAdapter$PolicyCardViewHolder(true, 0, hmlAboutAdapter$HmlAboutViewHolder_ViewBinding));
        }
        if (this.AppCompatActivity) {
            return new InsurersAdapter$InsurersViewHolder_ViewBinding(companyItemViewHolder_ViewBinding);
        }
        return new DiscoverFundFilterAdapter$SelectListHolder(companyItemViewHolder_ViewBinding);
    }
}
