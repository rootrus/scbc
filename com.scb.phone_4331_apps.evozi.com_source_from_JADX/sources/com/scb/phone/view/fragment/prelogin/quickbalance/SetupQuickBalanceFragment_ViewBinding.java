package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SetupQuickBalanceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SetupQuickBalanceFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public SetupQuickBalanceFragment_ViewBinding(final SetupQuickBalanceFragment setupQuickBalanceFragment, View view) {
        super(setupQuickBalanceFragment, view);
        this.IconCompatParcelizer = setupQuickBalanceFragment;
        setupQuickBalanceFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mContinueButton' and method 'onConfirmButtonClicked'");
        setupQuickBalanceFragment.mContinueButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_continue, "field 'mContinueButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SetupQuickBalanceFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        SetupQuickBalanceFragment setupQuickBalanceFragment = this.IconCompatParcelizer;
        if (setupQuickBalanceFragment != null) {
            this.IconCompatParcelizer = null;
            setupQuickBalanceFragment.mRecyclerView = null;
            setupQuickBalanceFragment.mContinueButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
