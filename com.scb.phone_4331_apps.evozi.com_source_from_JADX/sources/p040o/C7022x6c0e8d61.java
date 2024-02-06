package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.RegistrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding */
public abstract class C7022x6c0e8d61 implements Comparable<C7022x6c0e8d61> {
    private static final ConcurrentHashMap<String, C7022x6c0e8d61> CHRONOS_BY_ID = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, C7022x6c0e8d61> CHRONOS_BY_TYPE = new ConcurrentHashMap<>();
    public static final EBillAdapter$EBillHolder<C7022x6c0e8d61> FROM = new EBillAdapter$EBillHolder<C7022x6c0e8d61>() {
        public final C7022x6c0e8d61 queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final Method LOCALE_METHOD;

    public abstract PromptPayMobileListAdapter$PromptPayListView date(int i, int i2, int i3);

    public abstract PromptPayMobileListAdapter$PromptPayListView date(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);

    public abstract PromptPayMobileListAdapter$PromptPayListView dateEpochDay(long j);

    public abstract PromptPayMobileListAdapter$PromptPayListView dateYearDay(int i, int i2);

    public abstract RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding eraOf(int i);

    public abstract List<RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding> eras();

    public abstract String getCalendarType();

    public abstract String getId();

    public abstract boolean isLeapYear(long j);

    public abstract int prolepticYear(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i);

    public abstract FavouriteTargetAdapter$ItemViewHolder range(TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder);

    public abstract PromptPayMobileListAdapter$PromptPayListView resolveDate(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", new Class[]{String.class});
        } catch (Throwable unused) {
            method = null;
        }
        LOCALE_METHOD = method;
    }

    public static C7022x6c0e8d61 from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null ? RemittanceCountryListAdapter$CountryViewHolder.INSTANCE : registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
    }

    public static C7022x6c0e8d61 ofLocale(Locale locale) {
        String str;
        init();
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        Method method = LOCALE_METHOD;
        if (method != null) {
            try {
                str = (String) method.invoke(locale, new Object[]{"ca"});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } else {
            if (locale.equals(RemittanceCountryListAdapter$TransferOptionViewHolder.LOCALE)) {
                str = "japanese";
            }
            str = "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = CHRONOS_BY_TYPE.get(str);
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown calendar system: ");
        sb.append(str);
        throw new DateTimeException(sb.toString());
    }

    /* renamed from: of */
    public static C7022x6c0e8d61 m3557of(String str) {
        init();
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = CHRONOS_BY_ID.get(str);
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 = CHRONOS_BY_TYPE.get(str);
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2 != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown chronology: ");
        sb.append(str);
        throw new DateTimeException(sb.toString());
    }

    public static Set<C7022x6c0e8d61> getAvailableChronologies() {
        init();
        return new HashSet(CHRONOS_BY_ID.values());
    }

    private static void init() {
        Class<C7022x6c0e8d61> cls = C7022x6c0e8d61.class;
        if (CHRONOS_BY_ID.isEmpty()) {
            register(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
            register(ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE);
            register(IncomingAdapter$IncomingHolder.INSTANCE);
            register(RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE);
            register(RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE);
            CHRONOS_BY_ID.putIfAbsent("Hijrah", RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE);
            CHRONOS_BY_TYPE.putIfAbsent("islamic", RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE);
            Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
            while (it.hasNext()) {
                C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) it.next();
                CHRONOS_BY_ID.putIfAbsent(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId(), registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding);
                String calendarType = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getCalendarType();
                if (calendarType != null) {
                    CHRONOS_BY_TYPE.putIfAbsent(calendarType, registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding);
                }
            }
        }
    }

    private static void register(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        CHRONOS_BY_ID.putIfAbsent(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId(), registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding);
        String calendarType = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getCalendarType();
        if (calendarType != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding);
        }
    }

    protected C7022x6c0e8d61() {
    }

    /* access modifiers changed from: package-private */
    public <D extends PromptPayMobileListAdapter$PromptPayListView> D ensureChronoLocalDate(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        D d = (PromptPayMobileListAdapter$PromptPayListView) denominatorAmountAdapter$BubbleViewDisableHolder;
        if (equals(d.getChronology())) {
            return d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, expected: ");
        sb.append(getId());
        sb.append(", actual: ");
        sb.append(d.getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public <D extends PromptPayMobileListAdapter$PromptPayListView> DepositAccountsAdapter$DepositAccountHolder<D> ensureChronoLocalDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        DepositAccountsAdapter$DepositAccountHolder<D> depositAccountsAdapter$DepositAccountHolder = (DepositAccountsAdapter$DepositAccountHolder) denominatorAmountAdapter$BubbleViewDisableHolder;
        if (equals(depositAccountsAdapter$DepositAccountHolder.toLocalDate().getChronology())) {
            return depositAccountsAdapter$DepositAccountHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(depositAccountsAdapter$DepositAccountHolder.toLocalDate().getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public <D extends PromptPayMobileListAdapter$PromptPayListView> RegistrationCountrySearchAdapter$CountryItemViewHolder<D> ensureChronoZonedDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        RegistrationCountrySearchAdapter$CountryItemViewHolder<D> registrationCountrySearchAdapter$CountryItemViewHolder = (RegistrationCountrySearchAdapter$CountryItemViewHolder) denominatorAmountAdapter$BubbleViewDisableHolder;
        if (equals(registrationCountrySearchAdapter$CountryItemViewHolder.toLocalDate().getChronology())) {
            return registrationCountrySearchAdapter$CountryItemViewHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chrono mismatch, required: ");
        sb.append(getId());
        sb.append(", supplied: ");
        sb.append(registrationCountrySearchAdapter$CountryItemViewHolder.toLocalDate().getChronology().getId());
        throw new ClassCastException(sb.toString());
    }

    public PromptPayMobileListAdapter$PromptPayListView date(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2, int i3) {
        return date(prolepticYear(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i), i2, i3);
    }

    public PromptPayMobileListAdapter$PromptPayListView dateYearDay(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2) {
        return dateYearDay(prolepticYear(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i), i2);
    }

    public PromptPayMobileListAdapter$PromptPayListView dateNow() {
        return dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public PromptPayMobileListAdapter$PromptPayListView dateNow(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public PromptPayMobileListAdapter$PromptPayListView dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return date(QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding));
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> localDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        try {
            return date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).atTime(QuickAccountSelectAdapter$SelectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
        } catch (DateTimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass());
            throw new DateTimeException(sb.toString(), e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        return p040o.RegistrationCountrySearchAdapter$CountryItemViewHolder.ofBest(ensureChronoLocalDateTime(localDateTime(r4)), r0, (p040o.ManageAccountInboundViewHolder_ViewBinding) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> zonedDateTime(p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding r4) {
        /*
            r3 = this;
            o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding r0 = p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.from(r4)     // Catch:{ DateTimeException -> 0x001b }
            o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding r1 = p040o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding.from(r4)     // Catch:{ DateTimeException -> 0x000d }
            o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding r4 = r3.zonedDateTime(r1, r0)     // Catch:{ DateTimeException -> 0x000d }
            return r4
        L_0x000d:
            o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding r1 = r3.localDateTime(r4)     // Catch:{ DateTimeException -> 0x001b }
            o.DepositAccountsAdapter$DepositAccountHolder r1 = r3.ensureChronoLocalDateTime(r1)     // Catch:{ DateTimeException -> 0x001b }
            r2 = 0
            o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding r4 = p040o.RegistrationCountrySearchAdapter$CountryItemViewHolder.ofBest(r1, r0, r2)     // Catch:{ DateTimeException -> 0x001b }
            return r4
        L_0x001b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to obtain ChronoZonedDateTime from TemporalAccessor: "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            org.threeten.bp.DateTimeException r4 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = r1.toString()
            r4.<init>(r1, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C7022x6c0e8d61.zonedDateTime(o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding):o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding");
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return RegistrationCountrySearchAdapter$CountryItemViewHolder.ofInstant(this, quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder period(int i, int i2, int i3) {
        return new PromptPayMobileListAdapter$PromptPayListView_ViewBinding(this, i, i2, i3);
    }

    public String getDisplayName(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendChronologyText(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding).toFormatter(locale).format(new TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding() {
            public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                return false;
            }

            public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }

            public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
                if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
                    return C7022x6c0e8d61.this;
                }
                return super.query(eBillAdapter$EBillHolder);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void updateResolveMap(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder, long j) {
        Long l = map.get(tierPricingInstallmentAdapter$InstallmentViewHolder);
        if (l == null || l.longValue() == j) {
            map.put(tierPricingInstallmentAdapter$InstallmentViewHolder, Long.valueOf(j));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid state, field: ");
        sb.append(tierPricingInstallmentAdapter$InstallmentViewHolder);
        sb.append(" ");
        sb.append(l);
        sb.append(" conflicts with ");
        sb.append(tierPricingInstallmentAdapter$InstallmentViewHolder);
        sb.append(" ");
        sb.append(j);
        throw new DateTimeException(sb.toString());
    }

    public int compareTo(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        return getId().compareTo(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7022x6c0e8d61)) {
            return false;
        }
        if (compareTo((C7022x6c0e8d61) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 11, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    static C7022x6c0e8d61 readExternal(DataInput dataInput) throws IOException {
        return m3557of(dataInput.readUTF());
    }
}
