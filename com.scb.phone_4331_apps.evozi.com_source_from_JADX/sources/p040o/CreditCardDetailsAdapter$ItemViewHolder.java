package p040o;

import java.io.IOException;

/* renamed from: o.CreditCardDetailsAdapter$ItemViewHolder */
public final class CreditCardDetailsAdapter$ItemViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder implements FixedTransferSubDepositAdapter$SubDepositViewHolder {
    public int IconCompatParcelizer;
    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;

    public CreditCardDetailsAdapter$ItemViewHolder(DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dividendSummaryAdapter$ParentViewHolder_ViewBinding;
        this.IconCompatParcelizer = 4;
    }

    public CreditCardDetailsAdapter$ItemViewHolder(int i, HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding;
        this.IconCompatParcelizer = i;
    }

    public CreditCardDetailsAdapter$ItemViewHolder(String str) {
        this.IconCompatParcelizer = 1;
        this.MediaBrowserCompat$CustomActionResultReceiver = new InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder(str);
    }

    public static CreditCardDetailsAdapter$ItemViewHolder read(Object obj) {
        if (obj == null || (obj instanceof CreditCardDetailsAdapter$ItemViewHolder)) {
            return (CreditCardDetailsAdapter$ItemViewHolder) obj;
        }
        if (obj instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
            HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding = (HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) obj;
            int i = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer;
            switch (i) {
                case 0:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, false));
                case 1:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
                case 2:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
                case 3:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown tag: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                case 4:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, DividendSummaryAdapter$ParentViewHolder_ViewBinding.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
                case 5:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, false));
                case 6:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
                case 7:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, C10905onItemClick.IconCompatParcelizer(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
                case 8:
                    return new CreditCardDetailsAdapter$ItemViewHolder(i, HmlBusinessInfoAdapter$BankAccountViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding));
            }
        }
        if (obj instanceof byte[]) {
            try {
                return read(C10402xc503e64f.read((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unknown object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.IconCompatParcelizer);
        stringBuffer.append(": ");
        int i = this.IconCompatParcelizer;
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                stringBuffer.append(DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver).toString());
            } else if (i != 6) {
                stringBuffer.append(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(InvestmentDetailsClientListAdapter$ExpandableGroupViewHolder.read((Object) this.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat());
        return stringBuffer.toString();
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        int i = this.IconCompatParcelizer;
        if (i == 4) {
            return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(true, i, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(false, i, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
