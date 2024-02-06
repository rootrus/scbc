package com.scb.phone.view.fragment.transferandpay.fixedtransfer;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FixedTransferTargetTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FixedTransferTargetTabFragment write;

    public FixedTransferTargetTabFragment_ViewBinding(final FixedTransferTargetTabFragment fixedTransferTargetTabFragment, View view) {
        super(fixedTransferTargetTabFragment, view);
        this.write = fixedTransferTargetTabFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_reload, "field 'rvReload' and method 'onReloadClick'");
        fixedTransferTargetTabFragment.rvReload = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_reload, "field 'rvReload'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferTargetTabFragment.this.onReloadClick(view);
            }
        });
        fixedTransferTargetTabFragment.ctlTargetAccount = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctl_target_account, "field 'ctlTargetAccount'", CustomTabLayout.class);
        fixedTransferTargetTabFragment.vpTargetAccount = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_target_account, "field 'vpTargetAccount'", FragmentWrapContentViewPager.class);
        fixedTransferTargetTabFragment.groupViewpager = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_viewpager, "field 'groupViewpager'", Group.class);
        fixedTransferTargetTabFragment.groupAccountInfoLoadFailed = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_account_info_load_failed, "field 'groupAccountInfoLoadFailed'", Group.class);
        fixedTransferTargetTabFragment.groupMainAccountFrozen = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_main_account_frozen, "field 'groupMainAccountFrozen'", Group.class);
    }

    public final void read() {
        FixedTransferTargetTabFragment fixedTransferTargetTabFragment = this.write;
        if (fixedTransferTargetTabFragment != null) {
            this.write = null;
            fixedTransferTargetTabFragment.rvReload = null;
            fixedTransferTargetTabFragment.ctlTargetAccount = null;
            fixedTransferTargetTabFragment.vpTargetAccount = null;
            fixedTransferTargetTabFragment.groupViewpager = null;
            fixedTransferTargetTabFragment.groupAccountInfoLoadFailed = null;
            fixedTransferTargetTabFragment.groupMainAccountFrozen = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
