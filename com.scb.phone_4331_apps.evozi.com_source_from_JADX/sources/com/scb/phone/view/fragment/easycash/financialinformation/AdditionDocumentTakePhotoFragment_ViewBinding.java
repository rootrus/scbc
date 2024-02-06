package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AdditionDocumentTakePhotoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AdditionDocumentTakePhotoFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public AdditionDocumentTakePhotoFragment_ViewBinding(final AdditionDocumentTakePhotoFragment additionDocumentTakePhotoFragment, View view) {
        super(additionDocumentTakePhotoFragment, view);
        this.IconCompatParcelizer = additionDocumentTakePhotoFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_take_photo, "field 'btnTakePhoto' and method 'onTakePhotoButtonClicked'");
        additionDocumentTakePhotoFragment.btnTakePhoto = (Button) onStart.write(IconCompatParcelizer2, R.id.button_take_photo, "field 'btnTakePhoto'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AdditionDocumentTakePhotoFragment.this.onTakePhotoButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_upload_photo, "field 'btnUploadPhoto' and method 'onSelectImageClicked'");
        additionDocumentTakePhotoFragment.btnUploadPhoto = (Button) onStart.write(IconCompatParcelizer3, R.id.button_upload_photo, "field 'btnUploadPhoto'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AdditionDocumentTakePhotoFragment.this.onSelectImageClicked();
            }
        });
    }

    public final void read() {
        AdditionDocumentTakePhotoFragment additionDocumentTakePhotoFragment = this.IconCompatParcelizer;
        if (additionDocumentTakePhotoFragment != null) {
            this.IconCompatParcelizer = null;
            additionDocumentTakePhotoFragment.btnTakePhoto = null;
            additionDocumentTakePhotoFragment.btnUploadPhoto = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
