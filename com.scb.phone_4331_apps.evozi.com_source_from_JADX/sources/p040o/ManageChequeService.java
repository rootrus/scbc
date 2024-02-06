package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomTileToggle;

/* renamed from: o.ManageChequeService */
public final /* synthetic */ class ManageChequeService implements View.OnClickListener {
    private final /* synthetic */ CustomTileToggle IconCompatParcelizer;

    public /* synthetic */ ManageChequeService(CustomTileToggle customTileToggle) {
        this.IconCompatParcelizer = customTileToggle;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.write(view);
    }
}
