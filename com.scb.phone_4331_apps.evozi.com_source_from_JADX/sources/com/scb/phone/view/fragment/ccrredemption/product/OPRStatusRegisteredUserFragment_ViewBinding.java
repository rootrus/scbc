package com.scb.phone.view.fragment.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class OPRStatusRegisteredUserFragment_ViewBinding extends BaseFragment_ViewBinding {
    private OPRStatusRegisteredUserFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public OPRStatusRegisteredUserFragment_ViewBinding(final OPRStatusRegisteredUserFragment oPRStatusRegisteredUserFragment, View view) {
        super(oPRStatusRegisteredUserFragment, view);
        this.IconCompatParcelizer = oPRStatusRegisteredUserFragment;
        oPRStatusRegisteredUserFragment.eligiblePrivilegesViewPager = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.eligible_privileges_view_pager, "field 'eligiblePrivilegesViewPager'", WrapContentViewPager.class);
        oPRStatusRegisteredUserFragment.eligiblePrivilegesIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.eligible_privileges_indicator, "field 'eligiblePrivilegesIndicator'", CircleIndicator.class);
        oPRStatusRegisteredUserFragment.eligiblePrivilegesLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.eligible_privileges_label, "field 'eligiblePrivilegesLabel'", TextView.class);
        oPRStatusRegisteredUserFragment.txvExpiryDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_expiry_date, "field 'txvExpiryDate'", TextView.class);
        oPRStatusRegisteredUserFragment.wowBannerLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.wow_banner_layout, "field 'wowBannerLayout'", ConstraintLayout.class);
        oPRStatusRegisteredUserFragment.viewGroupProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_progress, "field 'viewGroupProgress'", ViewGroup.class);
        oPRStatusRegisteredUserFragment.infoLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_info_layout, "field 'infoLayout'", ViewGroup.class);
        oPRStatusRegisteredUserFragment.errorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_plan_error_header, "field 'errorTitle'", TextView.class);
        oPRStatusRegisteredUserFragment.errorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_plan_error_body, "field 'errorMessage'", TextView.class);
        oPRStatusRegisteredUserFragment.errorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_error_layout, "field 'errorLayout'", ViewGroup.class);
        oPRStatusRegisteredUserFragment.expiryDateGroup = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expiry_date_group, "field 'expiryDateGroup'", Group.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_button, "method 'handleViewClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OPRStatusRegisteredUserFragment.this.handleViewClick();
            }
        });
    }

    public final void read() {
        OPRStatusRegisteredUserFragment oPRStatusRegisteredUserFragment = this.IconCompatParcelizer;
        if (oPRStatusRegisteredUserFragment != null) {
            this.IconCompatParcelizer = null;
            oPRStatusRegisteredUserFragment.eligiblePrivilegesViewPager = null;
            oPRStatusRegisteredUserFragment.eligiblePrivilegesIndicator = null;
            oPRStatusRegisteredUserFragment.eligiblePrivilegesLabel = null;
            oPRStatusRegisteredUserFragment.txvExpiryDate = null;
            oPRStatusRegisteredUserFragment.wowBannerLayout = null;
            oPRStatusRegisteredUserFragment.viewGroupProgress = null;
            oPRStatusRegisteredUserFragment.infoLayout = null;
            oPRStatusRegisteredUserFragment.errorTitle = null;
            oPRStatusRegisteredUserFragment.errorMessage = null;
            oPRStatusRegisteredUserFragment.errorLayout = null;
            oPRStatusRegisteredUserFragment.expiryDateGroup = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
