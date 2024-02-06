package p040o;

import java.math.BigInteger;
import java.util.Enumeration;
import p040o.SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;

/* renamed from: o.FundSourceListAdapter$FundSourceHolder */
public final class FundSourceListAdapter$FundSourceHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private boolean IconCompatParcelizer = false;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    public InvestmentDetailsClientListAdapter$ExpandableChildViewHolder MediaBrowserCompat$ItemReceiver;
    public SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder read;
    public LtfSummaryAdapter$SsfChildViewHolder write;

    public FundSourceListAdapter$FundSourceHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver() == 3) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(0);
            LtfSummaryAdapter$SsfChildViewHolder ltfSummaryAdapter$SsfChildViewHolder = null;
            if (read2 instanceof SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder) {
                suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder = (SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder) read2;
            } else {
                suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder = read2 != null ? new SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read2)) : null;
            }
            this.read = suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder;
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read3 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(1);
            if (read3 instanceof LtfSummaryAdapter$SsfChildViewHolder) {
                ltfSummaryAdapter$SsfChildViewHolder = (LtfSummaryAdapter$SsfChildViewHolder) read3;
            } else if (read3 != null) {
                ltfSummaryAdapter$SsfChildViewHolder = new LtfSummaryAdapter$SsfChildViewHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(read3));
            }
            this.write = ltfSummaryAdapter$SsfChildViewHolder;
            this.MediaBrowserCompat$ItemReceiver = InvestmentDetailsClientListAdapter$ExpandableChildViewHolder.MediaBrowserCompat$ItemReceiver((Object) hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public final Enumeration MediaBrowserCompat$ItemReceiver() {
        SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder = this.read;
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.read;
        if (hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder == null) {
            return new C10425xd50b5c63(suitabilityAssessmentAdapter$SuitabilityHeaderViewHolder);
        }
        return new SuitabilityAssessmentAdapter$SuitabilityHeaderViewHolder.write(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write());
    }

    public final int write() {
        HmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding = this.read.MediaBrowserCompat$SearchResultReceiver;
        if (hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding == null) {
            return 1;
        }
        return new BigInteger(hmlBusinessInfoAdapter$BankAccountViewHolder_ViewBinding.read).intValue() + 1;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding = new CompanyItemViewHolder_ViewBinding();
        companyItemViewHolder_ViewBinding.write.addElement(this.read);
        companyItemViewHolder_ViewBinding.write.addElement(this.write);
        companyItemViewHolder_ViewBinding.write.addElement(this.MediaBrowserCompat$ItemReceiver);
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(companyItemViewHolder_ViewBinding);
    }

    public final int hashCode() {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = super.hashCode();
            this.IconCompatParcelizer = true;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
