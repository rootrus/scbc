package com.scb.phone.view.activity.investment.discover;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.EkycService;
import com.scb.phone.data.network.service.hml.HmlConsentService;
import com.scb.phone.data.network.service.hml.HmlDocumentUploadService;
import com.scb.phone.data.network.service.hml.HmlService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.discover.NtbDiscoverFundFilterActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.investment.discover.DiscoverSearchResultAdapter;
import com.scb.phone.view.adapter.investment.discover.DiscoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p040o.C3586xf7c35d5d;
import p040o.C5361xd79df389;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindDeejungTransferSlipFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.GoogleSigninService;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportExtractor;
import p040o.TextInputEditText$MediaBrowserCompat$ItemReceiver;
import p040o.captureEventData;
import p040o.captureReportData;
import p040o.forEachSrcAtop;
import p040o.getDeejungTransferPlans;
import p040o.onGetStartedClick;
import p040o.populateFramesList;
import p040o.populateSessionData;
import p040o.populateSignalData;
import p040o.populateThreadData;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;
import p040o.setRequestUserName;
import p040o.setRequestUserName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setRequestUserName$MediaBrowserCompat$SearchResultReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

public abstract class BaseDiscoverSearchActivity extends BaseActivity implements PassportExtractor, DiscoverSearchResultAdapter$MediaBrowserCompat$ItemReceiver {
    private final HmlVerifyEmailActivity AlertController$RecycleListView;
    private final HmlVerifyEmailActivity Keep;
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public boolean MediaDescriptionCompat;
    private captureEventData MediaMetadataCompat;
    private forEachSrcAtop MediaSessionCompat$ResultReceiverWrapper;
    private final HmlVerifyEmailActivity MediaSessionCompat$Token;
    private final HmlVerifyEmailActivity PlaybackStateCompat;
    private final HmlVerifyEmailActivity PlaybackStateCompat$CustomAction;
    @BindView
    public ImageButton btClear;
    @BindView
    public ImageButton btFilter;
    @BindView
    public ViewGroup customProgress;
    @BindView
    public EditText etSearch;
    @BindView
    public ImageView ivError;
    @BindView
    public ImageView ivFilterFlag;
    @BindView
    public ViewGroup layoutContainer;
    @BindView
    public ViewGroup layoutEmpty;
    @BindView
    public ViewGroup layoutFunds;
    @BindView
    public ViewGroup layoutSearchHint;
    @BindView
    public ViewGroup layoutSortOptions;
    @BindView
    public ViewGroup layoutTxnLoading;
    @HmlPinActivity
    public setRequestUserName presenter;
    @BindView
    public RecyclerView rcvFunds;
    @BindView
    public NestedScrollView scrollContainer;
    private final HmlVerifyEmailActivity setContentView;
    /* access modifiers changed from: private */
    public Runnable setHasDecor;
    @BindView
    public Spinner spnPeriod;
    @BindView
    public Spinner spnSortingType;
    @BindView
    public Toolbar toolbar;
    @BindView
    public TextView tvErrorDescription;
    @BindView
    public TextView tvErrorTitle;
    @BindView
    public TextView tvToolbarTitle;
    @BindView
    public TextView tvTotalRecords;

    public BaseDiscoverSearchActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = BaseDiscoverSearchActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
        FundActionsSuccessActivity baseDiscoverSearchActivity$MediaSessionCompat$ResultReceiverWrapper = new C5647xd8cb8f2a(this);
        onGetStartedClick.write((Object) baseDiscoverSearchActivity$MediaSessionCompat$ResultReceiverWrapper, "initializer");
        this.AlertController$RecycleListView = new HmlVerifyPhoneTermsConditionsActivity(baseDiscoverSearchActivity$MediaSessionCompat$ResultReceiverWrapper);
        FundActionsSuccessActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) mediaMetadataCompat, "initializer");
        this.PlaybackStateCompat$CustomAction = new HmlVerifyPhoneTermsConditionsActivity(mediaMetadataCompat);
        FundActionsSuccessActivity baseDiscoverSearchActivity$MediaBrowserCompat$SearchResultReceiver = new C5642x9c5b235f(this);
        onGetStartedClick.write((Object) baseDiscoverSearchActivity$MediaBrowserCompat$SearchResultReceiver, "initializer");
        this.MediaSessionCompat$Token = new HmlVerifyPhoneTermsConditionsActivity(baseDiscoverSearchActivity$MediaBrowserCompat$SearchResultReceiver);
        FundActionsSuccessActivity parcelableVolumeInfo = new ParcelableVolumeInfo(this);
        onGetStartedClick.write((Object) parcelableVolumeInfo, "initializer");
        this.setContentView = new HmlVerifyPhoneTermsConditionsActivity(parcelableVolumeInfo);
        FundActionsSuccessActivity ratingCompat = new RatingCompat(this);
        onGetStartedClick.write((Object) ratingCompat, "initializer");
        this.Keep = new HmlVerifyPhoneTermsConditionsActivity(ratingCompat);
        FundActionsSuccessActivity baseDiscoverSearchActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new C5644xb44a2117(this);
        onGetStartedClick.write((Object) baseDiscoverSearchActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, "initializer");
        this.PlaybackStateCompat = new HmlVerifyPhoneTermsConditionsActivity(baseDiscoverSearchActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
    }

    public static final class IconCompatParcelizer {
        public HmlDocumentUploadService IconCompatParcelizer;
        public EkycService MediaBrowserCompat$ItemReceiver;
        public HmlService read;
        public HmlConsentService write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(HmlService hmlService, HmlConsentService hmlConsentService, EkycService ekycService, HmlDocumentUploadService hmlDocumentUploadService) {
            this.read = hmlService;
            this.write = hmlConsentService;
            this.MediaBrowserCompat$ItemReceiver = ekycService;
            this.IconCompatParcelizer = hmlDocumentUploadService;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77452131492970);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        m2941x50fd9e4a();
        ImageButton imageButton = this.btClear;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btClear");
        }
        imageButton.setOnClickListener(new BaseDiscoverSearchActivity$MediaBrowserCompat$MediaItem(this));
        ImageButton imageButton2 = this.btFilter;
        if (imageButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btFilter");
        }
        imageButton2.setOnClickListener(new MediaDescriptionCompat(this));
        Context context = this;
        Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_search_24dp);
        boolean z = false;
        if (write2 != null) {
            float dimension = getResources().getDimension(R.dimen.f73252131165576);
            if (!Float.isNaN(dimension)) {
                int round = Math.round(dimension);
                float dimension2 = getResources().getDimension(R.dimen.f73252131165576);
                if (!Float.isNaN(dimension2)) {
                    write2.setBounds(0, 0, round, Math.round(dimension2));
                    Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(write2);
                    setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem2, setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
                    EditText editText = this.etSearch;
                    if (editText == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
                    }
                    editText.setCompoundDrawables(MediaBrowserCompat$MediaItem2, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    throw new IllegalArgumentException("Cannot round NaN value.");
                }
            } else {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
        }
        EditText editText2 = this.etSearch;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText2.setFilters((InputFilter[]) new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$")});
        EditText editText3 = this.etSearch;
        if (editText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText3.setInputType(524432);
        EditText editText4 = this.etSearch;
        if (editText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText4.removeTextChangedListener((write) this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver());
        EditText editText5 = this.etSearch;
        if (editText5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText5.addTextChangedListener((write) this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver());
        EditText editText6 = this.etSearch;
        if (editText6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText6.setOnEditorActionListener(new read(new BaseDiscoverSearchActivity$MediaSessionCompat$Token(this)));
        RecyclerView recyclerView = this.rcvFunds;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rcvFunds");
        }
        recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new GoogleSigninService());
        RecyclerView recyclerView2 = this.rcvFunds;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rcvFunds");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.rcvFunds;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rcvFunds");
        }
        recyclerView3.setAdapter((DiscoverSearchResultAdapter) this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver());
        FragmentBuilder_BindDeejungTransferSlipFragment.read read2 = FragmentBuilder_BindDeejungTransferSlipFragment.MediaBrowserCompat$ItemReceiver;
        if (Build.VERSION.SDK_INT >= 26) {
            NestedScrollView nestedScrollView = this.scrollContainer;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("scrollContainer");
            }
            nestedScrollView.setDefaultFocusHighlightEnabled(false);
        }
        NestedScrollView nestedScrollView2 = this.scrollContainer;
        if (nestedScrollView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("scrollContainer");
        }
        nestedScrollView2.setOnScrollChangeListener(new BaseDiscoverSearchActivity$MediaSessionCompat$QueueItem(this));
        Spinner spinner = this.spnSortingType;
        if (spinner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnSortingType");
        }
        spinner.setAdapter((getDeejungTransferPlans) this.setContentView.MediaBrowserCompat$CustomActionResultReceiver());
        Spinner spinner2 = this.spnPeriod;
        if (spinner2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnPeriod");
        }
        spinner2.setAdapter((getDeejungTransferPlans) this.Keep.MediaBrowserCompat$CustomActionResultReceiver());
        setRequestUserName setrequestusername = this.presenter;
        if (setrequestusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setrequestusername.MediaBrowserCompat$ItemReceiver(this);
        setRequestUserName setrequestusername2 = this.presenter;
        if (setrequestusername2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setRequestUserName$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
        if (setrequestusername2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(setrequestusername2.RatingCompat);
        }
        LinkedListMultimap.AsMapEntries asMapEntries = setrequestusername2.MediaBrowserCompat$SearchResultReceiver;
        FundFactSheetActivity parcelableVolumeInfo = new setRequestUserName.ParcelableVolumeInfo(setrequestusername2);
        FundFactSheetActivity setrequestusername_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C5361xd79df389(setrequestusername2);
        onGetStartedClick.write((Object) parcelableVolumeInfo, "onSuccess");
        onGetStartedClick.write((Object) setrequestusername_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver, "onError");
        asMapEntries.MediaBrowserCompat$ItemReceiver(asMapEntries.MediaBrowserCompat$CustomActionResultReceiver, parcelableVolumeInfo, setrequestusername_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver, new TextInputEditText$MediaBrowserCompat$ItemReceiver(), new C3586xf7c35d5d(asMapEntries));
        this.MediaSessionCompat$ResultReceiverWrapper = new forEachSrcAtop();
    }

    public final void setStackedBackground() {
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("toolbar");
        }
        this.mToolbar = toolbar2;
        TextView textView = this.tvToolbarTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvToolbarTitle");
        }
        this.mActionBarTitle = textView;
        super.setStackedBackground();
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowCustomEnabled(true);
        }
        setTabContainer();
        setTitle(R.string.investment_discover_search_title);
    }

    static final class MediaDescriptionCompat implements View.OnClickListener {
        private /* synthetic */ BaseDiscoverSearchActivity read;

        MediaDescriptionCompat(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
            this.read = baseDiscoverSearchActivity;
        }

        public final void onClick(View view) {
            setRequestUserName setrequestusername = this.read.presenter;
            if (setrequestusername == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            populateFramesList populateframeslist = setrequestusername.write;
            if (populateframeslist != null) {
                writeUInt64NoTag.IconCompatParcelizer setrequestusername_mediabrowsercompat_customactionresultreceiver = new setRequestUserName$MediaBrowserCompat$CustomActionResultReceiver(populateframeslist, setrequestusername);
                if (setrequestusername.RatingCompat != null) {
                    setrequestusername_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setrequestusername.RatingCompat);
                }
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2941x50fd9e4a() {
        ViewGroup viewGroup = this.layoutSearchHint;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.customProgress;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customProgress");
        }
        viewGroup2.setVisibility(8);
        ViewGroup viewGroup3 = this.layoutEmpty;
        if (viewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        viewGroup3.setVisibility(8);
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(8);
        ViewGroup viewGroup4 = this.layoutFunds;
        if (viewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
        }
        viewGroup4.setVisibility(8);
        ViewGroup viewGroup5 = this.layoutContainer;
        if (viewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        viewGroup5.setVisibility(0);
        DiscoverSearchResultAdapter discoverSearchResultAdapter = (DiscoverSearchResultAdapter) this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver();
        ((List) discoverSearchResultAdapter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()).clear();
        discoverSearchResultAdapter.IconCompatParcelizer.write();
    }

    /* access modifiers changed from: private */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        setRequestUserName setrequestusername = this.presenter;
        if (setrequestusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setrequestusername.read();
        Runnable runnable = this.setHasDecor;
        if (runnable != null) {
            ((Handler) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).removeCallbacks(runnable);
        }
        ViewGroup viewGroup = this.layoutTxnLoading;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        viewGroup.setVisibility(8);
    }

    public final void Keep() {
        super.Keep();
        ViewGroup viewGroup = this.customProgress;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customProgress");
        }
        viewGroup.setVisibility(0);
        ViewGroup viewGroup2 = this.layoutContainer;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        viewGroup2.setVisibility(8);
    }

    public final void ay_() {
        super.ay_();
        ViewGroup viewGroup = this.customProgress;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customProgress");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.layoutContainer;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutContainer");
        }
        viewGroup2.setVisibility(0);
    }

    public final void write() {
        ViewGroup viewGroup = this.layoutTxnLoading;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        viewGroup.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ViewGroup viewGroup = this.layoutTxnLoading;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutTxnLoading");
        }
        viewGroup.setVisibility(8);
    }

    public final void IconCompatParcelizer(boolean z) {
        ImageButton imageButton = this.btFilter;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btFilter");
        }
        imageButton.setEnabled(z);
    }

    public final void read(boolean z) {
        ImageView imageView = this.ivFilterFlag;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFilterFlag");
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    public final void PlaybackStateCompat$CustomAction() {
        super.PlaybackStateCompat$CustomAction();
        EditText editText = this.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText.clearFocus();
        NestedScrollView nestedScrollView = this.scrollContainer;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("scrollContainer");
        }
        nestedScrollView.requestFocus();
    }

    public final void read() {
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(0);
        MediaBrowserCompat$ItemReceiver((int) R.drawable.thumb_empty_state, getString(R.string.investment_discover_search_no_result_found), getString(R.string.investment_discover_search_no_result_found_description));
    }

    public final void IconCompatParcelizer(String str) {
        if (str != null) {
            TextView textView = this.tvTotalRecords;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
            }
            textView.setText(getString(R.string.investment_discover_search_item_found, new Object[]{str}));
            return;
        }
        TextView textView2 = this.tvTotalRecords;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView2.setText(getString(R.string.investment_discover_search_item_found_is_null));
    }

    public final void IconCompatParcelizer() {
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(8);
        MediaBrowserCompat$ItemReceiver((int) R.drawable.icon_easycash_empty, getString(R.string.unable_to_proceed_error_title), getString(R.string.investment_discover_search_error_description));
    }

    private final void MediaBrowserCompat$ItemReceiver(int i, String str, String str2) {
        ViewGroup viewGroup = this.layoutSearchHint;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.layoutEmpty;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        viewGroup2.setVisibility(0);
        ViewGroup viewGroup3 = this.layoutFunds;
        if (viewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
        }
        viewGroup3.setVisibility(8);
        ImageView imageView = this.ivError;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivError");
        }
        imageView.setImageDrawable(setLastBaselineToBottomHeight.write(this, i));
        TextView textView = this.tvErrorTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorTitle");
        }
        textView.setText(str);
        TextView textView2 = this.tvErrorDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorDescription");
        }
        textView2.setText(str2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            Spinner spinner = this.spnSortingType;
            if (spinner == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnSortingType");
            }
            spinner.setOnItemSelectedListener((C5641x16f00c3e) this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver());
            Spinner spinner2 = this.spnPeriod;
            if (spinner2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnPeriod");
            }
            spinner2.setOnItemSelectedListener((C5641x16f00c3e) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver());
            return;
        }
        Spinner spinner3 = this.spnSortingType;
        if (spinner3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnSortingType");
        }
        spinner3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        Spinner spinner4 = this.spnPeriod;
        if (spinner4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnPeriod");
        }
        spinner4.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
    }

    private static void IconCompatParcelizer(Spinner spinner, List<captureReportData> list, HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity, ArrayAdapter<captureReportData> arrayAdapter) {
        arrayAdapter.clear();
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        Collection collection = list;
        onGetStartedClick.write((Object) collection, "$this$toMutableList");
        List arrayList = new ArrayList(collection);
        boolean isEmpty = arrayList.isEmpty();
        spinner.setEnabled(!isEmpty);
        spinner.setVisibility(isEmpty ? 8 : 0);
        if (!(!isEmpty || hmlVerifyEmailSuccessfulActivity == null || ((String) hmlVerifyEmailSuccessfulActivity.write) == null)) {
            String str = (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = (String) hmlVerifyEmailSuccessfulActivity.write;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new captureReportData(str, str2));
            spinner.setVisibility(0);
        }
        arrayAdapter.addAll(arrayList);
    }

    private static void MediaBrowserCompat$ItemReceiver(Spinner spinner, List<captureReportData> list, HmlVerifyEmailSuccessfulActivity<String, String> hmlVerifyEmailSuccessfulActivity) {
        Collection collection = list;
        if (!(collection == null || collection.isEmpty()) && hmlVerifyEmailSuccessfulActivity != null) {
            Iterator<captureReportData> it = list.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) it.next().IconCompatParcelizer, (Object) (String) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            int max = Math.max(0, i);
            if (max != spinner.getSelectedItemPosition()) {
                spinner.setSelection(max, false);
            }
        }
    }

    public final void write(boolean z) {
        ViewGroup viewGroup = this.layoutSortOptions;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSortOptions");
        }
        viewGroup.setVisibility(z ? 0 : 8);
    }

    public void IconCompatParcelizer(populateSessionData populatesessiondata) {
        String str;
        onGetStartedClick.write((Object) populatesessiondata, "display");
        PlaybackStateCompat$CustomAction();
        forEachSrcAtop foreachsrcatop = this.MediaSessionCompat$ResultReceiverWrapper;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, populatesessiondata.MediaBrowserCompat$CustomActionResultReceiver);
        forEachSrcAtop foreachsrcatop2 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.MediaBrowserCompat$MediaItem);
        forEachSrcAtop foreachsrcatop3 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (foreachsrcatop3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop3.MediaBrowserCompat$ItemReceiver();
        forEachSrcAtop foreachsrcatop4 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (foreachsrcatop4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        String str2 = populatesessiondata.MediaBrowserCompat$CustomActionResultReceiver;
        EditText editText = this.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        String obj = editText.getText().toString();
        captureEventData captureeventdata = this.MediaMetadataCompat;
        onGetStartedClick.write((Object) str2, "fundCode");
        onGetStartedClick.write((Object) obj, "searchKey");
        foreachsrcatop4.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver, str2);
        String str3 = forEachSrcAtop.MediaBrowserCompat$ItemReceiver.RatingCompat;
        if (captureeventdata != null) {
            str = forEachSrcAtop.write.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = forEachSrcAtop.write.IconCompatParcelizer;
        }
        foreachsrcatop4.read(str3, str);
        foreachsrcatop4.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, obj);
        forEachSrcAtop foreachsrcatop5 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (foreachsrcatop5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop5.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.MediaSessionCompat$QueueItem);
        HashMap hashMap = new HashMap();
        Map map = hashMap;
        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver);
        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, populatesessiondata.MediaBrowserCompat$CustomActionResultReceiver);
        PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$CustomActionResultReceiver = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, hashMap, true, (Intent) null);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(populateFramesList populateframeslist, captureEventData captureeventdata) {
        onGetStartedClick.write((Object) populateframeslist, "display");
        PlaybackStateCompat$CustomAction();
        C5648x418b2082 discoverFundFilterActivity$MediaBrowserCompat$CustomActionResultReceiver = DiscoverFundFilterActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) populateframeslist, "display");
        Intent intent = new Intent(context, DiscoverFundFilterActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_FUND_FILTER_DISPLAY", populateframeslist);
        if (captureeventdata != null) {
            intent.putExtra("EXTRA_FUND_FILTER_SELECTED_DISPLAY", captureeventdata);
        }
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(populateFramesList populateframeslist, captureEventData captureeventdata) {
        onGetStartedClick.write((Object) populateframeslist, "display");
        PlaybackStateCompat$CustomAction();
        NtbDiscoverFundFilterActivity.IconCompatParcelizer iconCompatParcelizer = NtbDiscoverFundFilterActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) populateframeslist, "display");
        Intent intent = new Intent(context, NtbDiscoverFundFilterActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_FUND_FILTER_DISPLAY", populateframeslist);
        if (captureeventdata != null) {
            intent.putExtra("EXTRA_FUND_FILTER_SELECTED_DISPLAY", captureeventdata);
        }
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 10001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r0 != r7) goto L_0x006f
            r7 = -1
            if (r8 != r7) goto L_0x006f
            o.setRequestUserName r0 = r6.presenter
            if (r0 != 0) goto L_0x0013
            java.lang.String r7 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r7)
        L_0x0013:
            android.widget.EditText r7 = r6.etSearch
            if (r7 != 0) goto L_0x001c
            java.lang.String r8 = "etSearch"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x001c:
            android.text.Editable r7 = r7.getText()
            r8 = 0
            if (r7 == 0) goto L_0x0028
            java.lang.String r7 = r7.toString()
            goto L_0x0029
        L_0x0028:
            r7 = r8
        L_0x0029:
            if (r7 != 0) goto L_0x002d
            java.lang.String r7 = ""
        L_0x002d:
            r1 = r7
            if (r9 == 0) goto L_0x0039
            java.lang.String r7 = "EXTRA_FUND_FILTER_DISPLAY_RETURN"
            android.os.Parcelable r7 = r9.getParcelableExtra(r7)
            r8 = r7
            o.captureEventData r8 = (p040o.captureEventData) r8
        L_0x0039:
            r0.IconCompatParcelizer = r8
            o.setRequestUserName$RatingCompat r7 = new o.setRequestUserName$RatingCompat
            r7.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r7 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r7
            T r9 = r0.RatingCompat
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x004a
            r9 = r2
            goto L_0x004b
        L_0x004a:
            r9 = r3
        L_0x004b:
            if (r9 == 0) goto L_0x0052
            T r9 = r0.RatingCompat
            r7.IconCompatParcelizer(r9)
        L_0x0052:
            o.setRequestUserName$MediaSessionCompat$Token r7 = new o.setRequestUserName$MediaSessionCompat$Token
            r7.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r7 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r7
            T r8 = r0.RatingCompat
            if (r8 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r2 = r3
        L_0x005f:
            if (r2 == 0) goto L_0x0066
            T r8 = r0.RatingCompat
            r7.IconCompatParcelizer(r8)
        L_0x0066:
            r2 = 0
            java.lang.String r3 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.String r4 = r0.read
            r5 = 2
            p040o.setRequestUserName.MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r2, r3, r4, r5)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onDestroy() {
        super.onDestroy();
        Runnable runnable = this.setHasDecor;
        if (runnable != null) {
            ((Handler) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).removeCallbacks(runnable);
        }
    }

    public final void write(captureEventData captureeventdata) {
        this.MediaMetadataCompat = captureeventdata;
    }

    public final class write implements TextWatcher {
        private final FundFactSheetActivity<Editable, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public write(FundFactSheetActivity<? super Editable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
            onGetStartedClick.write((Object) fundFactSheetActivity, "func");
            this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        }

        public final void afterTextChanged(Editable editable) {
            this.MediaBrowserCompat$ItemReceiver.invoke(editable);
        }
    }

    public final class read implements TextView.OnEditorActionListener {
        private final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver;

        public read(FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
            onGetStartedClick.write((Object) fundActionsSuccessActivity, "func");
            this.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSuccessActivity;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 6) {
                return true;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.invoke();
            return false;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<C5641x16f00c3e> {
        final /* synthetic */ BaseDiscoverSearchActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
            super(0);
            this.IconCompatParcelizer = baseDiscoverSearchActivity;
        }

        public final /* synthetic */ Object invoke() {
            return new C5641x16f00c3e(new FundFactSheetActivity<captureReportData, HmlVerifyPhoneValidateOtpActivity>(this) {
                private /* synthetic */ MediaMetadataCompat write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    List<captureReportData> list;
                    populateSignalData populatesignaldata;
                    captureReportData capturereportdata = (captureReportData) obj;
                    if (capturereportdata != null) {
                        z = capturereportdata.MediaBrowserCompat$ItemReceiver;
                    } else {
                        z = true;
                    }
                    setRequestUserName setrequestusername = this.write.IconCompatParcelizer.presenter;
                    if (setrequestusername == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    populateFramesList populateframeslist = setrequestusername.write;
                    String str = null;
                    if (populateframeslist == null || (populatesignaldata = populateframeslist.MediaBrowserCompat$CustomActionResultReceiver) == null) {
                        list = null;
                    } else {
                        list = populatesignaldata.read;
                    }
                    Collection collection = list;
                    int i = 0;
                    if (!(collection == null || collection.isEmpty())) {
                        Spinner spinner = this.write.IconCompatParcelizer.spnPeriod;
                        if (spinner == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spnPeriod");
                        }
                        if (!z) {
                            i = 8;
                        }
                        spinner.setVisibility(i);
                    }
                    setRequestUserName setrequestusername2 = this.write.IconCompatParcelizer.presenter;
                    if (setrequestusername2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    if (capturereportdata != null) {
                        str = capturereportdata.IconCompatParcelizer;
                    }
                    String str2 = str;
                    if (str2 != null && (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) setrequestusername2.MediaBrowserCompat$ItemReceiver))) {
                        setrequestusername2.MediaBrowserCompat$ItemReceiver = str2;
                        setRequestUserName.MediaBrowserCompat$CustomActionResultReceiver(setrequestusername2, setrequestusername2.MediaBrowserCompat$MediaItem, 0, str2, setrequestusername2.read, 2);
                    }
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            });
        }
    }

    static final class ParcelableVolumeInfo extends CheckEligibilityActivity implements FundActionsSuccessActivity<getDeejungTransferPlans> {
        private /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ParcelableVolumeInfo(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverSearchActivity;
        }

        public final /* synthetic */ Object invoke() {
            return new getDeejungTransferPlans(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<getDeejungTransferPlans> {
        private /* synthetic */ BaseDiscoverSearchActivity read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
            super(0);
            this.read = baseDiscoverSearchActivity;
        }

        public final /* synthetic */ Object invoke() {
            return new getDeejungTransferPlans(this.read);
        }
    }

    public static final /* synthetic */ Handler write(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        return (Handler) baseDiscoverSearchActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static final /* synthetic */ void write(BaseDiscoverSearchActivity baseDiscoverSearchActivity, int i, int i2) {
        EditText editText = baseDiscoverSearchActivity.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        if (editText.isFocused() && i != i2) {
            baseDiscoverSearchActivity.PlaybackStateCompat$CustomAction();
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        baseDiscoverSearchActivity.MediaDescriptionCompat = false;
        baseDiscoverSearchActivity.MediaSessionCompat$ResultReceiverWrapper();
        baseDiscoverSearchActivity.m2941x50fd9e4a();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DiscoverSearchResultAdapter discoverSearchResultAdapter = (DiscoverSearchResultAdapter) this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver();
        ((List) discoverSearchResultAdapter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()).clear();
        discoverSearchResultAdapter.IconCompatParcelizer.write();
    }

    public final void read(populateThreadData populatethreaddata) {
        onGetStartedClick.write((Object) populatethreaddata, "display");
        this.MediaBrowserCompat$SearchResultReceiver = populatethreaddata.IconCompatParcelizer;
        ViewGroup viewGroup = this.layoutSearchHint;
        if (viewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchHint");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.layoutFunds;
        if (viewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutFunds");
        }
        viewGroup2.setVisibility(0);
        TextView textView = this.tvTotalRecords;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalRecords");
        }
        textView.setVisibility(0);
        ViewGroup viewGroup3 = this.layoutEmpty;
        if (viewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmpty");
        }
        viewGroup3.setVisibility(8);
        ((DiscoverSearchResultAdapter) this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver()).write = populatethreaddata.MediaBrowserCompat$MediaItem;
        DiscoverSearchResultAdapter discoverSearchResultAdapter = (DiscoverSearchResultAdapter) this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver();
        List<populateSessionData> list = populatethreaddata.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) list, "items");
        int IconCompatParcelizer2 = discoverSearchResultAdapter.IconCompatParcelizer();
        ((List) discoverSearchResultAdapter.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver()).addAll(list);
        discoverSearchResultAdapter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2 - 1, discoverSearchResultAdapter.IconCompatParcelizer() - 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: o.captureReportData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: o.captureReportData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: o.captureReportData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.captureReportData} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r3 = r8.IconCompatParcelizer;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.populateFramesList r8, p040o.populateThreadData r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0006
            java.lang.String r1 = r9.IconCompatParcelizer
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            r7.MediaBrowserCompat$SearchResultReceiver = r1
            android.widget.Spinner r1 = r7.spnSortingType
            java.lang.String r2 = "spnSortingType"
            if (r1 != 0) goto L_0x0012
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0012:
            if (r8 == 0) goto L_0x001b
            o.populateSignalData r3 = r8.IconCompatParcelizer
            if (r3 == 0) goto L_0x001b
            java.util.List<o.captureReportData> r3 = r3.read
            goto L_0x001c
        L_0x001b:
            r3 = r0
        L_0x001c:
            if (r9 == 0) goto L_0x0021
            o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String> r4 = r9.MediaDescriptionCompat
            goto L_0x0022
        L_0x0021:
            r4 = r0
        L_0x0022:
            o.HmlVerifyEmailActivity r5 = r7.setContentView
            java.lang.Object r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            o.getDeejungTransferPlans r5 = (p040o.getDeejungTransferPlans) r5
            android.widget.ArrayAdapter r5 = (android.widget.ArrayAdapter) r5
            IconCompatParcelizer(r1, r3, r4, r5)
            android.widget.Spinner r1 = r7.spnPeriod
            java.lang.String r3 = "spnPeriod"
            if (r1 != 0) goto L_0x0038
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0038:
            if (r8 == 0) goto L_0x0041
            o.populateSignalData r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 == 0) goto L_0x0041
            java.util.List<o.captureReportData> r4 = r4.read
            goto L_0x0042
        L_0x0041:
            r4 = r0
        L_0x0042:
            if (r9 == 0) goto L_0x0047
            o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String> r5 = r9.write
            goto L_0x0048
        L_0x0047:
            r5 = r0
        L_0x0048:
            o.HmlVerifyEmailActivity r6 = r7.Keep
            java.lang.Object r6 = r6.MediaBrowserCompat$CustomActionResultReceiver()
            o.getDeejungTransferPlans r6 = (p040o.getDeejungTransferPlans) r6
            android.widget.ArrayAdapter r6 = (android.widget.ArrayAdapter) r6
            IconCompatParcelizer(r1, r4, r5, r6)
            android.widget.Spinner r1 = r7.spnSortingType
            if (r1 != 0) goto L_0x005c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x005c:
            if (r8 == 0) goto L_0x0065
            o.populateSignalData r2 = r8.IconCompatParcelizer
            if (r2 == 0) goto L_0x0065
            java.util.List<o.captureReportData> r2 = r2.read
            goto L_0x0066
        L_0x0065:
            r2 = r0
        L_0x0066:
            if (r9 == 0) goto L_0x006b
            o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String> r4 = r9.MediaDescriptionCompat
            goto L_0x006c
        L_0x006b:
            r4 = r0
        L_0x006c:
            MediaBrowserCompat$ItemReceiver((android.widget.Spinner) r1, (java.util.List<p040o.captureReportData>) r2, (p040o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String>) r4)
            android.widget.Spinner r1 = r7.spnPeriod
            if (r1 != 0) goto L_0x0076
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0076:
            if (r8 == 0) goto L_0x007f
            o.populateSignalData r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x007f
            java.util.List<o.captureReportData> r2 = r2.read
            goto L_0x0080
        L_0x007f:
            r2 = r0
        L_0x0080:
            if (r9 == 0) goto L_0x0085
            o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String> r4 = r9.write
            goto L_0x0086
        L_0x0085:
            r4 = r0
        L_0x0086:
            MediaBrowserCompat$ItemReceiver((android.widget.Spinner) r1, (java.util.List<p040o.captureReportData>) r2, (p040o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String>) r4)
            if (r9 == 0) goto L_0x00cd
            o.HmlVerifyEmailSuccessfulActivity<java.lang.String, java.lang.String> r9 = r9.MediaDescriptionCompat
            if (r9 == 0) goto L_0x00cd
            A r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = (java.lang.String) r9
            if (r8 == 0) goto L_0x00cd
            o.populateSignalData r8 = r8.IconCompatParcelizer
            if (r8 == 0) goto L_0x00cd
            java.util.List<o.captureReportData> r8 = r8.read
            if (r8 == 0) goto L_0x00cd
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00a3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00b9
            java.lang.Object r1 = r8.next()
            r2 = r1
            o.captureReportData r2 = (p040o.captureReportData) r2
            java.lang.String r2 = r2.IconCompatParcelizer
            boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r2, (java.lang.Object) r9)
            if (r2 == 0) goto L_0x00a3
            r0 = r1
        L_0x00b9:
            o.captureReportData r0 = (p040o.captureReportData) r0
            if (r0 == 0) goto L_0x00cd
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver
            if (r8 != 0) goto L_0x00cd
            android.widget.Spinner r8 = r7.spnPeriod
            if (r8 != 0) goto L_0x00c8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00c8:
            r9 = 8
            r8.setVisibility(r9)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity.write(o.populateFramesList, o.populateThreadData):void");
    }
}
