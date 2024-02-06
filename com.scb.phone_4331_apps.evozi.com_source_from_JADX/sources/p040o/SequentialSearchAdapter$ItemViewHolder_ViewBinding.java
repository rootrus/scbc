package p040o;

import com.airbnb.lottie.utils.Utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.threeten.p041bp.DateTimeException;
import p040o.GiftingBaseListAdapter$GiftViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding */
public final class SequentialSearchAdapter$ItemViewHolder_ViewBinding {
    private static final Map<Character, DenominatorAmountAdapter$PencilViewHolder> FIELD_MAP;
    static final Comparator<String> LENGTH_SORT = new Comparator<String>() {
        public final int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    };
    private static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> QUERY_REGION_ONLY = new EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding>() {
        public LanguageSettingAdapter$LanguageSettingHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId());
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding == null || (languageSettingAdapter$LanguageSettingHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding)) {
                return null;
            }
            return languageSettingAdapter$LanguageSettingHolder_ViewBinding;
        }
    };
    private SequentialSearchAdapter$ItemViewHolder_ViewBinding active;
    private final boolean optional;
    private char padNextChar;
    private int padNextWidth;
    private final SequentialSearchAdapter$ItemViewHolder_ViewBinding parent;
    private final List<IconCompatParcelizer> printerParsers;
    private int valueParserIndex;

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$IconCompatParcelizer */
    interface IconCompatParcelizer {
        int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i);

        boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb);
    }

    static {
        HashMap hashMap = new HashMap();
        FIELD_MAP = hashMap;
        hashMap.put('G', TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
        FIELD_MAP.put('y', TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
        FIELD_MAP.put('u', TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
        FIELD_MAP.put('Q', BillerAdapter$ItemViewHolder.QUARTER_OF_YEAR);
        FIELD_MAP.put('q', BillerAdapter$ItemViewHolder.QUARTER_OF_YEAR);
        FIELD_MAP.put('M', TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
        FIELD_MAP.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
        FIELD_MAP.put('D', TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR);
        FIELD_MAP.put('d', TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
        FIELD_MAP.put('F', TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        FIELD_MAP.put('E', TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
        FIELD_MAP.put('c', TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
        FIELD_MAP.put('e', TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
        FIELD_MAP.put('a', TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY);
        FIELD_MAP.put('H', TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY);
        FIELD_MAP.put('k', TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY);
        FIELD_MAP.put('K', TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM);
        FIELD_MAP.put('h', TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM);
        FIELD_MAP.put('m', TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR);
        FIELD_MAP.put('s', TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE);
        FIELD_MAP.put('S', TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
        FIELD_MAP.put('A', TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY);
        FIELD_MAP.put('n', TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
        FIELD_MAP.put('N', TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY);
    }

    public static String getLocalizedDateTimePattern(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, Locale locale) {
        DateFormat dateFormat;
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, "chrono");
        if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding == null && giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding == null) {
            dateFormat = DateFormat.getTimeInstance(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2.ordinal(), locale);
        } else if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2 != null) {
            dateFormat = DateFormat.getDateTimeInstance(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.ordinal(), giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2.ordinal(), locale);
        } else {
            dateFormat = DateFormat.getDateInstance(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.ordinal(), locale);
        }
        if (dateFormat instanceof SimpleDateFormat) {
            return ((SimpleDateFormat) dateFormat).toPattern();
        }
        throw new IllegalArgumentException("Unable to determine pattern");
    }

    public SequentialSearchAdapter$ItemViewHolder_ViewBinding() {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = null;
        this.optional = false;
    }

    private SequentialSearchAdapter$ItemViewHolder_ViewBinding(SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding, boolean z) {
        this.active = this;
        this.printerParsers = new ArrayList();
        this.valueParserIndex = -1;
        this.parent = sequentialSearchAdapter$ItemViewHolder_ViewBinding;
        this.optional = z;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding parseCaseSensitive() {
        appendInternal(C7056xf304cc17.SENSITIVE);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding parseCaseInsensitive() {
        appendInternal(C7056xf304cc17.INSENSITIVE);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding parseStrict() {
        appendInternal(C7056xf304cc17.STRICT);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding parseLenient() {
        appendInternal(C7056xf304cc17.LENIENT);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding parseDefaulting(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        appendInternal(new read(denominatorAmountAdapter$PencilViewHolder, j));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValue(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        appendValue(new RatingCompat(denominatorAmountAdapter$PencilViewHolder, 1, 19, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValue(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        if (i <= 0 || i > 19) {
            StringBuilder sb = new StringBuilder();
            sb.append("The width must be from 1 to 19 inclusive but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        appendValue(new RatingCompat(denominatorAmountAdapter$PencilViewHolder, i, i, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValue(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding) {
        if (i == i2 && moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding == MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE) {
            return appendValue(denominatorAmountAdapter$PencilViewHolder, i2);
        }
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding, "signStyle");
        if (i <= 0 || i > 19) {
            StringBuilder sb = new StringBuilder();
            sb.append("The minimum width must be from 1 to 19 inclusive but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= 0 || i2 > 19) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The maximum width must be from 1 to 19 inclusive but was ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 >= i) {
            appendValue(new RatingCompat(denominatorAmountAdapter$PencilViewHolder, i, i2, moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding));
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The maximum width must exceed or equal the minimum width but ");
            sb3.append(i2);
            sb3.append(" < ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValueReduced(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, int i3) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        appendValue((RatingCompat) new C7058x42238fcc(denominatorAmountAdapter$PencilViewHolder, i, i2, i3, (PromptPayMobileListAdapter$PromptPayListView) null));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValueReduced(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(promptPayMobileListAdapter$PromptPayListView, "baseDate");
        appendValue((RatingCompat) new C7058x42238fcc(denominatorAmountAdapter$PencilViewHolder, i, i2, 0, promptPayMobileListAdapter$PromptPayListView));
        return this;
    }

    private SequentialSearchAdapter$ItemViewHolder_ViewBinding appendValue(RatingCompat ratingCompat) {
        RatingCompat ratingCompat2;
        SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding = this.active;
        int i = sequentialSearchAdapter$ItemViewHolder_ViewBinding.valueParserIndex;
        if (i < 0 || !(sequentialSearchAdapter$ItemViewHolder_ViewBinding.printerParsers.get(i) instanceof RatingCompat)) {
            this.active.valueParserIndex = appendInternal(ratingCompat);
        } else {
            SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding2 = this.active;
            int i2 = sequentialSearchAdapter$ItemViewHolder_ViewBinding2.valueParserIndex;
            RatingCompat ratingCompat3 = (RatingCompat) sequentialSearchAdapter$ItemViewHolder_ViewBinding2.printerParsers.get(i2);
            if (ratingCompat.minWidth == ratingCompat.maxWidth && ratingCompat.signStyle == MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE) {
                ratingCompat2 = ratingCompat3.withSubsequentWidth(ratingCompat.maxWidth);
                appendInternal(ratingCompat.withFixedWidth());
                this.active.valueParserIndex = i2;
            } else {
                ratingCompat2 = ratingCompat3.withFixedWidth();
                this.active.valueParserIndex = appendInternal(ratingCompat);
            }
            this.active.printerParsers.set(i2, ratingCompat2);
        }
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendFraction(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, boolean z) {
        appendInternal(new C7054xcb86c5fc(denominatorAmountAdapter$PencilViewHolder, i, i2, z));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendText(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL);
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendText(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, "textStyle");
        appendInternal(new C7051x49ed55a7(denominatorAmountAdapter$PencilViewHolder, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, GiftingBaseListAdapter$GiftViewHolder.getInstance()));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendText(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, Map<Long, String> map) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(map, "textLookup");
        final GiftingBaseListAdapter$GiftViewHolder_ViewBinding.IconCompatParcelizer iconCompatParcelizer = new GiftingBaseListAdapter$GiftViewHolder_ViewBinding.IconCompatParcelizer(Collections.singletonMap(C7010xce0f74d9.FULL, new LinkedHashMap(map)));
        appendInternal(new C7051x49ed55a7(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL, new GiftingBaseListAdapter$GiftViewHolder() {
            public final String getText(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
                return iconCompatParcelizer.getText(j, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding);
            }

            public final Iterator<Map.Entry<String, Long>> getTextIterator(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
                return iconCompatParcelizer.getTextIterator(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding);
            }
        }));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendInstant() {
        appendInternal(new MediaMetadataCompat(-2));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendInstant(int i) {
        if (i < -1 || i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid fractional digits: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        appendInternal(new MediaMetadataCompat(i));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendOffsetId() {
        appendInternal(ParcelableVolumeInfo.INSTANCE_ID);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendOffset(String str, String str2) {
        appendInternal(new ParcelableVolumeInfo(str2, str));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendLocalizedOffset(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, "style");
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding == C7010xce0f74d9.FULL || questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding == C7010xce0f74d9.SHORT) {
            appendInternal(new MediaDescriptionCompat(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendZoneId() {
        appendInternal(new PlaybackStateCompat(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId(), "ZoneId()"));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendZoneRegionId() {
        appendInternal(new PlaybackStateCompat(QUERY_REGION_ONLY, "ZoneRegionId()"));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendZoneOrOffsetId() {
        appendInternal(new PlaybackStateCompat(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone(), "ZoneOrOffsetId()"));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendZoneText(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
        appendInternal(new setHasDecor(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendZoneText(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Set<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> set) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(set, "preferredZones");
        appendInternal(new setHasDecor(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendChronologyId() {
        appendInternal(new write((C7010xce0f74d9) null));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendChronologyText(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, "textStyle");
        appendInternal(new write(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendLocalized(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2) {
        if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding == null && giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        appendInternal(new C10422x137dcaef(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendLiteral(char c) {
        appendInternal(new C7053xeaf271d(c));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendLiteral(String str) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                appendInternal(new C7053xeaf271d(str.charAt(0)));
            } else {
                appendInternal(new C7057x45fdd99a(str));
            }
        }
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding append(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        appendInternal(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.toPrinterParser(false));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendOptional(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        appendInternal(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.toPrinterParser(true));
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding appendPattern(String str) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "pattern");
        parsePattern(str);
        return this;
    }

    private void parsePattern(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i3 = i2 + 1;
                while (i3 < str.length() && str.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (charAt == 'p') {
                    if (i3 >= str.length() || (((charAt = str.charAt(i3)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i = i4;
                        i4 = 0;
                    } else {
                        int i5 = i3 + 1;
                        while (i5 < str.length() && str.charAt(i5) == charAt) {
                            i5++;
                        }
                        i = i5 - i3;
                        i3 = i5;
                    }
                    if (i4 != 0) {
                        padNext(i4);
                        i4 = i;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Pad letter 'p' must be followed by valid pad pattern: ");
                        sb.append(str);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder = FIELD_MAP.get(Character.valueOf(charAt));
                if (denominatorAmountAdapter$PencilViewHolder != null) {
                    parseField(charAt, i4, denominatorAmountAdapter$PencilViewHolder);
                } else if (charAt == 'z') {
                    if (i4 > 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Too many pattern letters: ");
                        sb2.append(charAt);
                        throw new IllegalArgumentException(sb2.toString());
                    } else if (i4 == 4) {
                        appendZoneText(C7010xce0f74d9.FULL);
                    } else {
                        appendZoneText(C7010xce0f74d9.SHORT);
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i4 < 4) {
                            appendOffset("+HHMM", str2);
                        } else if (i4 == 4) {
                            appendLocalizedOffset(C7010xce0f74d9.FULL);
                        } else if (i4 == 5) {
                            appendOffset("+HH:MM:ss", "Z");
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Too many pattern letters: ");
                            sb3.append(charAt);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    } else if (charAt == 'O') {
                        if (i4 == 1) {
                            appendLocalizedOffset(C7010xce0f74d9.SHORT);
                        } else if (i4 == 4) {
                            appendLocalizedOffset(C7010xce0f74d9.FULL);
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Pattern letter count must be 1 or 4: ");
                            sb4.append(charAt);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                    } else if (charAt == 'X') {
                        if (i4 <= 5) {
                            appendOffset(ParcelableVolumeInfo.PATTERNS[i4 + (i4 == 1 ? 0 : 1)], "Z");
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Too many pattern letters: ");
                            sb5.append(charAt);
                            throw new IllegalArgumentException(sb5.toString());
                        }
                    } else if (charAt == 'x') {
                        if (i4 <= 5) {
                            if (i4 == 1) {
                                str2 = "+00";
                            } else if (i4 % 2 != 0) {
                                str2 = "+00:00";
                            }
                            appendOffset(ParcelableVolumeInfo.PATTERNS[i4 + (i4 == 1 ? 0 : 1)], str2);
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Too many pattern letters: ");
                            sb6.append(charAt);
                            throw new IllegalArgumentException(sb6.toString());
                        }
                    } else if (charAt == 'W') {
                        if (i4 <= 1) {
                            appendInternal(new Keep('W', i4));
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Too many pattern letters: ");
                            sb7.append(charAt);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                    } else if (charAt == 'w') {
                        if (i4 <= 2) {
                            appendInternal(new Keep('w', i4));
                        } else {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("Too many pattern letters: ");
                            sb8.append(charAt);
                            throw new IllegalArgumentException(sb8.toString());
                        }
                    } else if (charAt == 'Y') {
                        appendInternal(new Keep('Y', i4));
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Unknown pattern letter: ");
                        sb9.append(charAt);
                        throw new IllegalArgumentException(sb9.toString());
                    }
                } else if (i4 == 2) {
                    appendZoneId();
                } else {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Pattern letter count must be 2: ");
                    sb10.append(charAt);
                    throw new IllegalArgumentException(sb10.toString());
                }
                i2 = i3 - 1;
            } else if (charAt == '\'') {
                int i6 = i2 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 >= str.length() || str.charAt(i8) != '\'') {
                            break;
                        }
                        i7 = i8;
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    String substring = str.substring(i6, i7);
                    if (substring.length() == 0) {
                        appendLiteral('\'');
                    } else {
                        appendLiteral(substring.replace("''", "'"));
                    }
                    i2 = i7;
                } else {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("Pattern ends with an incomplete string literal: ");
                    sb11.append(str);
                    throw new IllegalArgumentException(sb11.toString());
                }
            } else if (charAt == '[') {
                optionalStart();
            } else if (charAt == ']') {
                if (this.active.parent != null) {
                    optionalEnd();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                StringBuilder sb12 = new StringBuilder();
                sb12.append("Pattern includes reserved character: '");
                sb12.append(charAt);
                sb12.append("'");
                throw new IllegalArgumentException(sb12.toString());
            } else {
                appendLiteral(charAt);
            }
            i2++;
        }
    }

    private void parseField(char c, int i, DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (c != 'Q') {
            if (c == 'S') {
                appendFraction(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, i, i, false);
                return;
            } else if (c != 'a') {
                if (!(c == 'h' || c == 'k' || c == 'm')) {
                    if (c != 'q') {
                        if (c != 's') {
                            if (c != 'u' && c != 'y') {
                                switch (c) {
                                    case 'D':
                                        if (i == 1) {
                                            appendValue(denominatorAmountAdapter$PencilViewHolder);
                                            return;
                                        } else if (i <= 3) {
                                            appendValue(denominatorAmountAdapter$PencilViewHolder, i);
                                            return;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Too many pattern letters: ");
                                            sb.append(c);
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                    case 'E':
                                    case 'G':
                                        if (i == 1 || i == 2 || i == 3) {
                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT);
                                            return;
                                        } else if (i == 4) {
                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL);
                                            return;
                                        } else if (i == 5) {
                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.NARROW);
                                            return;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Too many pattern letters: ");
                                            sb2.append(c);
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                    case 'F':
                                        if (i == 1) {
                                            appendValue(denominatorAmountAdapter$PencilViewHolder);
                                            return;
                                        }
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Too many pattern letters: ");
                                        sb3.append(c);
                                        throw new IllegalArgumentException(sb3.toString());
                                    case 'H':
                                        break;
                                    default:
                                        switch (c) {
                                            case 'K':
                                                break;
                                            case 'L':
                                                break;
                                            case 'M':
                                                break;
                                            default:
                                                switch (c) {
                                                    case 'c':
                                                        if (i == 1) {
                                                            appendInternal(new Keep('c', i));
                                                            return;
                                                        } else if (i == 2) {
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append("Invalid number of pattern letters: ");
                                                            sb4.append(c);
                                                            throw new IllegalArgumentException(sb4.toString());
                                                        } else if (i == 3) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT_STANDALONE);
                                                            return;
                                                        } else if (i == 4) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL_STANDALONE);
                                                            return;
                                                        } else if (i == 5) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.NARROW_STANDALONE);
                                                            return;
                                                        } else {
                                                            StringBuilder sb5 = new StringBuilder();
                                                            sb5.append("Too many pattern letters: ");
                                                            sb5.append(c);
                                                            throw new IllegalArgumentException(sb5.toString());
                                                        }
                                                    case 'd':
                                                        break;
                                                    case 'e':
                                                        if (i == 1 || i == 2) {
                                                            appendInternal(new Keep('e', i));
                                                            return;
                                                        } else if (i == 3) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT);
                                                            return;
                                                        } else if (i == 4) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL);
                                                            return;
                                                        } else if (i == 5) {
                                                            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.NARROW);
                                                            return;
                                                        } else {
                                                            StringBuilder sb6 = new StringBuilder();
                                                            sb6.append("Too many pattern letters: ");
                                                            sb6.append(c);
                                                            throw new IllegalArgumentException(sb6.toString());
                                                        }
                                                    default:
                                                        if (i == 1) {
                                                            appendValue(denominatorAmountAdapter$PencilViewHolder);
                                                            return;
                                                        } else {
                                                            appendValue(denominatorAmountAdapter$PencilViewHolder, i);
                                                            return;
                                                        }
                                                }
                                        }
                                }
                            } else if (i == 2) {
                                appendValueReduced(denominatorAmountAdapter$PencilViewHolder, 2, 2, (PromptPayMobileListAdapter$PromptPayListView) C7058x42238fcc.BASE_DATE);
                                return;
                            } else if (i < 4) {
                                appendValue(denominatorAmountAdapter$PencilViewHolder, i, 19, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL);
                                return;
                            } else {
                                appendValue(denominatorAmountAdapter$PencilViewHolder, i, 19, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD);
                                return;
                            }
                        }
                    }
                    if (i == 1) {
                        appendValue(denominatorAmountAdapter$PencilViewHolder);
                        return;
                    } else if (i == 2) {
                        appendValue(denominatorAmountAdapter$PencilViewHolder, 2);
                        return;
                    } else if (i == 3) {
                        appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT_STANDALONE);
                        return;
                    } else if (i == 4) {
                        appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL_STANDALONE);
                        return;
                    } else if (i == 5) {
                        appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.NARROW_STANDALONE);
                        return;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Too many pattern letters: ");
                        sb7.append(c);
                        throw new IllegalArgumentException(sb7.toString());
                    }
                }
                if (i == 1) {
                    appendValue(denominatorAmountAdapter$PencilViewHolder);
                    return;
                } else if (i == 2) {
                    appendValue(denominatorAmountAdapter$PencilViewHolder, i);
                    return;
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Too many pattern letters: ");
                    sb8.append(c);
                    throw new IllegalArgumentException(sb8.toString());
                }
            } else if (i == 1) {
                appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT);
                return;
            } else {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Too many pattern letters: ");
                sb9.append(c);
                throw new IllegalArgumentException(sb9.toString());
            }
        }
        if (i == 1) {
            appendValue(denominatorAmountAdapter$PencilViewHolder);
        } else if (i == 2) {
            appendValue(denominatorAmountAdapter$PencilViewHolder, 2);
        } else if (i == 3) {
            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.SHORT);
        } else if (i == 4) {
            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.FULL);
        } else if (i == 5) {
            appendText(denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9.NARROW);
        } else {
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Too many pattern letters: ");
            sb10.append(c);
            throw new IllegalArgumentException(sb10.toString());
        }
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding padNext(int i) {
        return padNext(i, ' ');
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding padNext(int i, char c) {
        if (i > 0) {
            SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding = this.active;
            sequentialSearchAdapter$ItemViewHolder_ViewBinding.padNextWidth = i;
            sequentialSearchAdapter$ItemViewHolder_ViewBinding.padNextChar = c;
            sequentialSearchAdapter$ItemViewHolder_ViewBinding.valueParserIndex = -1;
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The pad width must be at least one but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding optionalStart() {
        this.active.valueParserIndex = -1;
        this.active = new SequentialSearchAdapter$ItemViewHolder_ViewBinding(this.active, true);
        return this;
    }

    public final SequentialSearchAdapter$ItemViewHolder_ViewBinding optionalEnd() {
        SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding = this.active;
        if (sequentialSearchAdapter$ItemViewHolder_ViewBinding.parent != null) {
            if (sequentialSearchAdapter$ItemViewHolder_ViewBinding.printerParsers.size() > 0) {
                SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding2 = this.active;
                C7052x1ebac7ce sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new C7052x1ebac7ce(sequentialSearchAdapter$ItemViewHolder_ViewBinding2.printerParsers, sequentialSearchAdapter$ItemViewHolder_ViewBinding2.optional);
                this.active = this.active.parent;
                appendInternal(sequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                this.active = this.active.parent;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    private int appendInternal(IconCompatParcelizer iconCompatParcelizer) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(iconCompatParcelizer, "pp");
        SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding = this.active;
        int i = sequentialSearchAdapter$ItemViewHolder_ViewBinding.padNextWidth;
        if (i > 0) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer = new C7055x7791f8a7(iconCompatParcelizer, i, sequentialSearchAdapter$ItemViewHolder_ViewBinding.padNextChar);
            }
            SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding2 = this.active;
            sequentialSearchAdapter$ItemViewHolder_ViewBinding2.padNextWidth = 0;
            sequentialSearchAdapter$ItemViewHolder_ViewBinding2.padNextChar = 0;
        }
        this.active.printerParsers.add(iconCompatParcelizer);
        SequentialSearchAdapter$ItemViewHolder_ViewBinding sequentialSearchAdapter$ItemViewHolder_ViewBinding3 = this.active;
        sequentialSearchAdapter$ItemViewHolder_ViewBinding3.valueParserIndex = -1;
        return sequentialSearchAdapter$ItemViewHolder_ViewBinding3.printerParsers.size() - 1;
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder toFormatter() {
        return toFormatter(Locale.getDefault());
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder toFormatter(Locale locale) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        while (this.active.parent != null) {
            optionalEnd();
        }
        return new GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder(new C7052x1ebac7ce(this.printerParsers, false), locale, GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder.STANDARD, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART, (Set<DenominatorAmountAdapter$PencilViewHolder>) null, (C7022x6c0e8d61) null, (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) null);
    }

    /* access modifiers changed from: package-private */
    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder toFormatter(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        return toFormatter().withResolverStyle(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$read */
    static class read implements IconCompatParcelizer {
        private final DenominatorAmountAdapter$PencilViewHolder field;
        private final long value;

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            return true;
        }

        read(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
            this.field = denominatorAmountAdapter$PencilViewHolder;
            this.value = j;
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getParsed(this.field) == null) {
                giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(this.field, this.value, i, i);
            }
            return i;
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$RatingCompat */
    static class RatingCompat implements IconCompatParcelizer {
        static final int[] EXCEED_POINTS = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Utils.SECOND_IN_NANOS};
        final DenominatorAmountAdapter$PencilViewHolder field;
        final int maxWidth;
        final int minWidth;
        final MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding signStyle;
        final int subsequentWidth;

        /* access modifiers changed from: package-private */
        public long getValue(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, long j) {
            return j;
        }

        RatingCompat(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding) {
            this.field = denominatorAmountAdapter$PencilViewHolder;
            this.minWidth = i;
            this.maxWidth = i2;
            this.signStyle = moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding;
            this.subsequentWidth = 0;
        }

        private RatingCompat(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, int i, int i2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding, int i3) {
            this.field = denominatorAmountAdapter$PencilViewHolder;
            this.minWidth = i;
            this.maxWidth = i2;
            this.signStyle = moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding;
            this.subsequentWidth = i3;
        }

        /* access modifiers changed from: package-private */
        public RatingCompat withFixedWidth() {
            if (this.subsequentWidth == -1) {
                return this;
            }
            return new RatingCompat(this.field, this.minWidth, this.maxWidth, this.signStyle, -1);
        }

        /* access modifiers changed from: package-private */
        public RatingCompat withSubsequentWidth(int i) {
            return new RatingCompat(this.field, this.minWidth, this.maxWidth, this.signStyle, this.subsequentWidth + i);
        }

        public boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            String str;
            Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(this.field);
            if (value == null) {
                return false;
            }
            long value2 = getValue(giftTutorialViewPagerAdapter$TutorialItemHolder, value.longValue());
            GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder symbols = giftTutorialViewPagerAdapter$TutorialItemHolder.getSymbols();
            if (value2 == Long.MIN_VALUE) {
                str = "9223372036854775808";
            } else {
                str = Long.toString(Math.abs(value2));
            }
            if (str.length() <= this.maxWidth) {
                String convertNumberToI18N = symbols.convertNumberToI18N(str);
                if (value2 >= 0) {
                    int i = setOnCloseListener.$SwitchMap$org$threeten$bp$format$SignStyle[this.signStyle.ordinal()];
                    if (i == 1) {
                        int i2 = this.minWidth;
                        if (i2 < 19 && value2 >= ((long) EXCEED_POINTS[i2])) {
                            sb.append(symbols.getPositiveSign());
                        }
                    } else if (i == 2) {
                        sb.append(symbols.getPositiveSign());
                    }
                } else {
                    int i3 = setOnCloseListener.$SwitchMap$org$threeten$bp$format$SignStyle[this.signStyle.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        sb.append(symbols.getNegativeSign());
                    } else if (i3 == 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Field ");
                        sb2.append(this.field);
                        sb2.append(" cannot be printed as the value ");
                        sb2.append(value2);
                        sb2.append(" cannot be negative according to the SignStyle");
                        throw new DateTimeException(sb2.toString());
                    }
                }
                for (int i4 = 0; i4 < this.minWidth - convertNumberToI18N.length(); i4++) {
                    sb.append(symbols.getZeroDigit());
                }
                sb.append(convertNumberToI18N);
                return true;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Field ");
            sb3.append(this.field);
            sb3.append(" cannot be printed as the value ");
            sb3.append(value2);
            sb3.append(" exceeds the maximum print width of ");
            sb3.append(this.maxWidth);
            throw new DateTimeException(sb3.toString());
        }

        /* access modifiers changed from: package-private */
        public boolean isFixedWidth(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding) {
            int i = this.subsequentWidth;
            return i == -1 || (i > 0 && this.minWidth == this.maxWidth && this.signStyle == MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:106:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x017c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parse(p040o.C6877xfa77ad04 r20, java.lang.CharSequence r21, int r22) {
            /*
                r19 = this;
                r6 = r19
                r0 = r22
                int r1 = r21.length()
                if (r0 != r1) goto L_0x000c
                int r0 = ~r0
                return r0
            L_0x000c:
                char r2 = r21.charAt(r22)
                o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder r3 = r20.getSymbols()
                char r3 = r3.getPositiveSign()
                r4 = 0
                r5 = 1
                if (r2 != r3) goto L_0x0039
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r2 = r6.signStyle
                boolean r3 = r20.isStrict()
                int r7 = r6.minWidth
                int r8 = r6.maxWidth
                if (r7 != r8) goto L_0x002a
                r7 = r5
                goto L_0x002b
            L_0x002a:
                r7 = r4
            L_0x002b:
                boolean r2 = r2.parse(r5, r3, r7)
                if (r2 != 0) goto L_0x0033
                int r0 = ~r0
                return r0
            L_0x0033:
                int r0 = r0 + 1
                r7 = r0
                r0 = r4
                r2 = r5
                goto L_0x0071
            L_0x0039:
                o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder r3 = r20.getSymbols()
                char r3 = r3.getNegativeSign()
                if (r2 != r3) goto L_0x0060
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r2 = r6.signStyle
                boolean r3 = r20.isStrict()
                int r7 = r6.minWidth
                int r8 = r6.maxWidth
                if (r7 != r8) goto L_0x0051
                r7 = r5
                goto L_0x0052
            L_0x0051:
                r7 = r4
            L_0x0052:
                boolean r2 = r2.parse(r4, r3, r7)
                if (r2 != 0) goto L_0x005a
                int r0 = ~r0
                return r0
            L_0x005a:
                int r0 = r0 + 1
                r7 = r0
                r2 = r4
                r0 = r5
                goto L_0x0071
            L_0x0060:
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r2 = r6.signStyle
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r3 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.ALWAYS
                if (r2 != r3) goto L_0x006e
                boolean r2 = r20.isStrict()
                if (r2 == 0) goto L_0x006e
                int r0 = ~r0
                return r0
            L_0x006e:
                r7 = r0
                r0 = r4
                r2 = r0
            L_0x0071:
                boolean r3 = r20.isStrict()
                if (r3 != 0) goto L_0x007f
                boolean r3 = r19.isFixedWidth(r20)
                if (r3 != 0) goto L_0x007f
                r3 = r5
                goto L_0x0081
            L_0x007f:
                int r3 = r6.minWidth
            L_0x0081:
                int r8 = r7 + r3
                if (r8 <= r1) goto L_0x0087
                int r0 = ~r7
                return r0
            L_0x0087:
                boolean r9 = r20.isStrict()
                if (r9 != 0) goto L_0x0096
                boolean r9 = r19.isFixedWidth(r20)
                if (r9 != 0) goto L_0x0096
                r9 = 9
                goto L_0x0098
            L_0x0096:
                int r9 = r6.maxWidth
            L_0x0098:
                int r10 = r6.subsequentWidth
                int r10 = java.lang.Math.max(r10, r4)
                int r9 = r9 + r10
            L_0x009f:
                r10 = 2
                r11 = 0
                if (r4 >= r10) goto L_0x010b
                int r9 = r9 + r7
                int r9 = java.lang.Math.min(r9, r1)
                r10 = r7
                r14 = 0
            L_0x00ab:
                if (r10 >= r9) goto L_0x00f5
                int r16 = r10 + 1
                r12 = r21
                char r10 = r12.charAt(r10)
                o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder r13 = r20.getSymbols()
                int r10 = r13.convertToDigit(r10)
                if (r10 >= 0) goto L_0x00c5
                int r10 = r16 + -1
                if (r10 >= r8) goto L_0x00f7
                int r0 = ~r7
                return r0
            L_0x00c5:
                int r13 = r16 - r7
                r5 = 18
                if (r13 <= r5) goto L_0x00e5
                if (r11 != 0) goto L_0x00d1
                java.math.BigInteger r11 = java.math.BigInteger.valueOf(r14)
            L_0x00d1:
                java.math.BigInteger r5 = java.math.BigInteger.TEN
                java.math.BigInteger r5 = r11.multiply(r5)
                long r10 = (long) r10
                java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
                java.math.BigInteger r5 = r5.add(r10)
                r11 = r5
                r5 = r8
                r22 = r9
                goto L_0x00ee
            L_0x00e5:
                r17 = 10
                long r14 = r14 * r17
                r5 = r8
                r22 = r9
                long r8 = (long) r10
                long r14 = r14 + r8
            L_0x00ee:
                r9 = r22
                r8 = r5
                r10 = r16
                r5 = 1
                goto L_0x00ab
            L_0x00f5:
                r12 = r21
            L_0x00f7:
                r5 = r8
                int r8 = r6.subsequentWidth
                if (r8 <= 0) goto L_0x0109
                if (r4 != 0) goto L_0x0109
                int r10 = r10 - r7
                int r10 = r10 - r8
                int r9 = java.lang.Math.max(r3, r10)
                int r4 = r4 + 1
                r8 = r5
                r5 = 1
                goto L_0x009f
            L_0x0109:
                r5 = r10
                goto L_0x010e
            L_0x010b:
                r5 = r7
                r14 = 0
            L_0x010e:
                if (r0 == 0) goto L_0x013d
                if (r11 == 0) goto L_0x012a
                java.math.BigInteger r0 = java.math.BigInteger.ZERO
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L_0x0124
                boolean r0 = r20.isStrict()
                if (r0 == 0) goto L_0x0124
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0124:
                java.math.BigInteger r0 = r11.negate()
                r11 = r0
                goto L_0x015b
            L_0x012a:
                r0 = 1
                r1 = 0
                int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r1 != 0) goto L_0x013a
                boolean r1 = r20.isStrict()
                if (r1 == 0) goto L_0x013a
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x013a:
                long r0 = -r14
                r2 = r0
                goto L_0x015c
            L_0x013d:
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r0 = r6.signStyle
                o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding r1 = p040o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD
                if (r0 != r1) goto L_0x015b
                boolean r0 = r20.isStrict()
                if (r0 == 0) goto L_0x015b
                int r0 = r5 - r7
                if (r2 == 0) goto L_0x0155
                int r1 = r6.minWidth
                if (r0 > r1) goto L_0x015b
                r0 = 1
                int r7 = r7 - r0
                int r0 = ~r7
                return r0
            L_0x0155:
                int r1 = r6.minWidth
                if (r0 <= r1) goto L_0x015b
                int r0 = ~r7
                return r0
            L_0x015b:
                r2 = r14
            L_0x015c:
                if (r11 == 0) goto L_0x017c
                int r0 = r11.bitLength()
                r1 = 63
                if (r0 <= r1) goto L_0x016e
                java.math.BigInteger r0 = java.math.BigInteger.TEN
                java.math.BigInteger r11 = r11.divide(r0)
                int r5 = r5 + -1
            L_0x016e:
                long r2 = r11.longValue()
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.setValue(r1, r2, r4, r5)
                return r0
            L_0x017c:
                r0 = r19
                r1 = r20
                r4 = r7
                int r0 = r0.setValue(r1, r2, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding.RatingCompat.parse(o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        public int setValue(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, long j, int i, int i2) {
            return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(this.field, j, i, i2);
        }

        public String toString() {
            if (this.minWidth == 1 && this.maxWidth == 19 && this.signStyle == MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.field);
                sb.append(")");
                return sb.toString();
            } else if (this.minWidth == this.maxWidth && this.signStyle == MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Value(");
                sb2.append(this.field);
                sb2.append(",");
                sb2.append(this.minWidth);
                sb2.append(")");
                return sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Value(");
                sb3.append(this.field);
                sb3.append(",");
                sb3.append(this.minWidth);
                sb3.append(",");
                sb3.append(this.maxWidth);
                sb3.append(",");
                sb3.append(this.signStyle);
                sb3.append(")");
                return sb3.toString();
            }
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaMetadataCompat */
    static final class MediaMetadataCompat implements IconCompatParcelizer {
        private static final long SECONDS_0000_TO_1970 = 62167219200L;
        private static final long SECONDS_PER_10000_YEARS = 315569520000L;
        private final int fractionalDigits;

        public final String toString() {
            return "Instant()";
        }

        MediaMetadataCompat(int i) {
            this.fractionalDigits = i;
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            StringBuilder sb2 = sb;
            Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS);
            Long l = 0L;
            if (giftTutorialViewPagerAdapter$TutorialItemHolder.getTemporal().isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND)) {
                l = Long.valueOf(giftTutorialViewPagerAdapter$TutorialItemHolder.getTemporal().getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND));
            }
            int i = 0;
            if (value == null) {
                return false;
            }
            long longValue = value.longValue();
            int checkValidIntValue = TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidIntValue(l.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - SECONDS_PER_10000_YEARS) + SECONDS_0000_TO_1970;
                long floorDiv = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j, (long) SECONDS_PER_10000_YEARS) + 1;
                QuickAccountSelectAdapter$UnselectedHolder_ViewBinding ofEpochSecond = QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j, (long) SECONDS_PER_10000_YEARS) - SECONDS_0000_TO_1970, 0, ManageAccountInboundViewHolder_ViewBinding.UTC);
                if (floorDiv > 0) {
                    sb2.append('+');
                    sb2.append(floorDiv);
                }
                sb2.append(ofEpochSecond);
                if (ofEpochSecond.getSecond() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j2 = longValue + SECONDS_0000_TO_1970;
                long j3 = j2 / SECONDS_PER_10000_YEARS;
                long j4 = j2 % SECONDS_PER_10000_YEARS;
                QuickAccountSelectAdapter$UnselectedHolder_ViewBinding ofEpochSecond2 = QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(j4 - SECONDS_0000_TO_1970, 0, ManageAccountInboundViewHolder_ViewBinding.UTC);
                int length = sb.length();
                sb2.append(ofEpochSecond2);
                if (ofEpochSecond2.getSecond() == 0) {
                    sb2.append(":00");
                }
                if (j3 < 0) {
                    if (ofEpochSecond2.getYear() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.fractionalDigits;
            if (i2 == -2) {
                if (checkValidIntValue != 0) {
                    sb2.append('.');
                    if (checkValidIntValue % 1000000 == 0) {
                        sb2.append(Integer.toString((checkValidIntValue / 1000000) + 1000).substring(1));
                    } else if (checkValidIntValue % 1000 == 0) {
                        sb2.append(Integer.toString((checkValidIntValue / 1000) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(checkValidIntValue + Utils.SECOND_IN_NANOS).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && checkValidIntValue > 0)) {
                sb2.append('.');
                int i3 = 100000000;
                while (true) {
                    if ((this.fractionalDigits != -1 || checkValidIntValue <= 0) && i >= this.fractionalDigits) {
                        break;
                    }
                    int i4 = checkValidIntValue / i3;
                    sb2.append((char) (i4 + 48));
                    checkValidIntValue -= i4 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb2.append(Matrix.MATRIX_TYPE_ZERO);
            return true;
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            int i2;
            int i3 = i;
            C6877xfa77ad04 copy = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.copy();
            int i4 = this.fractionalDigits;
            int i5 = 0;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = this.fractionalDigits;
            if (i6 < 0) {
                i6 = 9;
            }
            int parse = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().append(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_LOCAL_DATE).appendLiteral('T').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, 2).appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR, 2).appendLiteral(':').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE, 2).appendFraction(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, i4, i6, true).appendLiteral((char) Matrix.MATRIX_TYPE_ZERO).toFormatter().toPrinterParser(false).parse(copy, charSequence, i3);
            if (parse < 0) {
                return parse;
            }
            long longValue = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue();
            int intValue = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).intValue();
            int intValue2 = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).intValue();
            int intValue3 = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY).intValue();
            int intValue4 = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR).intValue();
            Long parsed = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE);
            Long parsed2 = copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
            int intValue5 = parsed != null ? parsed.intValue() : 0;
            int intValue6 = parsed2 != null ? parsed2.intValue() : 0;
            int i7 = (int) longValue;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                intValue3 = 0;
                i5 = 1;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedLeapSecond();
                i2 = 59;
                int i8 = intValue6;
                C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding2 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding;
                int i9 = i;
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding2.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, (long) i8, i9, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding2.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3551of(i7 % 10000, intValue, intValue2, intValue3, intValue4, i2, 0).plusDays((long) i5).toEpochSecond(ManageAccountInboundViewHolder_ViewBinding.UTC) + RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(longValue / 10000, (long) SECONDS_PER_10000_YEARS), i9, parse));
            }
            i2 = intValue5;
            try {
                int i82 = intValue6;
                C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding22 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding;
                int i92 = i;
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding22.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, (long) i82, i92, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding22.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3551of(i7 % 10000, intValue, intValue2, intValue3, intValue4, i2, 0).plusDays((long) i5).toEpochSecond(ManageAccountInboundViewHolder_ViewBinding.UTC) + RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(longValue / 10000, (long) SECONDS_PER_10000_YEARS), i92, parse));
            } catch (RuntimeException unused) {
                return ~i3;
            }
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo implements IconCompatParcelizer {
        static final ParcelableVolumeInfo INSTANCE_ID = new ParcelableVolumeInfo("Z", "+HH:MM:ss");
        static final String[] PATTERNS = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        private final String noOffsetText;
        private final int type;

        ParcelableVolumeInfo(String str, String str2) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "noOffsetText");
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str2, "pattern");
            this.noOffsetText = str;
            this.type = checkPattern(str2);
        }

        private int checkPattern(String str) {
            int i = 0;
            while (true) {
                String[] strArr = PATTERNS;
                if (i >= strArr.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid zone offset pattern: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                } else if (strArr[i].equals(str)) {
                    return i;
                } else {
                    i++;
                }
            }
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            int safeToInt = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(value.longValue());
            if (safeToInt == 0) {
                sb.append(this.noOffsetText);
                return true;
            }
            int abs = Math.abs((safeToInt / 3600) % 100);
            int abs2 = Math.abs((safeToInt / 60) % 60);
            int abs3 = Math.abs(safeToInt % 60);
            int length = sb.length();
            sb.append(safeToInt < 0 ? "-" : "+");
            sb.append((char) ((abs / 10) + 48));
            sb.append((char) ((abs % 10) + 48));
            int i = this.type;
            if (i >= 3 || (i > 0 && abs2 > 0)) {
                String str = "";
                sb.append(this.type % 2 == 0 ? ":" : str);
                sb.append((char) ((abs2 / 10) + 48));
                sb.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                int i2 = this.type;
                if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                    if (this.type % 2 == 0) {
                        str = ":";
                    }
                    sb.append(str);
                    sb.append((char) ((abs3 / 10) + 48));
                    sb.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs != 0) {
                return true;
            }
            sb.setLength(length);
            sb.append(this.noOffsetText);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int parse(p040o.C6877xfa77ad04 r16, java.lang.CharSequence r17, int r18) {
            /*
                r15 = this;
                r0 = r15
                r7 = r17
                r8 = r18
                int r1 = r17.length()
                java.lang.String r2 = r0.noOffsetText
                int r9 = r2.length()
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0045
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r2 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS
                r3 = 0
                r1 = r16
                r5 = r18
                r6 = r18
                int r1 = r1.setParsedField(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0026
                int r1 = ~r8
                return r1
            L_0x0026:
                java.lang.String r4 = r0.noOffsetText
                r5 = 0
                r1 = r16
                r2 = r17
                r3 = r18
                r6 = r9
                boolean r1 = r1.subSequenceEquals(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0045
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r2 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                int r1 = r1.setParsedField(r2, r3, r5, r6)
                return r1
            L_0x0045:
                char r1 = r17.charAt(r18)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x0051
                if (r1 != r3) goto L_0x00a3
            L_0x0051:
                r2 = 1
                if (r1 != r3) goto L_0x0056
                r1 = -1
                goto L_0x0057
            L_0x0056:
                r1 = r2
            L_0x0057:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r15.parseNumber(r3, r2, r7, r2)
                r6 = 2
                r10 = 3
                if (r4 != 0) goto L_0x007c
                int r4 = r0.type
                if (r4 < r10) goto L_0x006d
                r4 = r2
                goto L_0x006e
            L_0x006d:
                r4 = r5
            L_0x006e:
                boolean r4 = r15.parseNumber(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x007c
                boolean r4 = r15.parseNumber(r3, r10, r7, r5)
                if (r4 != 0) goto L_0x007c
                r4 = r5
                goto L_0x007d
            L_0x007c:
                r4 = r2
            L_0x007d:
                if (r4 != 0) goto L_0x00a3
                long r11 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r4 = r3[r6]
                long r6 = (long) r4
                r4 = r3[r10]
                long r9 = (long) r4
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r4 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS
                r13 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r13
                r13 = 60
                long r6 = r6 * r13
                long r1 = r1 + r6
                long r1 = r1 + r9
                long r6 = r11 * r1
                r9 = r3[r5]
                r1 = r16
                r2 = r4
                r3 = r6
                r5 = r18
                r6 = r9
                int r1 = r1.setParsedField(r2, r3, r5, r6)
                return r1
            L_0x00a3:
                if (r9 != 0) goto L_0x00b4
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r2 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r16
                r5 = r18
                int r1 = r1.setParsedField(r2, r3, r5, r6)
                return r1
            L_0x00b4:
                int r1 = ~r8
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding.ParcelableVolumeInfo.parse(o.GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, java.lang.CharSequence, int):int");
        }

        private boolean parseNumber(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.type;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i6);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i6 + 1;
            return false;
        }

        public final String toString() {
            String replace = this.noOffsetText.replace("'", "''");
            StringBuilder sb = new StringBuilder();
            sb.append("Offset(");
            sb.append(PATTERNS[this.type]);
            sb.append(",'");
            sb.append(replace);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaDescriptionCompat */
    static final class MediaDescriptionCompat implements IconCompatParcelizer {
        private final C7010xce0f74d9 style;

        public MediaDescriptionCompat(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
            this.style = questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding;
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            Long value = giftTutorialViewPagerAdapter$TutorialItemHolder.getValue((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS);
            if (value == null) {
                return false;
            }
            sb.append("GMT");
            if (this.style == C7010xce0f74d9.FULL) {
                return new ParcelableVolumeInfo("", "+HH:MM:ss").print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb);
            }
            int safeToInt = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(value.longValue());
            if (safeToInt == 0) {
                return true;
            }
            int abs = Math.abs((safeToInt / 3600) % 100);
            int abs2 = Math.abs((safeToInt / 60) % 60);
            int abs3 = Math.abs(safeToInt % 60);
            sb.append(safeToInt < 0 ? "-" : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            char charAt;
            CharSequence charSequence2 = charSequence;
            int i2 = i;
            if (!giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.subSequenceEquals(charSequence, i, "GMT", 0, 3)) {
                return ~i2;
            }
            int i3 = i2 + 3;
            if (this.style == C7010xce0f74d9.FULL) {
                C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding2 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding;
                return new ParcelableVolumeInfo("", "+HH:MM:ss").parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence2, i3);
            }
            C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding3 = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding;
            int length = charSequence.length();
            if (i3 == length) {
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, 0, i3, i3);
            }
            char charAt2 = charSequence2.charAt(i3);
            if (charAt2 != '+' && charAt2 != '-') {
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, 0, i3, i3);
            }
            int i4 = charAt2 == '-' ? -1 : 1;
            if (i3 == length) {
                return ~i3;
            }
            int i5 = i3 + 1;
            char charAt3 = charSequence2.charAt(i5);
            if (charAt3 < '0' || charAt3 > '9') {
                return ~i5;
            }
            int i6 = i5 + 1;
            int i7 = charAt3 - '0';
            if (i6 != length && (charAt = charSequence2.charAt(i6)) >= '0' && charAt <= '9') {
                i7 = (i7 * 10) + (charAt - '0');
                if (i7 > 23) {
                    return ~i6;
                }
                i6++;
            }
            int i8 = i6;
            if (i8 == length || charSequence2.charAt(i8) != ':') {
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) (i4 * 3600 * i7), i8, i8);
            }
            int i9 = i8 + 1;
            int i10 = length - 2;
            if (i9 > i10) {
                return ~i9;
            }
            char charAt4 = charSequence2.charAt(i9);
            if (charAt4 < '0' || charAt4 > '9') {
                return ~i9;
            }
            int i11 = i9 + 1;
            char charAt5 = charSequence2.charAt(i11);
            if (charAt5 < '0' || charAt5 > '9') {
                return ~i11;
            }
            int i12 = i11 + 1;
            int i13 = ((charAt4 - '0') * 10) + (charAt5 - '0');
            if (i13 > 59) {
                return ~i12;
            }
            if (i12 == length || charSequence2.charAt(i12) != ':') {
                return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) (i4 * ((i7 * 3600) + (i13 * 60))), i12, i12);
            }
            int i14 = i12 + 1;
            if (i14 > i10) {
                return ~i14;
            }
            char charAt6 = charSequence2.charAt(i14);
            if (charAt6 < '0' || charAt6 > '9') {
                return ~i14;
            }
            int i15 = i14 + 1;
            char charAt7 = charSequence2.charAt(i15);
            if (charAt7 < '0' || charAt7 > '9') {
                return ~i15;
            }
            int i16 = i15 + 1;
            int i17 = ((charAt6 - '0') * 10) + (charAt7 - '0');
            if (i17 > 59) {
                return ~i16;
            }
            return giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsedField(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) (i4 * ((i7 * 3600) + (i13 * 60) + i17)), i16, i16);
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$setHasDecor */
    static final class setHasDecor implements IconCompatParcelizer {
        private static final Comparator<String> LENGTH_COMPARATOR = new Comparator<String>() {
            public final int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        };
        private final C7010xce0f74d9 textStyle;

        setHasDecor(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
            this.textStyle = (C7010xce0f74d9) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, "textStyle");
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            boolean z;
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId());
            int i = 0;
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding == null) {
                return false;
            }
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding.normalized() instanceof ManageAccountInboundViewHolder_ViewBinding) {
                sb.append(languageSettingAdapter$LanguageSettingHolder_ViewBinding.getId());
                return true;
            }
            DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding temporal = giftTutorialViewPagerAdapter$TutorialItemHolder.getTemporal();
            if (temporal.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)) {
                z = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().isDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(temporal.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)));
            } else {
                z = false;
            }
            TimeZone timeZone = TimeZone.getTimeZone(languageSettingAdapter$LanguageSettingHolder_ViewBinding.getId());
            if (this.textStyle.asNormal() == C7010xce0f74d9.FULL) {
                i = 1;
            }
            sb.append(timeZone.getDisplayName(z, i, giftTutorialViewPagerAdapter$TutorialItemHolder.getLocale()));
            return true;
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            TreeMap treeMap = new TreeMap(LENGTH_COMPARATOR);
            for (String next : LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.getAvailableZoneIds()) {
                treeMap.put(next, next);
                TimeZone timeZone = TimeZone.getTimeZone(next);
                int i2 = this.textStyle.asNormal() == C7010xce0f74d9.FULL ? 1 : 0;
                String displayName = timeZone.getDisplayName(false, i2, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getLocale());
                if (next.startsWith("Etc/") || (!displayName.startsWith("GMT+") && !displayName.startsWith("GMT+"))) {
                    treeMap.put(displayName, next);
                }
                String displayName2 = timeZone.getDisplayName(true, i2, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getLocale());
                if (next.startsWith("Etc/") || (!displayName2.startsWith("GMT+") && !displayName2.startsWith("GMT+"))) {
                    treeMap.put(displayName2, next);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.subSequenceEquals(charSequence, i, str, 0, str.length())) {
                    giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of((String) entry.getValue()));
                    return i + str.length();
                }
            }
            return ~i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ZoneText(");
            sb.append(this.textStyle);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat */
    static final class PlaybackStateCompat implements IconCompatParcelizer {
        private static volatile Map.Entry<Integer, C7059xb7145de2> cachedSubstringTree;
        private final String description;
        private final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> query;

        PlaybackStateCompat(EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> eBillAdapter$EBillHolder, String str) {
            this.query = eBillAdapter$EBillHolder;
            this.description = str;
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(this.query);
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding == null) {
                return false;
            }
            sb.append(languageSettingAdapter$LanguageSettingHolder_ViewBinding.getId());
            return true;
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            } else if (i == length) {
                return ~i;
            } else {
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    C6877xfa77ad04 copy = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.copy();
                    int parse = ParcelableVolumeInfo.INSTANCE_ID.parse(copy, charSequence, i);
                    if (parse < 0) {
                        return parse;
                    }
                    giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed((LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds((int) copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS).longValue()));
                    return parse;
                }
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charAt, Matrix.MATRIX_TYPE_RANDOM_UT) && giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charAt2, 'T')) {
                        int i4 = i + 3;
                        if (length < i4 || !giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charSequence.charAt(i3), 'C')) {
                            return parsePrefixedOffset(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i, i3);
                        }
                        return parsePrefixedOffset(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i, i4);
                    } else if (giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charAt, 'G') && length >= (i2 = i + 3) && giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charAt2, 'M') && giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charSequence.charAt(i3), 'T')) {
                        return parsePrefixedOffset(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i, i2);
                    }
                }
                Set<String> availableZoneIds = HistoryAdapter$GroupItemViewHolder.getAvailableZoneIds();
                int size = availableZoneIds.size();
                Map.Entry<Integer, C7059xb7145de2> entry = cachedSubstringTree;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = cachedSubstringTree;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), prepareParser(availableZoneIds));
                            cachedSubstringTree = entry;
                        }
                    }
                }
                C7059xb7145de2 value = entry.getValue();
                String str = null;
                String str2 = null;
                while (value != null) {
                    int i5 = value.length + i;
                    if (i5 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i, i5).toString();
                    value = value.get(charSequence2, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isCaseSensitive());
                    String str3 = charSequence2;
                    str2 = str;
                    str = str3;
                }
                LanguageSettingAdapter$LanguageSettingHolder_ViewBinding convertToZone = convertToZone(availableZoneIds, str, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isCaseSensitive());
                if (convertToZone == null) {
                    convertToZone = convertToZone(availableZoneIds, str2, giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.isCaseSensitive());
                    if (convertToZone != null) {
                        str = str2;
                    } else if (!giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charAt, Matrix.MATRIX_TYPE_ZERO)) {
                        return ~i;
                    } else {
                        giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed((LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) ManageAccountInboundViewHolder_ViewBinding.UTC);
                        return i + 1;
                    }
                }
                giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(convertToZone);
                return i + str.length();
            }
        }

        private LanguageSettingAdapter$LanguageSettingHolder_ViewBinding convertToZone(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String next : set) {
                    if (next.equalsIgnoreCase(str)) {
                        return LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of(next);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of(str);
            } else {
                return null;
            }
        }

        private int parsePrefixedOffset(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            C6877xfa77ad04 copy = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.copy();
            if (i2 >= charSequence.length() || !giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(charSequence.charAt(i2), Matrix.MATRIX_TYPE_ZERO)) {
                int parse = ParcelableVolumeInfo.INSTANCE_ID.parse(copy, charSequence, i2);
                if (parse < 0) {
                    giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.ofOffset(upperCase, ManageAccountInboundViewHolder_ViewBinding.UTC));
                    return i2;
                }
                giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.ofOffset(upperCase, ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds((int) copy.getParsed(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS).longValue())));
                return parse;
            }
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.ofOffset(upperCase, ManageAccountInboundViewHolder_ViewBinding.UTC));
            return i2;
        }

        private static C7059xb7145de2 prepareParser(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList<>(set);
            Collections.sort(arrayList, SequentialSearchAdapter$ItemViewHolder_ViewBinding.LENGTH_SORT);
            C7059xb7145de2 sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver = new C7059xb7145de2(((String) arrayList.get(0)).length());
            for (String access$300 : arrayList) {
                sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.add(access$300);
            }
            return sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final String toString() {
            return this.description;
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$write */
    static final class write implements IconCompatParcelizer {
        private final C7010xce0f74d9 textStyle;

        write(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding) {
            this.textStyle = questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding;
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) giftTutorialViewPagerAdapter$TutorialItemHolder.getValue(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
            if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null) {
                return false;
            }
            if (this.textStyle == null) {
                sb.append(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
                return true;
            }
            try {
                sb.append(ResourceBundle.getBundle("org.threeten.bp.format.ChronologyText", giftTutorialViewPagerAdapter$TutorialItemHolder.getLocale(), SequentialSearchAdapter$ItemViewHolder_ViewBinding.class.getClassLoader()).getString(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId()));
                return true;
            } catch (MissingResourceException unused) {
                sb.append(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
                return true;
            }
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            if (i < 0 || i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            }
            C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = null;
            int i2 = -1;
            for (C7022x6c0e8d61 next : C7022x6c0e8d61.getAvailableChronologies()) {
                String id = next.getId();
                int length = id.length();
                if (length > i2 && giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.subSequenceEquals(charSequence, i, id, 0, length)) {
                    registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = next;
                    i2 = length;
                }
            }
            if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null) {
                return ~i;
            }
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.setParsed(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding);
            return i + i2;
        }
    }

    /* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$Keep */
    static final class Keep implements IconCompatParcelizer {
        private final int count;
        private final char letter;

        public Keep(char c, int i) {
            this.letter = c;
            this.count = i;
        }

        public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
            return evaluate(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding.m3501of(giftTutorialViewPagerAdapter$TutorialItemHolder.getLocale())).print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb);
        }

        public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
            return evaluate(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding.m3501of(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getLocale())).parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i);
        }

        private IconCompatParcelizer evaluate(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding;
            char c = this.letter;
            if (c == 'W') {
                return new RatingCompat(editFavouriteAdapter$EditFavouriteHolder_ViewBinding.weekOfMonth(), 1, 2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
            }
            if (c != 'Y') {
                if (c == 'c') {
                    return new RatingCompat(editFavouriteAdapter$EditFavouriteHolder_ViewBinding.dayOfWeek(), this.count, 2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
                }
                if (c == 'e') {
                    return new RatingCompat(editFavouriteAdapter$EditFavouriteHolder_ViewBinding.dayOfWeek(), this.count, 2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
                }
                if (c != 'w') {
                    return null;
                }
                return new RatingCompat(editFavouriteAdapter$EditFavouriteHolder_ViewBinding.weekOfWeekBasedYear(), this.count, 2, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NOT_NEGATIVE);
            } else if (this.count == 2) {
                return new C7058x42238fcc(editFavouriteAdapter$EditFavouriteHolder_ViewBinding.weekBasedYear(), 2, 2, 0, C7058x42238fcc.BASE_DATE);
            } else {
                DenominatorAmountAdapter$PencilViewHolder weekBasedYear = editFavouriteAdapter$EditFavouriteHolder_ViewBinding.weekBasedYear();
                int i = this.count;
                if (i < 4) {
                    moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding = MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL;
                } else {
                    moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding = MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD;
                }
                return new RatingCompat(weekBasedYear, i, 19, moneyPresentAdapter$MoneyPresentViewHolder_ViewBinding, -1);
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Localized(");
            char c = this.letter;
            if (c == 'Y') {
                int i = this.count;
                if (i == 1) {
                    sb.append("WeekBasedYear");
                } else if (i == 2) {
                    sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb.append("WeekBasedYear,");
                    sb.append(this.count);
                    sb.append(",");
                    sb.append(19);
                    sb.append(",");
                    sb.append(this.count < 4 ? MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.NORMAL : MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb.append("DayOfWeek");
                } else if (c == 'w') {
                    sb.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb.append("WeekOfMonth");
                }
                sb.append(",");
                sb.append(this.count);
            }
            sb.append(")");
            return sb.toString();
        }
    }
}
