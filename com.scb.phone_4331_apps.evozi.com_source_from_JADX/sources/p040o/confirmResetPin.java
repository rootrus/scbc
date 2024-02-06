package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ccrredemption.CategoriesListAdapter;
import p040o.PersonalizeActivity;

/* renamed from: o.confirmResetPin */
public final /* synthetic */ class confirmResetPin implements View.OnClickListener {
    private final /* synthetic */ CategoriesListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PersonalizeActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ confirmResetPin(CategoriesListAdapter categoriesListAdapter, PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = categoriesListAdapter;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void onClick(View view) {
        CategoriesListAdapter categoriesListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        categoriesListAdapter.read.write(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.read, iconCompatParcelizer.write);
    }
}
