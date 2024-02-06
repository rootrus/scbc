package com.scb.phone.view.activity.prepaid.activation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import butterknife.ButterKnife;
import com.google.android.gms.location.places.Place;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.PrepaidConfirmPinActivity;
import com.scb.phone.view.activity.prepaid.PrepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.prepaid.PrepaidOtpActivity;
import com.scb.phone.view.activity.prepaid.PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.prepaid.activation.PrepaidActivationSuccessfulActivity;
import com.scb.phone.view.fragment.prepaid.C6118xb3582152;
import com.scb.phone.view.fragment.prepaid.PrepaidActivateEmptyStateFragment;
import com.scb.phone.view.fragment.prepaid.activation.PrepaidActivationInputFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4768hj;
import p040o.FragmentBuilder_BindChangeChannelStatementApplyAllFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableBiMap;
import p040o.ImmutableClassToInstanceMap;
import p040o.LocalProjectProvider_MembersInjector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PairwiseEquivalence;
import p040o.charactersOf;
import p040o.hj$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.hj$MediaBrowserCompat$ItemReceiver;
import p040o.isSimulator;
import p040o.onGetStartedClick;
import p040o.setModel;
import p040o.setModelClass;
import p040o.setTapText;
import p040o.standardStartAndWait;

public final class PrepaidActivationLandingActivity extends BaseActivity implements LocalProjectProvider_MembersInjector.read, FragmentBuilder_BindChangeChannelStatementApplyAllFragment {
    public static final PrepaidActivationLandingActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new PrepaidActivationLandingActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private isSimulator MediaBrowserCompat$MediaItem;
    private setModel MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C4768hj presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_activation_title);
        setTabContainer();
        C4768hj hjVar = this.presenter;
        if (hjVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hjVar.MediaBrowserCompat$ItemReceiver(this);
        C4768hj hjVar2 = this.presenter;
        if (hjVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (hjVar2.RatingCompat != null) {
            hjVar2.RatingCompat.AlertController$RecycleListView();
        }
        charactersOf charactersof = hjVar2.write;
        FundFactSheetActivity hj_mediabrowsercompat_customactionresultreceiver = new hj$MediaBrowserCompat$CustomActionResultReceiver(hjVar2);
        FundFactSheetActivity hj_mediabrowsercompat_itemreceiver = new hj$MediaBrowserCompat$ItemReceiver(hjVar2);
        ImmutableClassToInstanceMap immutableClassToInstanceMap = new ImmutableClassToInstanceMap((byte) 0);
        onGetStartedClick.write((Object) hj_mediabrowsercompat_customactionresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) hj_mediabrowsercompat_itemreceiver, "onError");
        onGetStartedClick.write((Object) immutableClassToInstanceMap, "request");
        charactersof.IconCompatParcelizer(charactersof.MediaBrowserCompat$CustomActionResultReceiver, hj_mediabrowsercompat_customactionresultreceiver, hj_mediabrowsercompat_itemreceiver, new PairwiseEquivalence.read(immutableClassToInstanceMap));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setModelClass setmodelclass) {
        onGetStartedClick.write((Object) setmodelclass, "prepaidActivationLandingDisplay");
        PrepaidActivationInputFragment.read read = PrepaidActivationInputFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) setmodelclass, "prepaidDisplay");
        PrepaidActivationInputFragment prepaidActivationInputFragment = new PrepaidActivationInputFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_PREPAID_DISPLAY", setmodelclass);
        prepaidActivationInputFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, prepaidActivationInputFragment).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C6118xb3582152 prepaidActivateEmptyStateFragment$MediaBrowserCompat$ItemReceiver = PrepaidActivateEmptyStateFragment.MediaBrowserCompat$CustomActionResultReceiver;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, new PrepaidActivateEmptyStateFragment()).write();
    }

    public final void write(setModel setmodel, isSimulator issimulator) {
        onGetStartedClick.write((Object) setmodel, "verification");
        onGetStartedClick.write((Object) issimulator, "prepaidCardSelected");
        this.MediaBrowserCompat$MediaItem = issimulator;
        this.MediaBrowserCompat$SearchResultReceiver = setmodel;
        PrepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver prepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver = PrepaidConfirmPinActivity.MediaDescriptionCompat;
        Context context = this;
        setModel setmodel2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (setmodel2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidVerificationDisplay");
        }
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) setmodel2, "display");
        Intent putExtra = new Intent(context, PrepaidConfirmPinActivity.class).putExtra("EXTRA_PREPAID_ACTIVATION_VERIFICATION", setmodel2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidC…ON_VERIFICATION, display)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, Place.TYPE_NATURAL_FEATURE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        Bundle extras2;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Parcelable parcelable = null;
            if (i == 1010) {
                PrepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver prepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver = PrepaidConfirmPinActivity.MediaDescriptionCompat;
                if (!(intent == null || (extras2 = intent.getExtras()) == null)) {
                    parcelable = (ImmutableBiMap.SerializedForm) extras2.getParcelable("EXTRA_PREPAID_ENCRYPT_PIN_REQUEST");
                }
                if (parcelable != null) {
                    PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver prepaidOtpActivity$MediaBrowserCompat$ItemReceiver = PrepaidOtpActivity.MediaBrowserCompat$MediaItem;
                    Context context = this;
                    isSimulator issimulator = this.MediaBrowserCompat$MediaItem;
                    if (issimulator == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardSelected");
                    }
                    setModel setmodel = this.MediaBrowserCompat$SearchResultReceiver;
                    if (setmodel == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidVerificationDisplay");
                    }
                    onGetStartedClick.write((Object) context, "context");
                    onGetStartedClick.write((Object) issimulator, "cardDisplay");
                    onGetStartedClick.write((Object) setmodel, "verificationDisplay");
                    onGetStartedClick.write((Object) parcelable, "request");
                    Intent putExtra = new Intent(context, PrepaidOtpActivity.class).putExtra("EXTRA_PREPAID_CARD", issimulator).putExtra("EXTRA_PREPAID_ACTIVATION_VERIFICATION", setmodel).putExtra("EXTRA_PREPAID_ENCRYPT_PIN", parcelable);
                    onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidO…AID_ENCRYPT_PIN, request)");
                    IntentTidInjectionActivityAspect.aspectOf();
                    try {
                        Intent read = setTapText.write(this, putExtra).read();
                        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                        sb.append(read.getData());
                        sb.append("\n with context ");
                        sb.append(hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                        startActivityForResult(read, Place.TYPE_NEIGHBORHOOD);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } else if (i == 1011) {
                PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver prepaidOtpActivity$MediaBrowserCompat$ItemReceiver2 = PrepaidOtpActivity.MediaBrowserCompat$MediaItem;
                if (!(intent == null || (extras = intent.getExtras()) == null)) {
                    parcelable = (standardStartAndWait) extras.getParcelable("EXTRA_PREPAID_SUCCESS");
                }
                if (parcelable != null) {
                    PrepaidActivationSuccessfulActivity.read read2 = PrepaidActivationSuccessfulActivity.MediaBrowserCompat$MediaItem;
                    Context context2 = this;
                    onGetStartedClick.write((Object) context2, "context");
                    onGetStartedClick.write((Object) parcelable, "successDisplay");
                    Intent putExtra2 = new Intent(context2, PrepaidActivationSuccessfulActivity.class).putExtra("com.scb.phone.view.activity.prepaid.activation.PrepaidActivationSuccessfulActivity.KEY_SUCCESS", parcelable);
                    onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "Intent(context, PrepaidA…_SUCCESS, successDisplay)");
                    IntentTidInjectionContextAspect.aspectOf();
                    try {
                        Intent read3 = setTapText.write(this, putExtra2).read();
                        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                        sb2.append(read3.getData());
                        sb2.append("\n with context ");
                        sb2.append(hashCode());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                        startActivity(read3);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    finish();
                }
            }
        }
    }

    public final void onDestroy() {
        C4768hj hjVar = this.presenter;
        if (hjVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hjVar.onDestroy();
        super.onDestroy();
    }
}
