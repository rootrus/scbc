package p040o;

import java.math.BigInteger;

/* renamed from: o.AccountDetailsAdapter$ItemViewHolder_ViewBinding */
public final class AccountDetailsAdapter$ItemViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    private static final BigInteger IconCompatParcelizer = BigInteger.valueOf(0);
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    private HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding read;
    public CreditCardDetailsAdapter$ItemViewHolder write;

    private AccountDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.write = CreditCardDetailsAdapter$ItemViewHolder.read(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        int MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == 1) {
            return;
        }
        if (MediaBrowserCompat$ItemReceiver == 2) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write2 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
            int i = write2.IconCompatParcelizer;
            if (i == 0) {
                this.read = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write2, false);
            } else if (i == 1) {
                this.MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write2, false);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad tag number: ");
                sb.append(write2.IconCompatParcelizer);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (MediaBrowserCompat$ItemReceiver == 3) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write3 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
            if (write3.IconCompatParcelizer == 0) {
                this.read = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write3, false);
                HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding write4 = HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(2));
                if (write4.IconCompatParcelizer == 1) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read(write4, false);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Bad tag number for 'maximum': ");
                sb2.append(write4.IconCompatParcelizer);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Bad tag number for 'minimum': ");
            sb3.append(write3.IconCompatParcelizer);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Bad sequence size: ");
            sb4.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static AccountDetailsAdapter$ItemViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof AccountDetailsAdapter$ItemViewHolder_ViewBinding) {
            return (AccountDetailsAdapter$ItemViewHolder_ViewBinding) obj;
        }
        return new AccountDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.read;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null && !new BigInteger(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read).equals(IconCompatParcelizer)) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 0, this.read));
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2 != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, 1, hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding2));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
