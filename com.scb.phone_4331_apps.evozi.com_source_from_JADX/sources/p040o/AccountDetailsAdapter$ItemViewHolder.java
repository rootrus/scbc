package p040o;

/* renamed from: o.AccountDetailsAdapter$ItemViewHolder */
public final class AccountDetailsAdapter$ItemViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public final CreditCardDetailsAdapter$ItemViewHolder[] MediaBrowserCompat$CustomActionResultReceiver;

    public AccountDetailsAdapter$ItemViewHolder(CreditCardDetailsAdapter$ItemViewHolder creditCardDetailsAdapter$ItemViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new CreditCardDetailsAdapter$ItemViewHolder[]{creditCardDetailsAdapter$ItemViewHolder};
    }

    public AccountDetailsAdapter$ItemViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new CreditCardDetailsAdapter$ItemViewHolder[hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver()];
        for (int i = 0; i != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver(); i++) {
            this.MediaBrowserCompat$CustomActionResultReceiver[i] = CreditCardDetailsAdapter$ItemViewHolder.read(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i));
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return new InvestmentDetailsTransactionAdapter$TransactionHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[]) this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String read = MoneyActionAdapter$CustomViewHolder.read();
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(read);
        for (int i = 0; i != this.MediaBrowserCompat$CustomActionResultReceiver.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
            stringBuffer.append(read);
        }
        return stringBuffer.toString();
    }
}
