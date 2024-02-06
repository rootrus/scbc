package p040o;

/* renamed from: o.DenominatorAmountAdapter$BubbleViewHolder_ViewBinding */
public final class DenominatorAmountAdapter$BubbleViewHolder_ViewBinding {
    static final EBillAdapter$EBillHolder<C7022x6c0e8d61> CHRONO = new EBillAdapter$EBillHolder<C7022x6c0e8d61>() {
        public final C7022x6c0e8d61 queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(this);
        }
    };
    static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder> LOCAL_DATE = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder>() {
        public final QuickAccountSelectAdapter$UnselectedHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY)) {
                return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY));
            }
            return null;
        }
    };
    static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$SelectedHolder> LOCAL_TIME = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$SelectedHolder>() {
        public final QuickAccountSelectAdapter$SelectedHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY)) {
                return QuickAccountSelectAdapter$SelectedHolder.ofNanoOfDay(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY));
            }
            return null;
        }
    };
    static final EBillAdapter$EBillHolder<ManageAccountInboundViewHolder_ViewBinding> OFFSET = new EBillAdapter$EBillHolder<ManageAccountInboundViewHolder_ViewBinding>() {
        public final ManageAccountInboundViewHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS)) {
                return ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS));
            }
            return null;
        }
    };
    static final EBillAdapter$EBillHolder<EBillAdapter$EBillHolder_ViewBinding> PRECISION = new EBillAdapter$EBillHolder<EBillAdapter$EBillHolder_ViewBinding>() {
        public final EBillAdapter$EBillHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return (EBillAdapter$EBillHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(this);
        }
    };
    static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> ZONE = new EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding>() {
        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.ZONE_ID);
            return languageSettingAdapter$LanguageSettingHolder_ViewBinding != null ? languageSettingAdapter$LanguageSettingHolder_ViewBinding : (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.OFFSET);
        }
    };
    static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> ZONE_ID = new EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding>() {
        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(this);
        }
    };
    public final String IconCompatParcelizer;
    public final String read;

    private DenominatorAmountAdapter$BubbleViewHolder_ViewBinding() {
    }

    public static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> zoneId() {
        return ZONE_ID;
    }

    public static final EBillAdapter$EBillHolder<C7022x6c0e8d61> chronology() {
        return CHRONO;
    }

    public static final EBillAdapter$EBillHolder<EBillAdapter$EBillHolder_ViewBinding> precision() {
        return PRECISION;
    }

    public static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> zone() {
        return ZONE;
    }

    public static final EBillAdapter$EBillHolder<ManageAccountInboundViewHolder_ViewBinding> offset() {
        return OFFSET;
    }

    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder> localDate() {
        return LOCAL_DATE;
    }

    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$SelectedHolder> localTime() {
        return LOCAL_TIME;
    }

    public DenominatorAmountAdapter$BubbleViewHolder_ViewBinding(String str, String str2) {
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) str2, "description");
        this.IconCompatParcelizer = str;
        this.read = str2;
    }
}
