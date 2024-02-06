package p040o;

import android.view.View;
import com.scb.phone.view.adapter.prelogin.QuickAccountSelectAdapter;

/* renamed from: o.getFixedDetailV2 */
public final /* synthetic */ class getFixedDetailV2 implements View.OnClickListener {
    private final /* synthetic */ QuickAccountSelectAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ getFixedDetailV2(QuickAccountSelectAdapter quickAccountSelectAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = quickAccountSelectAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.write;
        if (quickAccountSelectAdapter.MediaMetadataCompat != i) {
            quickAccountSelectAdapter.MediaMetadataCompat = i;
            FragmentBuilder_BindCloseAccountSelectionFragment fragmentBuilder_BindCloseAccountSelectionFragment = quickAccountSelectAdapter.MediaBrowserCompat$SearchResultReceiver;
            if (fragmentBuilder_BindCloseAccountSelectionFragment != null) {
                fragmentBuilder_BindCloseAccountSelectionFragment.write();
            }
            quickAccountSelectAdapter.IconCompatParcelizer.write();
        }
    }
}
