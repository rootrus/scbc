package p040o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.MwAmountEditText;

/* renamed from: o.confirmGift */
public final /* synthetic */ class confirmGift implements TextView.OnEditorActionListener {
    private final /* synthetic */ MwAmountEditText read;

    public /* synthetic */ confirmGift(MwAmountEditText mwAmountEditText) {
        this.read = mwAmountEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        MwAmountEditText mwAmountEditText = this.read;
        if (i != 6) {
            return false;
        }
        mwAmountEditText.clearFocus();
        MwAmountEditText.write write = mwAmountEditText.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            write.read();
        }
        if (TextUtils.isEmpty(mwAmountEditText.getText())) {
            return true;
        }
        double d = mwAmountEditText.read;
        if (mwAmountEditText.IconCompatParcelizer) {
            str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        } else {
            str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
        }
        mwAmountEditText.setFormattedAmount(str);
        return true;
    }
}
