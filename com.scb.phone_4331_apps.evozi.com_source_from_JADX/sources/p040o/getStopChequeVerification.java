package p040o;

import android.content.DialogInterface;
import android.widget.ImageView;
import com.scb.phone.view.custom.ntb.NTBAdsDialog;
import com.squareup.picasso.Picasso;

/* renamed from: o.getStopChequeVerification */
public final /* synthetic */ class getStopChequeVerification implements DialogInterface.OnDismissListener {
    private final /* synthetic */ NTBAdsDialog IconCompatParcelizer;

    public /* synthetic */ getStopChequeVerification(NTBAdsDialog nTBAdsDialog) {
        this.IconCompatParcelizer = nTBAdsDialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        NTBAdsDialog nTBAdsDialog = this.IconCompatParcelizer;
        boolean z = true;
        if (nTBAdsDialog.lightCheckBox.isChecked() || nTBAdsDialog.darkCheckBox.isChecked()) {
            nTBAdsDialog.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(nTBAdsDialog.read);
        }
        nTBAdsDialog.write = false;
        NTBAdsDialog.read read = nTBAdsDialog.IconCompatParcelizer;
        String str = nTBAdsDialog.MediaBrowserCompat$ItemReceiver;
        if (!nTBAdsDialog.lightCheckBox.isChecked() && !nTBAdsDialog.darkCheckBox.isChecked()) {
            z = false;
        }
        read.read(new C7367pc(str, "close_ad", String.valueOf(z), nTBAdsDialog.read));
        Picasso read2 = Picasso.read();
        ImageView imageView = nTBAdsDialog.ivAdsImage;
        if (imageView != null) {
            read2.write((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }
}
