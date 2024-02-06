package p040o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.InputText;

/* renamed from: o.confirmGiftPresent */
public final /* synthetic */ class confirmGiftPresent implements TextView.OnEditorActionListener {
    private final /* synthetic */ InputText read;

    public /* synthetic */ confirmGiftPresent(InputText inputText) {
        this.read = inputText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        InputText inputText = this.read;
        if (i != 6 || TextUtils.isEmpty(inputText.inputEditText.getText().toString().trim())) {
            return false;
        }
        inputText.setText(inputText.inputEditText.getText().toString().trim());
        return false;
    }
}
