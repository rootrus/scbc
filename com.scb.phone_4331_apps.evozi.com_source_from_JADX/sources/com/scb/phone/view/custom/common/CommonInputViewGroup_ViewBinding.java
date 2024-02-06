package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CommonInputViewGroup_ViewBinding implements Unbinder {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CommonInputViewGroup write;

    public CommonInputViewGroup_ViewBinding(final CommonInputViewGroup commonInputViewGroup, View view) {
        this.write = commonInputViewGroup;
        commonInputViewGroup.mEditText = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_text, "field 'mEditText'", CustomEditText.class);
        commonInputViewGroup.mCounterTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter, "field 'mCounterTextView'", TextView.class);
        commonInputViewGroup.mErrorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorTextView'", TextView.class);
        commonInputViewGroup.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'mTitleTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.edit_clear, "field 'mEditClearImageButton' and method 'onClickClear'");
        commonInputViewGroup.mEditClearImageButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.edit_clear, "field 'mEditClearImageButton'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CommonInputViewGroup.this.onClickClear();
            }
        });
        commonInputViewGroup.mEditPencilImageButton = (ImageButton) onStart.IconCompatParcelizer(view, R.id.ib_edit_pencil, "field 'mEditPencilImageButton'", ImageButton.class);
        commonInputViewGroup.extraIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_extra_icon, "field 'extraIcon'", ImageView.class);
    }

    public final void read() {
        CommonInputViewGroup commonInputViewGroup = this.write;
        if (commonInputViewGroup != null) {
            this.write = null;
            commonInputViewGroup.mEditText = null;
            commonInputViewGroup.mCounterTextView = null;
            commonInputViewGroup.mErrorTextView = null;
            commonInputViewGroup.mTitleTextView = null;
            commonInputViewGroup.mEditClearImageButton = null;
            commonInputViewGroup.mEditPencilImageButton = null;
            commonInputViewGroup.extraIcon = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
