package p040o;

import java.util.Iterator;
import java.util.Map;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$AlertController$RecycleListView */
final class C7051x49ed55a7 implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final DenominatorAmountAdapter$PencilViewHolder field;
    private volatile SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat numberPrinterParser;
    private final GiftingBaseListAdapter$GiftViewHolder provider;
    private final C7010xce0f74d9 textStyle;

    C7051x49ed55a7(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, GiftingBaseListAdapter$GiftViewHolder giftingBaseListAdapter$GiftViewHolder) {
        this.field = denominatorAmountAdapter$PencilViewHolder;
        this.textStyle = questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding;
        this.provider = giftingBaseListAdapter$GiftViewHolder;
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(this.field);
        if (value == null) {
            return false;
        }
        String text = this.provider.getText(this.field, value.longValue(), this.textStyle, giftTutorialViewPagerAdapter$TutorialItemHolder.getLocale());
        if (text == null) {
            return numberPrinterParser().print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb);
        }
        sb.append(text);
        return true;
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<Map.Entry<String, Long>> textIterator = this.provider.getTextIterator(this.field, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict() ? this.textStyle : null, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getLocale());
        if (textIterator != null) {
            while (textIterator.hasNext()) {
                Map.Entry next = textIterator.next();
                String str = (String) next.getKey();
                if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.subSequenceEquals(str, 0, charSequence, i, str.length())) {
                    return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(this.field, ((Long) next.getValue()).longValue(), i, i + str.length());
                }
            }
            if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict()) {
                return ~i;
            }
        }
        return numberPrinterParser().parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i);
    }

    private SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat numberPrinterParser() {
        if (this.numberPrinterParser == null) {
            this.numberPrinterParser = new SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat(this.field, 1, 19, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL);
        }
        return this.numberPrinterParser;
    }

    public final String toString() {
        if (this.textStyle == C7010xce0f74d9.FULL) {
            StringBuilder sb = new StringBuilder();
            sb.append("Text(");
            sb.append(this.field);
            sb.append(")");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Text(");
        sb2.append(this.field);
        sb2.append(",");
        sb2.append(this.textStyle);
        sb2.append(")");
        return sb2.toString();
    }
}
