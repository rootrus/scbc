package p040o;

import android.content.DialogInterface;
import p040o.setResultDeserializer;

/* renamed from: o.EasyCashDFWYNService */
public final /* synthetic */ class EasyCashDFWYNService implements DialogInterface.OnClickListener {
    private final /* synthetic */ setResultDeserializer.write read;

    public /* synthetic */ EasyCashDFWYNService(setResultDeserializer.write write) {
        this.read = write;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.MediaBrowserCompat$ItemReceiver();
    }
}
