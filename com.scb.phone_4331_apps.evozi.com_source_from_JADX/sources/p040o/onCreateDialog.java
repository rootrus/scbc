package p040o;

import android.view.View;

/* renamed from: o.onCreateDialog */
public abstract class onCreateDialog implements View.OnClickListener {
    /* access modifiers changed from: private */
    public static boolean read = true;
    private static final Runnable write = onAttach.IconCompatParcelizer;

    public abstract void write(View view);

    public final void onClick(View view) {
        if (read) {
            read = false;
            view.post(write);
            write(view);
        }
    }
}
