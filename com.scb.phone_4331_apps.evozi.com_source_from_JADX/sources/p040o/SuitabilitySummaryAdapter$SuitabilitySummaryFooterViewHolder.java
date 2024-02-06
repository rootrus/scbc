package p040o;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: o.SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder */
public final class SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private Vector MediaBrowserCompat$CustomActionResultReceiver = new Vector();
    private Hashtable read = new Hashtable();

    static {
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.9");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.14");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.15");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.16");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.17");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.18");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.19");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.20");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.21");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.23");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.24");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.27");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.28");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.29");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.30");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.31");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.32");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.33");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.35");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.36");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.37");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.46");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.54");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.1");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.11");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.12");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.2");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.3");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.4");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.56");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.55");
    }

    public static SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder read(Object obj) {
        while (obj != null) {
            if (obj instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                return new SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) obj);
            }
            if (obj instanceof HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = ((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) obj).MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                    obj = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
                } else {
                    obj = null;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("illegal object in getInstance: ");
                sb.append(obj.getClass().getName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder) obj;
    }

    private SuitabilitySummaryAdapter$SuitabilitySummaryFooterViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        Enumeration write = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write.hasMoreElements()) {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write.nextElement());
            if (MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() == 3) {
                this.read.put(MediaBrowserCompat$CustomActionResultReceiver2.read(0), new C10429xc6dd6bd7(FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2.read(1)), C10905onItemClick.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2.read(2))));
            } else if (MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() == 2) {
                this.read.put(MediaBrowserCompat$CustomActionResultReceiver2.read(0), new C10429xc6dd6bd7(C10905onItemClick.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2.read(1))));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad sequence size: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver());
                throw new IllegalArgumentException(sb.toString());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.addElement(MediaBrowserCompat$CustomActionResultReceiver2.read(0));
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        Enumeration elements = this.MediaBrowserCompat$CustomActionResultReceiver.elements();
        while (elements.hasMoreElements()) {
            HmlBusinessInfoAdapter$BankAccountViewHolder hmlBusinessInfoAdapter$BankAccountViewHolder = (HmlBusinessInfoAdapter$BankAccountViewHolder) elements.nextElement();
            C10429xc6dd6bd7 suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding = (C10429xc6dd6bd7) this.read.get(hmlBusinessInfoAdapter$BankAccountViewHolder);
            CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding2 = new CompanyItemViewHolder_ViewBinding();
            companyItemViewHolder_ViewBinding2.write.addElement(hmlBusinessInfoAdapter$BankAccountViewHolder);
            if (suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver) {
                companyItemViewHolder_ViewBinding2.write.addElement(FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.IconCompatParcelizer);
            }
            companyItemViewHolder_ViewBinding2.write.addElement(suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding.IconCompatParcelizer);
            companyItemViewHolder_ViewBinding.write.addElement(new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding2));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
