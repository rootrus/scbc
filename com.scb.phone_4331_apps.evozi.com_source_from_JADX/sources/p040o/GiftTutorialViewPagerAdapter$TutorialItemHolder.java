package p040o;

import java.util.Locale;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.GiftTutorialViewPagerAdapter$TutorialItemHolder */
final class GiftTutorialViewPagerAdapter$TutorialItemHolder {
    private Locale locale;
    private int optional;
    private GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder symbols;
    private DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding temporal;

    GiftTutorialViewPagerAdapter$TutorialItemHolder(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        this.temporal = adjust(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder);
        this.locale = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getLocale();
        this.symbols = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getDecimalStyle();
    }

    GiftTutorialViewPagerAdapter$TutorialItemHolder(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, Locale locale2, GiftSelectRecipientFromFavouriteAdapter$RecipientViewHolder giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder) {
        this.temporal = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        this.locale = locale2;
        this.symbols = giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder;
    }

    private static DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding adjust(final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        C7022x6c0e8d61 chronology = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getChronology();
        LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.getZone();
        if (chronology == null && zone == null) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId());
        final PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView = null;
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, chronology)) {
            chronology = null;
        }
        if (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.equals(languageSettingAdapter$LanguageSettingHolder_ViewBinding, zone)) {
            zone = null;
        }
        if (chronology == null && zone == null) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        final C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 = chronology != null ? chronology : registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        if (zone != null) {
            languageSettingAdapter$LanguageSettingHolder_ViewBinding = zone;
        }
        if (zone != null) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)) {
                if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 == null) {
                    registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 = RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
                }
                return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2.zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding), zone);
            }
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding normalized = zone.normalized();
            ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = (ManageAccountInboundViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset());
            if ((normalized instanceof ManageAccountInboundViewHolder_ViewBinding) && manageAccountInboundViewHolder_ViewBinding != null && !normalized.equals(manageAccountInboundViewHolder_ViewBinding)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid override zone for temporal: ");
                sb.append(zone);
                sb.append(" ");
                sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
                throw new DateTimeException(sb.toString());
            }
        }
        if (chronology != null) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY)) {
                promptPayMobileListAdapter$PromptPayListView = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2.date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            } else if (!(chronology == RemittanceCountryListAdapter$CountryViewHolder.INSTANCE && registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null)) {
                TierPricingInstallmentAdapter$InstallmentViewHolder[] values = TierPricingInstallmentAdapter$InstallmentViewHolder.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = values[i];
                    if (!tierPricingInstallmentAdapter$InstallmentViewHolder.isDateBased() || !denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(tierPricingInstallmentAdapter$InstallmentViewHolder)) {
                        i++;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid override chronology for temporal: ");
                        sb2.append(chronology);
                        sb2.append(" ");
                        sb2.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
                        throw new DateTimeException(sb2.toString());
                    }
                }
            }
        }
        return new TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding() {
            public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                if (PromptPayMobileListAdapter$PromptPayListView.this == null || !denominatorAmountAdapter$PencilViewHolder.isDateBased()) {
                    return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(denominatorAmountAdapter$PencilViewHolder);
                }
                return PromptPayMobileListAdapter$PromptPayListView.this.isSupported(denominatorAmountAdapter$PencilViewHolder);
            }

            public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                if (PromptPayMobileListAdapter$PromptPayListView.this == null || !denominatorAmountAdapter$PencilViewHolder.isDateBased()) {
                    return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.range(denominatorAmountAdapter$PencilViewHolder);
                }
                return PromptPayMobileListAdapter$PromptPayListView.this.range(denominatorAmountAdapter$PencilViewHolder);
            }

            public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                if (PromptPayMobileListAdapter$PromptPayListView.this == null || !denominatorAmountAdapter$PencilViewHolder.isDateBased()) {
                    return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(denominatorAmountAdapter$PencilViewHolder);
                }
                return PromptPayMobileListAdapter$PromptPayListView.this.getLong(denominatorAmountAdapter$PencilViewHolder);
            }

            public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
                if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
                    return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2;
                }
                if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
                    return languageSettingAdapter$LanguageSettingHolder_ViewBinding;
                }
                if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
                    return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(eBillAdapter$EBillHolder);
                }
                return eBillAdapter$EBillHolder.queryFrom(this);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding getTemporal() {
        return this.temporal;
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
    public final void startOptional() {
        this.optional++;
    }

    /* access modifiers changed from: package-private */
    public final void endOptional() {
        this.optional--;
    }

    /* access modifiers changed from: package-private */
    public final <R> R getValue(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        R query = this.temporal.query(eBillAdapter$EBillHolder);
        if (query != null || this.optional != 0) {
            return query;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to extract value: ");
        sb.append(this.temporal.getClass());
        throw new DateTimeException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final Long getValue(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        try {
            return Long.valueOf(this.temporal.getLong(denominatorAmountAdapter$PencilViewHolder));
        } catch (DateTimeException e) {
            if (this.optional > 0) {
                return null;
            }
            throw e;
        }
    }

    public final String toString() {
        return this.temporal.toString();
    }

    /* access modifiers changed from: package-private */
    public final void setDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        this.temporal = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
    }

    /* access modifiers changed from: package-private */
    public final void setLocale(Locale locale2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale2, "locale");
        this.locale = locale2;
    }
}
