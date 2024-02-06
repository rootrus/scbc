package com.scb.phone.view.fragment.sme.gifting;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.sme.gifting.GiftSelectRecipientFromFavouriteAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeRemittanceLandingActivity;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.CheckParameters_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.startCenterMessage;

public class GiftRecipientFromFavouriteFragment extends BaseFragment implements CheckParameters_MembersInjector.IconCompatParcelizer {
    @BindView
    View emptyCard;
    @BindView
    TextView favouriteSuggestion;
    @BindView
    RecyclerView recyclerView;
    @HmlPinActivity
    public startCenterMessage selectRecipientFromFavouritePresenter;

    public static GiftRecipientFromFavouriteFragment MediaBrowserCompat$ItemReceiver() {
        return new GiftRecipientFromFavouriteFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87652131493992, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectRecipientFromFavouritePresenter.MediaBrowserCompat$ItemReceiver(this);
        startCenterMessage startcentermessage = this.selectRecipientFromFavouritePresenter;
        if (startcentermessage.RatingCompat != null) {
            startcentermessage.RatingCompat.AlertController$RecycleListView();
        }
        startcentermessage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        startcentermessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new startCenterMessage.IconCompatParcelizer(startcentermessage, (byte) 0));
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.selectRecipientFromFavouritePresenter.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.Session.Event.Application.Builder> list) {
        this.emptyCard.setVisibility(8);
        this.recyclerView.setVisibility(0);
        GiftSelectRecipientFromFavouriteAdapter giftSelectRecipientFromFavouriteAdapter = new GiftSelectRecipientFromFavouriteAdapter(list, new ActivityBuilder_ContributeRemittanceLandingActivity(this));
        this.recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.recyclerView.setAdapter(giftSelectRecipientFromFavouriteAdapter);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.favouriteSuggestion.setText(R.string.favorite_add_suggestion_gifting);
        this.emptyCard.setVisibility(0);
        this.recyclerView.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        Intent intent = new Intent();
        intent.putExtra("GIFT_RECIPIENT_INFO", builder);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }
}
