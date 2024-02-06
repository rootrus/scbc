package p040o;

import java.util.List;

/* renamed from: o.PurchaseAccountSourceAdapter$ItemViewHolder */
public abstract class PurchaseAccountSourceAdapter$ItemViewHolder implements DenominatorAmountAdapter$PencilViewHolder_ViewBinding {
    public abstract DenominatorAmountAdapter$BubbleViewDisableHolder addTo(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder);

    public abstract boolean equals(Object obj);

    public abstract long get(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding);

    public abstract C7022x6c0e8d61 getChronology();

    public abstract List<EBillAdapter$EBillHolder_ViewBinding> getUnits();

    public abstract int hashCode();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding);

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder multipliedBy(int i);

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder normalized();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding);

    public abstract DenominatorAmountAdapter$BubbleViewDisableHolder subtractFrom(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder);

    public abstract String toString();

    public static PurchaseAccountSourceAdapter$ItemViewHolder between(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(promptPayMobileListAdapter$PromptPayListView, "startDateInclusive");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(promptPayMobileListAdapter$PromptPayListView2, "endDateExclusive");
        return promptPayMobileListAdapter$PromptPayListView.until(promptPayMobileListAdapter$PromptPayListView2);
    }

    public boolean isZero() {
        for (EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding : getUnits()) {
            if (get(eBillAdapter$EBillHolder_ViewBinding) != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isNegative() {
        for (EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding : getUnits()) {
            if (get(eBillAdapter$EBillHolder_ViewBinding) < 0) {
                return true;
            }
        }
        return false;
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder negated() {
        return multipliedBy(-1);
    }
}
