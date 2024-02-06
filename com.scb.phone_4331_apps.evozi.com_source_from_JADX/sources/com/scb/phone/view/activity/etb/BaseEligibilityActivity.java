package com.scb.phone.view.activity.etb;

import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.etb.ETBDescriptionAdapter;
import com.scb.phone.view.adapter.etb.ETBEligibilityAdapter;
import java.util.List;
import p040o.CheckUsabilityData;
import p040o.HmlPinActivity;
import p040o.access$2400;
import p040o.getFirstPassTexelWidthUniform;
import p040o.getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver;

public abstract class BaseEligibilityActivity extends BaseActivity implements CheckUsabilityData {
    @BindView
    TextView descriptionHeader;
    @BindView
    TextView eligibilityHeader;
    @HmlPinActivity
    public getFirstPassTexelWidthUniform eligibilityPresenter;
    @BindView
    RecyclerView eligibilityRecyclerView;
    @BindView
    RecyclerView etbDescriptionRecyclerView;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract int mo14154x50fd9e4a();

    /* access modifiers changed from: protected */
    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    /* access modifiers changed from: protected */
    public abstract String MediaSessionCompat$Token();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77762131493001);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.eligibilityPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(mo14154x50fd9e4a()));
        setTabContainer();
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = this.eligibilityPresenter;
        String MediaSessionCompat$Token = MediaSessionCompat$Token();
        if (getfirstpasstexelwidthuniform.RatingCompat != null) {
            getfirstpasstexelwidthuniform.RatingCompat.AlertController$RecycleListView();
        }
        getfirstpasstexelwidthuniform.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$Token);
        getfirstpasstexelwidthuniform.IconCompatParcelizer.IconCompatParcelizer(new getFirstPassTexelWidthUniform.read(getfirstpasstexelwidthuniform, (byte) 0));
        MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(mo14154x50fd9e4a()));
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<access$2400> list) {
        this.eligibilityRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.eligibilityRecyclerView.setAdapter(new ETBEligibilityAdapter(list));
    }

    public final void read(List<String> list) {
        this.etbDescriptionRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.etbDescriptionRecyclerView.setAdapter(new ETBDescriptionAdapter(list));
    }

    public final void IconCompatParcelizer(String str) {
        this.eligibilityHeader.setText(str);
    }

    public final void read(String str) {
        this.descriptionHeader.setText(str);
    }

    @OnClick
    public void onGetStartedButtonClicked() {
        getFirstPassTexelWidthUniform getfirstpasstexelwidthuniform = this.eligibilityPresenter;
        if (!getfirstpasstexelwidthuniform.MediaMetadataCompat) {
            boolean z = true;
            getfirstpasstexelwidthuniform.MediaMetadataCompat = true;
            if (getfirstpasstexelwidthuniform.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfirstpasstexelwidthuniform.RatingCompat.AlertController$RecycleListView();
            }
            getfirstpasstexelwidthuniform.MediaDescriptionCompat.IconCompatParcelizer();
            getfirstpasstexelwidthuniform.MediaDescriptionCompat.IconCompatParcelizer(new getFirstPassTexelWidthUniform$MediaBrowserCompat$ItemReceiver(getfirstpasstexelwidthuniform, (byte) 0));
        }
    }
}
