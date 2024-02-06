package p040o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* renamed from: o.SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder */
public final class SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder extends HmlBanksGridAdapter$HmlBankViewHolder implements FixedTransferSubDepositAdapter$SubDepositViewHolder {
    public C10402xc503e64f MediaBrowserCompat$CustomActionResultReceiver;

    private SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if ((hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) || (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HelpAdapter$MoreOptionsHolder_ViewBinding)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    public static SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder MediaBrowserCompat$ItemReceiver(Object obj) {
        if (obj == null || (obj instanceof SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder)) {
            return (SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder) obj;
        }
        if (obj instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) {
            return new SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) obj);
        }
        if (obj instanceof HelpAdapter$MoreOptionsHolder_ViewBinding) {
            return new SuitabilityAssessmentAdapter$SuitabilitySectionViewHolder((HelpAdapter$MoreOptionsHolder_ViewBinding) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public final Date IconCompatParcelizer() {
        try {
            if (!(this.MediaBrowserCompat$CustomActionResultReceiver instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding)) {
                return ((HelpAdapter$MoreOptionsHolder_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            return simpleDateFormat.parse(((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver).read());
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid date string: ");
            sb.append(e.getMessage());
            throw new IllegalStateException(sb.toString());
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) {
            return ((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read();
        }
        return ((HelpAdapter$MoreOptionsHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read();
    }
}
