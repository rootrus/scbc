package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CloseAccountSelectionOwnSelectedFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CloseAccountSelectionOwnSelectedFragment write;

    public CloseAccountSelectionOwnSelectedFragment_ViewBinding(final CloseAccountSelectionOwnSelectedFragment closeAccountSelectionOwnSelectedFragment, View view) {
        super(closeAccountSelectionOwnSelectedFragment, view);
        this.write = closeAccountSelectionOwnSelectedFragment;
        closeAccountSelectionOwnSelectedFragment.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
        closeAccountSelectionOwnSelectedFragment.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_subtitle, "field 'subtitle'", TextView.class);
        closeAccountSelectionOwnSelectedFragment.startIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_start_icon, "field 'startIcon'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_review, "field 'reviewButton' and method 'onReviewButtonClick'");
        closeAccountSelectionOwnSelectedFragment.reviewButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_review, "field 'reviewButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountSelectionOwnSelectedFragment.this.onReviewButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.iv_end_icon, "method 'onCloseIconClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountSelectionOwnSelectedFragment.this.onCloseIconClick();
            }
        });
    }

    public final void read() {
        CloseAccountSelectionOwnSelectedFragment closeAccountSelectionOwnSelectedFragment = this.write;
        if (closeAccountSelectionOwnSelectedFragment != null) {
            this.write = null;
            closeAccountSelectionOwnSelectedFragment.title = null;
            closeAccountSelectionOwnSelectedFragment.subtitle = null;
            closeAccountSelectionOwnSelectedFragment.startIcon = null;
            closeAccountSelectionOwnSelectedFragment.reviewButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
