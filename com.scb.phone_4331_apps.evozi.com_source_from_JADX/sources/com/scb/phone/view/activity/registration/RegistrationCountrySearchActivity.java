package com.scb.phone.view.activity.registration;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.registration.RegistrationCountrySearchAdapter;
import com.scb.phone.view.custom.common.ClearableEditText;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindEasycashCommercialLoanAccountFragment;
import p040o.FundFactSheetActivity;
import p040o.Group;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IKtaSessionIdProviderFactory;
import p040o.QuickExtractorAgent;
import p040o.getForwardList;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setCausedBy;
import p040o.writeUInt64NoTag;

public final class RegistrationCountrySearchActivity extends BaseActivity implements QuickExtractorAgent.C70202 {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);
    private RegistrationCountrySearchAdapter MediaDescriptionCompat;
    @BindView
    public RecyclerView countryRecyclerView;
    @BindView
    public ClearableEditText countrySearchEditText;
    @HmlPinActivity
    public IKtaSessionIdProviderFactory presenter;

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setCausedBy, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ RegistrationCountrySearchActivity read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(RegistrationCountrySearchActivity registrationCountrySearchActivity) {
            super(1);
            this.read = registrationCountrySearchActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setCausedBy setcausedby = (setCausedBy) obj;
            onGetStartedClick.write((Object) setcausedby, "countryDisplay");
            IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory = this.read.presenter;
            if (iKtaSessionIdProviderFactory == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setcausedby, "countryDisplay");
            writeUInt64NoTag.IconCompatParcelizer write = new IKtaSessionIdProviderFactory.write(setcausedby);
            if (iKtaSessionIdProviderFactory.RatingCompat != null) {
                write.IconCompatParcelizer(iKtaSessionIdProviderFactory.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79612131493186);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.registration_country_search_title);
        setTabContainer();
        this.MediaDescriptionCompat = new RegistrationCountrySearchAdapter(new IconCompatParcelizer(this));
        RecyclerView recyclerView = this.countryRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryRecyclerView");
        }
        RecyclerView recyclerView2 = this.countryRecyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryRecyclerView");
        }
        recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new Group(recyclerView2.getContext()), -1);
        RecyclerView recyclerView3 = this.countryRecyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryRecyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView4 = this.countryRecyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryRecyclerView");
        }
        RegistrationCountrySearchAdapter registrationCountrySearchAdapter = this.MediaDescriptionCompat;
        if (registrationCountrySearchAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        recyclerView4.setAdapter(registrationCountrySearchAdapter);
        ClearableEditText clearableEditText = this.countrySearchEditText;
        if (clearableEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countrySearchEditText");
        }
        clearableEditText.setEnabledEditTextIcon(true);
        ClearableEditText clearableEditText2 = this.countrySearchEditText;
        if (clearableEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countrySearchEditText");
        }
        clearableEditText2.setMaxLength(40);
        ClearableEditText clearableEditText3 = this.countrySearchEditText;
        if (clearableEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countrySearchEditText");
        }
        clearableEditText3.inputEditText.addTextChangedListener(new FragmentBuilder_BindEasycashCommercialLoanAccountFragment(new C5707x2f5268d0(this)));
        IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory = this.presenter;
        if (iKtaSessionIdProviderFactory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iKtaSessionIdProviderFactory.MediaBrowserCompat$ItemReceiver(this);
        IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory2 = this.presenter;
        if (iKtaSessionIdProviderFactory2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (iKtaSessionIdProviderFactory2.RatingCompat != null) {
            iKtaSessionIdProviderFactory2.RatingCompat.AlertController$RecycleListView();
        }
        getForwardList getforwardlist = iKtaSessionIdProviderFactory2.IconCompatParcelizer;
        FundFactSheetActivity read2 = new IKtaSessionIdProviderFactory.read(iKtaSessionIdProviderFactory2);
        FundFactSheetActivity iconCompatParcelizer = new IKtaSessionIdProviderFactory.IconCompatParcelizer(iKtaSessionIdProviderFactory2);
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onFailure");
        getforwardlist.MediaBrowserCompat$CustomActionResultReceiver.read(read2, iconCompatParcelizer, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new getForwardList.write(getforwardlist, true), getforwardlist.MediaBrowserCompat$ItemReceiver);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.registration_country_search_title);
        setTabContainer();
    }

    public final void onDestroy() {
        IKtaSessionIdProviderFactory iKtaSessionIdProviderFactory = this.presenter;
        if (iKtaSessionIdProviderFactory == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iKtaSessionIdProviderFactory.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<setCausedBy> list) {
        onGetStartedClick.write((Object) list, "countryDisplays");
        RegistrationCountrySearchAdapter registrationCountrySearchAdapter = this.MediaDescriptionCompat;
        if (registrationCountrySearchAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        onGetStartedClick.write((Object) list, "displays");
        registrationCountrySearchAdapter.MediaBrowserCompat$ItemReceiver = list;
        registrationCountrySearchAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setCausedBy setcausedby) {
        onGetStartedClick.write((Object) setcausedby, "countryDisplay");
        Intent intent = new Intent();
        intent.putExtra("COUNTRY_DISPLAY", setcausedby);
        setResult(-1, intent);
        finish();
    }
}
