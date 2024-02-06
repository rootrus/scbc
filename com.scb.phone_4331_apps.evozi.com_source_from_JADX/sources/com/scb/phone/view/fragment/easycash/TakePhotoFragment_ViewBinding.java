package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TakePhotoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private TakePhotoFragment MediaBrowserCompat$ItemReceiver;

    public TakePhotoFragment_ViewBinding(final TakePhotoFragment takePhotoFragment, View view) {
        super(takePhotoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = takePhotoFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_retake_photo, "field 'retakeButton' and method 'onRetakePhotoClick'");
        takePhotoFragment.retakeButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_retake_photo, "field 'retakeButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TakePhotoFragment.this.onRetakePhotoClick();
            }
        });
        takePhotoFragment.infoNoPhoto = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.info_no_photo, "field 'infoNoPhoto'", TextView.class);
        takePhotoFragment.linearAttaching = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_attaching, "field 'linearAttaching'", LinearLayout.class);
        takePhotoFragment.linearAttached = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_photo_attached, "field 'linearAttached'", LinearLayout.class);
        takePhotoFragment.linearNoAttached = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_photo_no_attached, "field 'linearNoAttached'", LinearLayout.class);
    }

    public final void read() {
        TakePhotoFragment takePhotoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (takePhotoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            takePhotoFragment.retakeButton = null;
            takePhotoFragment.infoNoPhoto = null;
            takePhotoFragment.linearAttaching = null;
            takePhotoFragment.linearAttached = null;
            takePhotoFragment.linearNoAttached = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
