package p040o;

import android.content.DialogInterface;
import p040o.setResultDeserializer;

/* renamed from: o.confirmFixedAccount */
public final /* synthetic */ class confirmFixedAccount implements DialogInterface.OnClickListener {
    private final /* synthetic */ setResultDeserializer.write IconCompatParcelizer;

    public /* synthetic */ confirmFixedAccount(setResultDeserializer.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }
}
