package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p040o.HistoryAdapter$ChildViewHolder;

/* renamed from: o.EditFavouriteAdapter$EditFavouriteHolder */
final class EditFavouriteAdapter$EditFavouriteHolder extends HistoryAdapter$ChildViewHolder implements Serializable {
    private static final int LAST_CACHED_YEAR = 2100;
    private static final long serialVersionUID = 3044319355680032515L;
    private final C6484x9e7f23a1[] lastRules;
    private final ConcurrentMap<Integer, HistoryAdapter$ChildViewHolder_ViewBinding[]> lastRulesCache = new ConcurrentHashMap();
    private final long[] savingsInstantTransitions;
    private final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[] savingsLocalTransitions;
    private final ManageAccountInboundViewHolder_ViewBinding[] standardOffsets;
    private final long[] standardTransitions;
    private final ManageAccountInboundViewHolder_ViewBinding[] wallOffsets;

    EditFavouriteAdapter$EditFavouriteHolder(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2, List<HistoryAdapter$ChildViewHolder_ViewBinding> list, List<HistoryAdapter$ChildViewHolder_ViewBinding> list2, List<C6484x9e7f23a1> list3) {
        this.standardTransitions = new long[list.size()];
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = new ManageAccountInboundViewHolder_ViewBinding[(list.size() + 1)];
        this.standardOffsets = manageAccountInboundViewHolder_ViewBindingArr;
        manageAccountInboundViewHolder_ViewBindingArr[0] = manageAccountInboundViewHolder_ViewBinding;
        int i = 0;
        while (i < list.size()) {
            this.standardTransitions[i] = list.get(i).toEpochSecond();
            int i2 = i + 1;
            this.standardOffsets[i2] = list.get(i).getOffsetAfter();
            i = i2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(manageAccountInboundViewHolder_ViewBinding2);
        for (HistoryAdapter$ChildViewHolder_ViewBinding next : list2) {
            if (next.isGap()) {
                arrayList.add(next.getDateTimeBefore());
                arrayList.add(next.getDateTimeAfter());
            } else {
                arrayList.add(next.getDateTimeAfter());
                arrayList.add(next.getDateTimeBefore());
            }
            arrayList2.add(next.getOffsetAfter());
        }
        this.savingsLocalTransitions = (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[]) arrayList.toArray(new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[arrayList.size()]);
        this.wallOffsets = (ManageAccountInboundViewHolder_ViewBinding[]) arrayList2.toArray(new ManageAccountInboundViewHolder_ViewBinding[arrayList2.size()]);
        this.savingsInstantTransitions = new long[list2.size()];
        for (int i3 = 0; i3 < list2.size(); i3++) {
            this.savingsInstantTransitions[i3] = list2.get(i3).getInstant().getEpochSecond();
        }
        if (list3.size() <= 15) {
            this.lastRules = (C6484x9e7f23a1[]) list3.toArray(new C6484x9e7f23a1[list3.size()]);
            return;
        }
        throw new IllegalArgumentException("Too many transition rules");
    }

    private EditFavouriteAdapter$EditFavouriteHolder(long[] jArr, ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr, long[] jArr2, ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr2, C6484x9e7f23a1[] fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr) {
        this.standardTransitions = jArr;
        this.standardOffsets = manageAccountInboundViewHolder_ViewBindingArr;
        this.savingsInstantTransitions = jArr2;
        this.wallOffsets = manageAccountInboundViewHolder_ViewBindingArr2;
        this.lastRules = fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding = new HistoryAdapter$ChildViewHolder_ViewBinding(jArr2[i], manageAccountInboundViewHolder_ViewBindingArr2[i], manageAccountInboundViewHolder_ViewBindingArr2[i2]);
            if (historyAdapter$ChildViewHolder_ViewBinding.isGap()) {
                arrayList.add(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeBefore());
                arrayList.add(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeAfter());
            } else {
                arrayList.add(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeAfter());
                arrayList.add(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeBefore());
            }
            i = i2;
        }
        this.savingsLocalTransitions = (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[]) arrayList.toArray(new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[arrayList.size()]);
    }

    private Object writeReplace() {
        return new FavouriteTargetAdapter$ItemViewHolder_ViewBinding((byte) 1, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.standardTransitions.length);
        for (long writeEpochSec : this.standardTransitions) {
            FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeEpochSec(writeEpochSec, dataOutput);
        }
        for (ManageAccountInboundViewHolder_ViewBinding writeOffset : this.standardOffsets) {
            FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeOffset(writeOffset, dataOutput);
        }
        dataOutput.writeInt(this.savingsInstantTransitions.length);
        for (long writeEpochSec2 : this.savingsInstantTransitions) {
            FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeEpochSec(writeEpochSec2, dataOutput);
        }
        for (ManageAccountInboundViewHolder_ViewBinding writeOffset2 : this.wallOffsets) {
            FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeOffset(writeOffset2, dataOutput);
        }
        dataOutput.writeByte(this.lastRules.length);
        for (C6484x9e7f23a1 writeExternal : this.lastRules) {
            writeExternal.writeExternal(dataOutput);
        }
    }

    static EditFavouriteAdapter$EditFavouriteHolder readExternal(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readEpochSec(dataInput);
        }
        int i2 = readInt + 1;
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = new ManageAccountInboundViewHolder_ViewBinding[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            manageAccountInboundViewHolder_ViewBindingArr[i3] = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readOffset(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readEpochSec(dataInput);
        }
        int i5 = readInt2 + 1;
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr2 = new ManageAccountInboundViewHolder_ViewBinding[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            manageAccountInboundViewHolder_ViewBindingArr2[i6] = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readOffset(dataInput);
        }
        int readByte = dataInput.readByte();
        C6484x9e7f23a1[] fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr = new C6484x9e7f23a1[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr[i7] = C6484x9e7f23a1.readExternal(dataInput);
        }
        return new EditFavouriteAdapter$EditFavouriteHolder(jArr, manageAccountInboundViewHolder_ViewBindingArr, jArr2, manageAccountInboundViewHolder_ViewBindingArr2, fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr);
    }

    public final boolean isFixedOffset() {
        return this.savingsInstantTransitions.length == 0;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        long epochSecond = quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond();
        if (this.lastRules.length > 0) {
            long[] jArr = this.savingsInstantTransitions;
            if (epochSecond > jArr[jArr.length - 1]) {
                ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.wallOffsets;
                HistoryAdapter$ChildViewHolder_ViewBinding[] findTransitionArray = findTransitionArray(findYear(epochSecond, manageAccountInboundViewHolder_ViewBindingArr[manageAccountInboundViewHolder_ViewBindingArr.length - 1]));
                HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding = null;
                for (int i = 0; i < findTransitionArray.length; i++) {
                    historyAdapter$ChildViewHolder_ViewBinding = findTransitionArray[i];
                    if (epochSecond < historyAdapter$ChildViewHolder_ViewBinding.toEpochSecond()) {
                        return historyAdapter$ChildViewHolder_ViewBinding.getOffsetBefore();
                    }
                }
                return historyAdapter$ChildViewHolder_ViewBinding.getOffsetAfter();
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.wallOffsets[binarySearch + 1];
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        Object offsetInfo = getOffsetInfo(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (offsetInfo instanceof HistoryAdapter$ChildViewHolder_ViewBinding) {
            return ((HistoryAdapter$ChildViewHolder_ViewBinding) offsetInfo).getOffsetBefore();
        }
        return (ManageAccountInboundViewHolder_ViewBinding) offsetInfo;
    }

    public final List<ManageAccountInboundViewHolder_ViewBinding> getValidOffsets(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        Object offsetInfo = getOffsetInfo(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (offsetInfo instanceof HistoryAdapter$ChildViewHolder_ViewBinding) {
            return ((HistoryAdapter$ChildViewHolder_ViewBinding) offsetInfo).getValidOffsets();
        }
        return Collections.singletonList((ManageAccountInboundViewHolder_ViewBinding) offsetInfo);
    }

    public final HistoryAdapter$ChildViewHolder_ViewBinding getTransition(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        Object offsetInfo = getOffsetInfo(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (offsetInfo instanceof HistoryAdapter$ChildViewHolder_ViewBinding) {
            return (HistoryAdapter$ChildViewHolder_ViewBinding) offsetInfo;
        }
        return null;
    }

    private Object getOffsetInfo(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        int i = 0;
        if (this.lastRules.length > 0) {
            QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[] quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr = this.savingsLocalTransitions;
            if (quickAccountSelectAdapter$UnselectedHolder_ViewBinding.isAfter(quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr[quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr.length - 1])) {
                HistoryAdapter$ChildViewHolder_ViewBinding[] findTransitionArray = findTransitionArray(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getYear());
                Object obj = null;
                int length = findTransitionArray.length;
                while (i < length) {
                    HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding = findTransitionArray[i];
                    Object findOffsetInfo = findOffsetInfo(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, historyAdapter$ChildViewHolder_ViewBinding);
                    if ((findOffsetInfo instanceof HistoryAdapter$ChildViewHolder_ViewBinding) || findOffsetInfo.equals(historyAdapter$ChildViewHolder_ViewBinding.getOffsetBefore())) {
                        return findOffsetInfo;
                    }
                    i++;
                    obj = findOffsetInfo;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsLocalTransitions, quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (binarySearch == -1) {
            return this.wallOffsets[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[] quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr2 = this.savingsLocalTransitions;
            if (binarySearch < quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr2.length - 1) {
                int i2 = binarySearch + 1;
                if (quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr2[binarySearch].equals(quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr2[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.wallOffsets[(binarySearch / 2) + 1];
        }
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding[] quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr3 = this.savingsLocalTransitions;
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding2 = quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr3[binarySearch];
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding3 = quickAccountSelectAdapter$UnselectedHolder_ViewBindingArr3[binarySearch + 1];
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.wallOffsets;
        int i3 = binarySearch / 2;
        ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = manageAccountInboundViewHolder_ViewBindingArr[i3];
        ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2 = manageAccountInboundViewHolder_ViewBindingArr[i3 + 1];
        if (manageAccountInboundViewHolder_ViewBinding2.getTotalSeconds() > manageAccountInboundViewHolder_ViewBinding.getTotalSeconds()) {
            return new HistoryAdapter$ChildViewHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding2, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding2);
        }
        return new HistoryAdapter$ChildViewHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding3, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding2);
    }

    private Object findOffsetInfo(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding dateTimeBefore = historyAdapter$ChildViewHolder_ViewBinding.getDateTimeBefore();
        if (historyAdapter$ChildViewHolder_ViewBinding.isGap()) {
            if (quickAccountSelectAdapter$UnselectedHolder_ViewBinding.isBefore(dateTimeBefore)) {
                return historyAdapter$ChildViewHolder_ViewBinding.getOffsetBefore();
            }
            if (quickAccountSelectAdapter$UnselectedHolder_ViewBinding.isBefore(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeAfter())) {
                return historyAdapter$ChildViewHolder_ViewBinding;
            }
            return historyAdapter$ChildViewHolder_ViewBinding.getOffsetAfter();
        } else if (!quickAccountSelectAdapter$UnselectedHolder_ViewBinding.isBefore(dateTimeBefore)) {
            return historyAdapter$ChildViewHolder_ViewBinding.getOffsetAfter();
        } else {
            return quickAccountSelectAdapter$UnselectedHolder_ViewBinding.isBefore(historyAdapter$ChildViewHolder_ViewBinding.getDateTimeAfter()) ? historyAdapter$ChildViewHolder_ViewBinding.getOffsetBefore() : historyAdapter$ChildViewHolder_ViewBinding;
        }
    }

    public final boolean isValidOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return getValidOffsets(quickAccountSelectAdapter$UnselectedHolder_ViewBinding).contains(manageAccountInboundViewHolder_ViewBinding);
    }

    private HistoryAdapter$ChildViewHolder_ViewBinding[] findTransitionArray(int i) {
        Integer valueOf = Integer.valueOf(i);
        HistoryAdapter$ChildViewHolder_ViewBinding[] historyAdapter$ChildViewHolder_ViewBindingArr = (HistoryAdapter$ChildViewHolder_ViewBinding[]) this.lastRulesCache.get(valueOf);
        if (historyAdapter$ChildViewHolder_ViewBindingArr != null) {
            return historyAdapter$ChildViewHolder_ViewBindingArr;
        }
        C6484x9e7f23a1[] fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr = this.lastRules;
        HistoryAdapter$ChildViewHolder_ViewBinding[] historyAdapter$ChildViewHolder_ViewBindingArr2 = new HistoryAdapter$ChildViewHolder_ViewBinding[fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr.length];
        for (int i2 = 0; i2 < fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr.length; i2++) {
            historyAdapter$ChildViewHolder_ViewBindingArr2[i2] = fixedTransferDepositSuccessTransactionAdapter$DepositViewHolder_ViewBindingArr[i2].createTransition(i);
        }
        if (i < LAST_CACHED_YEAR) {
            this.lastRulesCache.putIfAbsent(valueOf, historyAdapter$ChildViewHolder_ViewBindingArr2);
        }
        return historyAdapter$ChildViewHolder_ViewBindingArr2;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getStandardOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        int binarySearch = Arrays.binarySearch(this.standardTransitions, quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.standardOffsets[binarySearch + 1];
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        return QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds((long) (getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding).getTotalSeconds() - getStandardOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding).getTotalSeconds()));
    }

    public final boolean isDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        return !getStandardOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding).equals(getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding));
    }

    public final HistoryAdapter$ChildViewHolder_ViewBinding nextTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        if (this.savingsInstantTransitions.length == 0) {
            return null;
        }
        long epochSecond = quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond();
        long[] jArr = this.savingsInstantTransitions;
        if (epochSecond < jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            int i = binarySearch < 0 ? (-binarySearch) - 1 : binarySearch + 1;
            long j = this.savingsInstantTransitions[i];
            ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.wallOffsets;
            return new HistoryAdapter$ChildViewHolder_ViewBinding(j, manageAccountInboundViewHolder_ViewBindingArr[i], manageAccountInboundViewHolder_ViewBindingArr[i + 1]);
        } else if (this.lastRules.length == 0) {
            return null;
        } else {
            ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr2 = this.wallOffsets;
            int findYear = findYear(epochSecond, manageAccountInboundViewHolder_ViewBindingArr2[manageAccountInboundViewHolder_ViewBindingArr2.length - 1]);
            for (HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding : findTransitionArray(findYear)) {
                if (epochSecond < historyAdapter$ChildViewHolder_ViewBinding.toEpochSecond()) {
                    return historyAdapter$ChildViewHolder_ViewBinding;
                }
            }
            if (findYear < 999999999) {
                return findTransitionArray(findYear + 1)[0];
            }
            return null;
        }
    }

    public final HistoryAdapter$ChildViewHolder_ViewBinding previousTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        if (this.savingsInstantTransitions.length == 0) {
            return null;
        }
        long epochSecond = quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond();
        if (quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        long[] jArr = this.savingsInstantTransitions;
        long j = jArr[jArr.length - 1];
        if (this.lastRules.length > 0 && epochSecond > j) {
            ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.wallOffsets;
            ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = manageAccountInboundViewHolder_ViewBindingArr[manageAccountInboundViewHolder_ViewBindingArr.length - 1];
            int findYear = findYear(epochSecond, manageAccountInboundViewHolder_ViewBinding);
            HistoryAdapter$ChildViewHolder_ViewBinding[] findTransitionArray = findTransitionArray(findYear);
            for (int length = findTransitionArray.length - 1; length >= 0; length--) {
                if (epochSecond > findTransitionArray[length].toEpochSecond()) {
                    return findTransitionArray[length];
                }
            }
            int i = findYear - 1;
            if (i > findYear(j, manageAccountInboundViewHolder_ViewBinding)) {
                HistoryAdapter$ChildViewHolder_ViewBinding[] findTransitionArray2 = findTransitionArray(i);
                return findTransitionArray2[findTransitionArray2.length - 1];
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch <= 0) {
            return null;
        }
        int i2 = binarySearch - 1;
        long j2 = this.savingsInstantTransitions[i2];
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr2 = this.wallOffsets;
        return new HistoryAdapter$ChildViewHolder_ViewBinding(j2, manageAccountInboundViewHolder_ViewBindingArr2[i2], manageAccountInboundViewHolder_ViewBindingArr2[binarySearch]);
    }

    private int findYear(long j, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j + ((long) manageAccountInboundViewHolder_ViewBinding.getTotalSeconds()), 86400)).getYear();
    }

    public final List<HistoryAdapter$ChildViewHolder_ViewBinding> getTransitions() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            long[] jArr = this.savingsInstantTransitions;
            if (i >= jArr.length) {
                return Collections.unmodifiableList(arrayList);
            }
            long j = jArr[i];
            ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.wallOffsets;
            ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = manageAccountInboundViewHolder_ViewBindingArr[i];
            i++;
            arrayList.add(new HistoryAdapter$ChildViewHolder_ViewBinding(j, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBindingArr[i]));
        }
    }

    public final List<C6484x9e7f23a1> getTransitionRules() {
        return Collections.unmodifiableList(Arrays.asList(this.lastRules));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EditFavouriteAdapter$EditFavouriteHolder) {
            EditFavouriteAdapter$EditFavouriteHolder editFavouriteAdapter$EditFavouriteHolder = (EditFavouriteAdapter$EditFavouriteHolder) obj;
            if (!Arrays.equals(this.standardTransitions, editFavouriteAdapter$EditFavouriteHolder.standardTransitions) || !Arrays.equals(this.standardOffsets, editFavouriteAdapter$EditFavouriteHolder.standardOffsets) || !Arrays.equals(this.savingsInstantTransitions, editFavouriteAdapter$EditFavouriteHolder.savingsInstantTransitions) || !Arrays.equals(this.wallOffsets, editFavouriteAdapter$EditFavouriteHolder.wallOffsets) || !Arrays.equals(this.lastRules, editFavouriteAdapter$EditFavouriteHolder.lastRules)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof HistoryAdapter$ChildViewHolder.write)) {
            return false;
        } else {
            if (!isFixedOffset() || !getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.EPOCH).equals(((HistoryAdapter$ChildViewHolder.write) obj).getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.EPOCH))) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.standardTransitions);
        int hashCode2 = Arrays.hashCode(this.standardOffsets);
        int hashCode3 = Arrays.hashCode(this.savingsInstantTransitions);
        return (((hashCode ^ hashCode2) ^ hashCode3) ^ Arrays.hashCode(this.wallOffsets)) ^ Arrays.hashCode(this.lastRules);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StandardZoneRules[currentStandardOffset=");
        ManageAccountInboundViewHolder_ViewBinding[] manageAccountInboundViewHolder_ViewBindingArr = this.standardOffsets;
        sb.append(manageAccountInboundViewHolder_ViewBindingArr[manageAccountInboundViewHolder_ViewBindingArr.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
