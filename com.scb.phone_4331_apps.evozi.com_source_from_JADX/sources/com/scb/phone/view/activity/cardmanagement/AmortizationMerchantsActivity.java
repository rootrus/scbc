package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C10827Iterators;
import p040o.CheckEligibilityActivity;
import p040o.CreditCardParameters_MembersInjector;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FirebaseOptions;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.checkElement;
import p040o.getLocalPort;
import p040o.getMaxResults;
import p040o.getMaxResults$MediaBrowserCompat$ItemReceiver;
import p040o.initializeApp;
import p040o.normalize;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class AmortizationMerchantsActivity extends BaseAmortizationActivity implements CreditCardParameters_MembersInjector {
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @BindView
    public LinearLayout layoutFilterOptions;
    @HmlPinActivity
    public getMaxResults presenter;
    @BindView
    public Spinner spFilterOptions;

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, chain chain, normalize normalize, List<FirebaseOptions> list) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) chain, "selectedCreditCard");
        onGetStartedClick.write((Object) normalize, "selectedPlanDisplay");
        onGetStartedClick.write((Object) list, "displays");
        Intent intent = new Intent(context, AmortizationMerchantsActivity.class);
        intent.putExtra("com.phone.scb.EXTRA_SELECTED_CARD", chain);
        intent.putExtra("com.phone.scb.EXTRA_DEEJUNG_PLAN_DISPLAY", normalize);
        intent.putExtra("com.phone.scb.EXTRA_AMORTIZATION_SUMMARY_DISPLAY", new ArrayList(list));
        intent.addFlags(603979776);
        return intent;
    }

    public AmortizationMerchantsActivity() {
        FundActionsSuccessActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) iconCompatParcelizer, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(iconCompatParcelizer);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMaxResults getmaxresults = this.presenter;
        if (getmaxresults == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getmaxresults.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        List<FirebaseOptions> parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("com.phone.scb.EXTRA_AMORTIZATION_SUMMARY_DISPLAY") : null;
        if (parcelableArrayListExtra != null) {
            getMaxResults getmaxresults2 = this.presenter;
            if (getmaxresults2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) parcelableArrayListExtra, "displays");
            getmaxresults2.read = parcelableArrayListExtra;
            getmaxresults2.write(!parcelableArrayListExtra.isEmpty(), new getMaxResults.read(parcelableArrayListExtra));
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.deejung_amortization_activity_title);
        setTabContainer();
    }

    @OnClick
    public final void onClickNextAction() {
        Intent intent = getIntent();
        normalize normalize = null;
        chain chain = intent != null ? (chain) intent.getParcelableExtra("com.phone.scb.EXTRA_SELECTED_CARD") : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            normalize = (normalize) intent2.getParcelableExtra("com.phone.scb.EXTRA_DEEJUNG_PLAN_DISPLAY");
        }
        if (chain != null && normalize != null) {
            getMaxResults getmaxresults = this.presenter;
            if (getmaxresults == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) chain, "selectedCreditCardDisplay");
            onGetStartedClick.write((Object) normalize, "selectedPlanDisplayModel");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getMaxResults.write.MediaBrowserCompat$CustomActionResultReceiver;
            if (getmaxresults.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getmaxresults.RatingCompat);
            }
            C10827Iterators.C353712 r3 = getmaxresults.MediaBrowserCompat$ItemReceiver;
            checkElement read = getmaxresults.write.read(chain, normalize);
            onGetStartedClick.IconCompatParcelizer((Object) read, "deejungInstallmentsToken…isplayModel\n            )");
            DebitCardMarketConductDeepLinkActivity iconCompatParcelizer2 = new getMaxResults.IconCompatParcelizer(getmaxresults, chain, normalize);
            DebitCardMarketConductDeepLinkActivity getmaxresults_mediabrowsercompat_itemreceiver = new getMaxResults$MediaBrowserCompat$ItemReceiver(getmaxresults);
            onGetStartedClick.write((Object) read, "request");
            onGetStartedClick.write((Object) iconCompatParcelizer2, "onSuccess");
            onGetStartedClick.write((Object) getmaxresults_mediabrowsercompat_itemreceiver, "onError");
            getLocalPort getlocalport = r3.write;
            getlocalport.read(getlocalport.MediaBrowserCompat$CustomActionResultReceiver(read), iconCompatParcelizer2, getmaxresults_mediabrowsercompat_itemreceiver);
        }
    }

    public final void write(initializeApp initializeapp) {
        onGetStartedClick.write((Object) initializeapp, "display");
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

    public final void onDestroy() {
        getMaxResults getmaxresults = this.presenter;
        if (getmaxresults == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getmaxresults.onDestroy();
        super.onDestroy();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<ArrayAdapter<String>> {
        private /* synthetic */ AmortizationMerchantsActivity read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(AmortizationMerchantsActivity amortizationMerchantsActivity) {
            super(0);
            this.read = amortizationMerchantsActivity;
        }

        public final /* synthetic */ Object invoke() {
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.read, R.layout.f84852131493712);
            arrayAdapter.setDropDownViewResource(R.layout.f84812131493708);
            return arrayAdapter;
        }
    }

    public final void IconCompatParcelizer(List<String> list) {
        onGetStartedClick.write((Object) list, "options");
        ((ArrayAdapter) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).clear();
        LinearLayout linearLayout = this.layoutFilterOptions;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFilterOptions");
        }
        linearLayout.setVisibility(0);
        ((ArrayAdapter) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).addAll(list);
        Spinner spinner = this.spFilterOptions;
        if (spinner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spFilterOptions");
        }
        spinner.setAdapter((ArrayAdapter) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver());
        Spinner spinner2 = this.spFilterOptions;
        if (spinner2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spFilterOptions");
        }
        spinner2.setOnItemSelectedListener(new C5565xa3698148(this));
    }
}
