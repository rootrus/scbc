package p040o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment */
public final class FragmentBuilder_BindEasycashFeaturesCardInformationFragment implements TextWatcher {
    private EditText IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver = "";
    private read MediaBrowserCompat$MediaItem;
    public write read;
    public boolean write;

    /* renamed from: o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment$read */
    public interface read {
        String MediaBrowserCompat$ItemReceiver(String str);
    }

    /* renamed from: o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment$write */
    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(String str);

        void write(String str);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public FragmentBuilder_BindEasycashFeaturesCardInformationFragment(EditText editText, String str, read read2) {
        this.IconCompatParcelizer = editText;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$MediaItem = read2;
        editText.setOnFocusChangeListener(new FragmentBuilder_BindEasycashBusinessAndMaritalInfoFragment(this));
    }

    public final void afterTextChanged(Editable editable) {
        String str;
        this.IconCompatParcelizer.removeTextChangedListener(this);
        String obj = editable.toString();
        String MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(obj);
        if (obj.length() > this.MediaBrowserCompat$CustomActionResultReceiver.length() || ((str = this.MediaBrowserCompat$ItemReceiver) != null && str.equals(MediaBrowserCompat$ItemReceiver2))) {
            editable.replace(0, editable.length(), this.MediaBrowserCompat$ItemReceiver);
            this.IconCompatParcelizer.addTextChangedListener(this);
            return;
        }
        editable.replace(0, editable.length(), MediaBrowserCompat$ItemReceiver2);
        this.MediaBrowserCompat$ItemReceiver = editable.toString();
        this.IconCompatParcelizer.addTextChangedListener(this);
        if (this.MediaBrowserCompat$ItemReceiver.length() >= this.MediaBrowserCompat$CustomActionResultReceiver.length()) {
            write write2 = this.read;
            if (write2 != null) {
                write2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
                return;
            }
            return;
        }
        write write3 = this.read;
        if (write3 != null) {
            write3.write(this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
