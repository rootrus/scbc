package com.scb.phone.view.fragment.personallimit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.debitatm.DebitWithdrawalLimitActivity;
import com.scb.phone.view.adapter.limit.DebitsLimitAdapter;
import com.scb.phone.view.adapter.limit.DebitsLimitAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.limit.PersonalLimitAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlNTBOccupationInfoActivity;
import p040o.ActivityBuilder_ContributeHmlNTBOperatingAccountActivity;
import p040o.AlertController$RecycleListView;
import p040o.C10883getLar;
import p040o.FragmentBuilder_BindCardlessReviewFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.beginSession;
import p040o.expandIfNecessary;
import p040o.export;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getOversizeImage;
import p040o.nonNull;
import p040o.removeAppStatsWriteFileListener;
import p040o.setTapText;
import p040o.standardAdd;
import p040o.standardToString;
import p040o.zzmd;

public class PersonalLimitFragment extends BaseFragment implements C10883getLar, FragmentBuilder_BindCardlessReviewFragment, DebitsLimitAdapter$MediaBrowserCompat$CustomActionResultReceiver {
    private getAdditionalBottomScanLinesHeight IconCompatParcelizer;
    private DebitsLimitAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private PersonalLimitAdapter MediaMetadataCompat;
    private PersonalLimitAdapter RatingCompat;
    @BindView
    protected TextView billPaymentValue;
    @BindView
    protected TextView cardlessCreditCardLimitValue;
    @BindView
    protected TextView cardlessLimitValue;
    @BindView
    protected TextView cardlessSpeedyCashLimitValue;
    @BindView
    protected TextView cardlessTitle;
    @BindView
    protected LinearLayout layoutCardless;
    @BindView
    protected LinearLayout layoutCardlessCreditCard;
    @BindView
    protected LinearLayout layoutCardlessDeposits;
    @BindView
    protected LinearLayout layoutCardlessSpeedyCash;
    @BindView
    protected LinearLayout layoutDebitCard;
    @BindView
    protected LinearLayout layoutRemittance;
    @HmlPinActivity
    public removeAppStatsWriteFileListener limitPresenter;
    @BindView
    protected NestedScrollView mPersonalLimitScrollView;
    @BindView
    LinearLayout prepaidLimitLayout;
    @BindView
    TextView prepaidLimitTitle;
    @BindView
    TextView prepaidLimitValue;
    @BindView
    protected RecyclerView recyclerViewDebits;
    @BindView
    protected RecyclerView recyclerViewRemittance;
    @HmlPinActivity
    public SharedPreferences sharedPreferences;
    @BindView
    protected TextView topUpLimitValue;
    @BindView
    protected RecyclerView transfersRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88862131494113, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.limit_title));
        this.MediaMetadataCompat = new PersonalLimitAdapter();
        this.RatingCompat = new PersonalLimitAdapter();
        this.MediaBrowserCompat$CustomActionResultReceiver = new DebitsLimitAdapter();
        this.limitPresenter.MediaBrowserCompat$ItemReceiver(this);
        removeAppStatsWriteFileListener removeappstatswritefilelistener = this.limitPresenter;
        zzmd.zzm.zzb.zza zza2 = zzmd.zzm.zzb.zza.JURISTIC;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        if (zza2 == zza) {
            z = true;
        }
        removeappstatswritefilelistener.write = z;
        this.IconCompatParcelizer = (getAdditionalBottomScanLinesHeight) getActivity();
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.limit_title));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.limitPresenter.MediaBrowserCompat$ItemReceiver();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1895) {
            this.limitPresenter.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void onDestroy() {
        this.limitPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(List<expandIfNecessary> list) {
        List<expandIfNecessary> list2 = this.MediaMetadataCompat.read;
        if (list2 == null || list2.isEmpty()) {
            getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.MediaMetadataCompat.read = list;
            this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver = this;
            this.transfersRecyclerView.setLayoutManager(linearLayoutManager);
            this.transfersRecyclerView.setAdapter(this.MediaMetadataCompat);
            this.transfersRecyclerView.setHasFixedSize(true);
            this.transfersRecyclerView.setNestedScrollingEnabled(false);
            return;
        }
        this.MediaMetadataCompat.read = list;
        this.MediaMetadataCompat.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<nonNull> list) {
        if (!list.isEmpty()) {
            RecyclerView recyclerView = this.recyclerViewDebits;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.recyclerViewDebits.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
            DebitsLimitAdapter debitsLimitAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            debitsLimitAdapter.read = list;
            debitsLimitAdapter.IconCompatParcelizer.write();
            this.MediaBrowserCompat$CustomActionResultReceiver.write = this;
            this.layoutDebitCard.setVisibility(0);
            return;
        }
        this.layoutDebitCard.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(nonNull nonnull) {
        Intent IconCompatParcelizer2 = DebitWithdrawalLimitActivity.IconCompatParcelizer(getContext(), nonnull);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 1895);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(nonNull nonnull) {
        removeAppStatsWriteFileListener removeappstatswritefilelistener = this.limitPresenter;
        boolean z = true;
        if (!"1000".equalsIgnoreCase(nonnull.RatingCompat.read) || nonnull.MediaBrowserCompat$ItemReceiver == null || (!nonnull.MediaBrowserCompat$ItemReceiver.contains("CARD_LIMIT_WITHDRAWAL") && !nonnull.MediaBrowserCompat$ItemReceiver.contains("CARD_LIMIT_PURCHASE"))) {
            beginSession beginsession = new beginSession(removeappstatswritefilelistener, removeappstatswritefilelistener.MediaBrowserCompat$ItemReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title), nonnull.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver);
            if (removeappstatswritefilelistener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                beginsession.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
                return;
            }
            return;
        }
        export export = new export(nonnull);
        if (removeappstatswritefilelistener.RatingCompat == null) {
            z = false;
        }
        if (z) {
            export.IconCompatParcelizer(removeappstatswritefilelistener.RatingCompat);
        }
    }

    public final void read(expandIfNecessary expandifnecessary, expandIfNecessary expandifnecessary2) {
        this.topUpLimitValue.setText(expandifnecessary.MediaBrowserCompat$CustomActionResultReceiver);
        this.billPaymentValue.setText(expandifnecessary2.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(expandIfNecessary expandifnecessary) {
        this.prepaidLimitValue.setText(expandifnecessary.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.prepaidLimitTitle.setVisibility(0);
        this.prepaidLimitLayout.setVisibility(0);
    }

    public final void write(expandIfNecessary expandifnecessary, expandIfNecessary expandifnecessary2, expandIfNecessary expandifnecessary3) {
        if (expandifnecessary != null) {
            this.layoutCardlessDeposits.setVisibility(0);
            this.cardlessLimitValue.setText(expandifnecessary.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (expandifnecessary2 != null) {
            this.layoutCardlessCreditCard.setVisibility(0);
            this.cardlessCreditCardLimitValue.setText(expandifnecessary2.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (expandifnecessary3 != null) {
            this.layoutCardlessSpeedyCash.setVisibility(0);
            this.cardlessSpeedyCashLimitValue.setText(expandifnecessary3.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void read() {
        this.cardlessTitle.setVisibility(8);
        this.layoutCardless.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.layoutDebitCard.setVisibility(8);
    }

    public final void write(List<expandIfNecessary> list) {
        if (this.RatingCompat.read.isEmpty()) {
            this.RatingCompat.read = list;
            this.RatingCompat.MediaBrowserCompat$ItemReceiver = this;
            RecyclerView recyclerView = this.recyclerViewRemittance;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            this.recyclerViewRemittance.setAdapter(this.RatingCompat);
            this.recyclerViewRemittance.setHasFixedSize(true);
            return;
        }
        this.RatingCompat.read = list;
        this.RatingCompat.IconCompatParcelizer.write();
    }

    public final void write() {
        this.layoutRemittance.setVisibility(8);
    }

    public final void read(List<standardAdd> list) {
        removeAppStatsWriteFileListener removeappstatswritefilelistener = this.limitPresenter;
        standardToString read = standardToString.read();
        read.MediaBrowserCompat$ItemReceiver = list;
        read.MediaBrowserCompat$CustomActionResultReceiver = this.sharedPreferences.getString("randomDeviceId", "");
        removeappstatswritefilelistener.read.MediaBrowserCompat$ItemReceiver.read(read);
        if (AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(getContext())) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver("OTP_MOBILE_LIST_FRAGMENT_TAG", (String) null, (String) null);
        } else {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.must_be_connected_mobile_data);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
                }
            }
        }
        this.limitPresenter.write();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        PlaybackStateCompat$CustomAction();
    }

    public final void Keep() {
        super.Keep();
        this.mPersonalLimitScrollView.setVisibility(8);
    }

    public final void ay_() {
        super.ay_();
        this.mPersonalLimitScrollView.setVisibility(0);
    }

    public final void write(access$2200 access_2200) {
        aj_();
        super.write(access_2200);
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void MediaDescriptionCompat() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.personal_limit_exit_dialog_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.personal_limit_exit_dialog_body)).IconCompatParcelizer(getString(R.string.personal_limit_exit_dialog_ok), new ActivityBuilder_ContributeHmlNTBOperatingAccountActivity(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.personal_limit_exit_dialog_cancel), ActivityBuilder_ContributeHmlNTBOccupationInfoActivity.MediaBrowserCompat$CustomActionResultReceiver).show();
    }
}
