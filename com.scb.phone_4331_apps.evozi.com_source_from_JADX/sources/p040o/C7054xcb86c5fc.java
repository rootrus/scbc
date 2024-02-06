package p040o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$MediaItem */
final class C7054xcb86c5fc implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final boolean decimalPoint;
    private final DenominatorAmountAdapter$PencilViewHolder field;
    private final int maxWidth;
    private final int minWidth;

    C7054xcb86c5fc(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, boolean z) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        if (!denominatorAmountAdapter$PencilViewHolder.range().isFixed()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field must have a fixed set of values: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i > 9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Minimum width must be from 0 to 9 inclusive but was ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= 0 || i2 > 9) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Maximum width must be from 1 to 9 inclusive but was ");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        } else if (i2 >= i) {
            this.field = denominatorAmountAdapter$PencilViewHolder;
            this.minWidth = i;
            this.maxWidth = i2;
            this.decimalPoint = z;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Maximum width must exceed or equal the minimum width but ");
            sb4.append(i2);
            sb4.append(" < ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(this.field);
        if (value == null) {
            return false;
        }
        GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder symbols = giftTutorialViewPagerAdapter$TutorialItemHolder.getSymbols();
        BigDecimal convertToFraction = convertToFraction(value.longValue());
        if (convertToFraction.scale() != 0) {
            String convertNumberToI18N = symbols.convertNumberToI18N(convertToFraction.setScale(Math.min(Math.max(convertToFraction.scale(), this.minWidth), this.maxWidth), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.decimalPoint) {
                sb.append(symbols.getDecimalSeparator());
            }
            sb.append(convertNumberToI18N);
            return true;
        } else if (this.minWidth <= 0) {
            return true;
        } else {
            if (this.decimalPoint) {
                sb.append(symbols.getDecimalSeparator());
            }
            for (int i = 0; i < this.minWidth; i++) {
                sb.append(symbols.getZeroDigit());
            }
            return true;
        }
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        int i2;
        int i3 = 0;
        int i4 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict() ? this.minWidth : 0;
        int i5 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict() ? this.maxWidth : 9;
        int length = charSequence.length();
        if (i == length) {
            return i4 > 0 ? ~i : i;
        }
        if (this.decimalPoint) {
            if (charSequence.charAt(i) != giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getSymbols().getDecimalSeparator()) {
                return i4 > 0 ? ~i : i;
            }
            i++;
        }
        int i6 = i;
        int i7 = i4 + i6;
        if (i7 > length) {
            return ~i6;
        }
        int min = Math.min(i5 + i6, length);
        int i8 = i6;
        while (true) {
            if (i8 >= min) {
                i2 = i8;
                break;
            }
            int i9 = i8 + 1;
            int convertToDigit = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getSymbols().convertToDigit(charSequence.charAt(i8));
            if (convertToDigit >= 0) {
                i3 = (i3 * 10) + convertToDigit;
                i8 = i9;
            } else if (i9 < i7) {
                return ~i6;
            } else {
                i2 = i9 - 1;
            }
        }
        return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(this.field, convertFromFraction(new BigDecimal(i3).movePointLeft(i2 - i6)), i6, i2);
    }

    private BigDecimal convertToFraction(long j) {
        FavouriteTargetAdapter$ItemViewHolder range = this.field.range();
        range.checkValidValue(j, this.field);
        BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
        BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
    }

    private long convertFromFraction(BigDecimal bigDecimal) {
        FavouriteTargetAdapter$ItemViewHolder range = this.field.range();
        BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
        return bigDecimal.multiply(BigDecimal.valueOf(range.getMaximum()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
    }

    public final String toString() {
        String str = this.decimalPoint ? ",DecimalPoint" : "";
        StringBuilder sb = new StringBuilder();
        sb.append("Fraction(");
        sb.append(this.field);
        sb.append(",");
        sb.append(this.minWidth);
        sb.append(",");
        sb.append(this.maxWidth);
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
