package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import com.lyft.android.scissors.CropView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwPartnerCropPhotoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private MwPartnerCropPhotoActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public MwPartnerCropPhotoActivity_ViewBinding(final MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity, View view) {
        super(mwPartnerCropPhotoActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mwPartnerCropPhotoActivity;
        mwPartnerCropPhotoActivity.cropView = (CropView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.crop_view, "field 'cropView'", CropView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_cancel, "method 'cancelClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPartnerCropPhotoActivity.this.cancelClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_use, "method 'usePhotoClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPartnerCropPhotoActivity.this.usePhotoClick();
            }
        });
    }

    public final void read() {
        MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mwPartnerCropPhotoActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mwPartnerCropPhotoActivity.cropView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
