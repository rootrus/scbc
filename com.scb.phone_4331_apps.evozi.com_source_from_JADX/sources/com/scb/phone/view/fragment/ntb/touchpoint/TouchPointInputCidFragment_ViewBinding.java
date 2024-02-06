package com.scb.phone.view.fragment.ntb.touchpoint;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class TouchPointInputCidFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TouchPointInputCidFragment MediaBrowserCompat$CustomActionResultReceiver;

    public TouchPointInputCidFragment_ViewBinding(TouchPointInputCidFragment touchPointInputCidFragment, View view) {
        super(touchPointInputCidFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = touchPointInputCidFragment;
        touchPointInputCidFragment.ivpNationalIdNumber = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_nid_number, "field 'ivpNationalIdNumber'", CommonInputViewGroup.class);
        touchPointInputCidFragment.root = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rr_layout_root, "field 'root'", ViewGroup.class);
        touchPointInputCidFragment.buttonNext = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'buttonNext'", Button.class);
    }

    public final void read() {
        TouchPointInputCidFragment touchPointInputCidFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (touchPointInputCidFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            touchPointInputCidFragment.ivpNationalIdNumber = null;
            touchPointInputCidFragment.root = null;
            touchPointInputCidFragment.buttonNext = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
