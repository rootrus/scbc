package p040o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding */
final class C6877xfa77ad04 {
    private boolean caseSensitive;
    private Locale locale;
    private C7022x6c0e8d61 overrideChronology;
    /* access modifiers changed from: private */
    public LanguageSettingAdapter$LanguageSettingHolder_ViewBinding overrideZone;
    private final ArrayList<IconCompatParcelizer> parsed;
    private boolean strict;
    private GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder symbols;

    C6877xfa77ad04(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        this.caseSensitive = true;
        this.strict = true;
        this.parsed = new ArrayList<>();
        this.locale = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getLocale();
        this.symbols = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getDecimalStyle();
        this.overrideChronology = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getChronology();
        this.overrideZone = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getZone();
        this.parsed.add(new IconCompatParcelizer());
    }

    C6877xfa77ad04(Locale locale2, GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        this.caseSensitive = true;
        this.strict = true;
        ArrayList<IconCompatParcelizer> arrayList = new ArrayList<>();
        this.parsed = arrayList;
        this.locale = locale2;
        this.symbols = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder;
        this.overrideChronology = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        this.overrideZone = null;
        arrayList.add(new IconCompatParcelizer());
    }

    C6877xfa77ad04(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding) {
        this.caseSensitive = true;
        this.strict = true;
        ArrayList<IconCompatParcelizer> arrayList = new ArrayList<>();
        this.parsed = arrayList;
        this.locale = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.locale;
        this.symbols = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.symbols;
        this.overrideChronology = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.overrideChronology;
        this.overrideZone = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.overrideZone;
        this.caseSensitive = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.caseSensitive;
        this.strict = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.strict;
        arrayList.add(new IconCompatParcelizer());
    }

    /* access modifiers changed from: package-private */
    public final C6877xfa77ad04 copy() {
        return new C6877xfa77ad04(this);
    }

    /* access modifiers changed from: package-private */
    public final Locale getLocale() {
        return this.locale;
    }

    /* access modifiers changed from: package-private */
    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder getSymbols() {
        return this.symbols;
    }

    /* access modifiers changed from: package-private */
    public final C7022x6c0e8d61 getEffectiveChronology() {
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = currentParsed().chrono;
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 = this.overrideChronology;
        return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 == null ? RemittanceCountryListAdapter$CountryViewHolder.INSTANCE : registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2;
    }

    /* access modifiers changed from: package-private */
    public final boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    /* access modifiers changed from: package-private */
    public final void setCaseSensitive(boolean z) {
        this.caseSensitive = z;
    }

    /* access modifiers changed from: package-private */
    public final boolean subSequenceEquals(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (isCaseSensitive()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean charEquals(char c, char c2) {
        if (isCaseSensitive()) {
            return c == c2;
        }
        return charEqualsIgnoreCase(c, c2);
    }

    static boolean charEqualsIgnoreCase(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* access modifiers changed from: package-private */
    public final boolean isStrict() {
        return this.strict;
    }

    /* access modifiers changed from: package-private */
    public final void setStrict(boolean z) {
        this.strict = z;
    }

    /* access modifiers changed from: package-private */
    public final void startOptional() {
        this.parsed.add(currentParsed().copy());
    }

    /* access modifiers changed from: package-private */
    public final void endOptional(boolean z) {
        if (z) {
            ArrayList<IconCompatParcelizer> arrayList = this.parsed;
            arrayList.remove(arrayList.size() - 2);
            return;
        }
        ArrayList<IconCompatParcelizer> arrayList2 = this.parsed;
        arrayList2.remove(arrayList2.size() - 1);
    }

    private IconCompatParcelizer currentParsed() {
        ArrayList<IconCompatParcelizer> arrayList = this.parsed;
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final Long getParsed(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return currentParsed().fieldValues.get(denominatorAmountAdapter$PencilViewHolder);
    }

    /* access modifiers changed from: package-private */
    public final int setParsedField(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j, int i, int i2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        Long put = currentParsed().fieldValues.put(denominatorAmountAdapter$PencilViewHolder, Long.valueOf(j));
        return (put == null || put.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: package-private */
    public final void setParsed(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, "chrono");
        IconCompatParcelizer currentParsed = currentParsed();
        currentParsed.chrono = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        if (currentParsed.callbacks != null) {
            ArrayList<Object[]> arrayList = new ArrayList<>(currentParsed.callbacks);
            currentParsed.callbacks.clear();
            for (Object[] objArr : arrayList) {
                ((C7058x42238fcc) objArr[0]).setValue(this, ((Long) objArr[1]).longValue(), ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void addChronologyChangedParser(C7058x42238fcc sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaSessionCompat$Token, long j, int i, int i2) {
        IconCompatParcelizer currentParsed = currentParsed();
        if (currentParsed.callbacks == null) {
            currentParsed.callbacks = new ArrayList(2);
        }
        currentParsed.callbacks.add(new Object[]{sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaSessionCompat$Token, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* access modifiers changed from: package-private */
    public final void setParsed(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        currentParsed().zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
    }

    /* access modifiers changed from: package-private */
    public final void setParsedLeapSecond() {
        currentParsed().leapSecond = true;
    }

    /* access modifiers changed from: package-private */
    public final IconCompatParcelizer toParsed() {
        return currentParsed();
    }

    public final String toString() {
        return currentParsed().toString();
    }

    /* renamed from: o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding$IconCompatParcelizer */
    final class IconCompatParcelizer extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding {
        List<Object[]> callbacks;
        C7022x6c0e8d61 chrono;
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding excessDays;
        final Map<DenominatorAmountAdapter$PencilViewHolder, Long> fieldValues;
        boolean leapSecond;
        LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

        private IconCompatParcelizer() {
            this.chrono = null;
            this.zone = null;
            this.fieldValues = new HashMap();
            this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ZERO;
        }

        /* access modifiers changed from: protected */
        public final IconCompatParcelizer copy() {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            iconCompatParcelizer.chrono = this.chrono;
            iconCompatParcelizer.zone = this.zone;
            iconCompatParcelizer.fieldValues.putAll(this.fieldValues);
            iconCompatParcelizer.leapSecond = this.leapSecond;
            return iconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fieldValues.toString());
            sb.append(",");
            sb.append(this.chrono);
            sb.append(",");
            sb.append(this.zone);
            return sb.toString();
        }

        public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
            return this.fieldValues.containsKey(denominatorAmountAdapter$PencilViewHolder);
        }

        public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
            if (this.fieldValues.containsKey(denominatorAmountAdapter$PencilViewHolder)) {
                return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(this.fieldValues.get(denominatorAmountAdapter$PencilViewHolder).longValue());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }

        public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
            if (this.fieldValues.containsKey(denominatorAmountAdapter$PencilViewHolder)) {
                return this.fieldValues.get(denominatorAmountAdapter$PencilViewHolder).longValue();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }

        public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
            if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
                return this.chrono;
            }
            if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone()) {
                return this.zone;
            }
            return super.query(eBillAdapter$EBillHolder);
        }

        /* access modifiers changed from: package-private */
        public final ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding toBuilder() {
            ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding = new ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding();
            scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.fieldValues.putAll(this.fieldValues);
            scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.chrono = C6877xfa77ad04.this.getEffectiveChronology();
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = this.zone;
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding != null) {
                scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
            } else {
                scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.zone = C6877xfa77ad04.this.overrideZone;
            }
            scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.leapSecond = this.leapSecond;
            scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding.excessDays = this.excessDays;
            return scheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setLocale(Locale locale2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale2, "locale");
        this.locale = locale2;
    }
}
