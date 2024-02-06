package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlanErrorFragment;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlansFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p040o.C10827Iterators;
import p040o.C1389kI;
import p040o.C7162iR;
import p040o.C9742xdf6f648;
import p040o.CardView;
import p040o.Constraint;
import p040o.Constraints;
import p040o.Extractor;
import p040o.FirebaseException;
import p040o.FirebaseMessaging;
import p040o.FirebaseMessagingRegistrar;
import p040o.FirebaseOptions;
import p040o.FirebaseVisionImageMetadata;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.Iterators$12$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TokenResult;
import p040o.UncheckedTimeoutException;
import p040o.chain;
import p040o.directBootSafe;
import p040o.getOOBInline;
import p040o.getOptions;
import p040o.initializeApp;
import p040o.isAutoInitEnabled;
import p040o.lambda$new$0;
import p040o.normalize;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.systemExit;

public class DeejungPlansActivity extends CCRBaseActivity implements Extractor, C1389kI {
    private getOptions MediaBrowserCompat$SearchResultReceiver;
    private normalize MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    @BindView
    View dividerCostOverview;
    @BindView
    TextView labelAbovePlans;
    @BindView
    public NestedScrollView nestedScrollView;
    @HmlPinActivity
    public FirebaseVisionImageMetadata presenter;
    @BindView
    TextView txvCountOfPurchases;
    @BindView
    TextView txvTotalAmount;

    public static Intent IconCompatParcelizer(Context context, getOptions getoptions, chain chain) {
        Intent intent = new Intent(context, DeejungPlansActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungPlansActivity.KEY_DEEJUNG_PLANS_DATA", getoptions);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY", chain);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77302131492955);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (this.mToolbar != null) {
            this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        }
        if (this.mActionBarTitle != null) {
            this.mActionBarTitle.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        }
        this.MediaBrowserCompat$SearchResultReceiver = (getOptions) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungPlansActivity.KEY_DEEJUNG_PLANS_DATA");
        this.MediaMetadataCompat = (chain) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY");
        this.txvTotalAmount.setText(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        this.txvCountOfPurchases.setText(String.format(getString(R.string.number_of_purchases), new Object[]{Integer.toString(this.MediaBrowserCompat$SearchResultReceiver.read)}));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.presenter;
        getOptions getoptions = this.MediaBrowserCompat$SearchResultReceiver;
        if (getoptions.MediaBrowserCompat$ItemReceiver != null || getoptions.write == null) {
            FirebaseMessagingRegistrar.zza zza = new FirebaseMessagingRegistrar.zza(firebaseVisionImageMetadata.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(getoptions.MediaBrowserCompat$ItemReceiver));
            if (firebaseVisionImageMetadata.RatingCompat == null) {
                z = false;
            }
            if (z) {
                zza.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
                return;
            }
            return;
        }
        FirebaseMessaging firebaseMessaging = new FirebaseMessaging(getoptions);
        if (firebaseVisionImageMetadata.RatingCompat == null) {
            z = false;
        }
        if (z) {
            firebaseMessaging.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
    }

    @OnClick
    public void onClickEditSelectedPurchases() {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungPlansActivity.KEY_DEEJUNG_PLANS_DATA", this.MediaBrowserCompat$SearchResultReceiver);
        setResult(116, intent);
        finish();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.deejung_installment_plan);
        setTabContainer();
        if (mo11B_() != null) {
            mo11B_().ParcelableVolumeInfo();
        }
    }

    public void onBackPressed() {
        finish();
    }

    @OnClick
    public void onAboutClick() {
        Intent IconCompatParcelizer = CCAboutActivity.IconCompatParcelizer(this, UncheckedTimeoutException.DEEJUNG_INSTALLMENT);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(normalize normalize) {
        this.MediaDescriptionCompat = normalize;
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.presenter;
        chain chain = this.MediaMetadataCompat;
        isAutoInitEnabled isautoinitenabled = isAutoInitEnabled.MediaBrowserCompat$ItemReceiver;
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            isautoinitenabled.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
        firebaseVisionImageMetadata.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(firebaseVisionImageMetadata.write.read(chain, normalize));
        firebaseVisionImageMetadata.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C9742xdf6f648(firebaseVisionImageMetadata, (byte) 0));
    }

    public final void IconCompatParcelizer(normalize normalize) {
        String str;
        String str2;
        List list;
        Constraints.ConstrainedListIterator constrainedListIterator;
        double d;
        this.MediaDescriptionCompat = normalize;
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.presenter;
        chain chain = this.MediaMetadataCompat;
        isAutoInitEnabled isautoinitenabled = isAutoInitEnabled.MediaBrowserCompat$ItemReceiver;
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            isautoinitenabled.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
        onGetStartedClick.write((Object) normalize, "model");
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        String str3 = chain.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) str3, "creditCardDisplay.cardRefNo");
        String str4 = normalize.MediaMetadataCompat;
        String str5 = str4 == null ? "" : str4;
        String str6 = normalize.setContentView;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = normalize.MediaSessionCompat$ResultReceiverWrapper;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        List<FirebaseException> list2 = normalize.PlaybackStateCompat;
        if (list2 != null) {
            Collection arrayList = new ArrayList();
            for (FirebaseException firebaseException : list2) {
                systemExit systemexit = firebaseException.IconCompatParcelizer;
                if (systemexit != null) {
                    constrainedListIterator = Constraints.ConstrainedListIterator.MediaBrowserCompat$CustomActionResultReceiver();
                    constrainedListIterator.write = systemexit.MediaBrowserCompat$CustomActionResultReceiver;
                    constrainedListIterator.RatingCompat = systemexit.MediaBrowserCompat$SearchResultReceiver;
                    Double d2 = systemexit.MediaMetadataCompat;
                    if (d2 != null) {
                        d = d2.doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                    decimalFormatSymbols.setDecimalSeparator('.');
                    constrainedListIterator.MediaMetadataCompat = new DecimalFormat("#################0.00", decimalFormatSymbols).format(d);
                    constrainedListIterator.read = systemexit.write;
                    constrainedListIterator.MediaBrowserCompat$CustomActionResultReceiver = systemexit.read;
                    constrainedListIterator.MediaBrowserCompat$ItemReceiver = systemexit.MediaBrowserCompat$ItemReceiver;
                    constrainedListIterator.IconCompatParcelizer = systemexit.IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) constrainedListIterator, "CardTransaction.create()…quenceNo(info.sequenceNo)");
                } else {
                    constrainedListIterator = null;
                }
                if (constrainedListIterator != null) {
                    arrayList.add(constrainedListIterator);
                }
            }
            list = (List) arrayList;
        } else {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        Constraint constraint = new Constraint(str3, str5, str, str2, list);
        C10827Iterators.C353712 r2 = firebaseVisionImageMetadata.read;
        directBootSafe directbootsafe = new directBootSafe(firebaseVisionImageMetadata, normalize);
        TokenResult.Builder builder = new TokenResult.Builder(firebaseVisionImageMetadata);
        onGetStartedClick.write((Object) constraint, "request");
        onGetStartedClick.write((Object) directbootsafe, "onSuccess");
        onGetStartedClick.write((Object) builder, "onError");
        r2.IconCompatParcelizer.read(directbootsafe, builder, new getOOBInline.write(constraint), new Iterators$12$MediaBrowserCompat$CustomActionResultReceiver(r2), r2.MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(initializeApp initializeapp) {
        Intent MediaBrowserCompat$ItemReceiver = DeejungInstallmentsReviewActivity.MediaBrowserCompat$ItemReceiver(this, initializeapp);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(normalize normalize, List<FirebaseOptions> list) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = AmortizationMerchantsActivity.MediaBrowserCompat$CustomActionResultReceiver(this, this.MediaMetadataCompat, normalize, list);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final normalize MediaBrowserCompat$ItemReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final chain MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver(lambda$new$0 lambda_new_0) {
        this.labelAbovePlans.setVisibility(0);
        this.dividerCostOverview.setVisibility(0);
        DeejungPlanErrorFragment write = DeejungPlanErrorFragment.write(lambda_new_0.IconCompatParcelizer, lambda_new_0.read);
        CardView read = getSupportFragmentManager().read();
        read.IconCompatParcelizer(R.id.fragment_container, write, "DeejungPlanErrorFragment");
        read.write();
    }

    public final void write(List<normalize> list) {
        this.labelAbovePlans.setVisibility(8);
        this.dividerCostOverview.setVisibility(8);
        DeejungPlansFragment MediaBrowserCompat$CustomActionResultReceiver = DeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(list);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this;
        CardView read = getSupportFragmentManager().read();
        read.IconCompatParcelizer(R.id.fragment_container, MediaBrowserCompat$CustomActionResultReceiver, "DeejungPlansFragment");
        read.write();
    }

    public final void write(int i) {
        this.nestedScrollView.postDelayed(new C7162iR(this), (long) i);
    }
}
