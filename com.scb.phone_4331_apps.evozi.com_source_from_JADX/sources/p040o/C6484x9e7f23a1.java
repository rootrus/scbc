package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding */
public final class C6484x9e7f23a1 implements Serializable {
    private static final int SECS_PER_DAY = 86400;
    private static final long serialVersionUID = 6889046316657758795L;
    private final int adjustDays;
    private final byte dom;
    private final QuickAccountSelectAdapter$FooterHolder_ViewBinding dow;
    private final PrepaidTransactionAdapter$ChildViewHolder month;
    private final ManageAccountInboundViewHolder_ViewBinding offsetAfter;
    private final ManageAccountInboundViewHolder_ViewBinding offsetBefore;
    private final ManageAccountInboundViewHolder_ViewBinding standardOffset;
    private final QuickAccountSelectAdapter$SelectedHolder time;
    private final IconCompatParcelizer timeDefinition;

    /* renamed from: of */
    public static C6484x9e7f23a1 m3508of(PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i, QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, boolean z, IconCompatParcelizer iconCompatParcelizer, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding3) {
        int i2 = i;
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder2 = quickAccountSelectAdapter$SelectedHolder;
        PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder2 = prepaidTransactionAdapter$ChildViewHolder;
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(prepaidTransactionAdapter$ChildViewHolder, "month");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder, "time");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(iconCompatParcelizer, "timeDefnition");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "standardOffset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding2, "offsetBefore");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (!z || quickAccountSelectAdapter$SelectedHolder.equals(QuickAccountSelectAdapter$SelectedHolder.MIDNIGHT)) {
            return new C6484x9e7f23a1(prepaidTransactionAdapter$ChildViewHolder, i, quickAccountSelectAdapter$FooterHolder_ViewBinding, quickAccountSelectAdapter$SelectedHolder, z ? 1 : 0, iconCompatParcelizer, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding2, manageAccountInboundViewHolder_ViewBinding3);
        } else {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
    }

    C6484x9e7f23a1(PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i, QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, int i2, IconCompatParcelizer iconCompatParcelizer, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding3) {
        this.month = prepaidTransactionAdapter$ChildViewHolder;
        this.dom = (byte) i;
        this.dow = quickAccountSelectAdapter$FooterHolder_ViewBinding;
        this.time = quickAccountSelectAdapter$SelectedHolder;
        this.adjustDays = i2;
        this.timeDefinition = iconCompatParcelizer;
        this.standardOffset = manageAccountInboundViewHolder_ViewBinding;
        this.offsetBefore = manageAccountInboundViewHolder_ViewBinding2;
        this.offsetAfter = manageAccountInboundViewHolder_ViewBinding3;
    }

    private Object writeReplace() {
        return new FavouriteTargetAdapter$ItemViewHolder_ViewBinding((byte) 3, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        int i;
        int i2;
        int i3;
        int secondOfDay = this.time.toSecondOfDay() + (this.adjustDays * SECS_PER_DAY);
        int totalSeconds = this.standardOffset.getTotalSeconds();
        int totalSeconds2 = this.offsetBefore.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.offsetAfter.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 != 0 || secondOfDay > SECS_PER_DAY) {
            i = 31;
        } else {
            i = secondOfDay == SECS_PER_DAY ? 24 : this.time.getHour();
        }
        int i4 = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        if (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) {
            i2 = totalSeconds2 / 1800;
        } else {
            i2 = 3;
        }
        if (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) {
            i3 = totalSeconds3 / 1800;
        } else {
            i3 = 3;
        }
        QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding = this.dow;
        dataOutput.writeInt((this.month.getValue() << 28) + ((this.dom + 32) << 22) + ((quickAccountSelectAdapter$FooterHolder_ViewBinding == null ? 0 : quickAccountSelectAdapter$FooterHolder_ViewBinding.getValue()) << 19) + (i << 14) + (this.timeDefinition.ordinal() << 12) + (i4 << 4) + (i2 << 2) + i3);
        if (i == 31) {
            dataOutput.writeInt(secondOfDay);
        }
        if (i4 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.offsetBefore.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.offsetAfter.getTotalSeconds());
        }
    }

    static C6484x9e7f23a1 readExternal(DataInput dataInput) throws IOException {
        QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding;
        int readInt = dataInput.readInt();
        PrepaidTransactionAdapter$ChildViewHolder of = PrepaidTransactionAdapter$ChildViewHolder.m3539of(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        if (i2 == 0) {
            quickAccountSelectAdapter$FooterHolder_ViewBinding = null;
        } else {
            quickAccountSelectAdapter$FooterHolder_ViewBinding = QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(i2);
        }
        QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding2 = quickAccountSelectAdapter$FooterHolder_ViewBinding;
        int i3 = (507904 & readInt) >>> 14;
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.values()[(readInt & C7887a.f3647sL) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        int readInt2 = i3 == 31 ? dataInput.readInt() : i3 * 3600;
        ManageAccountInboundViewHolder_ViewBinding ofTotalSeconds = ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        ManageAccountInboundViewHolder_ViewBinding ofTotalSeconds2 = ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(i5 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i5 * 1800));
        ManageAccountInboundViewHolder_ViewBinding ofTotalSeconds3 = ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : ofTotalSeconds.getTotalSeconds() + (i6 * 1800));
        if (i >= -28 && i <= 31 && i != 0) {
            return new C6484x9e7f23a1(of, i, quickAccountSelectAdapter$FooterHolder_ViewBinding2, QuickAccountSelectAdapter$SelectedHolder.ofSecondOfDay((long) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(readInt2, (int) SECS_PER_DAY)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(readInt2, (int) SECS_PER_DAY), iconCompatParcelizer, ofTotalSeconds, ofTotalSeconds2, ofTotalSeconds3);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    public final PrepaidTransactionAdapter$ChildViewHolder getMonth() {
        return this.month;
    }

    public final int getDayOfMonthIndicator() {
        return this.dom;
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding getDayOfWeek() {
        return this.dow;
    }

    public final QuickAccountSelectAdapter$SelectedHolder getLocalTime() {
        return this.time;
    }

    public final boolean isMidnightEndOfDay() {
        return this.adjustDays == 1 && this.time.equals(QuickAccountSelectAdapter$SelectedHolder.MIDNIGHT);
    }

    public final IconCompatParcelizer getTimeDefinition() {
        return this.timeDefinition;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getStandardOffset() {
        return this.standardOffset;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffsetBefore() {
        return this.offsetBefore;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffsetAfter() {
        return this.offsetAfter;
    }

    public final HistoryAdapter$ChildViewHolder_ViewBinding createTransition(int i) {
        QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder;
        byte b = this.dom;
        if (b < 0) {
            PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder = this.month;
            quickAccountSelectAdapter$UnselectedHolder = QuickAccountSelectAdapter$UnselectedHolder.m3548of(i, prepaidTransactionAdapter$ChildViewHolder, prepaidTransactionAdapter$ChildViewHolder.length(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear((long) i)) + 1 + this.dom);
            QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding = this.dow;
            if (quickAccountSelectAdapter$FooterHolder_ViewBinding != null) {
                quickAccountSelectAdapter$UnselectedHolder = quickAccountSelectAdapter$UnselectedHolder.with(DenominatorAmountAdapter$BubbleViewHolder.previousOrSame(quickAccountSelectAdapter$FooterHolder_ViewBinding));
            }
        } else {
            quickAccountSelectAdapter$UnselectedHolder = QuickAccountSelectAdapter$UnselectedHolder.m3548of(i, this.month, (int) b);
            QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding2 = this.dow;
            if (quickAccountSelectAdapter$FooterHolder_ViewBinding2 != null) {
                quickAccountSelectAdapter$UnselectedHolder = quickAccountSelectAdapter$UnselectedHolder.with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(quickAccountSelectAdapter$FooterHolder_ViewBinding2));
            }
        }
        return new HistoryAdapter$ChildViewHolder_ViewBinding(this.timeDefinition.createDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(quickAccountSelectAdapter$UnselectedHolder.plusDays((long) this.adjustDays), this.time), this.standardOffset, this.offsetBefore), this.offsetBefore, this.offsetAfter);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6484x9e7f23a1)) {
            return false;
        }
        C6484x9e7f23a1 fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding = (C6484x9e7f23a1) obj;
        if (this.month == fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.month && this.dom == fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.dom && this.dow == fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.dow && this.timeDefinition == fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.timeDefinition && this.adjustDays == fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.adjustDays && this.time.equals(fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.time) && this.standardOffset.equals(fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.standardOffset) && this.offsetBefore.equals(fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.offsetBefore) && this.offsetAfter.equals(fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding.offsetAfter)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = this.time.toSecondOfDay();
        int i = this.adjustDays;
        int ordinal = this.month.ordinal();
        byte b = this.dom;
        QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding = this.dow;
        int ordinal2 = quickAccountSelectAdapter$FooterHolder_ViewBinding == null ? 7 : quickAccountSelectAdapter$FooterHolder_ViewBinding.ordinal();
        return ((((((((secondOfDay + i) << 15) + (ordinal << 11)) + ((b + 32) << 5)) + (ordinal2 << 2)) + this.timeDefinition.ordinal()) ^ this.standardOffset.hashCode()) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionRule[");
        sb.append(this.offsetBefore.compareTo(this.offsetAfter) > 0 ? "Gap " : "Overlap ");
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(", ");
        QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding = this.dow;
        if (quickAccountSelectAdapter$FooterHolder_ViewBinding != null) {
            byte b = this.dom;
            if (b == -1) {
                sb.append(quickAccountSelectAdapter$FooterHolder_ViewBinding.name());
                sb.append(" on or before last day of ");
                sb.append(this.month.name());
            } else if (b < 0) {
                sb.append(quickAccountSelectAdapter$FooterHolder_ViewBinding.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.dom) - 1);
                sb.append(" of ");
                sb.append(this.month.name());
            } else {
                sb.append(quickAccountSelectAdapter$FooterHolder_ViewBinding.name());
                sb.append(" on or after ");
                sb.append(this.month.name());
                sb.append(' ');
                sb.append(this.dom);
            }
        } else {
            sb.append(this.month.name());
            sb.append(' ');
            sb.append(this.dom);
        }
        sb.append(" at ");
        if (this.adjustDays == 0) {
            sb.append(this.time);
        } else {
            long secondOfDay = (long) ((this.time.toSecondOfDay() / 60) + (this.adjustDays * 24 * 60));
            appendZeroPad(sb, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(secondOfDay, 60));
            sb.append(':');
            appendZeroPad(sb, (long) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(secondOfDay, 60));
        }
        sb.append(" ");
        sb.append(this.timeDefinition);
        sb.append(", standard offset ");
        sb.append(this.standardOffset);
        sb.append(']');
        return sb.toString();
    }

    private void appendZeroPad(StringBuilder sb, long j) {
        if (j < 10) {
            sb.append(0);
        }
        sb.append(j);
    }

    /* renamed from: o.FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBinding$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        UTC,
        WALL,
        STANDARD;

        public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding createDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2) {
            int i = setQuery.f2640x9c587b4d[ordinal()];
            if (i == 1) {
                return quickAccountSelectAdapter$UnselectedHolder_ViewBinding.plusSeconds((long) (manageAccountInboundViewHolder_ViewBinding2.getTotalSeconds() - ManageAccountInboundViewHolder_ViewBinding.UTC.getTotalSeconds()));
            }
            if (i != 2) {
                return quickAccountSelectAdapter$UnselectedHolder_ViewBinding;
            }
            return quickAccountSelectAdapter$UnselectedHolder_ViewBinding.plusSeconds((long) (manageAccountInboundViewHolder_ViewBinding2.getTotalSeconds() - manageAccountInboundViewHolder_ViewBinding.getTotalSeconds()));
        }
    }
}
