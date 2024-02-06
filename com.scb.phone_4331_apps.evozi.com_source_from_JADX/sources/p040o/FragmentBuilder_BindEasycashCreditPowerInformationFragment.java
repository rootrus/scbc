package p040o;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.FragmentBuilder_BindEasycashCreditPowerInformationFragment */
public final class FragmentBuilder_BindEasycashCreditPowerInformationFragment implements TextWatcher {
    public EditText IconCompatParcelizer;
    public C6509xca412883 MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    public boolean read;
    String write = "";

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public FragmentBuilder_BindEasycashCreditPowerInformationFragment(EditText editText, String str, int i) {
        InputFilter[] inputFilterArr;
        this.IconCompatParcelizer = editText;
        if (editText.getFilters() == null || this.IconCompatParcelizer.getFilters().length <= 0) {
            inputFilterArr = new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(str)};
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.IconCompatParcelizer.getFilters()));
            arrayList.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(str));
            inputFilterArr = (InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]);
        }
        this.IconCompatParcelizer.setFilters(inputFilterArr);
        this.IconCompatParcelizer.setOnFocusChangeListener(new FragmentBuilder_BindEasycashCommonReviewFragment(this));
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void afterTextChanged(Editable editable) {
        this.write = editable.toString();
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return;
        }
        if (editable.length() >= this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(this.write);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }
}
