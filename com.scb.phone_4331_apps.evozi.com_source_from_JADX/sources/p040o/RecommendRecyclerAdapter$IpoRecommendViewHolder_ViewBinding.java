package p040o;

import java.util.Enumeration;

/* renamed from: o.RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding */
public final class RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder implements RecommendRecyclerAdapter$RecommendViewHolder {
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding ActionMenuItemView;
    public C10403xf0c8ae24 AppCompatActivity;
    public C10403xf0c8ae24 AppCompatDialogFragment;
    private C10403xf0c8ae24 AppCompatViewInflater;
    private HighlightRecycleAdapter$MyViewHolder setBackgroundResource;
    private C10403xf0c8ae24 setExpandedFormat;

    public static RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding IconCompatParcelizer(Object obj) {
        if (obj != null) {
            return new RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    public RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding(HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding, C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding, HighlightRecycleAdapter$MyViewHolder highlightRecycleAdapter$MyViewHolder, C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2, C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding3) {
        this.ActionMenuItemView = hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding;
        this.AppCompatViewInflater = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding;
        this.setBackgroundResource = highlightRecycleAdapter$MyViewHolder;
        this.AppCompatDialogFragment = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2;
        this.AppCompatActivity = null;
        this.setExpandedFormat = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding3;
    }

    private RecommendRecyclerAdapter$IpoRecommendViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        HighlightRecycleAdapter$MyViewHolder highlightRecycleAdapter$MyViewHolder;
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        this.ActionMenuItemView = (HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) write.nextElement();
        this.AppCompatViewInflater = (C10403xf0c8ae24) write.nextElement();
        Object nextElement = write.nextElement();
        if (nextElement instanceof HighlightRecycleAdapter$MyViewHolder) {
            highlightRecycleAdapter$MyViewHolder = (HighlightRecycleAdapter$MyViewHolder) nextElement;
        } else {
            highlightRecycleAdapter$MyViewHolder = nextElement != null ? new HighlightRecycleAdapter$MyViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement)) : null;
        }
        this.setBackgroundResource = highlightRecycleAdapter$MyViewHolder;
        while (write.hasMoreElements()) {
            C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = (C10402xc503e64f) write.nextElement();
            if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
                int i = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer;
                if (i == 0) {
                    this.AppCompatDialogFragment = C10403xf0c8ae24.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding);
                } else if (i == 1) {
                    this.AppCompatActivity = C10403xf0c8ae24.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown tag value ");
                    sb.append(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.setExpandedFormat = (C10403xf0c8ae24) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.ActionMenuItemView);
        companyItemViewHolder_ViewBinding.write.addElement(this.AppCompatViewInflater);
        companyItemViewHolder_ViewBinding.write.addElement(this.setBackgroundResource);
        C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding = this.AppCompatDialogFragment;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding));
        }
        C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2 = this.AppCompatActivity;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2 != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding2));
        }
        companyItemViewHolder_ViewBinding.write.addElement(this.setExpandedFormat);
        return new InsurersAdapter$InsurersViewHolder_ViewBinding(companyItemViewHolder_ViewBinding);
    }
}
