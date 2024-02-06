package com.scb.phone.view.activity.debitatm;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class DebitCardDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private DebitCardDetailActivity MediaBrowserCompat$ItemReceiver;

    public DebitCardDetailActivity_ViewBinding(DebitCardDetailActivity debitCardDetailActivity, View view) {
        super(debitCardDetailActivity, view);
        this.MediaBrowserCompat$ItemReceiver = debitCardDetailActivity;
        debitCardDetailActivity.vpCardView = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_card, "field 'vpCardView'", ViewPager.class);
        debitCardDetailActivity.vpContent = (WrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_content, "field 'vpContent'", WrapContentViewPager.class);
        debitCardDetailActivity.indicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'indicator'", CircleIndicator.class);
        debitCardDetailActivity.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nested_scrollview, "field 'scrollView'", NestedScrollView.class);
        debitCardDetailActivity.tvBalanceValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_balance_value, "field 'tvBalanceValue'", TextView.class);
        debitCardDetailActivity.tvBalanceLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_balance_label, "field 'tvBalanceLabel'", TextView.class);
        debitCardDetailActivity.tvAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_number, "field 'tvAccountNumber'", TextView.class);
        debitCardDetailActivity.debitTabLayout = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctl_debit_atm, "field 'debitTabLayout'", CustomTabLayout.class);
        debitCardDetailActivity.accountErrorView = onStart.IconCompatParcelizer(view, R.id.root_error_account, "field 'accountErrorView'");
        debitCardDetailActivity.imgIconAccount = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon_account, "field 'imgIconAccount'", ImageView.class);
    }

    public final void read() {
        DebitCardDetailActivity debitCardDetailActivity = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardDetailActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            debitCardDetailActivity.vpCardView = null;
            debitCardDetailActivity.vpContent = null;
            debitCardDetailActivity.indicator = null;
            debitCardDetailActivity.scrollView = null;
            debitCardDetailActivity.tvBalanceValue = null;
            debitCardDetailActivity.tvBalanceLabel = null;
            debitCardDetailActivity.tvAccountNumber = null;
            debitCardDetailActivity.debitTabLayout = null;
            debitCardDetailActivity.accountErrorView = null;
            debitCardDetailActivity.imgIconAccount = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
