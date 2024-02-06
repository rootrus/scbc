package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.CCTermsAndConditionsActivity;
import com.scb.phone.view.activity.cardmanagement.CreditCardTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccrredemption.categories.RewardsHomeActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageConfirmRedemptionActivity;
import com.scb.phone.view.custom.cardmanagement.TermsAndConditionsView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.AbstractComponentContainer;
import p040o.C10895excluder;
import p040o.Constraints;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getLicense;
import p040o.getObjectives;
import p040o.lambda$of$1;
import p040o.nullifyEvictable;
import p040o.setTapText;
import p040o.toJsonTree;
import p040o.verifyPurposefulFeatures;

public class MileageReviewRedemptionFragment extends BaseFragment implements getLicense, verifyPurposefulFeatures, getObjectives {
    private lambda$of$1 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btnConfirm;
    @BindView
    TextView milesDeliveryEtaText;
    @HmlPinActivity
    public toJsonTree presenter;
    @BindView
    TermsAndConditionsView termsAndConditionsView;
    @BindView
    TextView txvAirlineNumber;
    @BindView
    TextView txvCardNumber;
    @BindView
    TextView txvCardType;
    @BindView
    TextView txvItemDescription;
    @BindView
    TextView txvItemName;
    @BindView
    TextView txvLastName;
    @BindView
    TextView txvPoints;
    @BindView
    TextView txvPointsToRedeem;
    @BindView
    TextView txvTotalMiles;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88492131494076, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        lambda$of$1 lambda_of_1 = (lambda$of$1) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.mileage.MileageReviewRedemptionActivity.KEY_MILEAGE_REDEMPTION_DTO");
        this.MediaBrowserCompat$CustomActionResultReceiver = lambda_of_1;
        this.txvCardType.setText(lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver);
        this.txvCardNumber.setText(lambda_of_1.RatingCompat);
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            this.txvItemDescription.setText(getString(R.string.product_item_description_opr, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token));
            this.milesDeliveryEtaText.setText(getResources().getString(R.string.miles_delivery_eta_opr));
        } else {
            this.txvItemDescription.setText(getString(R.string.product_item_description, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token, Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.read)));
            this.milesDeliveryEtaText.setText(getResources().getString(R.string.miles_delivery_eta));
        }
        this.txvItemName.setText(lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem);
        this.txvPointsToRedeem.setText(lambda_of_1.f2886x50fd9e4a);
        this.txvTotalMiles.setText(lambda_of_1.MediaSessionCompat$ResultReceiverWrapper);
        this.txvAirlineNumber.setText(lambda_of_1.MediaBrowserCompat$MediaItem);
        this.txvLastName.setText(lambda_of_1.write);
        this.termsAndConditionsView.setTermsAndConditionsListener(this);
        this.termsAndConditionsView.setTermsCheckboxListener(this);
        if (Integer.parseInt(lambda_of_1.f2886x50fd9e4a.replace(",", "")) <= 1) {
            this.txvPoints.setText(getResources().getString(R.string.point_label));
        }
        this.btnConfirm.setEnabled(false);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmClick() {
        toJsonTree tojsontree = this.presenter;
        lambda$of$1 lambda_of_1 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tojsontree.RatingCompat != null) {
            tojsontree.RatingCompat.AlertController$RecycleListView();
        }
        Constraints.ConstrainedCollection constrainedCollection = new Constraints.ConstrainedCollection(lambda_of_1.IconCompatParcelizer, lambda_of_1.MediaDescriptionCompat, lambda_of_1.RatingCompat);
        nullifyEvictable nullifyevictable = new nullifyEvictable(lambda_of_1.write, lambda_of_1.MediaBrowserCompat$MediaItem);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Constraints.ConstrainedSet(lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token, lambda_of_1.read, CustomConcurrentHashMap.POINT, lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem, Long.valueOf((long) (lambda_of_1.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction.intValue() * lambda_of_1.read)), (Long) null));
        tojsontree.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new Constraints.NotNullConstraint(constrainedCollection, arrayList, nullifyevictable));
        tojsontree.IconCompatParcelizer.IconCompatParcelizer(new toJsonTree.IconCompatParcelizer(lambda_of_1));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AbstractComponentContainer abstractComponentContainer) {
        Intent intent = new Intent(getContext(), RewardsHomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE", abstractComponentContainer.Keep);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = MileageConfirmRedemptionActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), abstractComponentContainer);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity2, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb2.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb2.append("\n with context ");
            sb2.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 106);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 106 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.btnConfirm.setEnabled(z);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        toJsonTree tojsontree = this.presenter;
        C10895excluder excluder = new C10895excluder(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        if (tojsontree.RatingCompat != null) {
            excluder.IconCompatParcelizer(tojsontree.RatingCompat);
        }
    }

    public final void read() {
        Intent IconCompatParcelizer = CreditCardTermsAndConditionsActivity.IconCompatParcelizer(getActivity(), "CREDITCARDREWARDS");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$ItemReceiver = CCTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver(getActivity(), this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
