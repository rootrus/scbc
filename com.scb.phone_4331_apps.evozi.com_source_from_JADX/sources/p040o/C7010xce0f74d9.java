package p040o;

/* renamed from: o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding */
public enum C7010xce0f74d9 {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public final boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }

    public final C7010xce0f74d9 asStandalone() {
        return values()[ordinal() | 1];
    }

    public final C7010xce0f74d9 asNormal() {
        return values()[ordinal() & -2];
    }
}
