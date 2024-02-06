package com.scb.phone.view.fragment.transferandpay;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeScbMapActivity;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.getTopLeftCornerWidth;

public abstract class BaseBillersFragment extends BaseFragment implements getTopLeftCornerWidth.ParcelableVolumeInfo, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    public BillerAdapter IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected View mDividerView;
    @BindView
    protected RelativeLayout mEmptyCard;
    @BindView
    protected TextView mEmptyDescription;
    @BindView
    protected ImageView mEmptyImage;
    @BindView
    protected TextView mEmptyTitle;
    @BindView
    protected View mFooterView;
    @BindView
    public RecyclerView mRecyclerView;

    public void IconCompatParcelizer(List<CrashlyticsReport.Session.Builder> list) {
        this.mRecyclerView.setVisibility(0);
        this.mFooterView.setVisibility(0);
        this.mDividerView.setVisibility(0);
        BillerAdapter billerAdapter = this.IconCompatParcelizer;
        if (billerAdapter == null) {
            this.IconCompatParcelizer = new BillerAdapter(getContext(), list, this);
        } else {
            billerAdapter.read = list;
            billerAdapter.IconCompatParcelizer.write();
        }
        this.mRecyclerView.setNestedScrollingEnabled(false);
        this.mRecyclerView.setAdapter(this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsReport.Session.Builder> list) {
        BillerAdapter billerAdapter = this.IconCompatParcelizer;
        if (billerAdapter == null) {
            this.IconCompatParcelizer = new BillerAdapter(getContext(), list, this);
            return;
        }
        billerAdapter.read.addAll(list);
        this.mRecyclerView.post(new ActivityBuilder_ContributeScbMapActivity(this));
    }

    public void read(int i) {
        if (SystemClock.elapsedRealtime() - this.MediaBrowserCompat$CustomActionResultReceiver >= 300) {
            this.MediaBrowserCompat$CustomActionResultReceiver = SystemClock.elapsedRealtime();
        }
    }

    public void IconCompatParcelizer() {
        this.mEmptyTitle.setText(getResources().getString(R.string.custom_error_title));
        this.mEmptyDescription.setText(getResources().getString(R.string.custom_error_description));
        this.mEmptyCard.setVisibility(0);
    }

    @OnClick
    public void onEmptyLayoutClick() {
        this.mEmptyCard.setVisibility(8);
    }
}
