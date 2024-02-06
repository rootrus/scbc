package com.scb.phone.view.activity.prepaid;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class PrepaidDetailsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrepaidDetailsActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public PrepaidDetailsActivity_ViewBinding(final PrepaidDetailsActivity prepaidDetailsActivity, View view) {
        super(prepaidDetailsActivity, view);
        this.IconCompatParcelizer = prepaidDetailsActivity;
        prepaidDetailsActivity.tvBalanceValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_balance_value, "field 'tvBalanceValue'", TextView.class);
        prepaidDetailsActivity.tvBalanceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_balance_label, "field 'tvBalanceLabel'", TextView.class);
        prepaidDetailsActivity.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nested_scrollview, "field 'scrollView'", NestedScrollView.class);
        prepaidDetailsActivity.normalPrepaidTab = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctl, "field 'normalPrepaidTab'", CustomTabLayout.class);
        prepaidDetailsActivity.travelPrepaidTab = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctl_travel_tab, "field 'travelPrepaidTab'", CustomTabLayout.class);
        prepaidDetailsActivity.vpCard = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_card, "field 'vpCard'", ViewPager.class);
        prepaidDetailsActivity.indicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'indicator'", CircleIndicator.class);
        prepaidDetailsActivity.vpPrepaidNormalContent = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_content, "field 'vpPrepaidNormalContent'", WrapContentViewPager.class);
        prepaidDetailsActivity.vpPrepaidTravelContent = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_travel_content, "field 'vpPrepaidTravelContent'", WrapContentViewPager.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_top_up, "field 'btnTopUp' and method 'onTopUpClick'");
        prepaidDetailsActivity.btnTopUp = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_top_up, "field 'btnTopUp'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidDetailsActivity.this.onTopUpClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_prepaid_travel_transfer, "field 'btnPrepaidTravelTransfer' and method 'onTransferOutClick'");
        prepaidDetailsActivity.btnPrepaidTravelTransfer = (AppCompatButton) onStart.write(IconCompatParcelizer3, R.id.bt_prepaid_travel_transfer, "field 'btnPrepaidTravelTransfer'", AppCompatButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidDetailsActivity.this.onTransferOutClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_prepaid_travel_topup, "field 'btnPrepaidTravelTopup' and method 'onPrepaidTravelTopUpClick'");
        prepaidDetailsActivity.btnPrepaidTravelTopup = (AppCompatButton) onStart.write(IconCompatParcelizer4, R.id.bt_prepaid_travel_topup, "field 'btnPrepaidTravelTopup'", AppCompatButton.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidDetailsActivity.this.onPrepaidTravelTopUpClick();
            }
        });
        prepaidDetailsActivity.prepaidTravelView = onStart.IconCompatParcelizer(view, R.id.root_prepaid_travel, "field 'prepaidTravelView'");
        prepaidDetailsActivity.normalTravelView = onStart.IconCompatParcelizer(view, R.id.root_prepaid_normal, "field 'normalTravelView'");
        prepaidDetailsActivity.rootTravelTopup = onStart.IconCompatParcelizer(view, R.id.root_prepaid_travel_topup, "field 'rootTravelTopup'");
    }

    public final void read() {
        PrepaidDetailsActivity prepaidDetailsActivity = this.IconCompatParcelizer;
        if (prepaidDetailsActivity != null) {
            this.IconCompatParcelizer = null;
            prepaidDetailsActivity.tvBalanceValue = null;
            prepaidDetailsActivity.tvBalanceLabel = null;
            prepaidDetailsActivity.scrollView = null;
            prepaidDetailsActivity.normalPrepaidTab = null;
            prepaidDetailsActivity.travelPrepaidTab = null;
            prepaidDetailsActivity.vpCard = null;
            prepaidDetailsActivity.indicator = null;
            prepaidDetailsActivity.vpPrepaidNormalContent = null;
            prepaidDetailsActivity.vpPrepaidTravelContent = null;
            prepaidDetailsActivity.btnTopUp = null;
            prepaidDetailsActivity.btnPrepaidTravelTransfer = null;
            prepaidDetailsActivity.btnPrepaidTravelTopup = null;
            prepaidDetailsActivity.prepaidTravelView = null;
            prepaidDetailsActivity.normalTravelView = null;
            prepaidDetailsActivity.rootTravelTopup = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
