package p040o;

/* renamed from: o.MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding */
public enum MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    /* access modifiers changed from: package-private */
    public final boolean parse(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return !z || !z2;
        }
        if (ordinal == 1 || ordinal == 4) {
            return true;
        }
        return !z2 && !z3;
    }
}
