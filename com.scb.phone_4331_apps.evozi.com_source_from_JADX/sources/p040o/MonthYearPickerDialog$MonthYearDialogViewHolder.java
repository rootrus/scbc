package p040o;

/* renamed from: o.MonthYearPickerDialog$MonthYearDialogViewHolder */
public final class MonthYearPickerDialog$MonthYearDialogViewHolder<E> extends MonthYearPickerDialog$MonthYearDialogViewHolder_ViewBinding<E> {
    public MonthYearPickerDialog$MonthYearDialogViewHolder(int i) {
        super(Math.max(2, i));
    }

    public final boolean offer(E e) {
        if (e != null) {
            long j = this.IconCompatParcelizer;
            long[] jArr = this.read;
            long j2 = Long.MAX_VALUE;
            while (true) {
                long MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
                long MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver);
                int i = ((setCloseButton.IconCompatParcelizer.getLongVolatile(jArr, MediaBrowserCompat$ItemReceiver) - MediaBrowserCompat$CustomActionResultReceiver) > 0 ? 1 : ((setCloseButton.IconCompatParcelizer.getLongVolatile(jArr, MediaBrowserCompat$ItemReceiver) - MediaBrowserCompat$CustomActionResultReceiver) == 0 ? 0 : -1));
                if (i == 0) {
                    long j3 = 1 + MediaBrowserCompat$CustomActionResultReceiver;
                    if (write(MediaBrowserCompat$CustomActionResultReceiver, j3)) {
                        read(IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver), e);
                        setCloseButton.IconCompatParcelizer.putOrderedLong(jArr, MediaBrowserCompat$ItemReceiver, j3);
                        return true;
                    }
                } else if (i < 0) {
                    long j4 = MediaBrowserCompat$CustomActionResultReceiver - (1 + j);
                    if (j4 <= j2) {
                        j2 = write();
                        if (j4 <= j2) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public final E poll() {
        long[] jArr = this.read;
        long j = -1;
        while (true) {
            long write = write();
            long MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(write);
            long j2 = write + 1;
            int i = ((setCloseButton.IconCompatParcelizer.getLongVolatile(jArr, MediaBrowserCompat$ItemReceiver) - j2) > 0 ? 1 : ((setCloseButton.IconCompatParcelizer.getLongVolatile(jArr, MediaBrowserCompat$ItemReceiver) - j2) == 0 ? 0 : -1));
            if (i == 0) {
                if (MediaBrowserCompat$CustomActionResultReceiver(write, j2)) {
                    long IconCompatParcelizer = IconCompatParcelizer(write);
                    E write2 = write(IconCompatParcelizer);
                    read(IconCompatParcelizer, null);
                    setCloseButton.IconCompatParcelizer.putOrderedLong(jArr, MediaBrowserCompat$ItemReceiver, write + this.IconCompatParcelizer + 1);
                    return write2;
                }
            } else if (i < 0 && write >= j) {
                j = MediaBrowserCompat$CustomActionResultReceiver();
                if (write == j) {
                    return null;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E peek() {
        /*
            r5 = this;
        L_0x0000:
            long r0 = r5.write()
            long r2 = r5.IconCompatParcelizer(r0)
            java.lang.Object r2 = r5.write(r2)
            if (r2 != 0) goto L_0x0016
            long r3 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0000
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MonthYearPickerDialog$MonthYearDialogViewHolder.peek():java.lang.Object");
    }

    public final int size() {
        long write = write();
        while (true) {
            long MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            long write2 = write();
            if (write == write2) {
                return (int) (MediaBrowserCompat$CustomActionResultReceiver - write2);
            }
            write = write2;
        }
    }

    public final boolean isEmpty() {
        return write() == MediaBrowserCompat$CustomActionResultReceiver();
    }
}
