package com.scb.phone.view.activity.mwpartner;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.activity.ErrorPageActivity;
import com.scb.phone.view.activity.ScbMapActivity;
import com.scb.phone.view.activity.cardmanagement.AmortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.investment.assessment.C5639xa36eeabf;
import com.scb.phone.view.activity.mwpartner.MwPinnedSuccessActivity;
import com.scb.phone.view.adapter.mwpartner.MwPlaceAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C4093bd;
import p040o.CharMatcher;
import p040o.ChequeInquiryDeepLinkActivity;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.HistoryAdapter$GroupFooterViewHolder_ViewBinding;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IIdImageProcessingListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerBuilder;
import p040o.bd$MediaSessionCompat$Token;
import p040o.getKernelIDClear;
import p040o.newLatLngZoom;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.validateSide;

public final class MwPinShopLocationActivity extends ScbMapActivity implements IIdImageProcessingListener.IconCompatParcelizer, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener, MwPlaceAdapter.read {
    private boolean MediaBrowserCompat$MediaItem;
    private MwPlaceAdapter MediaBrowserCompat$SearchResultReceiver;
    private ChequeInquiryDeepLinkActivity MediaDescriptionCompat;
    private AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder MediaMetadataCompat;
    private int MediaSessionCompat$Token;
    @BindView
    public EditText autoCompleteEditText;
    @BindView
    public ImageView btnDelete;
    @BindView
    public FloatingActionButton fabMyLocation;
    @BindView
    public LinearLayout layoutEditLocation;
    @BindView
    public LinearLayout layoutNoResult;
    @BindView
    public LinearLayout layoutPinLocation;
    @BindView
    public RelativeLayout layoutSearchEditText;
    @BindView
    public RelativeLayout layoutSearchResult;
    @BindView
    public LinearLayout layoutShopLocation;
    @HmlPinActivity
    public C4093bd presenter;
    @BindView
    public RecyclerView rvItemSearchResult;
    @BindView
    public TextView tvAddressPinLocation;
    @BindView
    public TextView tvDescription;
    @BindView
    public TextView tvNamePinLocation;

    static final class Keep implements DialogInterface.OnClickListener {
        public static final Keep write = new Keep();

        Keep() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static final class ParcelableVolumeInfo implements DialogInterface.OnClickListener {
        public static final ParcelableVolumeInfo MediaBrowserCompat$CustomActionResultReceiver = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, MwPinShopLocationActivity.class);
    }

    static final class MediaMetadataCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final MediaMetadataCompat read = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ Object write(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            onGetStartedClick.write((Object) charSequence, "charSequence");
            return charSequence.toString();
        }
    }

    static final class RatingCompat<T> implements DebitCardMarketConductDeepLinkActivity<String> {
        private /* synthetic */ MwPinShopLocationActivity write;

        RatingCompat(MwPinShopLocationActivity mwPinShopLocationActivity) {
            this.write = mwPinShopLocationActivity;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = (String) obj;
            this.write.Keep();
            onGetStartedClick.IconCompatParcelizer((Object) str, "charSequence");
            if (str.length() > 0) {
                MwPinShopLocationActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write).getFilter().filter(str.toString());
            }
        }
    }

    static final class write<TResult> implements OnSuccessListener<Location> {
        private /* synthetic */ MwPinShopLocationActivity read;

        write(MwPinShopLocationActivity mwPinShopLocationActivity) {
            this.read = mwPinShopLocationActivity;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            Location location = (Location) obj;
            if (location != null) {
                this.read.MediaSessionCompat$QueueItem().moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 15.0f));
            }
        }
    }

    public static final /* synthetic */ MwPlaceAdapter MediaBrowserCompat$CustomActionResultReceiver(MwPinShopLocationActivity mwPinShopLocationActivity) {
        MwPlaceAdapter mwPlaceAdapter = mwPinShopLocationActivity.MediaBrowserCompat$SearchResultReceiver;
        if (mwPlaceAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("placeAdapter");
        }
        return mwPlaceAdapter;
    }

    public static final class IconCompatParcelizer {
        public final int IconCompatParcelizer;
        public final ErrorPageActivity.read MediaBrowserCompat$CustomActionResultReceiver;
        public final C5639xa36eeabf MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String read;
        public final AmortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(int i, String str, String str2, C5639xa36eeabf questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver, ErrorPageActivity.read read2, AmortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver amortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver) {
            onGetStartedClick.write((Object) str, "walletId");
            onGetStartedClick.write((Object) str2, "walletStatus");
            onGetStartedClick.write((Object) questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver, "shop");
            onGetStartedClick.write((Object) amortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver, "bankAccount");
            this.IconCompatParcelizer = i;
            this.read = str;
            this.MediaBrowserCompat$MediaItem = str2;
            this.MediaBrowserCompat$ItemReceiver = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2;
            this.write = amortizationMerchantsActivity$MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78912131493116);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.mw_pin_shop_location_title);
        setTabContainer();
        this.MediaDescriptionCompat = new ChequeInquiryDeepLinkActivity();
        this.MediaMetadataCompat = new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder((byte) 0);
        MapView AppCompatDelegateImpl$ListMenuDecorView = AppCompatDelegateImpl$ListMenuDecorView();
        AppCompatDelegateImpl$ListMenuDecorView.onCreate(bundle);
        AppCompatDelegateImpl$ListMenuDecorView.getMapAsync(this);
        mo13836x50fd9e4a();
        C4093bd bdVar = this.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bdVar.MediaBrowserCompat$ItemReceiver(this);
        FloatingActionButton floatingActionButton = this.fabMyLocation;
        if (floatingActionButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
        }
        Context context = this;
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257)));
        EditText editText = this.autoCompleteEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("autoCompleteEditText");
        }
        editText.setOnFocusChangeListener(new MwPinShopLocationActivity$MediaBrowserCompat$MediaItem(this));
        EditText editText2 = this.autoCompleteEditText;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("autoCompleteEditText");
        }
        TextView textView = editText2;
        if (textView != null) {
            BulkTransferDeepLinkActivity subscribe = new validateSide(textView).debounce(500, TimeUnit.MILLISECONDS).map(MediaMetadataCompat.read).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new RatingCompat(this));
            ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity = this.MediaDescriptionCompat;
            if (chequeInquiryDeepLinkActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("compositeDisposable");
            }
            chequeInquiryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(subscribe);
            AutocompleteFilter build = new AutocompleteFilter.Builder().setCountry("TH").build();
            MwPlaceAdapter mwPlaceAdapter = new MwPlaceAdapter();
            this.MediaBrowserCompat$SearchResultReceiver = mwPlaceAdapter;
            LatLngBounds latLngBounds = new LatLngBounds(new LatLng(0.0d, 0.0d), new LatLng(0.0d, 0.0d));
            GoogleApiClient MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
            onGetStartedClick.IconCompatParcelizer((Object) build, "filter");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) latLngBounds, "mBounds");
            onGetStartedClick.write((Object) MediaSessionCompat$ResultReceiverWrapper, "mGoogleApiClient");
            onGetStartedClick.write((Object) build, "mPlaceFilter");
            mwPlaceAdapter.MediaBrowserCompat$ItemReceiver = context;
            mwPlaceAdapter.write = latLngBounds;
            mwPlaceAdapter.MediaMetadataCompat = MediaSessionCompat$ResultReceiverWrapper;
            mwPlaceAdapter.MediaDescriptionCompat = build;
            MwPlaceAdapter mwPlaceAdapter2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (mwPlaceAdapter2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("placeAdapter");
            }
            MwPlaceAdapter.read read2 = this;
            onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            mwPlaceAdapter2.read = read2;
            RecyclerView recyclerView = this.rvItemSearchResult;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvItemSearchResult");
            }
            recyclerView.setLayoutManager(new LinearLayoutManager());
            RecyclerView recyclerView2 = this.rvItemSearchResult;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvItemSearchResult");
            }
            MwPlaceAdapter mwPlaceAdapter3 = this.MediaBrowserCompat$SearchResultReceiver;
            if (mwPlaceAdapter3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("placeAdapter");
            }
            recyclerView2.setAdapter(mwPlaceAdapter3);
            new getKernelIDClear().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_pinshoplocation");
            return;
        }
        throw new NullPointerException("view == null");
    }

    public final void write() {
        Context context = this;
        if (!MediaBrowserCompat$ItemReceiver(context)) {
            ActionMenuPresenter$OverflowMenuButton();
            return;
        }
        if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            setOverlayMode();
            C4093bd bdVar = this.presenter;
            if (bdVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bdVar.write(AppCompatActivity());
        } else if (Build.VERSION.SDK_INT < 23) {
            MediaBrowserCompat$CustomActionResultReceiver((HistoryAdapter$GroupFooterViewHolder_ViewBinding) null);
        } else {
            ServerBuilder.read(this);
        }
    }

    private final void ActionMenuPresenter$OverflowMenuButton() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.mw_gps_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.mw_gps_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.mw_gps_setting_button), new MwPinShopLocationActivity$AlertController$RecycleListView(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.mw_gps_cancel_button), Keep.write).show();
    }

    static final class MediaDescriptionCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ MwPinShopLocationActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(MwPinShopLocationActivity mwPinShopLocationActivity, HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mwPinShopLocationActivity;
            this.MediaBrowserCompat$ItemReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (Build.VERSION.SDK_INT >= 23) {
                HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder_ViewBinding != null) {
                    historyAdapter$GroupFooterViewHolder_ViewBinding.write();
                    return;
                }
                return;
            }
            MwPinShopLocationActivity mwPinShopLocationActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            Intent intent = new Intent("android.settings.SETTINGS");
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(mwPinShopLocationActivity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(mwPinShopLocationActivity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                mwPinShopLocationActivity.startActivityForResult(read, 1002);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            dialogInterface.dismiss();
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.mw_gps_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.mw_gps_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.mw_gps_setting_button), new MediaDescriptionCompat(this, historyAdapter$GroupFooterViewHolder_ViewBinding));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.mw_gps_cancel_button), new MwPinShopLocationActivity$MediaSessionCompat$QueueItem(historyAdapter$GroupFooterViewHolder_ViewBinding)).show();
    }

    public final void setItemInvoker() {
        setOverlayMode();
        C4093bd bdVar = this.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bdVar.write(AppCompatActivity());
    }

    public final void IconCompatParcelizer(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        onGetStartedClick.write((Object) historyAdapter$GroupFooterViewHolder_ViewBinding, "request");
        MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupFooterViewHolder_ViewBinding);
    }

    public final void setIcon() {
        MwPlaceAdapter mwPlaceAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (mwPlaceAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("placeAdapter");
        }
        GoogleApiClient MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        if (MediaSessionCompat$ResultReceiverWrapper == null || !MediaSessionCompat$ResultReceiverWrapper.isConnected()) {
            mwPlaceAdapter.MediaMetadataCompat = null;
        } else {
            mwPlaceAdapter.MediaMetadataCompat = MediaSessionCompat$ResultReceiverWrapper;
        }
    }

    public final void setMenu() {
        MwPlaceAdapter mwPlaceAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (mwPlaceAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("placeAdapter");
        }
        mwPlaceAdapter.MediaMetadataCompat = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMapReady(com.google.android.gms.maps.GoogleMap r6) {
        /*
            r5 = this;
            java.lang.String r0 = "googleMap"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            super.onMapReady(r6)
            o.bd r6 = r5.presenter
            if (r6 != 0) goto L_0x0011
            java.lang.String r0 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0011:
            o.bd$MediaBrowserCompat$MediaItem r0 = p040o.bd$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r6.RatingCompat
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            r1 = r2
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            if (r1 == 0) goto L_0x0025
            T r1 = r6.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0025:
            o.CharMatcher$LookupTable r0 = r6.write
            o.OnDeviceIdExtractor$a$3 r0 = r0.IconCompatParcelizer
            com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity$IconCompatParcelizer r0 = r0.MediaBrowserCompat$ItemReceiver()
            r1 = 0
            if (r0 == 0) goto L_0x003f
            java.util.List<com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$IconCompatParcelizer> r0 = r0.ParcelableVolumeInfo
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r0.get(r3)
            com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$IconCompatParcelizer r0 = (com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity.IconCompatParcelizer) r0
            if (r0 == 0) goto L_0x003f
            com.scb.phone.view.activity.ErrorPageActivity$read r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            java.lang.String r4 = r0.MediaBrowserCompat$ItemReceiver
            goto L_0x0046
        L_0x0045:
            r4 = r1
        L_0x0046:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0052
            int r4 = r4.length()
            if (r4 == 0) goto L_0x0052
            r4 = r3
            goto L_0x0053
        L_0x0052:
            r4 = r2
        L_0x0053:
            if (r4 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.read
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0067
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0067
            r0 = r3
            goto L_0x0068
        L_0x0067:
            r0 = r2
        L_0x0068:
            if (r0 != 0) goto L_0x006c
            r0 = r2
            goto L_0x006d
        L_0x006c:
            r0 = r3
        L_0x006d:
            if (r0 != 0) goto L_0x0081
            o.bd$MediaBrowserCompat$SearchResultReceiver r0 = p040o.bd$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r2 = r3
        L_0x0079:
            if (r2 == 0) goto L_0x00ad
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
            goto L_0x00ad
        L_0x0081:
            o.CharMatcher$LookupTable r0 = r6.write
            o.OnDeviceIdExtractor$a$3 r0 = r0.IconCompatParcelizer
            com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity$IconCompatParcelizer r0 = r0.MediaBrowserCompat$ItemReceiver()
            if (r0 == 0) goto L_0x0099
            java.util.List<com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$IconCompatParcelizer> r0 = r0.ParcelableVolumeInfo
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r0.get(r3)
            com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$IconCompatParcelizer r0 = (com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity.IconCompatParcelizer) r0
            if (r0 == 0) goto L_0x0099
            com.scb.phone.view.activity.ErrorPageActivity$read r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0099:
            o.bd$MediaDescriptionCompat r0 = new o.bd$MediaDescriptionCompat
            r0.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            if (r2 == 0) goto L_0x00ad
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x00ad:
            com.google.android.gms.maps.GoogleMap r6 = r5.MediaSessionCompat$QueueItem()
            r0 = r5
            com.google.android.gms.maps.GoogleMap$OnMapClickListener r0 = (com.google.android.gms.maps.GoogleMap.OnMapClickListener) r0
            r6.setOnMapClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity.onMapReady(com.google.android.gms.maps.GoogleMap):void");
    }

    public final void onMapClick(LatLng latLng) {
        onGetStartedClick.write((Object) latLng, "latLng");
        PlaybackStateCompat$CustomAction();
        int i = this.MediaSessionCompat$Token;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                if (this.MediaBrowserCompat$MediaItem) {
                    this.MediaBrowserCompat$MediaItem = false;
                    LinearLayout linearLayout = this.layoutEditLocation;
                    if (linearLayout == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEditLocation");
                    }
                    View view = linearLayout;
                    view.setVisibility(0);
                    view.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
                    return;
                }
                this.MediaBrowserCompat$MediaItem = true;
                LinearLayout linearLayout2 = this.layoutEditLocation;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEditLocation");
                }
                IconCompatParcelizer((View) linearLayout2, false);
            } else if (this.MediaBrowserCompat$MediaItem) {
                this.MediaBrowserCompat$MediaItem = false;
                LinearLayout linearLayout3 = this.layoutPinLocation;
                if (linearLayout3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
                }
                View view2 = linearLayout3;
                view2.setVisibility(0);
                view2.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
            } else {
                this.MediaBrowserCompat$MediaItem = true;
                LinearLayout linearLayout4 = this.layoutPinLocation;
                if (linearLayout4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
                }
                IconCompatParcelizer((View) linearLayout4, false);
            }
        } else if (this.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$MediaItem = false;
            LinearLayout linearLayout5 = this.layoutShopLocation;
            if (linearLayout5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
            }
            View view3 = linearLayout5;
            view3.setVisibility(0);
            view3.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
            FloatingActionButton floatingActionButton = this.fabMyLocation;
            if (floatingActionButton == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
            }
            View view4 = floatingActionButton;
            view4.setVisibility(0);
            view4.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
        } else {
            this.MediaBrowserCompat$MediaItem = true;
            LinearLayout linearLayout6 = this.layoutShopLocation;
            if (linearLayout6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
            }
            IconCompatParcelizer((View) linearLayout6, true);
            FloatingActionButton floatingActionButton2 = this.fabMyLocation;
            if (floatingActionButton2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
            }
            IconCompatParcelizer((View) floatingActionButton2, false);
        }
    }

    public final void onMapLongClick(LatLng latLng) {
        onGetStartedClick.write((Object) latLng, "latLng");
        setUiOptions();
        MediaBrowserCompat$ItemReceiver(true);
        write(latLng);
        BulkTransferDeepLinkActivity subscribe = DebitCardResetOtpActivity.fromCallable(new read(new Geocoder(getApplicationContext(), Locale.getDefault()), latLng)).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new C5661xe60648d2(this, latLng), new C5662x15af5ef3(this));
        ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity = this.MediaDescriptionCompat;
        if (chequeInquiryDeepLinkActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("compositeDisposable");
        }
        chequeInquiryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(subscribe);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.mw_pin_shop_location_title);
        setTabContainer();
    }

    @OnTextChanged
    public final void handleTextChange(Editable editable) {
        onGetStartedClick.write((Object) editable, "editable");
        if (editable.toString().length() > 0) {
            RelativeLayout relativeLayout = this.layoutSearchResult;
            if (relativeLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
            }
            relativeLayout.setVisibility(0);
            RecyclerView recyclerView = this.rvItemSearchResult;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvItemSearchResult");
            }
            recyclerView.setVisibility(0);
            LinearLayout linearLayout = this.layoutNoResult;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutNoResult");
            }
            linearLayout.setVisibility(8);
            ImageView imageView = this.btnDelete;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnDelete");
            }
            imageView.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout2 = this.layoutSearchResult;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        relativeLayout2.setVisibility(8);
        ImageView imageView2 = this.btnDelete;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnDelete");
        }
        imageView2.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MediaSessionCompat$QueueItem().setOnMapLongClickListener(this);
        TextView textView = this.tvDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDescription");
        }
        textView.setVisibility(0);
        LinearLayout linearLayout = this.layoutPinLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutPinLocation;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        IconCompatParcelizer((View) linearLayout2, false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaSessionCompat$Token = 2;
        LinearLayout linearLayout = this.layoutShopLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutPinLocation;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = this.layoutEditLocation;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEditLocation");
        }
        linearLayout3.setVisibility(0);
        LinearLayout linearLayout4 = this.layoutShopLocation;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
        }
        IconCompatParcelizer((View) linearLayout4, true);
        LinearLayout linearLayout5 = this.layoutPinLocation;
        if (linearLayout5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        IconCompatParcelizer((View) linearLayout5, false);
        FloatingActionButton floatingActionButton = this.fabMyLocation;
        if (floatingActionButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
        }
        IconCompatParcelizer((View) floatingActionButton, false);
        setUiOptions();
        MediaBrowserCompat$ItemReceiver(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str2, "address");
        this.MediaSessionCompat$Token = 1;
        LinearLayout linearLayout = this.layoutShopLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
        }
        IconCompatParcelizer((View) linearLayout, true);
        LinearLayout linearLayout2 = this.layoutPinLocation;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        View view = linearLayout2;
        view.setVisibility(0);
        view.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
        FloatingActionButton floatingActionButton = this.fabMyLocation;
        if (floatingActionButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
        }
        IconCompatParcelizer((View) floatingActionButton, false);
        TextView textView = this.tvNamePinLocation;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNamePinLocation");
        }
        if (str == null) {
            str = getString(R.string.mw_dropped_pin);
        }
        textView.setText(str);
        TextView textView2 = this.tvAddressPinLocation;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressPinLocation");
        }
        textView2.setText(str2);
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = this.MediaMetadataCompat;
        if (crashlyticsReportSessionEventApplicationExecutionThreadEncoder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("merchantSuccessDisplay");
        }
        TextView textView3 = this.tvNamePinLocation;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNamePinLocation");
        }
        crashlyticsReportSessionEventApplicationExecutionThreadEncoder.read = textView3.getText().toString();
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder2 = this.MediaMetadataCompat;
        if (crashlyticsReportSessionEventApplicationExecutionThreadEncoder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("merchantSuccessDisplay");
        }
        TextView textView4 = this.tvAddressPinLocation;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressPinLocation");
        }
        crashlyticsReportSessionEventApplicationExecutionThreadEncoder2.IconCompatParcelizer = textView4.getText().toString();
    }

    @OnClick
    public final void clearAutoCompleteEditText() {
        RelativeLayout relativeLayout = this.layoutSearchResult;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        relativeLayout.setVisibility(8);
        ImageView imageView = this.btnDelete;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnDelete");
        }
        imageView.setVisibility(8);
        RelativeLayout relativeLayout2 = this.layoutSearchEditText;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchEditText");
        }
        relativeLayout2.setBackground(setLastBaselineToBottomHeight.write(this, R.drawable.shape_gray_rounded_rectangle));
        EditText editText = this.autoCompleteEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("autoCompleteEditText");
        }
        editText.setText("");
        PlaybackStateCompat$CustomAction();
    }

    @OnClick
    public final void moveCameraToCurrentLocation() {
        Context context = this;
        if (!MediaBrowserCompat$ItemReceiver(context)) {
            ActionMenuPresenter$OverflowMenuButton();
            return;
        }
        if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            Activity activity = this;
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity);
            onGetStartedClick.IconCompatParcelizer((Object) fusedLocationProviderClient, "client");
            onGetStartedClick.IconCompatParcelizer((Object) fusedLocationProviderClient.getLastLocation().addOnSuccessListener(activity, new write(this)), "client.lastLocation.addO…          }\n            }");
        } else if (Build.VERSION.SDK_INT < 23) {
            MediaBrowserCompat$CustomActionResultReceiver((HistoryAdapter$GroupFooterViewHolder_ViewBinding) null);
        } else {
            ServerBuilder.read(this);
        }
    }

    @OnClick
    public final void showDialogDeletePinLocation() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.mw_clear_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.mw_clear_dialog_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.mw_clear_dialog_positive), new C8851x802038ab(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.mw_clear_dialog_negative), ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    @OnClick
    public final void editPinLocation() {
        MediaSessionCompat$QueueItem().setOnMapLongClickListener(this);
        LinearLayout linearLayout = this.layoutEditLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEditLocation");
        }
        IconCompatParcelizer((View) linearLayout, false);
        setWindowCallback();
        MediaBrowserCompat$ItemReceiver(false);
    }

    @OnClick
    public final void closePinLocation() {
        LinearLayout linearLayout = this.layoutPinLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutPinLocation");
        }
        IconCompatParcelizer((View) linearLayout, false);
        setWindowCallback();
        Marker MediaSessionCompat$Token2 = MediaSessionCompat$Token();
        if (MediaSessionCompat$Token2 != null) {
            MediaSessionCompat$Token2.remove();
        }
        MediaBrowserCompat$ItemReceiver(false);
    }

    @OnClick
    public final void confirmPinLocation() {
        C4093bd bdVar = this.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (bdVar.RatingCompat != null) {
            bdVar.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.And and = bdVar.IconCompatParcelizer;
        newLatLngZoom newlatlngzoom = bdVar.MediaBrowserCompat$ItemReceiver;
        if (newlatlngzoom == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mwLocation");
        }
        and.read(and.MediaBrowserCompat$CustomActionResultReceiver(newlatlngzoom), new C4093bd.RatingCompat(bdVar), new bd$MediaSessionCompat$Token(bdVar));
    }

    private final void setWindowCallback() {
        this.MediaSessionCompat$Token = 0;
        TextView textView = this.tvDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDescription");
        }
        textView.setVisibility(8);
        LinearLayout linearLayout = this.layoutShopLocation;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutShopLocation");
        }
        View view = linearLayout;
        view.setVisibility(0);
        view.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
        FloatingActionButton floatingActionButton = this.fabMyLocation;
        if (floatingActionButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("fabMyLocation");
        }
        View view2 = floatingActionButton;
        view2.setVisibility(0);
        view2.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener((Animator.AnimatorListener) null);
    }

    private static void IconCompatParcelizer(View view, boolean z) {
        view.animate().translationY(z ? -((float) view.getHeight()) : (float) view.getHeight()).setListener(new PlaybackStateCompat(view));
    }

    public static final class PlaybackStateCompat extends AnimatorListenerAdapter {
        private /* synthetic */ View IconCompatParcelizer;

        PlaybackStateCompat(View view) {
            this.IconCompatParcelizer = view;
        }

        public final void onAnimationEnd(Animator animator) {
            onGetStartedClick.write((Object) animator, "animation");
            super.onAnimationEnd(animator);
            this.IconCompatParcelizer.setVisibility(8);
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "placeId");
        PlaybackStateCompat$CustomAction();
        setUiOptions();
        MediaBrowserCompat$ItemReceiver(true);
        RelativeLayout relativeLayout = this.layoutSearchResult;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSearchResult");
        }
        relativeLayout.setVisibility(8);
        EditText editText = this.autoCompleteEditText;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("autoCompleteEditText");
        }
        editText.setText("");
        Places.GeoDataApi.getPlaceById(MediaSessionCompat$ResultReceiverWrapper(), str).setResultCallback(new MwPinShopLocationActivity$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void setWindowTitle() {
        ay_();
        LinearLayout linearLayout = this.layoutNoResult;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutNoResult");
        }
        linearLayout.setVisibility(8);
        RecyclerView recyclerView = this.rvItemSearchResult;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvItemSearchResult");
        }
        recyclerView.setVisibility(0);
    }

    public final void ActionMenuView() {
        ay_();
        LinearLayout linearLayout = this.layoutNoResult;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutNoResult");
        }
        linearLayout.setVisibility(0);
        RecyclerView recyclerView = this.rvItemSearchResult;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvItemSearchResult");
        }
        recyclerView.setVisibility(8);
    }

    public final void IconCompatParcelizer(double d, double d2) {
        IconCompatParcelizer(new LatLng(d, d2));
    }

    public final void read(AutoCrashlyticsReportEncoder.C3050xc3999712 crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder) {
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder, "otpDisplay");
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = this.MediaMetadataCompat;
        if (crashlyticsReportSessionEventApplicationExecutionThreadEncoder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("merchantSuccessDisplay");
        }
        crashlyticsReportSessionEventApplicationExecutionThreadEncoder.write = crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.MediaBrowserCompat$ItemReceiver;
        MwPinnedSuccessActivity.write write2 = MwPinnedSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder2 = this.MediaMetadataCompat;
        if (crashlyticsReportSessionEventApplicationExecutionThreadEncoder2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("merchantSuccessDisplay");
        }
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadEncoder2, "merchantDisplay");
        Intent putExtra = new Intent(context, MwPinnedSuccessActivity.class).putExtra("MERCHANT_PINNED_SUCCESS", crashlyticsReportSessionEventApplicationExecutionThreadEncoder2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, MwPinned…SUCCESS, merchantDisplay)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        MediaBrowserCompat$CustomActionResultReceiver.addFlags(603979776);
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
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 1001) {
            if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                z = false;
            }
            if (z) {
                setOverlayMode();
            }
        } else if (i == 1002) {
            if (setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                z = false;
            }
            if (z) {
                setOverlayMode();
                C4093bd bdVar = this.presenter;
                if (bdVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                bdVar.write(AppCompatActivity());
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        if (setContentView()) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
            String string = IconCompatParcelizer2.read.getString(R.string.mw_no_location_saved_dialog_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                IconCompatParcelizer2.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer2.read.getString(R.string.mw_no_location_saved_dialog_message);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer2.mTextTextView.setVisibility(0);
                IconCompatParcelizer2.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.mw_no_location_saved_dialog_positive), new C5663x89fec616(this));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.mw_no_location_saved_dialog_negative), MwPinShopLocationActivity$MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver).show();
            return;
        }
        super.onBackPressed();
    }

    public final void onDestroy() {
        super.onDestroy();
        ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity = this.MediaDescriptionCompat;
        if (chequeInquiryDeepLinkActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("compositeDisposable");
        }
        chequeInquiryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
    }

    static final class read<V> implements Callable<T> {
        private /* synthetic */ Geocoder MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ LatLng read;

        read(Geocoder geocoder, LatLng latLng) {
            this.MediaBrowserCompat$CustomActionResultReceiver = geocoder;
            this.read = latLng;
        }

        public final /* synthetic */ Object call() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getFromLocation(this.read.latitude, this.read.longitude, 1);
        }
    }
}
