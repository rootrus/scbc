package p040o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* renamed from: o.FragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment */
public class C6510x49ff895f implements TextWatcher {
    private final WeakReference<EditText> read;
    public IconCompatParcelizer write;

    @FunctionalInterface
    /* renamed from: o.FragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void IconCompatParcelizer(BigDecimal bigDecimal);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6510x49ff895f(EditText editText, IconCompatParcelizer iconCompatParcelizer) {
        this.read = new WeakReference<>(editText);
        this.write = iconCompatParcelizer;
    }

    public void afterTextChanged(Editable editable) {
        EditText editText = this.read.get();
        if (editText != null && editable != null) {
            String obj = editable.toString();
            if (!obj.equalsIgnoreCase(".") && !obj.isEmpty()) {
                BigDecimal ParcelableVolumeInfo = getICheckDeserializerRtti.ParcelableVolumeInfo(obj);
                if (editable.toString().indexOf(".") != editable.length() - 1) {
                    editText.removeTextChangedListener(this);
                    int selectionStart = editText.getSelectionStart();
                    int length = editText.getText().length();
                    String str = "###,###,###,##0.";
                    for (int i = 0; i < 4; i++) {
                        if (i < (obj.contains(".") ? (obj.length() - obj.indexOf(46)) - 1 : 0)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append("0");
                            str = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("#");
                            str = sb2.toString();
                        }
                    }
                    editText.setText(new DecimalFormat(str).format(getICheckDeserializerRtti.ParcelableVolumeInfo(obj)));
                    editText.addTextChangedListener(this);
                    if (editText.getText().length() - length == 1) {
                        selectionStart++;
                    }
                    if (selectionStart >= editText.getText().length()) {
                        selectionStart = editText.getText().length();
                    }
                    editText.setSelection(selectionStart);
                }
                IconCompatParcelizer iconCompatParcelizer = this.write;
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.IconCompatParcelizer(ParcelableVolumeInfo);
                }
            }
        }
    }
}
