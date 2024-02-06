package com.scb.phone.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import java.util.List;
import p040o.ForwardingFuture;
import p040o.ForwardingService;
import p040o.HmlPinActivity;
import p040o.Iterables;

public class ReviewCommonFragment extends BaseFragment {
    private read MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView additionalConfirmText;
    @BindView
    TextView additionalInfoText;
    @BindView
    LinearLayout container;
    @HmlPinActivity
    public Iterables.C351911 factory;

    public interface read {
        void MediaSessionCompat$Token();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89532131494180, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ForwardingService forwardingService = (ForwardingService) getArguments().getParcelable("PURCHASE_REVIEW_DISPLAY");
        if (forwardingService != null) {
            IconCompatParcelizer(forwardingService.MediaBrowserCompat$ItemReceiver);
            String str = forwardingService.read;
            if (str != null) {
                this.additionalInfoText.setText(str);
                this.additionalInfoText.setVisibility(0);
            }
            String str2 = forwardingService.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                this.additionalConfirmText.setText(str2);
                this.additionalConfirmText.setVisibility(0);
            }
        }
        return inflate;
    }

    public static ReviewCommonFragment MediaBrowserCompat$CustomActionResultReceiver(ForwardingService forwardingService) {
        ReviewCommonFragment reviewCommonFragment = new ReviewCommonFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PURCHASE_REVIEW_DISPLAY", forwardingService);
        reviewCommonFragment.setArguments(bundle);
        return reviewCommonFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof read) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (read) context;
            return;
        }
        throw new IllegalStateException("This context needs to implement the ReviewListener contract");
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(List<ForwardingFuture> list) {
        for (ForwardingFuture next : list) {
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver2 = this.factory.MediaBrowserCompat$CustomActionResultReceiver(getContext(), next);
            MediaBrowserCompat$CustomActionResultReceiver2.setUpWithDisplay(next);
            this.container.addView(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmButtonClicked() {
        read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read2 != null) {
            read2.MediaSessionCompat$Token();
        }
    }
}
