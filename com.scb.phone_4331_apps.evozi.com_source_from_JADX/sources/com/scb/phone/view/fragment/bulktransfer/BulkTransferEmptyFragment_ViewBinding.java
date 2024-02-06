package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BulkTransferEmptyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BulkTransferEmptyFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public BulkTransferEmptyFragment_ViewBinding(final BulkTransferEmptyFragment bulkTransferEmptyFragment, View view) {
        super(bulkTransferEmptyFragment, view);
        this.IconCompatParcelizer = bulkTransferEmptyFragment;
        bulkTransferEmptyFragment.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root_bulk_transfer, "field 'rootView'", RelativeLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bulk_transfer_tutorial_relative_layout, "field 'relativeTutorial' and method 'onTutorialClicked'");
        bulkTransferEmptyFragment.relativeTutorial = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.bulk_transfer_tutorial_relative_layout, "field 'relativeTutorial'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferEmptyFragment.this.onTutorialClicked();
            }
        });
        bulkTransferEmptyFragment.overlayImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_bulk_transfer_tutorial_image_view, "field 'overlayImageView'", ImageView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_create_recipient_group, "method 'createButtonClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferEmptyFragment.this.createButtonClicked();
            }
        });
    }

    public final void read() {
        BulkTransferEmptyFragment bulkTransferEmptyFragment = this.IconCompatParcelizer;
        if (bulkTransferEmptyFragment != null) {
            this.IconCompatParcelizer = null;
            bulkTransferEmptyFragment.rootView = null;
            bulkTransferEmptyFragment.relativeTutorial = null;
            bulkTransferEmptyFragment.overlayImageView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
