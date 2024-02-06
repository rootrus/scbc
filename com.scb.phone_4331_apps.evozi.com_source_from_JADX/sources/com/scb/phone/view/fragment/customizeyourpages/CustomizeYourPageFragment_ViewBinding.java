package com.scb.phone.view.fragment.customizeyourpages;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomCustomizePageItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CustomizeYourPageFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CustomizeYourPageFragment IconCompatParcelizer;

    public CustomizeYourPageFragment_ViewBinding(CustomizeYourPageFragment customizeYourPageFragment, View view) {
        super(customizeYourPageFragment, view);
        this.IconCompatParcelizer = customizeYourPageFragment;
        customizeYourPageFragment.applyTheme = (CustomCustomizePageItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.apply_theme, "field 'applyTheme'", CustomCustomizePageItem.class);
    }

    public final void read() {
        CustomizeYourPageFragment customizeYourPageFragment = this.IconCompatParcelizer;
        if (customizeYourPageFragment != null) {
            this.IconCompatParcelizer = null;
            customizeYourPageFragment.applyTheme = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
