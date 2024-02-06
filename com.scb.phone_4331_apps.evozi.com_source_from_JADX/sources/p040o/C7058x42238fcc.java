package p040o;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import org.threeten.p041bp.DateTimeException;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaSessionCompat$Token */
final class C7058x42238fcc extends SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat {
    static final QuickAccountSelectAdapter$UnselectedHolder BASE_DATE = QuickAccountSelectAdapter$UnselectedHolder.m3547of((int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1, 1);
    private final PromptPayMobileListAdapter$PromptPayListView baseDate;
    private final int baseValue;

    C7058x42238fcc(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, int i3, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        super(denominatorAmountAdapter$PencilViewHolder, i, i2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
        if (i <= 0 || i > 10) {
            StringBuilder sb = new StringBuilder();
            sb.append("The width must be from 1 to 10 inclusive but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= 0 || i2 > 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The maxWidth must be from 1 to 10 inclusive but was ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 >= i) {
            if (promptPayMobileListAdapter$PromptPayListView == null) {
                long j = (long) i3;
                if (!denominatorAmountAdapter$PencilViewHolder.range().isValidValue(j)) {
                    throw new IllegalArgumentException("The base value must be within the range of the field");
                } else if (j + ((long) EXCEED_POINTS[i]) > 2147483647L) {
                    throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                }
            }
            this.baseValue = i3;
            this.baseDate = promptPayMobileListAdapter$PromptPayListView;
        } else {
            throw new IllegalArgumentException("The maxWidth must be greater than the width");
        }
    }

    private C7058x42238fcc(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, int i3, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView, int i4) {
        super(denominatorAmountAdapter$PencilViewHolder, i, i2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE, i4);
        this.baseValue = i3;
        this.baseDate = promptPayMobileListAdapter$PromptPayListView;
    }

    /* access modifiers changed from: package-private */
    public final long getValue(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, long j) {
        long abs = Math.abs(j);
        int i = this.baseValue;
        if (this.baseDate != null) {
            i = C7022x6c0e8d61.from(giftTutorialViewPagerAdapter$TutorialItemHolder.getTemporal()).date(this.baseDate).get(this.field);
        }
        if (j < ((long) i) || j >= ((long) (i + EXCEED_POINTS[this.minWidth]))) {
            return abs % ((long) EXCEED_POINTS[this.maxWidth]);
        }
        return abs % ((long) EXCEED_POINTS[this.minWidth]);
    }

    /* access modifiers changed from: package-private */
    public final int setValue(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, long j, int i, int i2) {
        int i3 = this.baseValue;
        if (this.baseDate != null) {
            i3 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getEffectiveChronology().date(this.baseDate).get(this.field);
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.addChronologyChangedParser(this, j, i, i2);
        }
        if (i2 - i == this.minWidth && j >= 0) {
            long j2 = (long) EXCEED_POINTS[this.minWidth];
            long j3 = (long) i3;
            long j4 = j3 - (j3 % j2);
            j = i3 > 0 ? j4 + j : j4 - j;
            if (j < j3) {
                j += j2;
            }
        }
        return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(this.field, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat withFixedWidth() {
        if (this.subsequentWidth == -1) {
            return this;
        }
        return new C7058x42238fcc(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, -1);
    }

    /* access modifiers changed from: package-private */
    public final C7058x42238fcc withSubsequentWidth(int i) {
        return new C7058x42238fcc(this.field, this.minWidth, this.maxWidth, this.baseValue, this.baseDate, this.subsequentWidth + i);
    }

    /* access modifiers changed from: package-private */
    public final boolean isFixedWidth(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding) {
        if (!giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isStrict()) {
            return false;
        }
        return super.isFixedWidth(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReducedValue(");
        sb.append(this.field);
        sb.append(",");
        sb.append(this.minWidth);
        sb.append(",");
        sb.append(this.maxWidth);
        sb.append(",");
        Object obj = this.baseDate;
        if (obj == null) {
            obj = Integer.valueOf(this.baseValue);
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
