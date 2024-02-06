package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.FundSummaryService */
public final /* synthetic */ class FundSummaryService implements View.OnFocusChangeListener {
    private final /* synthetic */ EditTextDecorator read;

    public /* synthetic */ FundSummaryService(EditTextDecorator editTextDecorator) {
        this.read = editTextDecorator;
    }

    public final void onFocusChange(View view, boolean z) {
        EditTextDecorator editTextDecorator = this.read;
        if (z) {
            editTextDecorator.MediaBrowserCompat$ItemReceiver.setVisibility(editTextDecorator.IconCompatParcelizer.getText().toString().isEmpty() ^ true ? 0 : 8);
        }
    }
}
