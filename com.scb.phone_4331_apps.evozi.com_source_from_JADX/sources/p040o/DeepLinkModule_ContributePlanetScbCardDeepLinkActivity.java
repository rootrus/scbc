package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.fastpay.FastPayInputFragment;

/* renamed from: o.DeepLinkModule_ContributePlanetScbCardDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributePlanetScbCardDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FastPayInputFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ DeepLinkModule_ContributePlanetScbCardDeepLinkActivity(FastPayInputFragment fastPayInputFragment, setUuidFromUtf8Bytes setuuidfromutf8bytes, String str) {
        this.MediaBrowserCompat$ItemReceiver = fastPayInputFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes;
        this.read = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
