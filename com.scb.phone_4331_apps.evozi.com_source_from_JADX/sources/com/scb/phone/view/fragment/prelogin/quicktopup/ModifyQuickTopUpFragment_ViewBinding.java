package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class ModifyQuickTopUpFragment_ViewBinding extends QuickTopUpFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ModifyQuickTopUpFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public ModifyQuickTopUpFragment_ViewBinding(final ModifyQuickTopUpFragment modifyQuickTopUpFragment, View view) {
        super(modifyQuickTopUpFragment, view);
        this.MediaBrowserCompat$ItemReceiver = modifyQuickTopUpFragment;
        modifyQuickTopUpFragment.mSwitchCompat = (SwitchCompat) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.quick_top_up_switch, "field 'mSwitchCompat'", SwitchCompat.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.switch_relative_layout, "field 'mSwitchRelativeLayout' and method 'onSwitchClick'");
        modifyQuickTopUpFragment.mSwitchRelativeLayout = (RelativeLayout) onStart.write(IconCompatParcelizer, R.id.switch_relative_layout, "field 'mSwitchRelativeLayout'", RelativeLayout.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ModifyQuickTopUpFragment.this.onSwitchClick();
            }
        });
        modifyQuickTopUpFragment.mModifyQuickTopUpLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.modify_quick_top_up_linear_layout, "field 'mModifyQuickTopUpLinearLayout'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onContinueButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ModifyQuickTopUpFragment.this.onContinueButtonClick();
            }
        });
    }

    public final void read() {
        ModifyQuickTopUpFragment modifyQuickTopUpFragment = this.MediaBrowserCompat$ItemReceiver;
        if (modifyQuickTopUpFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            modifyQuickTopUpFragment.mSwitchCompat = null;
            modifyQuickTopUpFragment.mSwitchRelativeLayout = null;
            modifyQuickTopUpFragment.mModifyQuickTopUpLinearLayout = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
