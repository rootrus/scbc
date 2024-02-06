package p040o;

import com.scb.phone.view.adapter.bulktransfer.C5731x73b61c49;
import com.scb.phone.view.fragment.bulktransfer.SelectRecipientFromFavouriteFragment;

/* renamed from: o.getQuickPromptPayStatus */
public final /* synthetic */ class getQuickPromptPayStatus implements C5731x73b61c49 {
    private final /* synthetic */ SelectRecipientFromFavouriteFragment write;

    public /* synthetic */ getQuickPromptPayStatus(SelectRecipientFromFavouriteFragment selectRecipientFromFavouriteFragment) {
        this.write = selectRecipientFromFavouriteFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.write.addButton.setButtonEnabled(z);
    }
}
