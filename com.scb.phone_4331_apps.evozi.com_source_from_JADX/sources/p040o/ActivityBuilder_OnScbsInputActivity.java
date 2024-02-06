package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessfulRequestFragment;

/* renamed from: o.ActivityBuilder_OnScbsInputActivity */
public final /* synthetic */ class ActivityBuilder_OnScbsInputActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ CardlessSuccessfulRequestFragment read;

    public /* synthetic */ ActivityBuilder_OnScbsInputActivity(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment) {
        this.read = cardlessSuccessfulRequestFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.MediaBrowserCompat$ItemReceiver();
    }
}
