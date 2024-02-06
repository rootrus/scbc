package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.landingpage.BaseDragAndDropFragment;

/* renamed from: o.ActivityBuilder_ContributeDealsSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDealsSuccessActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BaseDragAndDropFragment write;

    public /* synthetic */ ActivityBuilder_ContributeDealsSuccessActivity(BaseDragAndDropFragment baseDragAndDropFragment, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.write = baseDragAndDropFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.RatingCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
