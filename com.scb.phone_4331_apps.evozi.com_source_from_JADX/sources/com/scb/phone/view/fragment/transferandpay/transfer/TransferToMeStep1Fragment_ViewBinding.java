package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TransferToMeStep1Fragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransferToMeStep1Fragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public TransferToMeStep1Fragment_ViewBinding(final TransferToMeStep1Fragment transferToMeStep1Fragment, View view) {
        super(transferToMeStep1Fragment, view);
        this.IconCompatParcelizer = transferToMeStep1Fragment;
        transferToMeStep1Fragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        transferToMeStep1Fragment.viewGroupNoTargets = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_no_targets, "field 'viewGroupNoTargets'", ViewGroup.class);
        transferToMeStep1Fragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        transferToMeStep1Fragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_close, "method 'onCloseButtonClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferToMeStep1Fragment.this.onCloseButtonClicked();
            }
        });
    }

    public final void read() {
        TransferToMeStep1Fragment transferToMeStep1Fragment = this.IconCompatParcelizer;
        if (transferToMeStep1Fragment != null) {
            this.IconCompatParcelizer = null;
            transferToMeStep1Fragment.recyclerView = null;
            transferToMeStep1Fragment.viewGroupNoTargets = null;
            transferToMeStep1Fragment.imageIcon = null;
            transferToMeStep1Fragment.textTitle = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
