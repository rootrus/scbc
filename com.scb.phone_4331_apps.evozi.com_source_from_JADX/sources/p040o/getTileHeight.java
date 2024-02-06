package p040o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.view.activity.prepaid.DetailsTabHolder;

/* renamed from: o.getTileHeight */
public final /* synthetic */ class getTileHeight implements Toolbar.IconCompatParcelizer {
    private final /* synthetic */ DetailsTabHolder IconCompatParcelizer;

    public /* synthetic */ getTileHeight(DetailsTabHolder detailsTabHolder) {
        this.IconCompatParcelizer = detailsTabHolder;
    }

    public final boolean read(MenuItem menuItem) {
        DetailsTabHolder detailsTabHolder = this.IconCompatParcelizer;
        detailsTabHolder.mTextTxnMonthPrepaid.setText(menuItem.getTitle());
        detailsTabHolder.read.IconCompatParcelizer(detailsTabHolder.MediaBrowserCompat$ItemReceiver.get(menuItem.getTitle().toString()));
        return true;
    }
}
