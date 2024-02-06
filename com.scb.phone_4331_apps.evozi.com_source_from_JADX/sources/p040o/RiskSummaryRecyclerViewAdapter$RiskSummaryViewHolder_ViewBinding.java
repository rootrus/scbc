package p040o;

import java.util.Locale;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder_ViewBinding */
public abstract class RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder_ViewBinding extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding {
    public boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder != TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
                return false;
            }
            return true;
        } else if (denominatorAmountAdapter$PencilViewHolder == null || !denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
            return getValue();
        }
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
            return (long) getValue();
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA, (long) getValue());
    }

    public <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.ERAS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public String getDisplayName(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendText((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.ERA, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding).toFormatter(locale).format(this);
    }
}
