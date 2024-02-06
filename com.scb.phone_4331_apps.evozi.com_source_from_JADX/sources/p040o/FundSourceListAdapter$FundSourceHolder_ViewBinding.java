package p040o;

import java.util.Enumeration;

/* renamed from: o.FundSourceListAdapter$FundSourceHolder_ViewBinding */
public final class FundSourceListAdapter$FundSourceHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public FundAccountPagerAdapter$ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public FundAccountPagerAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver;

    public FundSourceListAdapter$FundSourceHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 1 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 2) {
            Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
            while (write.hasMoreElements()) {
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write(write.nextElement());
                FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder = null;
                if (write2.IconCompatParcelizer == 0) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, true);
                    this.MediaBrowserCompat$ItemReceiver = write3 != null ? new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write3)) : fundAccountPagerAdapter$ItemViewHolder;
                } else if (write2.IconCompatParcelizer == 1) {
                    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write4 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, true);
                    this.MediaBrowserCompat$CustomActionResultReceiver = write4 != null ? new FundAccountPagerAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write4)) : fundAccountPagerAdapter$ItemViewHolder;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Bad tag number: ");
                    sb.append(write2.IconCompatParcelizer);
                    throw new IllegalArgumentException(sb.toString());
                }
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
        FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (fundAccountPagerAdapter$ItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(0, fundAccountPagerAdapter$ItemViewHolder));
        }
        FundAccountPagerAdapter$ItemViewHolder fundAccountPagerAdapter$ItemViewHolder2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundAccountPagerAdapter$ItemViewHolder2 != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(1, fundAccountPagerAdapter$ItemViewHolder2));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
