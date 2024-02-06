package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o.HistoryAdapter$ChildViewHolder_ViewBinding */
public final class HistoryAdapter$ChildViewHolder_ViewBinding implements Comparable<HistoryAdapter$ChildViewHolder_ViewBinding>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final ManageAccountInboundViewHolder_ViewBinding offsetAfter;
    private final ManageAccountInboundViewHolder_ViewBinding offsetBefore;
    private final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding transition;

    /* renamed from: of */
    public static HistoryAdapter$ChildViewHolder_ViewBinding m3517of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "transition");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offsetBefore");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding2, "offsetAfter");
        if (manageAccountInboundViewHolder_ViewBinding.equals(manageAccountInboundViewHolder_ViewBinding2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        } else if (quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getNano() == 0) {
            return new HistoryAdapter$ChildViewHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding2);
        } else {
            throw new IllegalArgumentException("Nano-of-second must be zero");
        }
    }

    HistoryAdapter$ChildViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2) {
        this.transition = quickAccountSelectAdapter$UnselectedHolder_ViewBinding;
        this.offsetBefore = manageAccountInboundViewHolder_ViewBinding;
        this.offsetAfter = manageAccountInboundViewHolder_ViewBinding2;
    }

    HistoryAdapter$ChildViewHolder_ViewBinding(long j, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2) {
        this.transition = QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(j, 0, manageAccountInboundViewHolder_ViewBinding);
        this.offsetBefore = manageAccountInboundViewHolder_ViewBinding;
        this.offsetAfter = manageAccountInboundViewHolder_ViewBinding2;
    }

    private Object writeReplace() {
        return new FavouriteTargetAdapter$ItemViewHolder_ViewBinding((byte) 2, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeEpochSec(toEpochSecond(), dataOutput);
        FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeOffset(this.offsetBefore, dataOutput);
        FavouriteTargetAdapter$ItemViewHolder_ViewBinding.writeOffset(this.offsetAfter, dataOutput);
    }

    static HistoryAdapter$ChildViewHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        long readEpochSec = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readEpochSec(dataInput);
        ManageAccountInboundViewHolder_ViewBinding readOffset = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readOffset(dataInput);
        ManageAccountInboundViewHolder_ViewBinding readOffset2 = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.readOffset(dataInput);
        if (!readOffset.equals(readOffset2)) {
            return new HistoryAdapter$ChildViewHolder_ViewBinding(readEpochSec, readOffset, readOffset2);
        }
        throw new IllegalArgumentException("Offsets must not be equal");
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding getInstant() {
        return this.transition.toInstant(this.offsetBefore);
    }

    public final long toEpochSecond() {
        return this.transition.toEpochSecond(this.offsetBefore);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding getDateTimeBefore() {
        return this.transition;
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding getDateTimeAfter() {
        return this.transition.plusSeconds((long) getDurationSeconds());
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffsetBefore() {
        return this.offsetBefore;
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffsetAfter() {
        return this.offsetAfter;
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDuration() {
        return QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds((long) getDurationSeconds());
    }

    private int getDurationSeconds() {
        return getOffsetAfter().getTotalSeconds() - getOffsetBefore().getTotalSeconds();
    }

    public final boolean isGap() {
        return getOffsetAfter().getTotalSeconds() > getOffsetBefore().getTotalSeconds();
    }

    public final boolean isOverlap() {
        return getOffsetAfter().getTotalSeconds() < getOffsetBefore().getTotalSeconds();
    }

    public final boolean isValidOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return !isGap() && (getOffsetBefore().equals(manageAccountInboundViewHolder_ViewBinding) || getOffsetAfter().equals(manageAccountInboundViewHolder_ViewBinding));
    }

    /* access modifiers changed from: package-private */
    public final List<ManageAccountInboundViewHolder_ViewBinding> getValidOffsets() {
        if (isGap()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ManageAccountInboundViewHolder_ViewBinding[]{getOffsetBefore(), getOffsetAfter()});
    }

    public final int compareTo(HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding) {
        return getInstant().compareTo(historyAdapter$ChildViewHolder_ViewBinding.getInstant());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HistoryAdapter$ChildViewHolder_ViewBinding)) {
            return false;
        }
        HistoryAdapter$ChildViewHolder_ViewBinding historyAdapter$ChildViewHolder_ViewBinding = (HistoryAdapter$ChildViewHolder_ViewBinding) obj;
        if (!this.transition.equals(historyAdapter$ChildViewHolder_ViewBinding.transition) || !this.offsetBefore.equals(historyAdapter$ChildViewHolder_ViewBinding.offsetBefore) || !this.offsetAfter.equals(historyAdapter$ChildViewHolder_ViewBinding.offsetAfter)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transition[");
        sb.append(isGap() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.transition);
        sb.append(this.offsetBefore);
        sb.append(" to ");
        sb.append(this.offsetAfter);
        sb.append(']');
        return sb.toString();
    }
}
