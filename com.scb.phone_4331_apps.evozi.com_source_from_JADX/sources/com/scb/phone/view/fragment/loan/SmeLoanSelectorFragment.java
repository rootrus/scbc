package com.scb.phone.view.fragment.loan;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.Futures;
import p040o.onCheckBoxClick;
import p059me.relex.circleindicator.CircleIndicator;

public class SmeLoanSelectorFragment extends BaseFragment {
    private C1119xf28bc137 IconCompatParcelizer;
    public List<Futures.ChainingListenableFuture> MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CircleIndicator mCircleIndicator;
    @BindView
    public ViewPager mViewPager;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89952131494222, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1119xf28bc137) {
            this.IconCompatParcelizer = (C1119xf28bc137) context;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List<Futures.ChainingListenableFuture> list;
        if (this.IconCompatParcelizer != null && (list = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            Futures.ChainingListenableFuture chainingListenableFuture = list.get(i);
            if (chainingListenableFuture != null) {
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(chainingListenableFuture);
            } else {
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("smeLoanDisplay is null", new Object[0]);
            }
        }
    }
}
