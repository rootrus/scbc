package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ContactCallCenterFragment;
import p040o.isHandlingException;

public class HmlOutcomePendingFragment extends ContactCallCenterFragment {
    @BindView
    public TextView contactInfo;
    @BindView
    protected TextView dateText;
    @BindView
    public TextView notificationHeader;
    @BindView
    public TextView notificationText;
    @BindView
    public TextView statusFirst;
    @BindView
    public TextView statusHeader;
    @BindView
    public TextView statusSecond;
    @BindView
    public TextView statusThird;
    @BindView
    protected TextView subtitle;
    @BindView
    protected TextView title;

    @OnClick
    public void onButtonReturnHomeClicked(View view) {
        mo15340x50fd9e4a(false);
    }

    @OnClick
    public void onContactCallCenter(View view) {
        aK_();
    }

    public static HmlOutcomePendingFragment IconCompatParcelizer(isHandlingException ishandlingexception) {
        HmlOutcomePendingFragment hmlOutcomePendingFragment = new HmlOutcomePendingFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_PENDING_EXTRA", ishandlingexception);
        hmlOutcomePendingFragment.setArguments(bundle);
        return hmlOutcomePendingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        isHandlingException ishandlingexception = null;
        View inflate = layoutInflater.inflate(R.layout.f88022131494029, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            ishandlingexception = (isHandlingException) getArguments().getParcelable("HML_OUTCOME_PENDING_EXTRA");
        }
        if (ishandlingexception != null) {
            write(ishandlingexception);
        }
        return inflate;
    }

    public void write(isHandlingException ishandlingexception) {
        this.title.setText(ishandlingexception.read);
        this.subtitle.setText(ishandlingexception.MediaBrowserCompat$CustomActionResultReceiver);
        this.dateText.setVisibility(ishandlingexception.MediaBrowserCompat$ItemReceiver == null ? 8 : 0);
        this.dateText.setText(ishandlingexception.MediaBrowserCompat$ItemReceiver);
    }
}
