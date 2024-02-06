package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CloseAccountSelectionOtherFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountSelectionOtherFragment IconCompatParcelizer;
    private View write;

    public CloseAccountSelectionOtherFragment_ViewBinding(final CloseAccountSelectionOtherFragment closeAccountSelectionOtherFragment, View view) {
        super(closeAccountSelectionOtherFragment, view);
        this.IconCompatParcelizer = closeAccountSelectionOtherFragment;
        closeAccountSelectionOtherFragment.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_icon, "field 'icon'", ImageView.class);
        closeAccountSelectionOtherFragment.accountNumberInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.common_input_view_group, "field 'accountNumberInput'", CommonInputViewGroup.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_review, "field 'button' and method 'onButtonClick'");
        closeAccountSelectionOtherFragment.button = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_review, "field 'button'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CloseAccountSelectionOtherFragment.this.onButtonClick();
            }
        });
    }

    public final void read() {
        CloseAccountSelectionOtherFragment closeAccountSelectionOtherFragment = this.IconCompatParcelizer;
        if (closeAccountSelectionOtherFragment != null) {
            this.IconCompatParcelizer = null;
            closeAccountSelectionOtherFragment.icon = null;
            closeAccountSelectionOtherFragment.accountNumberInput = null;
            closeAccountSelectionOtherFragment.button = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
