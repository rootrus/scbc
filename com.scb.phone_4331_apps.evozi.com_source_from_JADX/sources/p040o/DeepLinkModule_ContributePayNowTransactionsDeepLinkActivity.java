package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.fastpay.FastPayInputFragment;

/* renamed from: o.DeepLinkModule_ContributePayNowTransactionsDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributePayNowTransactionsDeepLinkActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ FastPayInputFragment write;

    public /* synthetic */ DeepLinkModule_ContributePayNowTransactionsDeepLinkActivity(FastPayInputFragment fastPayInputFragment, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = fastPayInputFragment;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
