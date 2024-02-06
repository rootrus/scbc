package p040o;

import java.util.Enumeration;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder */
public final class SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    public CreditCardDetailsAdapter$ItemViewHolder_ViewBinding IconCompatParcelizer;
    public SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;
    public SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder MediaBrowserCompat$MediaItem;
    HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding MediaBrowserCompat$SearchResultReceiver;
    HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder read;
    public LtfSummaryAdapter$SsfChildViewHolder write;

    /* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder$IconCompatParcelizer */
    public static class IconCompatParcelizer extends HmlBanksGridAdapter$HmlBankViewHolder {
        public HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder read;
        private CreditCardDetailsAdapter$ItemViewHolder_ViewBinding write;

        public IconCompatParcelizer(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
            if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() < 2 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bad sequence size: ");
                sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
                throw new IllegalArgumentException(sb.toString());
            }
            this.read = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
        }

        public final CreditCardDetailsAdapter$ItemViewHolder_ViewBinding read() {
            CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
            if (this.write == null && this.read.MediaBrowserCompat$ItemReceiver() == 3) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = this.read.read(2);
                if (read2 instanceof CreditCardDetailsAdapter$ItemViewHolder_ViewBinding) {
                    creditCardDetailsAdapter$ItemViewHolder_ViewBinding = (CreditCardDetailsAdapter$ItemViewHolder_ViewBinding) read2;
                } else {
                    creditCardDetailsAdapter$ItemViewHolder_ViewBinding = read2 != null ? new CreditCardDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
                }
                this.write = creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
            }
            return this.write;
        }

        public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
            return this.read;
        }
    }

    /* renamed from: o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder$write */
    class write implements Enumeration {
        private final Enumeration read;

        write(Enumeration enumeration) {
            this.read = enumeration;
        }

        public final boolean hasMoreElements() {
            return this.read.hasMoreElements();
        }

        public final Object nextElement() {
            Object nextElement = this.read.nextElement();
            if (nextElement instanceof IconCompatParcelizer) {
                return (IconCompatParcelizer) nextElement;
            }
            if (nextElement != null) {
                return new IconCompatParcelizer(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(nextElement));
            }
            return null;
        }
    }

    public SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() < 3 || hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() > 7) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver());
            throw new IllegalArgumentException(sb.toString());
        }
        int i = 0;
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = null;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0) instanceof HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding) {
            this.MediaBrowserCompat$SearchResultReceiver = HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.write((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0));
            i = 1;
        } else {
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
        int i2 = i + 1;
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i);
        if (read2 instanceof LtfSummaryAdapter$SsfChildViewHolder) {
            ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) read2;
        } else {
            ltfSummaryAdapter$SsfChildViewHolder = read2 != null ? new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
        }
        this.write = ltfSummaryAdapter$SsfChildViewHolder;
        int i3 = i2 + 1;
        this.MediaBrowserCompat$ItemReceiver = DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i2));
        int i4 = i3 + 1;
        this.MediaBrowserCompat$MediaItem = SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i3));
        if (i4 < hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() && ((hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4) instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) || (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4) instanceof HelpAdapter$MoreOptionsHolder_ViewBinding) || (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4) instanceof SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder))) {
            this.MediaBrowserCompat$CustomActionResultReceiver = SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4));
            i4++;
        }
        if (i4 < hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() && !(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4) instanceof ScbsProductAdapter$ScbsProductViewHolder_ViewBinding)) {
            this.read = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4));
            i4++;
        }
        if (i4 < hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() && (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4) instanceof ScbsProductAdapter$ScbsProductViewHolder_ViewBinding)) {
            HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write((HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(i4), true);
            this.IconCompatParcelizer = write2 != null ? new CreditCardDetailsAdapter$ItemViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2)) : creditCardDetailsAdapter$ItemViewHolder_ViewBinding;
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.MediaBrowserCompat$SearchResultReceiver;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding);
        }
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$ItemReceiver);
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$MediaItem);
        SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder suitabilityAssessmentAdapter$SuitabilitySectionViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (suitabilityAssessmentAdapter$SuitabilitySectionViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(suitabilityAssessmentAdapter$SuitabilitySectionViewHolder);
        }
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = this.read;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder != null) {
            companyItemViewHolder_ViewBinding.write.addElement(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
        }
        CreditCardDetailsAdapter$ItemViewHolder_ViewBinding creditCardDetailsAdapter$ItemViewHolder_ViewBinding = this.IconCompatParcelizer;
        if (creditCardDetailsAdapter$ItemViewHolder_ViewBinding != null) {
            companyItemViewHolder_ViewBinding.write.addElement(new ScbsProductAdapter$ScbsProductViewHolder_ViewBinding(0, creditCardDetailsAdapter$ItemViewHolder_ViewBinding));
        }
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }
}
