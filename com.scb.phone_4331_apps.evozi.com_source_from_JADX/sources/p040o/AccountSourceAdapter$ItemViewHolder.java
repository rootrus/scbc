package p040o;

/* renamed from: o.AccountSourceAdapter$ItemViewHolder */
public abstract class AccountSourceAdapter$ItemViewHolder extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder {
    public DenominatorAmountAdapter$BubbleViewDisableHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }
}
