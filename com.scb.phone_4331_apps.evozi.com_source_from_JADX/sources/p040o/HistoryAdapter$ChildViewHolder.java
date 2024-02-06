package p040o;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: o.HistoryAdapter$ChildViewHolder */
public abstract class HistoryAdapter$ChildViewHolder {
    public abstract boolean equals(Object obj);

    public abstract QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    public abstract ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    public abstract ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding);

    public abstract ManageAccountInboundViewHolder_ViewBinding getStandardOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    public abstract HistoryAdapter$ChildViewHolder_ViewBinding getTransition(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding);

    public abstract List<C6484x9e7f23a1> getTransitionRules();

    public abstract List<HistoryAdapter$ChildViewHolder_ViewBinding> getTransitions();

    public abstract List<ManageAccountInboundViewHolder_ViewBinding> getValidOffsets(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding);

    public abstract int hashCode();

    public abstract boolean isDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    public abstract boolean isFixedOffset();

    public abstract boolean isValidOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding);

    public abstract HistoryAdapter$ChildViewHolder_ViewBinding nextTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    public abstract HistoryAdapter$ChildViewHolder_ViewBinding previousTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding);

    /* renamed from: of */
    public static HistoryAdapter$ChildViewHolder m3516of(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding2, List<HistoryAdapter$ChildViewHolder_ViewBinding> list, List<HistoryAdapter$ChildViewHolder_ViewBinding> list2, List<C6484x9e7f23a1> list3) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "baseStandardOffset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding2, "baseWallOffset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(list, "standardOffsetTransitionList");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(list2, "transitionList");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(list3, "lastRules");
        return new EditFavouriteAdapter$EditFavouriteHolder(manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding2, list, list2, list3);
    }

    /* renamed from: of */
    public static HistoryAdapter$ChildViewHolder m3515of(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        return new write(manageAccountInboundViewHolder_ViewBinding);
    }

    HistoryAdapter$ChildViewHolder() {
    }

    /* renamed from: o.HistoryAdapter$ChildViewHolder$write */
    static final class write extends HistoryAdapter$ChildViewHolder implements Serializable {
        private static final long serialVersionUID = -8733721350312276297L;
        private final ManageAccountInboundViewHolder_ViewBinding offset;

        public final HistoryAdapter$ChildViewHolder_ViewBinding getTransition(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return null;
        }

        public final boolean isDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return false;
        }

        public final boolean isFixedOffset() {
            return true;
        }

        public final HistoryAdapter$ChildViewHolder_ViewBinding nextTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return null;
        }

        public final HistoryAdapter$ChildViewHolder_ViewBinding previousTransition(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return null;
        }

        write(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
            this.offset = manageAccountInboundViewHolder_ViewBinding;
        }

        public final ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return this.offset;
        }

        public final ManageAccountInboundViewHolder_ViewBinding getOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return this.offset;
        }

        public final List<ManageAccountInboundViewHolder_ViewBinding> getValidOffsets(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return Collections.singletonList(this.offset);
        }

        public final boolean isValidOffset(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
            return this.offset.equals(manageAccountInboundViewHolder_ViewBinding);
        }

        public final ManageAccountInboundViewHolder_ViewBinding getStandardOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return this.offset;
        }

        public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDaylightSavings(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ZERO;
        }

        public final List<HistoryAdapter$ChildViewHolder_ViewBinding> getTransitions() {
            return Collections.emptyList();
        }

        public final List<C6484x9e7f23a1> getTransitionRules() {
            return Collections.emptyList();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof write) {
                return this.offset.equals(((write) obj).offset);
            }
            if (!(obj instanceof EditFavouriteAdapter$EditFavouriteHolder)) {
                return false;
            }
            EditFavouriteAdapter$EditFavouriteHolder editFavouriteAdapter$EditFavouriteHolder = (EditFavouriteAdapter$EditFavouriteHolder) obj;
            if (!editFavouriteAdapter$EditFavouriteHolder.isFixedOffset() || !this.offset.equals(editFavouriteAdapter$EditFavouriteHolder.getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.EPOCH))) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((((this.offset.hashCode() + 31) ^ 1) ^ 1) ^ (this.offset.hashCode() + 31)) ^ 1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FixedRules:");
            sb.append(this.offset);
            return sb.toString();
        }
    }
}
