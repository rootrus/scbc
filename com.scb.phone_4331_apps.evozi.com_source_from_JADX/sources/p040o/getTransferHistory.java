package p040o;

import android.content.DialogInterface;
import p040o.setResultDeserializer;

/* renamed from: o.getTransferHistory */
public final /* synthetic */ class getTransferHistory implements DialogInterface.OnClickListener {
    private final /* synthetic */ setResultDeserializer.write write;

    public /* synthetic */ getTransferHistory(setResultDeserializer.write write2) {
        this.write = write2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.MediaBrowserCompat$ItemReceiver();
    }
}
