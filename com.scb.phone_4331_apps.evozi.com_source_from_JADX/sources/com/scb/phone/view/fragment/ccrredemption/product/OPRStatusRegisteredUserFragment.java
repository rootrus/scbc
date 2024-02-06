package com.scb.phone.view.fragment.ccrredemption.product;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.ccrredemption.product.EligiblePrivilegesAdapter;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ccrredemption.oprredemption.CurrentCycleInfoFragment;
import java.util.Iterator;
import p040o.Barrier;
import p040o.C$Gson$Types;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.JsonDeserializationContext;
import p040o.JsonDeserializer;
import p040o.LongSerializationPolicy;
import p040o.Since;
import p040o.access$2200;
import p040o.access$2300;
import p040o.alwaysEager;
import p040o.eagerInDefaultApp;
import p040o.fromJsonTree;
import p040o.getAction;
import p040o.getAsByte;
import p040o.getAsNumber;
import p040o.getAsShort;
import p040o.getAsString;
import p040o.getFatca;
import p040o.getMiddleName;
import p040o.readStringList;
import p040o.validateInterface;
import p040o.zaz;
import p059me.relex.circleindicator.CircleIndicator;

public class OPRStatusRegisteredUserFragment extends BaseFragment implements getFatca, getMiddleName {
    private int IconCompatParcelizer = 0;
    private eagerInDefaultApp MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    CircleIndicator eligiblePrivilegesIndicator;
    @BindView
    TextView eligiblePrivilegesLabel;
    @BindView
    WrapContentViewPager eligiblePrivilegesViewPager;
    @BindView
    ViewGroup errorLayout;
    @BindView
    TextView errorMessage;
    @BindView
    TextView errorTitle;
    @BindView
    Group expiryDateGroup;
    @BindView
    ViewGroup infoLayout;
    @HmlPinActivity
    public zaz picassoFactory;
    @HmlPinActivity
    public C$Gson$Types presenter;
    @BindView
    TextView txvExpiryDate;
    @BindView
    ViewGroup viewGroupProgress;
    @BindView
    ConstraintLayout wowBannerLayout;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90012131494228, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = (eagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRStatusRewardsLandingActivity.OPR_LANDING_DTO");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C$Gson$Types _gson_types = this.presenter;
        eagerInDefaultApp eagerindefaultapp = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = eagerindefaultapp.ParcelableVolumeInfo;
        if (str == null || str.length() == 0) {
            LongSerializationPolicy.C36012 r1 = LongSerializationPolicy.C36012.MediaBrowserCompat$CustomActionResultReceiver;
            if (_gson_types.RatingCompat != null) {
                r1.IconCompatParcelizer(_gson_types.RatingCompat);
            }
        } else {
            getAsNumber getasnumber = new getAsNumber(eagerindefaultapp);
            if (_gson_types.RatingCompat != null) {
                getasnumber.IconCompatParcelizer(_gson_types.RatingCompat);
            }
        }
        getAsString getasstring = getAsString.MediaBrowserCompat$ItemReceiver;
        if (_gson_types.RatingCompat != null) {
            getasstring.IconCompatParcelizer(_gson_types.RatingCompat);
        }
        if (eagerindefaultapp.f2820x50fd9e4a == null || eagerindefaultapp.f2820x50fd9e4a.isEmpty()) {
            getAsByte getasbyte = getAsByte.read;
            if (_gson_types.RatingCompat != null) {
                getasbyte.IconCompatParcelizer(_gson_types.RatingCompat);
            }
        } else {
            Since since = Since.MediaBrowserCompat$CustomActionResultReceiver;
            if (_gson_types.RatingCompat != null) {
                since.IconCompatParcelizer(_gson_types.RatingCompat);
            }
        }
        fromJsonTree fromjsontree = fromJsonTree.write;
        if (_gson_types.RatingCompat != null) {
            fromjsontree.IconCompatParcelizer(_gson_types.RatingCompat);
        }
        _gson_types.read.read(eagerindefaultapp.MediaBrowserCompat$ItemReceiver, eagerindefaultapp.read, readStringList.NORMAL);
        _gson_types.read.IconCompatParcelizer(new C$Gson$Types.write(eagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper));
        if (eagerindefaultapp.RatingCompat && !eagerindefaultapp.MediaMetadataCompat) {
            JsonDeserializationContext jsonDeserializationContext = JsonDeserializationContext.IconCompatParcelizer;
            if (_gson_types.RatingCompat != null) {
                z = true;
            }
            if (z) {
                jsonDeserializationContext.IconCompatParcelizer(_gson_types.RatingCompat);
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(validateInterface validateinterface) {
        C$Gson$Types _gson_types = this.presenter;
        getAsShort getasshort = new getAsShort(validateinterface);
        if (_gson_types.RatingCompat != null) {
            getasshort.IconCompatParcelizer(_gson_types.RatingCompat);
        }
    }

    public final void RatingCompat() {
        this.eligiblePrivilegesViewPager.setVisibility(0);
        this.eligiblePrivilegesIndicator.setVisibility(0);
        this.eligiblePrivilegesLabel.setVisibility(0);
        this.eligiblePrivilegesViewPager.setAdapter(new EligiblePrivilegesAdapter(this.MediaBrowserCompat$CustomActionResultReceiver.f2820x50fd9e4a, this, this.picassoFactory));
        this.eligiblePrivilegesViewPager.setClipToPadding(false);
        this.eligiblePrivilegesViewPager.setAdapter(new EligiblePrivilegesAdapter(this.MediaBrowserCompat$CustomActionResultReceiver.f2820x50fd9e4a, this, this.picassoFactory));
        this.eligiblePrivilegesViewPager.setClipToPadding(false);
        this.eligiblePrivilegesViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f72472131165407), 0, getResources().getDimensionPixelOffset(R.dimen.f72472131165407), 0);
        this.eligiblePrivilegesViewPager.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.f72532131165444));
        this.eligiblePrivilegesIndicator.setViewPager(this.eligiblePrivilegesViewPager);
        this.eligiblePrivilegesViewPager.setCurrentItem(this.IconCompatParcelizer);
    }

    public final void IconCompatParcelizer() {
        this.eligiblePrivilegesViewPager.setVisibility(8);
        this.eligiblePrivilegesIndicator.setVisibility(8);
        this.eligiblePrivilegesLabel.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = 1;
        Intent intent = new Intent("OPRStatusRewardsLandingActivity.RedeemAction");
        intent.putExtra("OPRStatusRewardsLandingActivity.SelectedTier", str);
        Barrier.MediaBrowserCompat$CustomActionResultReceiver(getContext()).MediaBrowserCompat$CustomActionResultReceiver(intent);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.wowBannerLayout.setVisibility(8);
    }

    public final void MediaSessionCompat$Token() {
        this.wowBannerLayout.setVisibility(0);
    }

    public final void write(String str) {
        this.txvExpiryDate.setText(str);
    }

    public final void read(alwaysEager alwayseager) {
        CurrentCycleInfoFragment MediaBrowserCompat$CustomActionResultReceiver2 = CurrentCycleInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(alwayseager);
        CardView read = getChildFragmentManager().read();
        read.IconCompatParcelizer(R.id.fragment_container, MediaBrowserCompat$CustomActionResultReceiver2, "com.scb.phone.view.fragment.ccr_redemption.opr_redemption.CurrentCycleInfoFragment");
        read.write();
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.viewGroupProgress.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.infoLayout.setVisibility(8);
    }

    public final void read() {
        this.viewGroupProgress.setVisibility(8);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.infoLayout.setVisibility(0);
        this.errorTitle.setText(R.string.membership_expiry_title);
        this.errorMessage.setText(R.string.membership_expiry_message);
    }

    public final void write() {
        this.errorLayout.setVisibility(8);
    }

    @OnClick
    public void handleViewClick() {
        getAction getaction;
        C$Gson$Types _gson_types = this.presenter;
        Iterator<getAction> it = _gson_types.MediaBrowserCompat$ItemReceiver.read.iterator();
        while (true) {
            if (!it.hasNext()) {
                getaction = null;
                break;
            }
            getaction = it.next();
            if (getaction.MediaBrowserCompat$MediaItem) {
                break;
            }
        }
        JsonDeserializer jsonDeserializer = new JsonDeserializer(_gson_types, getaction);
        if (_gson_types.RatingCompat != null) {
            jsonDeserializer.IconCompatParcelizer(_gson_types.RatingCompat);
        }
    }

    public final void MediaMetadataCompat() {
        this.errorLayout.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.expiryDateGroup.setVisibility(8);
    }

    public final void MediaDescriptionCompat() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.unable_to_proceed_error_title);
        access_2200.IconCompatParcelizer = getString(R.string.membership_already_registered);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.NAVIGATE_BACK;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
