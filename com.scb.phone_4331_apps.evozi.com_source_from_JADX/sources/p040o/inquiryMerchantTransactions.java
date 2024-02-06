package p040o;

import android.text.TextUtils;
import android.view.View;
import com.scb.phone.view.custom.ntb.NTBAdsDialog;

/* renamed from: o.inquiryMerchantTransactions */
public final /* synthetic */ class inquiryMerchantTransactions implements View.OnClickListener {
    private final /* synthetic */ NTBAdsDialog read;

    public /* synthetic */ inquiryMerchantTransactions(NTBAdsDialog nTBAdsDialog) {
        this.read = nTBAdsDialog;
    }

    public final void onClick(View view) {
        NTBAdsDialog nTBAdsDialog = this.read;
        if (!TextUtils.isEmpty(nTBAdsDialog.MediaBrowserCompat$CustomActionResultReceiver) && nTBAdsDialog.MediaBrowserCompat$CustomActionResultReceiver.contains("://")) {
            if (!nTBAdsDialog.write) {
                boolean z = true;
                nTBAdsDialog.write = true;
                NTBAdsDialog.read read2 = nTBAdsDialog.IconCompatParcelizer;
                String str = nTBAdsDialog.MediaBrowserCompat$ItemReceiver;
                if (!nTBAdsDialog.lightCheckBox.isChecked() && !nTBAdsDialog.darkCheckBox.isChecked()) {
                    z = false;
                }
                read2.read(new C7367pc(str, "click_link", String.valueOf(z), nTBAdsDialog.read));
            }
            nTBAdsDialog.dismiss();
            if (NTBAdsDialog.read(nTBAdsDialog.MediaBrowserCompat$CustomActionResultReceiver)) {
                nTBAdsDialog.IconCompatParcelizer.IconCompatParcelizer(nTBAdsDialog.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }
}
