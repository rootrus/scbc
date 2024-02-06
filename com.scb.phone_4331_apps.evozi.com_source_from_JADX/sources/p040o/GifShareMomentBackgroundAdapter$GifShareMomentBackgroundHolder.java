package p040o;

import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.format.DateTimeParseException;
import p040o.C6877xfa77ad04;

/* renamed from: o.GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder */
public final class GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder {
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder BASIC_ISO_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4).appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, 2).appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 2).optionalStart().appendOffset("+HHMMss", "Z").toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_DATE).optionalStart().appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_DATE_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().append(ISO_LOCAL_DATE_TIME).optionalStart().appendOffsetId().optionalStart().appendLiteral('[').parseCaseSensitive().appendZoneRegionId().appendLiteral(']').toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_INSTANT = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().appendInstant().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_LOCAL_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4, 10, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 2).toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_LOCAL_DATE_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_DATE).appendLiteral('T').append(ISO_LOCAL_TIME).toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_LOCAL_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE, 2).optionalStart().appendFraction(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, 0, 9, true).toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_OFFSET_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_DATE).appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_OFFSET_DATE_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_DATE_TIME).appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_OFFSET_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_TIME).appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_ORDINAL_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4, 10, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR, 3).optionalStart().appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().append(ISO_LOCAL_TIME).optionalStart().appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_WEEK_DATE = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().appendValue(BillerAdapter$ItemViewHolder.WEEK_BASED_YEAR, 4, 10, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD).appendLiteral("-W").appendValue(BillerAdapter$ItemViewHolder.WEEK_OF_WEEK_BASED_YEAR, 2).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, 1).optionalStart().appendOffsetId().toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ISO_ZONED_DATE_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().append(ISO_OFFSET_DATE_TIME).optionalStart().appendLiteral('[').parseCaseSensitive().appendZoneRegionId().appendLiteral(']').toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    private static final EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ParentViewHolder_ViewBinding> PARSED_EXCESS_DAYS = new EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ParentViewHolder_ViewBinding>() {
        public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding) {
                return ((ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).excessDays;
            }
            return PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ZERO;
        }
    };
    private static final EBillAdapter$EBillHolder<Boolean> PARSED_LEAP_SECOND = new EBillAdapter$EBillHolder<Boolean>() {
        public final Boolean queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding) {
                return Boolean.valueOf(((ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).leapSecond);
            }
            return Boolean.FALSE;
        }
    };
    public static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder RFC_1123_DATE_TIME;
    private final C7022x6c0e8d61 chrono;
    private final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder decimalStyle;
    private final Locale locale;
    private final C7052x1ebac7ce printerParser;
    private final Set<DenominatorAmountAdapter$PencilViewHolder> resolverFields;
    private final QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder resolverStyle;
    private final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        RFC_1123_DATE_TIME = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().parseCaseInsensitive().parseLenient().optionalStart().appendText((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, (Map<Long, String>) hashMap).appendLiteral(", ").optionalEnd().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 1, 2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE).appendLiteral(' ').appendText((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, (Map<Long, String>) hashMap2).appendLiteral(' ').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4).appendLiteral(' ').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR, 2).optionalStart().appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE, 2).optionalEnd().appendLiteral(' ').appendOffset("+HHMM", "GMT").toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART).withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofPattern(String str) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendPattern(str).toFormatter();
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofPattern(String str, Locale locale2) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendPattern(str).toFormatter(locale2);
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofLocalizedDate(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "dateStyle");
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendLocalized(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, (GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) null).toFormatter().withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofLocalizedTime(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "timeStyle");
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendLocalized((GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) null, giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding).toFormatter().withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofLocalizedDateTime(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "dateTimeStyle");
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendLocalized(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding).toFormatter().withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    public static GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder ofLocalizedDateTime(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "dateStyle");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2, "timeStyle");
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendLocalized(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2).toFormatter().withChronology(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    public static final EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ParentViewHolder_ViewBinding> parsedExcessDays() {
        return PARSED_EXCESS_DAYS;
    }

    public static final EBillAdapter$EBillHolder<Boolean> parsedLeapSecond() {
        return PARSED_LEAP_SECOND;
    }

    GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(C7052x1ebac7ce sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, Locale locale2, GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, Set<DenominatorAmountAdapter$PencilViewHolder> set, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        this.printerParser = (C7052x1ebac7ce) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "printerParser");
        this.locale = (Locale) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale2, "locale");
        this.decimalStyle = (GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder, "decimalStyle");
        this.resolverStyle = (QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, "resolverStyle");
        this.resolverFields = set;
        this.chrono = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        this.zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withLocale(Locale locale2) {
        if (this.locale.equals(locale2)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, locale2, this.decimalStyle, this.resolverStyle, this.resolverFields, this.chrono, this.zone);
    }

    public final GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder getDecimalStyle() {
        return this.decimalStyle;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withDecimalStyle(GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) {
        if (this.decimalStyle.equals(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder, this.resolverStyle, this.resolverFields, this.chrono, this.zone);
    }

    public final C7022x6c0e8d61 getChronology() {
        return this.chrono;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withChronology(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(this.chrono, registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, this.resolverFields, registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, this.zone);
    }

    public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
        return this.zone;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(this.zone, languageSettingAdapter$LanguageSettingHolder_ViewBinding)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, this.resolverFields, this.chrono, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder getResolverStyle() {
        return this.resolverStyle;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withResolverStyle(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, "resolverStyle");
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(this.resolverStyle, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, this.resolverFields, this.chrono, this.zone);
    }

    public final Set<DenominatorAmountAdapter$PencilViewHolder> getResolverFields() {
        return this.resolverFields;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withResolverFields(DenominatorAmountAdapter$PencilViewHolder... denominatorAmountAdapter$PencilViewHolderArr) {
        if (denominatorAmountAdapter$PencilViewHolderArr == null) {
            return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, (Set<DenominatorAmountAdapter$PencilViewHolder>) null, this.chrono, this.zone);
        }
        HashSet hashSet = new HashSet(Arrays.asList(denominatorAmountAdapter$PencilViewHolderArr));
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(this.resolverFields, hashSet)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, Collections.unmodifiableSet(hashSet), this.chrono, this.zone);
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder withResolverFields(Set<DenominatorAmountAdapter$PencilViewHolder> set) {
        if (set == null) {
            return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, (Set<DenominatorAmountAdapter$PencilViewHolder>) null, this.chrono, this.zone);
        }
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(this.resolverFields, set)) {
            return this;
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(this.printerParser, this.locale, this.decimalStyle, this.resolverStyle, Collections.unmodifiableSet(new HashSet(set)), this.chrono, this.zone);
    }

    public final String format(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        StringBuilder sb = new StringBuilder(32);
        formatTo(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, sb);
        return sb.toString();
    }

    public final void formatTo(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, Appendable appendable) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(appendable, "appendable");
        try {
            GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder = new GiftTutorialViewPagerAdapter$TutorialItemHolder(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, this);
            if (appendable instanceof StringBuilder) {
                this.printerParser.print(giftTutorialViewPagerAdapter$TutorialItemHolder, (StringBuilder) appendable);
                return;
            }
            StringBuilder sb = new StringBuilder(32);
            this.printerParser.print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb);
            appendable.append(sb);
        } catch (IOException e) {
            throw new DateTimeException(e.getMessage(), e);
        }
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding parse(CharSequence charSequence) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        try {
            return parseToBuilder(charSequence, (ParsePosition) null).resolve(this.resolverStyle, this.resolverFields);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw createError(charSequence, e2);
        }
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding parse(CharSequence charSequence, ParsePosition parsePosition) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(parsePosition, "position");
        try {
            return parseToBuilder(charSequence, parsePosition).resolve(this.resolverStyle, this.resolverFields);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw createError(charSequence, e3);
        }
    }

    public final <T> T parse(CharSequence charSequence, EBillAdapter$EBillHolder<T> eBillAdapter$EBillHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(eBillAdapter$EBillHolder, "type");
        try {
            return parseToBuilder(charSequence, (ParsePosition) null).resolve(this.resolverStyle, this.resolverFields).build(eBillAdapter$EBillHolder);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw createError(charSequence, e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[ExcHandler: DateTimeParseException (r5v2 'e' org.threeten.bp.format.DateTimeParseException A[CUSTOM_DECLARE]), Splitter:B:3:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding parseBest(java.lang.CharSequence r5, p040o.EBillAdapter$EBillHolder<?>... r6) {
        /*
            r4 = this;
            java.lang.String r0 = "text"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r5, r0)
            java.lang.String r0 = "types"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r6, r0)
            int r0 = r6.length
            r1 = 2
            if (r0 < r1) goto L_0x0050
            r0 = 0
            o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding r0 = r4.parseToBuilder(r5, r0)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder r1 = r4.resolverStyle     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.util.Set<o.DenominatorAmountAdapter$PencilViewHolder> r2 = r4.resolverFields     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding r0 = r0.resolve(r1, r2)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            int r1 = r6.length     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            r2 = 0
        L_0x001f:
            if (r2 >= r1) goto L_0x002d
            r3 = r6[r2]     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.lang.Object r3 = r0.build(r3)     // Catch:{ RuntimeException -> 0x002a, DateTimeParseException -> 0x004e }
            o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding r3 = (p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) r3     // Catch:{ RuntimeException -> 0x002a, DateTimeParseException -> 0x004e }
            return r3
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x002d:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            r1.<init>()     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.lang.String r2 = "Unable to convert parsed text to any specified type: "
            r1.append(r2)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            r1.append(r6)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            java.lang.String r6 = r1.toString()     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            r0.<init>(r6)     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
            throw r0     // Catch:{ DateTimeParseException -> 0x004e, RuntimeException -> 0x0048 }
        L_0x0048:
            r6 = move-exception
            org.threeten.bp.format.DateTimeParseException r5 = r4.createError(r5, r6)
            throw r5
        L_0x004e:
            r5 = move-exception
            throw r5
        L_0x0050:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "At least two types must be specified"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parseBest(java.lang.CharSequence, o.EBillAdapter$EBillHolder[]):o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding");
    }

    private DateTimeParseException createError(CharSequence charSequence, RuntimeException runtimeException) {
        String str;
        if (charSequence.length() > 64) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence.subSequence(0, 64).toString());
            sb.append("...");
            str = sb.toString();
        } else {
            str = charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Text '");
        sb2.append(str);
        sb2.append("' could not be parsed: ");
        sb2.append(runtimeException.getMessage());
        return new DateTimeParseException(sb2.toString(), charSequence, 0, runtimeException);
    }

    /* access modifiers changed from: private */
    public ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding parseToBuilder(CharSequence charSequence, ParsePosition parsePosition) {
        String str;
        ParsePosition parsePosition2 = parsePosition != null ? parsePosition : new ParsePosition(0);
        C6877xfa77ad04.IconCompatParcelizer parseUnresolved0 = parseUnresolved0(charSequence, parsePosition2);
        if (parseUnresolved0 != null && parsePosition2.getErrorIndex() < 0 && (parsePosition != null || parsePosition2.getIndex() >= charSequence.length())) {
            return parseUnresolved0.toBuilder();
        }
        if (charSequence.length() > 64) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence.subSequence(0, 64).toString());
            sb.append("...");
            str = sb.toString();
        } else {
            str = charSequence.toString();
        }
        if (parsePosition2.getErrorIndex() >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Text '");
            sb2.append(str);
            sb2.append("' could not be parsed at index ");
            sb2.append(parsePosition2.getErrorIndex());
            throw new DateTimeParseException(sb2.toString(), charSequence, parsePosition2.getErrorIndex());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Text '");
        sb3.append(str);
        sb3.append("' could not be parsed, unparsed text found at index ");
        sb3.append(parsePosition2.getIndex());
        throw new DateTimeParseException(sb3.toString(), charSequence, parsePosition2.getIndex());
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding parseUnresolved(CharSequence charSequence, ParsePosition parsePosition) {
        return parseUnresolved0(charSequence, parsePosition);
    }

    /* access modifiers changed from: private */
    public C6877xfa77ad04.IconCompatParcelizer parseUnresolved0(CharSequence charSequence, ParsePosition parsePosition) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(parsePosition, "position");
        C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding = new C6877xfa77ad04(this);
        int parse = this.printerParser.parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, parsePosition.getIndex());
        if (parse < 0) {
            parsePosition.setErrorIndex(~parse);
            return null;
        }
        parsePosition.setIndex(parse);
        return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.toParsed();
    }

    /* access modifiers changed from: package-private */
    public final C7052x1ebac7ce toPrinterParser(boolean z) {
        return this.printerParser.withOptional(z);
    }

    public final Format toFormat() {
        return new C10398xc15347c0(this, (EBillAdapter$EBillHolder<?>) null);
    }

    public final Format toFormat(EBillAdapter$EBillHolder<?> eBillAdapter$EBillHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(eBillAdapter$EBillHolder, SearchIntents.EXTRA_QUERY);
        return new C10398xc15347c0(this, eBillAdapter$EBillHolder);
    }

    public final String toString() {
        String obj = this.printerParser.toString();
        return !obj.startsWith("[") ? obj.substring(1, obj.length() - 1) : obj;
    }
}
