package p040o;

import java.math.BigInteger;

/* renamed from: o.CurrencyAdapter$CurrencyHolder_ViewBinding */
public final class CurrencyAdapter$CurrencyHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder {
    private FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(false);
    public HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver = null;

    public CurrencyAdapter$CurrencyHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding) {
            this.MediaBrowserCompat$CustomActionResultReceiver = FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
        }
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() <= 1) {
            return;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1));
            return;
        }
        throw new IllegalArgumentException("wrong sequence in constructor");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding != null) {
            if (fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.read[0] != 0) {
                return true;
            }
        }
        return false;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding);
        }
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding);
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }

    public final String toString() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("BasicConstraints: isCa(");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver());
            sb.append("), pathLenConstraint = ");
            sb.append(new BigInteger(this.MediaBrowserCompat$ItemReceiver.read));
            return sb.toString();
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return "BasicConstraints: isCa(false)";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BasicConstraints: isCa(");
            sb2.append(MediaBrowserCompat$CustomActionResultReceiver());
            sb2.append(")");
            return sb2.toString();
        }
    }
}
