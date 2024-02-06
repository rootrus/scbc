package p040o;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;

/* renamed from: o.FragmentBuilder_BindEasycashContactInformationFragment */
public class FragmentBuilder_BindEasycashContactInformationFragment implements TextWatcher {
    public C6508x1018b6f IconCompatParcelizer;
    public final WeakReference<EditText> MediaBrowserCompat$CustomActionResultReceiver;
    public TextInputLayout MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private double MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private double f3136x50fd9e4a;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private final Object MediaSessionCompat$ResultReceiverWrapper;
    private double MediaSessionCompat$Token;
    private String RatingCompat;
    private double read;
    public String write;

    public FragmentBuilder_BindEasycashContactInformationFragment(EditText editText, TextInputLayout textInputLayout, double d, double d2, String str, String str2) {
        this(editText, textInputLayout, d, d, d2, str, str2, (String) null);
    }

    public FragmentBuilder_BindEasycashContactInformationFragment(EditText editText, TextInputLayout textInputLayout, double d, double d2, String str, String str2, String str3) {
        this(editText, textInputLayout, d, d, d2, str, str2, str3);
    }

    public FragmentBuilder_BindEasycashContactInformationFragment(EditText editText, TextInputLayout textInputLayout, double d, double d2, double d3, String str, String str2, String str3, double d4, String str4) {
        this.MediaBrowserCompat$SearchResultReceiver = 1.0d;
        this.MediaMetadataCompat = null;
        EditText editText2 = editText;
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(editText);
        this.MediaBrowserCompat$ItemReceiver = textInputLayout;
        this.IconCompatParcelizer = null;
        this.f3136x50fd9e4a = d;
        this.read = d2;
        this.RatingCompat = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.write = str3;
        this.MediaBrowserCompat$SearchResultReceiver = d4;
        this.MediaMetadataCompat = str4;
        this.MediaSessionCompat$Token = d3 == 0.0d ? 0.01d : d3;
        this.MediaSessionCompat$ResultReceiverWrapper = new Object();
    }

    public FragmentBuilder_BindEasycashContactInformationFragment(EditText editText, TextInputLayout textInputLayout, double d, double d2, double d3, String str, String str2, String str3) {
        this.MediaBrowserCompat$SearchResultReceiver = 1.0d;
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(editText);
        this.MediaBrowserCompat$ItemReceiver = textInputLayout;
        this.IconCompatParcelizer = null;
        this.f3136x50fd9e4a = d;
        this.read = d2;
        this.RatingCompat = str;
        this.MediaBrowserCompat$MediaItem = str2;
        this.write = str3;
        this.MediaSessionCompat$Token = d3 == 0.0d ? 0.01d : d3;
        this.MediaSessionCompat$ResultReceiverWrapper = new Object();
    }

    public FragmentBuilder_BindEasycashContactInformationFragment(EditText editText, C6508x1018b6f fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$SearchResultReceiver = 1.0d;
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(editText);
        this.IconCompatParcelizer = fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver;
        this.f3136x50fd9e4a = 9.9999999999E8d;
        this.MediaSessionCompat$ResultReceiverWrapper = new Object();
    }

    public final void IconCompatParcelizer(double d) {
        this.read = d;
        String obj = this.MediaBrowserCompat$CustomActionResultReceiver.get().getText().toString();
        if (!TextUtils.isEmpty(obj)) {
            read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj).doubleValue());
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if (charSequence.length() > i) {
            if (',' == charSequence.charAt(i)) {
                z = true;
            }
            this.MediaDescriptionCompat = z;
            return;
        }
        this.MediaDescriptionCompat = false;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (editText != null) {
            editText.getEditableText().setSpan(this.MediaSessionCompat$ResultReceiverWrapper, i, i3 + i, 17);
        }
    }

    public void afterTextChanged(Editable editable) {
        IconCompatParcelizer(editable, false);
    }

    public final void IconCompatParcelizer(Editable editable, boolean z) {
        EditText editText = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (editText != null && editable != null) {
            String obj = editable.toString();
            if (!obj.equalsIgnoreCase(".")) {
                if (obj.isEmpty()) {
                    C6508x1018b6f fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
                    if (fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver.write(0.0d);
                    }
                    if (z) {
                        read(0.0d);
                        return;
                    }
                    return;
                }
                if (editable.getSpanStart(this.MediaSessionCompat$ResultReceiverWrapper) == editable.getSpanEnd(this.MediaSessionCompat$ResultReceiverWrapper) && this.MediaDescriptionCompat) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj.substring(0, editable.getSpanEnd(this.MediaSessionCompat$ResultReceiverWrapper) - 1));
                    sb.append(obj.substring(editable.getSpanEnd(this.MediaSessionCompat$ResultReceiverWrapper)));
                    obj = sb.toString();
                }
                double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj).doubleValue();
                read(doubleValue);
                if (editable.toString().indexOf(".") != editable.length() - 1 || editable.getSpanEnd(this.MediaSessionCompat$ResultReceiverWrapper) < obj.indexOf(".")) {
                    editText.removeTextChangedListener(this);
                    int selectionStart = editText.getSelectionStart();
                    int length = editText.getText().length();
                    editText.setText(read(obj));
                    editText.addTextChangedListener(this);
                    if (editText.getText().length() - length == 1) {
                        selectionStart++;
                    }
                    if (selectionStart >= editText.getText().length()) {
                        selectionStart = editText.getText().length();
                    }
                    editText.setSelection(selectionStart);
                }
                C6508x1018b6f fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer;
                if (fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    fragmentBuilder_BindEasycashContactInformationFragment$MediaBrowserCompat$CustomActionResultReceiver2.write(doubleValue);
                }
            }
        }
    }

    private void read(double d) {
        double min = Math.min(this.read, this.f3136x50fd9e4a);
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            return;
        }
        if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(String.valueOf(d))) {
            String str = this.write;
            if (str != null) {
                this.MediaBrowserCompat$ItemReceiver.setError(str);
            } else {
                this.MediaBrowserCompat$ItemReceiver.setErrorEnabled(false);
            }
        } else {
            boolean z = true;
            if (d > min || d < this.MediaSessionCompat$Token) {
                String format = String.format(this.RatingCompat, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$Token), getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.f3136x50fd9e4a)});
                TextInputLayout textInputLayout = this.MediaBrowserCompat$ItemReceiver;
                if (this.read < d) {
                    format = this.MediaBrowserCompat$MediaItem;
                }
                textInputLayout.setError(format);
            } else if (this.MediaMetadataCompat != null) {
                double d2 = this.MediaBrowserCompat$SearchResultReceiver;
                if (d2 <= 0.0d || d % d2 != 0.0d) {
                    z = false;
                }
                if (z) {
                    this.MediaBrowserCompat$ItemReceiver.setErrorEnabled(false);
                } else {
                    this.MediaBrowserCompat$ItemReceiver.setError(this.MediaMetadataCompat);
                }
            } else {
                this.MediaBrowserCompat$ItemReceiver.setErrorEnabled(false);
            }
        }
    }

    private static String read(String str) {
        String str2 = "###,###,###,##0.";
        for (int i = 0; i < 2; i++) {
            if (i < (str.contains(".") ? (str.length() - str.indexOf(46)) - 1 : 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("0");
                str2 = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("#");
                str2 = sb2.toString();
            }
        }
        return new DecimalFormat(str2).format(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str));
    }
}
