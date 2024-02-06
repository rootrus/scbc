package p040o;

import java.util.Enumeration;

/* renamed from: o.FundRedeemSearchListAdapter$FundHolder_ViewBinding */
public final class FundRedeemSearchListAdapter$FundHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    public AccountDetailsAdapter$ItemViewHolder_ViewBinding[] IconCompatParcelizer;
    public AccountDetailsAdapter$ItemViewHolder_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver;

    public FundRedeemSearchListAdapter$FundHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write.hasMoreElements()) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write(write.nextElement());
            int i = write2.IconCompatParcelizer;
            if (i == 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver = write(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, false));
            } else if (i == 1) {
                this.IconCompatParcelizer = write(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, false));
            }
        }
    }

    private static AccountDetailsAdapter$ItemViewHolder_ViewBinding[] write(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        int MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver();
        AccountDetailsAdapter$ItemViewHolder_ViewBinding[] accountDetailsAdapter$ItemViewHolder_ViewBindingArr = new AccountDetailsAdapter$ItemViewHolder_ViewBinding[MediaBrowserCompat$ItemReceiver];
        for (int i = 0; i != MediaBrowserCompat$ItemReceiver; i++) {
            accountDetailsAdapter$ItemViewHolder_ViewBindingArr[i] = AccountDetailsAdapter$ItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i));
        }
        return accountDetailsAdapter$ItemViewHolder_ViewBindingArr;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, new InvestmentDetailsTransactionAdapter$TransactionHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[]) this.MediaBrowserCompat$CustomActionResultReceiver)));
        }
        if (this.IconCompatParcelizer != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, new InvestmentDetailsTransactionAdapter$TransactionHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[]) this.IconCompatParcelizer)));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
