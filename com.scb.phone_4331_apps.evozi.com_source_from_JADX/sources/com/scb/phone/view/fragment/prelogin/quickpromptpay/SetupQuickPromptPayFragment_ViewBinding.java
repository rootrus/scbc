package com.scb.phone.view.fragment.prelogin.quickpromptpay;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SetupQuickPromptPayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private SetupQuickPromptPayFragment MediaBrowserCompat$ItemReceiver;

    public SetupQuickPromptPayFragment_ViewBinding(final SetupQuickPromptPayFragment setupQuickPromptPayFragment, View view) {
        super(setupQuickPromptPayFragment, view);
        this.MediaBrowserCompat$ItemReceiver = setupQuickPromptPayFragment;
        setupQuickPromptPayFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mContinueButton' and method 'onConfirmButtonClicked'");
        setupQuickPromptPayFragment.mContinueButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_continue, "field 'mContinueButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SetupQuickPromptPayFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        SetupQuickPromptPayFragment setupQuickPromptPayFragment = this.MediaBrowserCompat$ItemReceiver;
        if (setupQuickPromptPayFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            setupQuickPromptPayFragment.mRecyclerView = null;
            setupQuickPromptPayFragment.mContinueButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
