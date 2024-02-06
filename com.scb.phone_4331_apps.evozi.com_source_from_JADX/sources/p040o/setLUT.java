package p040o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.setLUT */
public final class setLUT extends getFieldID {
    public setLUT(RecyclerView recyclerView) {
        super(recyclerView);
    }

    /* access modifiers changed from: protected */
    public final int write(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        throw new IllegalArgumentException();
    }
}
