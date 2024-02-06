package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.AppCompatMultiAutoCompleteTextView;

/* renamed from: o.RegistrationManageDeviceAdapter$DeviceItemViewHolder */
public final class RegistrationManageDeviceAdapter$DeviceItemViewHolder extends ProfileManagementAdapter$ProfileManagementHolder<RegistrationManageDeviceAdapter$DeviceItemViewHolder> implements Serializable {
    private static final Long[] ADJUSTED_CYCLES = new Long[MAX_ADJUSTED_CYCLE];
    private static final HashMap<Integer, Integer[]> ADJUSTED_CYCLE_YEARS = new HashMap<>();
    private static final Integer[] ADJUSTED_LEAST_MAX_VALUES = new Integer[LEAST_MAX_VALUES.length];
    private static final Integer[] ADJUSTED_MAX_VALUES = new Integer[MAX_VALUES.length];
    private static final Integer[] ADJUSTED_MIN_VALUES = new Integer[MIN_VALUES.length];
    private static final HashMap<Integer, Integer[]> ADJUSTED_MONTH_DAYS = new HashMap<>();
    private static final HashMap<Integer, Integer[]> ADJUSTED_MONTH_LENGTHS = new HashMap<>();
    private static final int[] CYCLEYEAR_START_DATE = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final String DEFAULT_CONFIG_FILENAME = "hijrah_deviation.cfg";
    private static final String DEFAULT_CONFIG_PATH;
    private static final Integer[] DEFAULT_CYCLE_YEARS = new Integer[CYCLEYEAR_START_DATE.length];
    private static final Integer[] DEFAULT_LEAP_MONTH_DAYS = new Integer[LEAP_NUM_DAYS.length];
    private static final Integer[] DEFAULT_LEAP_MONTH_LENGTHS = new Integer[LEAP_MONTH_LENGTH.length];
    private static final Integer[] DEFAULT_MONTH_DAYS = new Integer[NUM_DAYS.length];
    private static final Integer[] DEFAULT_MONTH_LENGTHS = new Integer[MONTH_LENGTH.length];
    private static final char FILE_SEP = File.separatorChar;
    private static final int HIJRAH_JAN_1_1_GREGORIAN_DAY = -492148;
    private static final int[] LEAP_MONTH_LENGTH = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] LEAP_NUM_DAYS = {0, 30, 59, 89, 118, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 207, 236, 266, 295, 325};
    private static final int[] LEAST_MAX_VALUES = {1, MAX_VALUE_OF_ERA, 11, 51, 5, 29, 354};
    private static final int MAX_ADJUSTED_CYCLE = 334;
    private static final int[] MAX_VALUES = {1, MAX_VALUE_OF_ERA, 11, 52, 6, 30, 355};
    public static final int MAX_VALUE_OF_ERA = 9999;
    private static final int[] MIN_VALUES = {0, 1, 0, 1, 0, 1, 1};
    public static final int MIN_VALUE_OF_ERA = 1;
    private static final int[] MONTH_LENGTH = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] NUM_DAYS = {0, 30, 59, 89, 118, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 207, 236, 266, 295, 325};
    private static final String PATH_SEP = File.pathSeparator;
    private static final int POSITION_DAY_OF_MONTH = 5;
    private static final int POSITION_DAY_OF_YEAR = 6;
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient int dayOfMonth;
    private final transient QuickAccountSelectAdapter$FooterHolder_ViewBinding dayOfWeek;
    private final transient int dayOfYear;
    private final transient RemittanceCountryListAdapter$CountryExpandViewHolder era;
    private final long gregorianEpochDay;
    private final transient boolean isLeapYear = isLeapYear((long) this.yearOfEra);
    private final transient int monthOfYear;
    private final transient int yearOfEra;

    public final /* bridge */ /* synthetic */ long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return super.until(denominatorAmountAdapter$BubbleViewDisableHolder, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final /* bridge */ /* synthetic */ PurchaseAccountSourceAdapter$ItemViewHolder until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        return super.until(promptPayMobileListAdapter$PromptPayListView);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("org");
        sb.append(FILE_SEP);
        sb.append("threeten");
        sb.append(FILE_SEP);
        sb.append("bp");
        sb.append(FILE_SEP);
        sb.append("chrono");
        DEFAULT_CONFIG_PATH = sb.toString();
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = NUM_DAYS;
            if (i2 >= iArr.length) {
                break;
            }
            DEFAULT_MONTH_DAYS[i2] = Integer.valueOf(iArr[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = LEAP_NUM_DAYS;
            if (i3 >= iArr2.length) {
                break;
            }
            DEFAULT_LEAP_MONTH_DAYS[i3] = Integer.valueOf(iArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr3 = MONTH_LENGTH;
            if (i4 >= iArr3.length) {
                break;
            }
            DEFAULT_MONTH_LENGTHS[i4] = Integer.valueOf(iArr3[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr4 = LEAP_MONTH_LENGTH;
            if (i5 >= iArr4.length) {
                break;
            }
            DEFAULT_LEAP_MONTH_LENGTHS[i5] = Integer.valueOf(iArr4[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr5 = CYCLEYEAR_START_DATE;
            if (i6 >= iArr5.length) {
                break;
            }
            DEFAULT_CYCLE_YEARS[i6] = Integer.valueOf(iArr5[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Long[] lArr = ADJUSTED_CYCLES;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = Long.valueOf((long) (i7 * 10631));
            i7++;
        }
        int i8 = 0;
        while (true) {
            int[] iArr6 = MIN_VALUES;
            if (i8 >= iArr6.length) {
                break;
            }
            ADJUSTED_MIN_VALUES[i8] = Integer.valueOf(iArr6[i8]);
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr7 = LEAST_MAX_VALUES;
            if (i9 >= iArr7.length) {
                break;
            }
            ADJUSTED_LEAST_MAX_VALUES[i9] = Integer.valueOf(iArr7[i9]);
            i9++;
        }
        while (true) {
            int[] iArr8 = MAX_VALUES;
            if (i < iArr8.length) {
                ADJUSTED_MAX_VALUES[i] = Integer.valueOf(iArr8[i]);
                i++;
            } else {
                try {
                    readDeviationConfig();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    public static RegistrationManageDeviceAdapter$DeviceItemViewHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static RegistrationManageDeviceAdapter$DeviceItemViewHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static RegistrationManageDeviceAdapter$DeviceItemViewHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        return RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE.dateNow(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
    }

    /* renamed from: of */
    public static RegistrationManageDeviceAdapter$DeviceItemViewHolder m6249of(int i, int i2, int i3) {
        if (i > 0) {
            return m6251of(RemittanceCountryListAdapter$CountryExpandViewHolder.AH, i, i2, i3);
        }
        return m6251of(RemittanceCountryListAdapter$CountryExpandViewHolder.BEFORE_AH, 1 - i, i2, i3);
    }

    /* renamed from: of */
    static RegistrationManageDeviceAdapter$DeviceItemViewHolder m6251of(RemittanceCountryListAdapter$CountryExpandViewHolder remittanceCountryListAdapter$CountryExpandViewHolder, int i, int i2, int i3) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(remittanceCountryListAdapter$CountryExpandViewHolder, "era");
        checkValidYearOfEra(i);
        checkValidMonth(i2);
        checkValidDayOfMonth(i3);
        return new RegistrationManageDeviceAdapter$DeviceItemViewHolder(getGregorianEpochDay(remittanceCountryListAdapter$CountryExpandViewHolder.prolepticYear(i), i2, i3));
    }

    private static void checkValidYearOfEra(int i) {
        if (i <= 0 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
    }

    private static void checkValidDayOfYear(int i) {
        if (i <= 0 || i > getMaximumDayOfYear()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
    }

    private static void checkValidMonth(int i) {
        if (i <= 0 || i > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
    }

    private static void checkValidDayOfMonth(int i) {
        if (i <= 0 || i > getMaximumDayOfMonth()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid day of month of Hijrah date, day ");
            sb.append(i);
            sb.append(" greater than ");
            sb.append(getMaximumDayOfMonth());
            sb.append(" or less than 1");
            throw new DateTimeException(sb.toString());
        }
    }

    /* renamed from: of */
    static RegistrationManageDeviceAdapter$DeviceItemViewHolder m6250of(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return new RegistrationManageDeviceAdapter$DeviceItemViewHolder(quickAccountSelectAdapter$UnselectedHolder.toEpochDay());
    }

    static RegistrationManageDeviceAdapter$DeviceItemViewHolder ofEpochDay(long j) {
        return new RegistrationManageDeviceAdapter$DeviceItemViewHolder(j);
    }

    public static RegistrationManageDeviceAdapter$DeviceItemViewHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE.date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    private RegistrationManageDeviceAdapter$DeviceItemViewHolder(long j) {
        int[] hijrahDateInfo = getHijrahDateInfo(j);
        checkValidYearOfEra(hijrahDateInfo[1]);
        checkValidMonth(hijrahDateInfo[2]);
        checkValidDayOfMonth(hijrahDateInfo[3]);
        checkValidDayOfYear(hijrahDateInfo[4]);
        this.era = RemittanceCountryListAdapter$CountryExpandViewHolder.m6252of(hijrahDateInfo[0]);
        this.yearOfEra = hijrahDateInfo[1];
        this.monthOfYear = hijrahDateInfo[2];
        this.dayOfMonth = hijrahDateInfo[3];
        this.dayOfYear = hijrahDateInfo[4];
        this.dayOfWeek = QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(hijrahDateInfo[5]);
        this.gregorianEpochDay = j;
    }

    private Object readResolve() {
        return new RegistrationManageDeviceAdapter$DeviceItemViewHolder(this.gregorianEpochDay);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding getChronology() {
        return RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE;
    }

    public final RemittanceCountryListAdapter$CountryExpandViewHolder getEra() {
        return this.era;
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
            int i = AppCompatMultiAutoCompleteTextView.IconCompatParcelizer.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
            if (i == 1) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) lengthOfMonth());
            }
            if (i == 2) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) lengthOfYear());
            }
            if (i == 3) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 5);
            }
            if (i != 4) {
                return getChronology().range(tierPricingInstallmentAdapter$InstallmentViewHolder);
            }
            return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 1000);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        int i;
        int i2;
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        switch (AppCompatMultiAutoCompleteTextView.IconCompatParcelizer.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()]) {
            case 1:
                i = this.dayOfMonth;
                break;
            case 2:
                i = this.dayOfYear;
                break;
            case 3:
                i2 = (this.dayOfMonth - 1) / 7;
                break;
            case 4:
                i = this.yearOfEra;
                break;
            case 5:
                i = this.dayOfWeek.getValue();
                break;
            case 6:
                i2 = (this.dayOfMonth - 1) % 7;
                break;
            case 7:
                i2 = (this.dayOfYear - 1) % 7;
                break;
            case 8:
                return toEpochDay();
            case 9:
                i2 = (this.dayOfYear - 1) / 7;
                break;
            case 10:
                i = this.monthOfYear;
                break;
            case 11:
                i = this.yearOfEra;
                break;
            case 12:
                i = this.era.getValue();
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
        i = i2 + 1;
        return (long) i;
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) super.with(accountSourceAdapter$ItemViewHolder_ViewBinding);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        int i = (int) j;
        switch (AppCompatMultiAutoCompleteTextView.IconCompatParcelizer.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()]) {
            case 1:
                return resolvePreviousValid(this.yearOfEra, this.monthOfYear, i);
            case 2:
                int i2 = i - 1;
                return resolvePreviousValid(this.yearOfEra, (i2 / 30) + 1, (i2 % 30) + 1);
            case 3:
                return plusDays((j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.yearOfEra <= 0) {
                    i = 1 - i;
                }
                return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
            case 5:
                return plusDays(j - ((long) this.dayOfWeek.getValue()));
            case 6:
                return plusDays(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new RegistrationManageDeviceAdapter$DeviceItemViewHolder((long) i);
            case 9:
                return plusDays((j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return resolvePreviousValid(this.yearOfEra, i, this.dayOfMonth);
            case 11:
                return resolvePreviousValid(i, this.monthOfYear, this.dayOfMonth);
            case 12:
                return resolvePreviousValid(1 - this.yearOfEra, this.monthOfYear, this.dayOfMonth);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    private static RegistrationManageDeviceAdapter$DeviceItemViewHolder resolvePreviousValid(int i, int i2, int i3) {
        int monthDays = getMonthDays(i2 - 1, i);
        if (i3 > monthDays) {
            i3 = monthDays;
        }
        return m6249of(i, i2, i3);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) super.plus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (RegistrationManageDeviceAdapter$DeviceItemViewHolder) super.minus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<RegistrationManageDeviceAdapter$DeviceItemViewHolder> atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return super.atTime(quickAccountSelectAdapter$SelectedHolder);
    }

    public final long toEpochDay() {
        return getGregorianEpochDay(this.yearOfEra, this.monthOfYear, this.dayOfMonth);
    }

    public final boolean isLeapYear() {
        return this.isLeapYear;
    }

    /* access modifiers changed from: package-private */
    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder plusYears(long j) {
        if (j == 0) {
            return this;
        }
        return m6251of(this.era, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.yearOfEra, (int) j), this.monthOfYear, this.dayOfMonth);
    }

    /* access modifiers changed from: package-private */
    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.monthOfYear - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(i2, 1);
        }
        return m6251of(this.era, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.yearOfEra, i2), i3 + 1, this.dayOfMonth);
    }

    /* access modifiers changed from: package-private */
    public final RegistrationManageDeviceAdapter$DeviceItemViewHolder plusDays(long j) {
        return new RegistrationManageDeviceAdapter$DeviceItemViewHolder(this.gregorianEpochDay + j);
    }

    private static int[] getHijrahDateInfo(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = j + 492148;
        if (j2 >= 0) {
            int cycleNumber = getCycleNumber(j2);
            int dayOfCycle = getDayOfCycle(j2, cycleNumber);
            int yearInCycle = getYearInCycle(cycleNumber, (long) dayOfCycle);
            i4 = getDayOfYear(cycleNumber, dayOfCycle, yearInCycle);
            i5 = (cycleNumber * 30) + yearInCycle + 1;
            i3 = getMonthOfYear(i4, i5);
            i2 = getDayOfMonth(i4, i3, i5) + 1;
            i = RemittanceCountryListAdapter$CountryExpandViewHolder.AH.getValue();
        } else {
            int i6 = (int) j2;
            int i7 = i6 / 10631;
            int i8 = i6 % 10631;
            if (i8 == 0) {
                i8 = -10631;
                i7++;
            }
            int yearInCycle2 = getYearInCycle(i7, (long) i8);
            int dayOfYear2 = getDayOfYear(i7, i8, yearInCycle2);
            int i9 = 1 - ((i7 * 30) - yearInCycle2);
            int i10 = isLeapYear((long) i9) ? dayOfYear2 + 355 : dayOfYear2 + 354;
            i3 = getMonthOfYear(i10, i9);
            i2 = getDayOfMonth(i10, i3, i9) + 1;
            i = RemittanceCountryListAdapter$CountryExpandViewHolder.BEFORE_AH.getValue();
            int i11 = i9;
            i4 = i10;
            i5 = i11;
        }
        int i12 = (int) ((j2 + 5) % 7);
        return new int[]{i, i5, i3 + 1, i2, i4 + 1, i12 + (i12 <= 0 ? 7 : 0)};
    }

    private static long getGregorianEpochDay(int i, int i2, int i3) {
        return yearToGregorianEpochDay(i) + ((long) getMonthDays(i2 - 1, i)) + ((long) i3);
    }

    private static long yearToGregorianEpochDay(int i) {
        Long l;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = getAdjustedCycle(i3)[Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l = ADJUSTED_CYCLES[i3];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i3 * 10631));
        }
        return ((l.longValue() + ((long) intValue)) - 492148) - 1;
    }

    private static int getCycleNumber(long j) {
        Long[] lArr = ADJUSTED_CYCLES;
        int i = 0;
        while (i < lArr.length) {
            try {
                if (j < lArr[i].longValue()) {
                    return i - 1;
                }
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j) / 10631;
            }
        }
        return ((int) j) / 10631;
    }

    private static int getDayOfCycle(long j, int i) {
        Long l;
        try {
            l = ADJUSTED_CYCLES[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = Long.valueOf((long) (i * 10631));
        }
        return (int) (j - l.longValue());
    }

    private static int getYearInCycle(int i, long j) {
        Integer[] adjustedCycle = getAdjustedCycle(i);
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i2 > 0) {
            while (i3 < adjustedCycle.length) {
                if (j < ((long) adjustedCycle[i3].intValue())) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j2 = -j;
        while (i3 < adjustedCycle.length) {
            if (j2 <= ((long) adjustedCycle[i3].intValue())) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    private static Integer[] getAdjustedCycle(int i) {
        Integer[] numArr;
        try {
            numArr = ADJUSTED_CYCLE_YEARS.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? DEFAULT_CYCLE_YEARS : numArr;
    }

    private static Integer[] getAdjustedMonthDays(int i) {
        Integer[] numArr;
        try {
            numArr = ADJUSTED_MONTH_DAYS.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i)) {
            return DEFAULT_LEAP_MONTH_DAYS;
        }
        return DEFAULT_MONTH_DAYS;
    }

    private static Integer[] getAdjustedMonthLength(int i) {
        Integer[] numArr;
        try {
            numArr = ADJUSTED_MONTH_LENGTHS.get(Integer.valueOf(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (isLeapYear((long) i)) {
            return DEFAULT_LEAP_MONTH_LENGTHS;
        }
        return DEFAULT_MONTH_LENGTHS;
    }

    private static int getDayOfYear(int i, int i2, int i3) {
        Integer[] adjustedCycle = getAdjustedCycle(i);
        if (i2 > 0) {
            return i2 - adjustedCycle[i3].intValue();
        }
        return adjustedCycle[i3].intValue() + i2;
    }

    private static int getMonthOfYear(int i, int i2) {
        Integer[] adjustedMonthDays = getAdjustedMonthDays(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < adjustedMonthDays.length) {
                if (i < adjustedMonthDays[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = isLeapYear((long) i2) ? i + 355 : i + 354;
        while (i3 < adjustedMonthDays.length) {
            if (i4 < adjustedMonthDays[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    private static int getDayOfMonth(int i, int i2, int i3) {
        int i4;
        Integer[] adjustedMonthDays = getAdjustedMonthDays(i3);
        if (i < 0) {
            i = isLeapYear((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            i4 = adjustedMonthDays[i2].intValue();
        } else if (i2 <= 0) {
            return i;
        } else {
            i4 = adjustedMonthDays[i2].intValue();
        }
        return i - i4;
    }

    static boolean isLeapYear(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    private static int getMonthDays(int i, int i2) {
        return getAdjustedMonthDays(i2)[i].intValue();
    }

    static int getMonthLength(int i, int i2) {
        return getAdjustedMonthLength(i2)[i].intValue();
    }

    public final int lengthOfMonth() {
        return getMonthLength(this.monthOfYear - 1, this.yearOfEra);
    }

    static int getYearLength(int i) {
        Integer[] numArr;
        int i2;
        int i3;
        int i4 = i - 1;
        int i5 = i4 / 30;
        try {
            numArr = ADJUSTED_CYCLE_YEARS.get(Integer.valueOf(i5));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return isLeapYear((long) i) ? 355 : 354;
        }
        int i6 = i4 % 30;
        if (i6 == 29) {
            i2 = ADJUSTED_CYCLES[i5 + 1].intValue() - ADJUSTED_CYCLES[i5].intValue();
            i3 = numArr[i6].intValue();
        } else {
            i2 = numArr[i6 + 1].intValue();
            i3 = numArr[i6].intValue();
        }
        return i2 - i3;
    }

    public final int lengthOfYear() {
        return getYearLength(this.yearOfEra);
    }

    static int getMaximumDayOfMonth() {
        return ADJUSTED_MAX_VALUES[5].intValue();
    }

    static int getSmallestMaximumDayOfMonth() {
        return ADJUSTED_LEAST_MAX_VALUES[5].intValue();
    }

    static int getMaximumDayOfYear() {
        return ADJUSTED_MAX_VALUES[6].intValue();
    }

    static int getSmallestMaximumDayOfYear() {
        return ADJUSTED_LEAST_MAX_VALUES[6].intValue();
    }

    private static void addDeviationAsHijrah(int i, int i2, int i3, int i4, int i5) {
        if (i <= 0) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i3 <= 0) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i2 < 0 || i2 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i4 < 0 || i4 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i3 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i3 < i) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i3 != i || i4 >= i2) {
            boolean isLeapYear2 = isLeapYear((long) i);
            Integer[] numArr = ADJUSTED_MONTH_DAYS.get(Integer.valueOf(i));
            if (numArr == null) {
                if (!isLeapYear2) {
                    numArr = new Integer[NUM_DAYS.length];
                    int i6 = 0;
                    while (true) {
                        int[] iArr = NUM_DAYS;
                        if (i6 >= iArr.length) {
                            break;
                        }
                        numArr[i6] = Integer.valueOf(iArr[i6]);
                        i6++;
                    }
                } else {
                    numArr = new Integer[LEAP_NUM_DAYS.length];
                    int i7 = 0;
                    while (true) {
                        int[] iArr2 = LEAP_NUM_DAYS;
                        if (i7 >= iArr2.length) {
                            break;
                        }
                        numArr[i7] = Integer.valueOf(iArr2[i7]);
                        i7++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i8 = 0; i8 < 12; i8++) {
                if (i8 > i2) {
                    numArr2[i8] = Integer.valueOf(numArr[i8].intValue() - i5);
                } else {
                    numArr2[i8] = Integer.valueOf(numArr[i8].intValue());
                }
            }
            ADJUSTED_MONTH_DAYS.put(Integer.valueOf(i), numArr2);
            Integer[] numArr3 = ADJUSTED_MONTH_LENGTHS.get(Integer.valueOf(i));
            if (numArr3 == null) {
                if (!isLeapYear2) {
                    numArr3 = new Integer[MONTH_LENGTH.length];
                    int i9 = 0;
                    while (true) {
                        int[] iArr3 = MONTH_LENGTH;
                        if (i9 >= iArr3.length) {
                            break;
                        }
                        numArr3[i9] = Integer.valueOf(iArr3[i9]);
                        i9++;
                    }
                } else {
                    numArr3 = new Integer[LEAP_MONTH_LENGTH.length];
                    int i10 = 0;
                    while (true) {
                        int[] iArr4 = LEAP_MONTH_LENGTH;
                        if (i10 >= iArr4.length) {
                            break;
                        }
                        numArr3[i10] = Integer.valueOf(iArr4[i10]);
                        i10++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i11 = 0; i11 < 12; i11++) {
                if (i11 == i2) {
                    numArr4[i11] = Integer.valueOf(numArr3[i11].intValue() - i5);
                } else {
                    numArr4[i11] = Integer.valueOf(numArr3[i11].intValue());
                }
            }
            ADJUSTED_MONTH_LENGTHS.put(Integer.valueOf(i), numArr4);
            if (i != i3) {
                int i12 = i - 1;
                int i13 = i12 / 30;
                Integer[] numArr5 = ADJUSTED_CYCLE_YEARS.get(Integer.valueOf(i13));
                if (numArr5 == null) {
                    int length = CYCLEYEAR_START_DATE.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i14 = 0; i14 < length; i14++) {
                        numArr6[i14] = Integer.valueOf(CYCLEYEAR_START_DATE[i14]);
                    }
                    numArr5 = numArr6;
                }
                int i15 = i12 % 30;
                while (true) {
                    i15++;
                    if (i15 >= CYCLEYEAR_START_DATE.length) {
                        break;
                    }
                    numArr5[i15] = Integer.valueOf(numArr5[i15].intValue() - i5);
                }
                ADJUSTED_CYCLE_YEARS.put(Integer.valueOf(i13), numArr5);
                int i16 = i3 - 1;
                int i17 = i16 / 30;
                if (i13 != i17) {
                    while (true) {
                        i13++;
                        Long[] lArr = ADJUSTED_CYCLES;
                        if (i13 >= lArr.length) {
                            break;
                        }
                        lArr[i13] = Long.valueOf(lArr[i13].longValue() - ((long) i5));
                    }
                    int i18 = i17 + 1;
                    while (true) {
                        Long[] lArr2 = ADJUSTED_CYCLES;
                        if (i18 >= lArr2.length) {
                            break;
                        }
                        lArr2[i18] = Long.valueOf(lArr2[i18].longValue() + ((long) i5));
                        i18++;
                    }
                }
                Integer[] numArr7 = ADJUSTED_CYCLE_YEARS.get(Integer.valueOf(i17));
                if (numArr7 == null) {
                    int length2 = CYCLEYEAR_START_DATE.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        numArr8[i19] = Integer.valueOf(CYCLEYEAR_START_DATE[i19]);
                    }
                    numArr7 = numArr8;
                }
                int i20 = i16 % 30;
                while (true) {
                    i20++;
                    if (i20 >= CYCLEYEAR_START_DATE.length) {
                        break;
                    }
                    numArr7[i20] = Integer.valueOf(numArr7[i20].intValue() + i5);
                }
                ADJUSTED_CYCLE_YEARS.put(Integer.valueOf(i17), numArr7);
            }
            boolean isLeapYear3 = isLeapYear((long) i3);
            Integer[] numArr9 = ADJUSTED_MONTH_DAYS.get(Integer.valueOf(i3));
            if (numArr9 == null) {
                if (!isLeapYear3) {
                    numArr9 = new Integer[NUM_DAYS.length];
                    int i21 = 0;
                    while (true) {
                        int[] iArr5 = NUM_DAYS;
                        if (i21 >= iArr5.length) {
                            break;
                        }
                        numArr9[i21] = Integer.valueOf(iArr5[i21]);
                        i21++;
                    }
                } else {
                    numArr9 = new Integer[LEAP_NUM_DAYS.length];
                    int i22 = 0;
                    while (true) {
                        int[] iArr6 = LEAP_NUM_DAYS;
                        if (i22 >= iArr6.length) {
                            break;
                        }
                        numArr9[i22] = Integer.valueOf(iArr6[i22]);
                        i22++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i23 = 0; i23 < 12; i23++) {
                if (i23 > i4) {
                    numArr10[i23] = Integer.valueOf(numArr9[i23].intValue() + i5);
                } else {
                    numArr10[i23] = Integer.valueOf(numArr9[i23].intValue());
                }
            }
            ADJUSTED_MONTH_DAYS.put(Integer.valueOf(i3), numArr10);
            Integer[] numArr11 = ADJUSTED_MONTH_LENGTHS.get(Integer.valueOf(i3));
            if (numArr11 == null) {
                if (!isLeapYear3) {
                    numArr11 = new Integer[MONTH_LENGTH.length];
                    int i24 = 0;
                    while (true) {
                        int[] iArr7 = MONTH_LENGTH;
                        if (i24 >= iArr7.length) {
                            break;
                        }
                        numArr11[i24] = Integer.valueOf(iArr7[i24]);
                        i24++;
                    }
                } else {
                    numArr11 = new Integer[LEAP_MONTH_LENGTH.length];
                    int i25 = 0;
                    while (true) {
                        int[] iArr8 = LEAP_MONTH_LENGTH;
                        if (i25 >= iArr8.length) {
                            break;
                        }
                        numArr11[i25] = Integer.valueOf(iArr8[i25]);
                        i25++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i26 = 0; i26 < 12; i26++) {
                if (i26 == i4) {
                    numArr12[i26] = Integer.valueOf(numArr11[i26].intValue() + i5);
                } else {
                    numArr12[i26] = Integer.valueOf(numArr11[i26].intValue());
                }
            }
            ADJUSTED_MONTH_LENGTHS.put(Integer.valueOf(i3), numArr12);
            Integer[] numArr13 = ADJUSTED_MONTH_LENGTHS.get(Integer.valueOf(i));
            Integer[] numArr14 = ADJUSTED_MONTH_LENGTHS.get(Integer.valueOf(i3));
            int intValue = numArr13[i2].intValue();
            int intValue2 = numArr14[i4].intValue();
            int intValue3 = ADJUSTED_MONTH_DAYS.get(Integer.valueOf(i))[11].intValue() + numArr13[11].intValue();
            int intValue4 = ADJUSTED_MONTH_DAYS.get(Integer.valueOf(i3))[11].intValue() + numArr14[11].intValue();
            int intValue5 = ADJUSTED_MAX_VALUES[5].intValue();
            int intValue6 = ADJUSTED_LEAST_MAX_VALUES[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            ADJUSTED_MAX_VALUES[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            ADJUSTED_LEAST_MAX_VALUES[5] = Integer.valueOf(intValue2);
            int intValue7 = ADJUSTED_MAX_VALUES[6].intValue();
            int intValue8 = ADJUSTED_LEAST_MAX_VALUES[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            ADJUSTED_MAX_VALUES[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            ADJUSTED_LEAST_MAX_VALUES[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void readDeviationConfig() throws java.io.IOException, java.text.ParseException {
        /*
            java.io.InputStream r0 = getConfigFileInputStream()
            if (r0 == 0) goto L_0x002f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0027 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0027 }
            r2.<init>(r0)     // Catch:{ all -> 0x0027 }
            r1.<init>(r2)     // Catch:{ all -> 0x0027 }
            r0 = 0
        L_0x0011:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0021
            int r0 = r0 + 1
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x0025 }
            parseLine(r2, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x0011
        L_0x0021:
            r1.close()
            return
        L_0x0025:
            r0 = move-exception
            goto L_0x0029
        L_0x0027:
            r0 = move-exception
            r1 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            throw r0
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.RegistrationManageDeviceAdapter$DeviceItemViewHolder.readDeviationConfig():void");
    }

    private static void parseLine(String str, int i) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Unknown error at line ");
                                                    sb.append(i);
                                                    sb.append(".");
                                                    throw new ParseException(sb.toString(), i);
                                                }
                                                addDeviationAsHijrah(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("End month is not properly set at line ");
                                                sb2.append(i);
                                                sb2.append(".");
                                                throw new ParseException(sb2.toString(), i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("End year is not properly set at line ");
                                            sb3.append(i);
                                            sb3.append(".");
                                            throw new ParseException(sb3.toString(), i);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("End year/month has incorrect format at line ");
                                        sb4.append(i);
                                        sb4.append(".");
                                        throw new ParseException(sb4.toString(), i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Start month is not properly set at line ");
                                    sb5.append(i);
                                    sb5.append(".");
                                    throw new ParseException(sb5.toString(), i);
                                }
                            } catch (NumberFormatException unused4) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Start year is not properly set at line ");
                                sb6.append(i);
                                sb6.append(".");
                                throw new ParseException(sb6.toString(), i);
                            }
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Start year/month has incorrect format at line ");
                            sb7.append(i);
                            sb7.append(".");
                            throw new ParseException(sb7.toString(), i);
                        }
                    } else {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Start and end year/month has incorrect format at line ");
                        sb8.append(i);
                        sb8.append(".");
                        throw new ParseException(sb8.toString(), i);
                    }
                } catch (NumberFormatException unused5) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Offset is not properly set at line ");
                    sb9.append(i);
                    sb9.append(".");
                    throw new ParseException(sb9.toString(), i);
                }
            } else {
                StringBuilder sb10 = new StringBuilder();
                sb10.append("Offset has incorrect format at line ");
                sb10.append(i);
                sb10.append(".");
                throw new ParseException(sb10.toString(), i);
            }
        }
    }

    private static InputStream getConfigFileInputStream() throws IOException {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = DEFAULT_CONFIG_FILENAME;
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(property2);
                sb.append(System.getProperty("file.separator"));
                property2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(property2);
            sb2.append(FILE_SEP);
            sb2.append(property);
            File file = new File(sb2.toString());
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e) {
                throw e;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), PATH_SEP);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(nextToken);
                        sb3.append(FILE_SEP);
                        sb3.append(DEFAULT_CONFIG_PATH);
                        if (new File(sb3.toString(), property).exists()) {
                            try {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(nextToken);
                                sb4.append(FILE_SEP);
                                sb4.append(DEFAULT_CONFIG_PATH);
                                sb4.append(FILE_SEP);
                                sb4.append(property);
                                return new FileInputStream(sb4.toString());
                            } catch (IOException e2) {
                                throw e2;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(DEFAULT_CONFIG_PATH);
                            sb5.append(FILE_SEP);
                            sb5.append(property);
                            String obj = sb5.toString();
                            ZipEntry entry = zipFile.getEntry(obj);
                            if (entry == null) {
                                char c = FILE_SEP;
                                if (c == '/') {
                                    obj = obj.replace('/', '\\');
                                } else if (c == '\\') {
                                    obj = obj.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(obj);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e3) {
                                    throw e3;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 3, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH));
    }

    static PromptPayMobileListAdapter$PromptPayListView readExternal(DataInput dataInput) throws IOException {
        return RegistrationManageDeviceAdapter$DeviceItemViewHolder_ViewBinding.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
