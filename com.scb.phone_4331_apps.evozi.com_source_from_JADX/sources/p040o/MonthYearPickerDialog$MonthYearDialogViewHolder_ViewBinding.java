package p040o;

/* renamed from: o.MonthYearPickerDialog$MonthYearDialogViewHolder_ViewBinding */
abstract class MonthYearPickerDialog$MonthYearDialogViewHolder_ViewBinding<E> extends setOnKnockListener<E> {
    private static final long write = setCloseButton.write(MonthYearPickerDialog$MonthYearDialogViewHolder_ViewBinding.class, "consumerIndex");
    private volatile long consumerIndex;

    public MonthYearPickerDialog$MonthYearDialogViewHolder_ViewBinding(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final long write() {
        return this.consumerIndex;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(long j, long j2) {
        return setCloseButton.IconCompatParcelizer.compareAndSwapLong(this, write, j, j2);
    }
}
