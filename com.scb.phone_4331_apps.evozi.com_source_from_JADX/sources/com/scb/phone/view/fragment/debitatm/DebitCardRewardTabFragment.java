package com.scb.phone.view.fragment.debitatm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C6908x29cb44d9;
import p040o.HmlPinActivity;
import p040o.Lazy;
import p040o.dispose;
import p040o.getICheckDeserializerRtti;

public class DebitCardRewardTabFragment extends BaseFragment implements C6908x29cb44d9 {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public dispose tabDebitCardPointPresenter;
    @BindView
    TextView tvPointValue;
    @BindView
    TextView tvRemark;
    @BindView
    TextView tvUnable;
    @BindView
    TextView tvYouHave;

    public static DebitCardRewardTabFragment IconCompatParcelizer() {
        return new DebitCardRewardTabFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86452131493872, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.tabDebitCardPointPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void IconCompatParcelizer(String str) {
        this.tvYouHave.setVisibility(8);
        this.tvPointValue.setVisibility(8);
        this.tvUnable.setText(str);
        this.tvUnable.setVisibility(0);
        this.tvRemark.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.tvYouHave.setVisibility(8);
        this.tvPointValue.setVisibility(8);
        this.tvUnable.setVisibility(0);
        this.tvRemark.setVisibility(8);
        this.tvUnable.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void read(Lazy lazy) {
        this.tvYouHave.setVisibility(0);
        this.tvPointValue.setVisibility(0);
        this.tvUnable.setVisibility(8);
        this.tvPointValue.setText(String.format("%s %s", new Object[]{lazy.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer, lazy.MediaSessionCompat$ResultReceiverWrapper}));
        this.tvRemark.setVisibility(0);
        String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(lazy.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver).doubleValue());
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.prepaid_message_m_card, MediaBrowserCompat$CustomActionResultReceiver2, lazy.MediaSessionCompat$ResultReceiverWrapper, lazy.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver));
        sb.append("\n");
        sb.append(getString(R.string.prepaid_point_m_card));
        this.tvRemark.setText(sb.toString());
    }

    public final void IconCompatParcelizer(Lazy lazy) {
        this.tvYouHave.setVisibility(0);
        this.tvPointValue.setVisibility(0);
        this.tvUnable.setVisibility(8);
        this.tvRemark.setVisibility(8);
        this.tvPointValue.setText(String.format("%s %s", new Object[]{0, lazy.MediaSessionCompat$ResultReceiverWrapper}));
    }
}
