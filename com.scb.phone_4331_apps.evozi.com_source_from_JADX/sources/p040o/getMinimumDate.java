package p040o;

import android.view.View;

/* renamed from: o.getMinimumDate */
public final /* synthetic */ class getMinimumDate implements View.OnClickListener {
    private final /* synthetic */ Runnable IconCompatParcelizer;

    public /* synthetic */ getMinimumDate(Runnable runnable) {
        this.IconCompatParcelizer = runnable;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.run();
    }
}
