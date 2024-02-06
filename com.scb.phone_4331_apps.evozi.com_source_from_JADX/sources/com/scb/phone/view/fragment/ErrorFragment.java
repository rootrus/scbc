package com.scb.phone.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.CheckExtractor_Factory;
import p040o.ForwardingCheckedFuture;
import p040o.HmlPinActivity;
import p040o.body;
import p040o.getEventAppExecutionExceptionSize;

public class ErrorFragment extends BaseFragment implements CheckExtractor_Factory {
    public ForwardingCheckedFuture MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public TextView errorDescription;
    @BindView
    ImageView errorIcon;
    @BindView
    TextView errorTitle;
    @HmlPinActivity
    public getEventAppExecutionExceptionSize presenter;

    public static ErrorFragment MediaBrowserCompat$CustomActionResultReceiver(ForwardingCheckedFuture forwardingCheckedFuture) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ERROR_DISPLAY_EXTRA", forwardingCheckedFuture);
        ErrorFragment errorFragment = new ErrorFragment();
        errorFragment.setArguments(bundle);
        return errorFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90372131494264, viewGroup, false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null && getArguments().containsKey("ERROR_DISPLAY_EXTRA")) {
            ForwardingCheckedFuture forwardingCheckedFuture = (ForwardingCheckedFuture) getArguments().getParcelable("ERROR_DISPLAY_EXTRA");
            this.MediaBrowserCompat$CustomActionResultReceiver = forwardingCheckedFuture;
            getEventAppExecutionExceptionSize geteventappexecutionexceptionsize = this.presenter;
            if (forwardingCheckedFuture != null) {
                body body = new body(forwardingCheckedFuture);
                if (geteventappexecutionexceptionsize.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    body.IconCompatParcelizer(geteventappexecutionexceptionsize.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public final void read(int i) {
        this.errorIcon.setImageDrawable(getResources().getDrawable(i));
    }

    public final void IconCompatParcelizer(String str) {
        this.errorTitle.setText(str);
    }

    public final void read(String str) {
        this.errorDescription.setText(str);
    }

    /* renamed from: s_ */
    public final void mo35781s_(String str) {
        ParcelableVolumeInfo(str);
    }
}
