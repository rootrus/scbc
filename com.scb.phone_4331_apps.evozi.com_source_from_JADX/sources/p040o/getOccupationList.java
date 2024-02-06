package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.ClearableEditText;

/* renamed from: o.getOccupationList */
public final /* synthetic */ class getOccupationList implements View.OnFocusChangeListener {
    private final /* synthetic */ ClearableEditText write;

    public /* synthetic */ getOccupationList(ClearableEditText clearableEditText) {
        this.write = clearableEditText;
    }

    public final void onFocusChange(View view, boolean z) {
        this.write.write(z);
    }
}
