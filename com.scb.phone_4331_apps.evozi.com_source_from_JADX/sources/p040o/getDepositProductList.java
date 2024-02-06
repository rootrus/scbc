package p040o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.AmountEditText;

/* renamed from: o.getDepositProductList */
public final /* synthetic */ class getDepositProductList implements TextView.OnEditorActionListener {
    private final /* synthetic */ AmountEditText write;

    public /* synthetic */ getDepositProductList(AmountEditText amountEditText) {
        this.write = amountEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        AmountEditText amountEditText = this.write;
        if (i != 6) {
            return false;
        }
        AmountEditText.read read = amountEditText.MediaBrowserCompat$CustomActionResultReceiver;
        if (read != null) {
            read.MediaBrowserCompat$CustomActionResultReceiver();
        }
        amountEditText.clearFocus();
        if (TextUtils.isEmpty(amountEditText.getText())) {
            return true;
        }
        double d = amountEditText.write;
        if (amountEditText.MediaDescriptionCompat) {
            str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        } else {
            str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
        }
        amountEditText.setFormattedAmount(str);
        return true;
    }
}
