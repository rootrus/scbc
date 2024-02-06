package p040o;

import java.util.Locale;
import java.util.Map;

/* renamed from: o.DenominatorAmountAdapter$PencilViewHolder */
public interface DenominatorAmountAdapter$PencilViewHolder {
    <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j);

    EBillAdapter$EBillHolder_ViewBinding getBaseUnit();

    String getDisplayName(Locale locale);

    long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);

    EBillAdapter$EBillHolder_ViewBinding getRangeUnit();

    boolean isDateBased();

    boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);

    boolean isTimeBased();

    FavouriteTargetAdapter$ItemViewHolder range();

    FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);

    DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
}
