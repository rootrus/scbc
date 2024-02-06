package p040o;

import java.util.Enumeration;

/* renamed from: o.CurrencyAdapter$CurrencyHolder */
public final class CurrencyAdapter$CurrencyHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding IconCompatParcelizer = null;
    private AccountDetailsAdapter$ItemViewHolder MediaBrowserCompat$ItemReceiver = null;
    public C10905onItemClick read = null;

    public CurrencyAdapter$CurrencyHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write.hasMoreElements()) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = ScbsProductAdapter$ScbsProductViewHolder_ViewBinding.write(write.nextElement());
            int i = write2.IconCompatParcelizer;
            if (i == 0) {
                this.read = C10905onItemClick.IconCompatParcelizer(write2);
            } else if (i == 1) {
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write3 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(write2, false);
                this.MediaBrowserCompat$ItemReceiver = write3 != null ? new AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write3)) : null;
            } else if (i == 2) {
                this.IconCompatParcelizer = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write2, false);
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        C10905onItemClick onitemclick = this.read;
        if (onitemclick != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, onitemclick));
        }
        AccountDetailsAdapter$ItemViewHolder accountDetailsAdapter$ItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (accountDetailsAdapter$ItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, accountDetailsAdapter$ItemViewHolder));
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 2, hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthorityKeyIdentifier: KeyID(");
        sb.append(this.read.write());
        sb.append(")");
        return sb.toString();
    }
}
