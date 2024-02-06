package p040o;

import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding */
public abstract class TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding {
    public FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }
}
