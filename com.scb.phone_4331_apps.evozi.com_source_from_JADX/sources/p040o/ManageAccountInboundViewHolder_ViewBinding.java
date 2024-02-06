package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.ManageAccountInboundViewHolder_ViewBinding */
public final class ManageAccountInboundViewHolder_ViewBinding extends LanguageSettingAdapter$LanguageSettingHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<ManageAccountInboundViewHolder_ViewBinding>, Serializable {
    public static final EBillAdapter$EBillHolder<ManageAccountInboundViewHolder_ViewBinding> FROM = new EBillAdapter$EBillHolder<ManageAccountInboundViewHolder_ViewBinding>() {
        public final ManageAccountInboundViewHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return ManageAccountInboundViewHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final ConcurrentMap<String, ManageAccountInboundViewHolder_ViewBinding> ID_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ManageAccountInboundViewHolder_ViewBinding MAX = ofTotalSeconds(MAX_SECONDS);
    private static final int MAX_SECONDS = 64800;
    public static final ManageAccountInboundViewHolder_ViewBinding MIN = ofTotalSeconds(-64800);
    private static final int MINUTES_PER_HOUR = 60;
    private static final ConcurrentMap<Integer, ManageAccountInboundViewHolder_ViewBinding> SECONDS_CACHE = new ConcurrentHashMap(16, 0.75f, 4);
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    public static final ManageAccountInboundViewHolder_ViewBinding UTC = ofTotalSeconds(0);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: id */
    private final transient String f3158id;
    private final int totalSeconds;

    private static int totalSeconds(int i, int i2, int i3) {
        return (i * SECONDS_PER_HOUR) + (i2 * 60) + i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* renamed from: of */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.ManageAccountInboundViewHolder_ViewBinding m3529of(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, o.ManageAccountInboundViewHolder_ViewBinding> r0 = ID_CACHE
            java.lang.Object r0 = r0.get(r7)
            o.ManageAccountInboundViewHolder_ViewBinding r0 = (p040o.ManageAccountInboundViewHolder_ViewBinding) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x006e
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r4 = 5
            if (r0 == r4) goto L_0x0064
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x005b
            r5 = 7
            if (r0 == r5) goto L_0x004e
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = parseNumber(r7, r2, r3)
            int r1 = parseNumber(r7, r6, r2)
            int r2 = parseNumber(r7, r5, r2)
            goto L_0x0090
        L_0x0037:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            r0.append(r1)
            r0.append(r7)
            org.threeten.bp.DateTimeException r7 = new org.threeten.bp.DateTimeException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x004e:
            int r0 = parseNumber(r7, r2, r3)
            int r1 = parseNumber(r7, r1, r3)
            int r2 = parseNumber(r7, r4, r3)
            goto L_0x0090
        L_0x005b:
            int r0 = parseNumber(r7, r2, r3)
            int r1 = parseNumber(r7, r6, r2)
            goto L_0x006c
        L_0x0064:
            int r0 = parseNumber(r7, r2, r3)
            int r1 = parseNumber(r7, r1, r3)
        L_0x006c:
            r2 = r3
            goto L_0x0090
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x008a:
            int r0 = parseNumber(r7, r2, r3)
            r1 = r3
            r2 = r1
        L_0x0090:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x00b4
            if (r3 != r5) goto L_0x009d
            goto L_0x00b4
        L_0x009d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            r0.append(r1)
            r0.append(r7)
            org.threeten.bp.DateTimeException r7 = new org.threeten.bp.DateTimeException
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00b4:
            if (r3 != r5) goto L_0x00be
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            o.ManageAccountInboundViewHolder_ViewBinding r7 = ofHoursMinutesSeconds(r7, r0, r1)
            return r7
        L_0x00be:
            o.ManageAccountInboundViewHolder_ViewBinding r7 = ofHoursMinutesSeconds(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ManageAccountInboundViewHolder_ViewBinding.m3529of(java.lang.String):o.ManageAccountInboundViewHolder_ViewBinding");
    }

    private static int parseNumber(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for ZoneOffset, non numeric characters found: ");
            sb.append(charSequence);
            throw new DateTimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid ID for ZoneOffset, colon not found when expected: ");
        sb2.append(charSequence);
        throw new DateTimeException(sb2.toString());
    }

    public static ManageAccountInboundViewHolder_ViewBinding ofHours(int i) {
        return ofHoursMinutesSeconds(i, 0, 0);
    }

    public static ManageAccountInboundViewHolder_ViewBinding ofHoursMinutes(int i, int i2) {
        return ofHoursMinutesSeconds(i, i2, 0);
    }

    public static ManageAccountInboundViewHolder_ViewBinding ofHoursMinutesSeconds(int i, int i2, int i3) {
        validate(i, i2, i3);
        return ofTotalSeconds(totalSeconds(i, i2, i3));
    }

    public static ManageAccountInboundViewHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = (ManageAccountInboundViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset());
        if (manageAccountInboundViewHolder_ViewBinding != null) {
            return manageAccountInboundViewHolder_ViewBinding;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain ZoneOffset from TemporalAccessor: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        sb.append(", type ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
        throw new DateTimeException(sb.toString());
    }

    private static void validate(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            StringBuilder sb = new StringBuilder();
            sb.append("Zone offset hours not in valid range: value ");
            sb.append(i);
            sb.append(" is not in the range -18 to 18");
            throw new DateTimeException(sb.toString());
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Zone offset minutes not in valid range: abs(value) ");
            sb2.append(Math.abs(i2));
            sb2.append(" is not in the range 0 to 59");
            throw new DateTimeException(sb2.toString());
        } else if (Math.abs(i3) > 59) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Zone offset seconds not in valid range: abs(value) ");
            sb3.append(Math.abs(i3));
            sb3.append(" is not in the range 0 to 59");
            throw new DateTimeException(sb3.toString());
        } else if (Math.abs(i) != 18) {
        } else {
            if (Math.abs(i2) > 0 || Math.abs(i3) > 0) {
                throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    public static ManageAccountInboundViewHolder_ViewBinding ofTotalSeconds(int i) {
        if (Math.abs(i) > MAX_SECONDS) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ManageAccountInboundViewHolder_ViewBinding(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = (ManageAccountInboundViewHolder_ViewBinding) SECONDS_CACHE.get(valueOf);
            if (manageAccountInboundViewHolder_ViewBinding != null) {
                return manageAccountInboundViewHolder_ViewBinding;
            }
            SECONDS_CACHE.putIfAbsent(valueOf, new ManageAccountInboundViewHolder_ViewBinding(i));
            ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2 = (ManageAccountInboundViewHolder_ViewBinding) SECONDS_CACHE.get(valueOf);
            ID_CACHE.putIfAbsent(manageAccountInboundViewHolder_ViewBinding2.getId(), manageAccountInboundViewHolder_ViewBinding2);
            return manageAccountInboundViewHolder_ViewBinding2;
        }
    }

    private ManageAccountInboundViewHolder_ViewBinding(int i) {
        this.totalSeconds = i;
        this.f3158id = buildId(i);
    }

    private static String buildId(int i) {
        if (i == 0) {
            return "Z";
        }
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder();
        int i2 = abs / SECONDS_PER_HOUR;
        int i3 = (abs / 60) % 60;
        sb.append(i < 0 ? "-" : "+");
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        String str = ":";
        sb.append(i3 < 10 ? ":0" : str);
        sb.append(i3);
        int i4 = abs % 60;
        if (i4 != 0) {
            if (i4 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append(i4);
        }
        return sb.toString();
    }

    public final int getTotalSeconds() {
        return this.totalSeconds;
    }

    public final String getId() {
        return this.f3158id;
    }

    public final HistoryAdapter$ChildViewHolder getRules() {
        return HistoryAdapter$ChildViewHolder.m3515of(this);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder != TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
                return false;
            }
            return true;
        } else if (denominatorAmountAdapter$PencilViewHolder == null || !denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return (long) this.totalSeconds;
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new DateTimeException(sb.toString());
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone()) {
            return this;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) this.totalSeconds);
    }

    public final int compareTo(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return manageAccountInboundViewHolder_ViewBinding.totalSeconds - this.totalSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageAccountInboundViewHolder_ViewBinding)) {
            return false;
        }
        if (this.totalSeconds != ((ManageAccountInboundViewHolder_ViewBinding) obj).totalSeconds) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.totalSeconds;
    }

    public final String toString() {
        return this.f3158id;
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 8, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        writeExternal(dataOutput);
    }

    public final void writeExternal(DataOutput dataOutput) throws IOException {
        int i = this.totalSeconds;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static ManageAccountInboundViewHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(readByte * 900);
    }
}
