package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageAirlineMembershipDetailsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.MailingAddressApi;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.assertFullConsumption;
import p040o.atomicLongArrayAdapter;
import p040o.checkValidFloatingPoint;
import p040o.getEyes;
import p040o.getIdClass;
import p040o.isEagerInDefaultApp;
import p040o.lambda$of$1;
import p040o.newJsonWriter;
import p040o.setTapText;

public class MileageQuantitySelectionFragment extends BaseFragment implements getEyes {
    private AdapterView.OnItemSelectedListener IconCompatParcelizer = new AdapterView.OnItemSelectedListener() {
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MileageQuantitySelectionFragment.this.MediaDescriptionCompat.setSelection(i);
        }
    };
    /* access modifiers changed from: private */
    public Spinner MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public Spinner MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public isEagerInDefaultApp MediaMetadataCompat;
    private AdapterView.OnItemSelectedListener RatingCompat = new AdapterView.OnItemSelectedListener() {
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            MileageQuantitySelectionFragment.this.MediaBrowserCompat$CustomActionResultReceiver.setSelection(i);
        }
    };
    @HmlPinActivity
    public newJsonWriter presenter;
    @BindView
    TextView txvPointsToMiles;
    @BindView
    ViewGroup vgMiles;
    @BindView
    ViewGroup vgPoints;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89202131494147, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        isEagerInDefaultApp iseagerindefaultapp = (isEagerInDefaultApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.KEY_REWARD_PRODUCT_DTO");
        this.MediaMetadataCompat = iseagerindefaultapp;
        iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        newJsonWriter newjsonwriter = this.presenter;
        isEagerInDefaultApp iseagerindefaultapp2 = this.MediaMetadataCompat;
        assertFullConsumption assertfullconsumption = new assertFullConsumption(iseagerindefaultapp2);
        if (newjsonwriter.RatingCompat != null) {
            assertfullconsumption.IconCompatParcelizer(newjsonwriter.RatingCompat);
        }
        checkValidFloatingPoint checkvalidfloatingpoint = new checkValidFloatingPoint((int) (((long) Integer.parseInt(iseagerindefaultapp2.MediaSessionCompat$Token.replaceAll(",", ""))) / ((long) iseagerindefaultapp2.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction.intValue())));
        if (newjsonwriter.RatingCompat != null) {
            z = true;
        }
        if (z) {
            checkvalidfloatingpoint.IconCompatParcelizer(newjsonwriter.RatingCompat);
        }
        return inflate;
    }

    public final void read(String str) {
        this.txvPointsToMiles.setText(str);
    }

    public final void IconCompatParcelizer(lambda$of$1 lambda_of_1) {
        Intent IconCompatParcelizer2 = MileageAirlineMembershipDetailsActivity.IconCompatParcelizer(getActivity(), lambda_of_1);
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
            startActivityForResult(IconCompatParcelizer2, 104);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextClick() {
        newJsonWriter newjsonwriter = this.presenter;
        isEagerInDefaultApp iseagerindefaultapp = this.MediaMetadataCompat;
        int selectedItemPosition = this.MediaBrowserCompat$CustomActionResultReceiver.getSelectedItemPosition();
        String obj = this.MediaBrowserCompat$CustomActionResultReceiver.getSelectedItem().toString();
        String obj2 = this.MediaDescriptionCompat.getSelectedItem().toString();
        boolean z = true;
        lambda$of$1 lambda_of_1 = new lambda$of$1();
        lambda_of_1.IconCompatParcelizer = iseagerindefaultapp.IconCompatParcelizer;
        lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver = iseagerindefaultapp.write;
        lambda_of_1.RatingCompat = iseagerindefaultapp.RatingCompat;
        lambda_of_1.MediaDescriptionCompat = iseagerindefaultapp.ParcelableVolumeInfo;
        lambda_of_1.MediaMetadataCompat = iseagerindefaultapp.MediaSessionCompat$Token;
        lambda_of_1.MediaBrowserCompat$SearchResultReceiver = iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper;
        lambda_of_1.read = selectedItemPosition + 1;
        lambda_of_1.MediaSessionCompat$ResultReceiverWrapper = obj;
        lambda_of_1.f2886x50fd9e4a = obj2;
        atomicLongArrayAdapter atomiclongarrayadapter = new atomicLongArrayAdapter(lambda_of_1);
        if (newjsonwriter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            atomiclongarrayadapter.IconCompatParcelizer(newjsonwriter.RatingCompat);
        }
    }

    public final void read(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (Spinner) this.vgMiles.findViewById(R.id.spinner);
        MailingAddressApi mailingAddressApi = new MailingAddressApi(getActivity(), i);
        this.MediaBrowserCompat$CustomActionResultReceiver.setAdapter(mailingAddressApi);
        mailingAddressApi.MediaBrowserCompat$CustomActionResultReceiver = new getIdClass() {
            public final String read(int i) {
                return newJsonWriter.MediaBrowserCompat$ItemReceiver(i, MileageQuantitySelectionFragment.this.MediaMetadataCompat);
            }
        };
        this.MediaBrowserCompat$CustomActionResultReceiver.setOnItemSelectedListener(this.IconCompatParcelizer);
        this.MediaDescriptionCompat = (Spinner) this.vgPoints.findViewById(R.id.spinner);
        MailingAddressApi mailingAddressApi2 = new MailingAddressApi(getActivity(), i);
        this.MediaDescriptionCompat.setAdapter(mailingAddressApi2);
        mailingAddressApi2.MediaBrowserCompat$CustomActionResultReceiver = new getIdClass() {
            public final String read(int i) {
                return newJsonWriter.read(i, MileageQuantitySelectionFragment.this.MediaMetadataCompat);
            }
        };
        this.MediaDescriptionCompat.setOnItemSelectedListener(this.RatingCompat);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 104 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }
}
