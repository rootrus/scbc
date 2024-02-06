package p040o;

import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder */
public final class GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder {
    private static final ConcurrentMap<Locale, GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder> CACHE = new ConcurrentHashMap(16, 0.75f, 2);
    public static final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder STANDARD = new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder('0', '+', '-', '.');
    private final char decimalSeparator;
    private final char negativeSign;
    private final char positiveSign;
    private final char zeroDigit;

    public static Set<Locale> getAvailableLocales() {
        return new HashSet(Arrays.asList(DecimalFormatSymbols.getAvailableLocales()));
    }

    public static GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder ofDefaultLocale() {
        return m3514of(Locale.getDefault());
    }

    /* renamed from: of */
    public static GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder m3514of(Locale locale) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder = (GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) CACHE.get(locale);
        if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder != null) {
            return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder;
        }
        CACHE.putIfAbsent(locale, create(locale));
        return (GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) CACHE.get(locale);
    }

    private static GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder create(Locale locale) {
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit2 = instance.getZeroDigit();
        char minusSign = instance.getMinusSign();
        char decimalSeparator2 = instance.getDecimalSeparator();
        if (zeroDigit2 == '0' && minusSign == '-' && decimalSeparator2 == '.') {
            return STANDARD;
        }
        return new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(zeroDigit2, '+', minusSign, decimalSeparator2);
    }

    private GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(char c, char c2, char c3, char c4) {
        this.zeroDigit = c;
        this.positiveSign = c2;
        this.negativeSign = c3;
        this.decimalSeparator = c4;
    }

    public final char getZeroDigit() {
        return this.zeroDigit;
    }

    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder withZeroDigit(char c) {
        if (c == this.zeroDigit) {
            return this;
        }
        return new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(c, this.positiveSign, this.negativeSign, this.decimalSeparator);
    }

    public final char getPositiveSign() {
        return this.positiveSign;
    }

    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder withPositiveSign(char c) {
        if (c == this.positiveSign) {
            return this;
        }
        return new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(this.zeroDigit, c, this.negativeSign, this.decimalSeparator);
    }

    public final char getNegativeSign() {
        return this.negativeSign;
    }

    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder withNegativeSign(char c) {
        if (c == this.negativeSign) {
            return this;
        }
        return new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(this.zeroDigit, this.positiveSign, c, this.decimalSeparator);
    }

    public final char getDecimalSeparator() {
        return this.decimalSeparator;
    }

    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder withDecimalSeparator(char c) {
        if (c == this.decimalSeparator) {
            return this;
        }
        return new GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder(this.zeroDigit, this.positiveSign, this.negativeSign, c);
    }

    /* access modifiers changed from: package-private */
    public final int convertToDigit(char c) {
        int i = c - this.zeroDigit;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final String convertNumberToI18N(String str) {
        char c = this.zeroDigit;
        if (c == '0') {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] + (c - '0'));
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder)) {
            return false;
        }
        GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder = (GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) obj;
        if (this.zeroDigit == giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder.zeroDigit && this.positiveSign == giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder.positiveSign && this.negativeSign == giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder.negativeSign && this.decimalSeparator == giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder.decimalSeparator) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zeroDigit + this.positiveSign + this.negativeSign + this.decimalSeparator;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecimalStyle[");
        sb.append(this.zeroDigit);
        sb.append(this.positiveSign);
        sb.append(this.negativeSign);
        sb.append(this.decimalSeparator);
        sb.append("]");
        return sb.toString();
    }
}
