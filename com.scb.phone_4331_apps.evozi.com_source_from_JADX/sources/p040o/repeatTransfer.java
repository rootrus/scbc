package p040o;

import android.content.Context;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.creditcard.InformationTabFragment;
import p040o.setResultDeserializer;

/* renamed from: o.repeatTransfer */
public final /* synthetic */ class repeatTransfer implements BaseFragment.write {
    private final /* synthetic */ setResultDeserializer.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ repeatTransfer(setResultDeserializer.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        InformationTabFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver, context);
    }
}
