package p040o;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.scb.phone.view.custom.common.CustomInputDialog;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.getSharingMomentConfig$MediaBrowserCompat$ItemReceiver */
public final class getSharingMomentConfig$MediaBrowserCompat$ItemReceiver {
    private getSharingMomentConfig$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getSharingMomentConfig$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static CustomInputDialog IconCompatParcelizer(Context context, String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "text");
        onGetStartedClick.write((Object) str3, "hint");
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(context);
        if (str != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(str);
        }
        if (str2 != null) {
            MediaBrowserCompat$ItemReceiver.mTextTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTextTextView.setText(str2);
        }
        MediaBrowserCompat$ItemReceiver.mEditTextView.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashCreditPowerSummaryFragment()});
        MediaBrowserCompat$ItemReceiver.mEditTextView.setTransformationMethod(new PasswordTransformationMethod());
        EditText editText = MediaBrowserCompat$ItemReceiver.mEditTextView;
        onGetStartedClick.IconCompatParcelizer((Object) editText, "editTextView");
        editText.setHint(str3);
        MediaBrowserCompat$ItemReceiver.setCanceledOnTouchOutside(false);
        MediaBrowserCompat$ItemReceiver.mEditTextView.setVisibility(0);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "CustomInputDialog.create…     }.showEditText(true)");
        return MediaBrowserCompat$ItemReceiver;
    }
}
