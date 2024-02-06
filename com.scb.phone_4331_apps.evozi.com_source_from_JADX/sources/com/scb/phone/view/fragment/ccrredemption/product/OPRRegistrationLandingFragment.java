package com.scb.phone.view.fragment.ccrredemption.product;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.CreditCardTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRStatusRewardsLandingActivity;
import com.scb.phone.view.activity.ccrredemption.review.ReviewRedemptionActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.C$Gson$Preconditions;
import p040o.C2983x35840db3;
import p040o.CheckCaptureActivity;
import p040o.ComponentContainer;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.HmlPinActivity;
import p040o.InstanceCreator;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder;
import p040o.Until;
import p040o.deserialize;
import p040o.eagerInDefaultApp;
import p040o.getAsCharacter;
import p040o.getAsFloat;
import p040o.getSignatureImage;
import p040o.intoSet;
import p040o.lambda$intoSet$2;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.zaz;

public class OPRRegistrationLandingFragment extends BaseFragment implements getSignatureImage {
    private intoSet IconCompatParcelizer;
    private Boolean MediaBrowserCompat$CustomActionResultReceiver;
    private ComponentContainer MediaMetadataCompat;
    @BindView
    Button btnViewRewards;
    @BindView
    ImageView imvProductDetail;
    @BindView
    LinearLayout layoutRegistration;
    @BindView
    CardView minimumPointsLayout;
    @BindView
    TextView oneCardAllowedLabel;
    @HmlPinActivity
    public zaz picassoFactory;
    @BindView
    CardView pointsCashLayout;
    @HmlPinActivity
    public C$Gson$Preconditions presenter;
    @BindView
    Button registerButton;
    @BindView
    ViewGroup rewardsErrorLayout;
    @BindView
    ImageView txvErrorIcon;
    @BindView
    TextView txvErrorMessage;
    @BindView
    TextView txvErrorTitle;
    @BindView
    TextView txvMaskedCardNumber;
    @BindView
    TextView txvMinimumPoints;
    @BindView
    TextView txvNickname;
    @BindView
    TextView txvPointsCash;
    @BindView
    TextView txvProductDetails;
    @BindView
    TextView txvProductName;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88772131494104, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaMetadataCompat = (ComponentContainer) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.OPRRegistrationLandingActivity.REGISTRATION_LANDING_DTO_EXTRA");
        this.minimumPointsLayout.setEnabled(false);
        this.pointsCashLayout.setEnabled(false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C$Gson$Preconditions _gson_preconditions = this.presenter;
        ComponentContainer componentContainer = this.MediaMetadataCompat;
        deserialize deserialize = deserialize.read;
        if (_gson_preconditions.RatingCompat != null) {
            z = true;
        }
        if (z) {
            deserialize.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
        _gson_preconditions.IconCompatParcelizer.write(componentContainer.MediaMetadataCompat, componentContainer.MediaBrowserCompat$SearchResultReceiver);
        _gson_preconditions.IconCompatParcelizer.IconCompatParcelizer(new C2983x35840db3(_gson_preconditions, componentContainer));
        return inflate;
    }

    public final void MediaDescriptionCompat() {
        AlertController$RecycleListView.write((Activity) getActivity(), (int) R.id.opr_registration_activity, (int) R.drawable.alert_error, getResources().getString(R.string.already_registered_error), (int) R.color.f66062131099761);
    }

    public final void read(lambda$intoSet$2 lambda_intoset_2) {
        Intent MediaBrowserCompat$ItemReceiver = ReviewRedemptionActivity.MediaBrowserCompat$ItemReceiver(getContext(), lambda_intoset_2);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 1101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(intoSet intoset, boolean z) {
        this.IconCompatParcelizer = intoset;
        this.layoutRegistration.setVisibility(0);
        this.registerButton.setText(getString(z ? R.string.renew_membership : R.string.register_label));
        this.txvProductName.setText(intoset.MediaSessionCompat$QueueItem);
        this.txvProductDetails.setText(intoset.AlertController$RecycleListView);
        this.txvMaskedCardNumber.setText(this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
        this.txvNickname.setText(this.MediaMetadataCompat.IconCompatParcelizer);
        TextView textView = this.txvPointsCash;
        String format = NumberFormat.getInstance(Locale.getDefault()).format(intoset.ParcelableVolumeInfo);
        String format2 = NumberFormat.getInstance(Locale.getDefault()).format(intoset.IconCompatParcelizer);
        textView.setText(intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points_plus_cash_opr, new Object[]{format, format2}));
        this.txvMinimumPoints.setText(intoset.read());
        String str = intoset.MediaDescriptionCompat;
        if (str != null) {
            Picasso picasso = this.picassoFactory.read;
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(str);
            picasso.write(sb.toString()).IconCompatParcelizer((int) R.drawable.donations_place_holder).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(this.imvProductDetail, (FragmentBuilder_BindEkycFragment) null);
            return;
        }
        this.imvProductDetail.setImageResource(R.drawable.donations_place_holder);
    }

    public final void read() {
        int read = setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764);
        this.minimumPointsLayout.setEnabled(true);
        this.txvMinimumPoints.setTextColor(read);
    }

    public final void IconCompatParcelizer() {
        int read = setLastBaselineToBottomHeight.read(getActivity(), R.color.f66092131099764);
        this.pointsCashLayout.setEnabled(true);
        this.txvPointsCash.setTextColor(read);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.minimumPointsLayout.setBackground(getContext().getResources().getDrawable(R.drawable.shape_purple_border_rounded_rectangle));
        this.MediaBrowserCompat$CustomActionResultReceiver = Boolean.TRUE;
        this.pointsCashLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
    }

    public final void write() {
        this.registerButton.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.registerButton.setEnabled(false);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.pointsCashLayout.setBackground(getContext().getResources().getDrawable(R.drawable.shape_purple_border_rounded_rectangle));
        this.MediaBrowserCompat$CustomActionResultReceiver = Boolean.FALSE;
        this.minimumPointsLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
    }

    @OnClick
    public void onMinimumPointsClick() {
        C$Gson$Preconditions _gson_preconditions = this.presenter;
        Until until = Until.write;
        if (_gson_preconditions.RatingCompat != null) {
            until.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
    }

    @OnClick
    public void onPointsPlusCashClick() {
        C$Gson$Preconditions _gson_preconditions = this.presenter;
        InstanceCreator instanceCreator = InstanceCreator.write;
        if (_gson_preconditions.RatingCompat != null) {
            instanceCreator.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
    }

    @OnClick
    public void onRegisterClick() {
        C$Gson$Preconditions _gson_preconditions = this.presenter;
        getAsCharacter getascharacter = new getAsCharacter(_gson_preconditions, this.MediaMetadataCompat, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, CheckCaptureActivity.read(getResources(), "dd MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(Calendar.getInstance()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))));
        if (_gson_preconditions.RatingCompat != null) {
            getascharacter.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
    }

    public final void read(eagerInDefaultApp eagerindefaultapp) {
        Intent write = OPRStatusRewardsLandingActivity.write(getContext(), eagerindefaultapp);
        write.addFlags(603979776);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1101 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    @OnClick
    public void handleClickOfTermsAndConditions() {
        Intent IconCompatParcelizer2 = CreditCardTermsAndConditionsActivity.IconCompatParcelizer(getActivity(), "CREDITCARDREWARDS_ONEPOINT");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.oneCardAllowedLabel.setTextColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f67152131099871));
    }

    @OnClick
    public void onRewardsClick() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("rewards_1point_register_landing_view1point_button");
        }
        C$Gson$Preconditions _gson_preconditions = this.presenter;
        ComponentContainer componentContainer = this.MediaMetadataCompat;
        eagerInDefaultApp eagerindefaultapp = new eagerInDefaultApp();
        eagerindefaultapp.read = componentContainer.MediaMetadataCompat;
        eagerindefaultapp.MediaDescriptionCompat = componentContainer.MediaBrowserCompat$SearchResultReceiver;
        boolean z = true;
        eagerindefaultapp.Keep = 1;
        eagerindefaultapp.MediaBrowserCompat$ItemReceiver = componentContainer.write;
        eagerindefaultapp.MediaSessionCompat$Token = componentContainer.IconCompatParcelizer;
        eagerindefaultapp.MediaBrowserCompat$MediaItem = componentContainer.MediaBrowserCompat$CustomActionResultReceiver;
        eagerindefaultapp.MediaSessionCompat$QueueItem = componentContainer.MediaBrowserCompat$ItemReceiver;
        eagerindefaultapp.MediaBrowserCompat$CustomActionResultReceiver = componentContainer.read;
        eagerindefaultapp.write = componentContainer.RatingCompat;
        eagerindefaultapp.MediaBrowserCompat$SearchResultReceiver = componentContainer.MediaSessionCompat$ResultReceiverWrapper;
        eagerindefaultapp.MediaMetadataCompat = Boolean.valueOf(componentContainer.MediaSessionCompat$QueueItem).booleanValue();
        eagerindefaultapp.ParcelableVolumeInfo = componentContainer.MediaDescriptionCompat;
        eagerindefaultapp.f2820x50fd9e4a = componentContainer.MediaSessionCompat$Token;
        eagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper = componentContainer.f2689x50fd9e4a;
        eagerindefaultapp.PlaybackStateCompat = componentContainer.ParcelableVolumeInfo;
        getAsFloat getasfloat = new getAsFloat(eagerindefaultapp);
        if (_gson_preconditions.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getasfloat.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
    }

    public final void RatingCompat() {
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.layoutRegistration.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorTitle.setText(R.string.oops);
        this.txvErrorMessage.setText(getString(R.string.no_rewards_error));
    }

    public final void MediaMetadataCompat() {
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.layoutRegistration.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorTitle.setText(R.string.error_default_title);
        this.txvErrorMessage.setText(getResources().getString(R.string.unable_to_display_OPR));
    }
}
