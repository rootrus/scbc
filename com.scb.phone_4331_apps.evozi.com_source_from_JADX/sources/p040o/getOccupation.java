package p040o;

import android.view.View;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;

/* renamed from: o.getOccupation */
public final /* synthetic */ class getOccupation implements View.OnFocusChangeListener {
    private final /* synthetic */ EasycashContactInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getOccupation(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.MediaBrowserCompat$ItemReceiver = easycashContactInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem(z);
    }
}
