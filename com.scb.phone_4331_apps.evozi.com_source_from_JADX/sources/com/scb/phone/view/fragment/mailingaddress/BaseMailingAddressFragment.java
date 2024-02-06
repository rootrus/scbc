package com.scb.phone.view.fragment.mailingaddress;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Locale;
import p040o.AggregateException;
import p040o.AppStatsDataStore;
import p040o.AppStatsDataStore$b$MediaBrowserCompat$ItemReceiver;
import p040o.AppStatsDataStore$b$MediaBrowserCompat$MediaItem;
import p040o.AppStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver;
import p040o.AppStatsDataStore$b$MediaSessionCompat$QueueItem;
import p040o.AppStatsDataStore$b$MediaSessionCompat$ResultReceiverWrapper;
import p040o.AppStatsDataStore$b$MediaSessionCompat$Token;
import p040o.BillPaymentSearchAdapter$BillPaymentSearchViewHolder;
import p040o.BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding;
import p040o.C3034x420047fd;
import p040o.CameraSourcePreview;
import p040o.Common;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindPrepaidTravelServicesTabFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceIdExtractor;
import p040o.addDelayedShutdownHook;
import p040o.keys;
import p040o.onGetStartedClick;
import p040o.requestGoogleAccountsAccess;
import p040o.serializeToBytes;
import p040o.serializeToIntentExtra;
import p040o.serializeToString;
import p040o.setLastBaselineToBottomHeight;
import p040o.setStartCap;
import p040o.setTapText;
import p040o.wrapPosition;
import p040o.writeUInt64NoTag;
import p040o.zzro;

public abstract class BaseMailingAddressFragment extends BaseFragment implements AggregateException {
    private boolean AlertController$RecycleListView;
    private boolean IconCompatParcelizer;
    private boolean Keep;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private wrapPosition MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f3093x50fd9e4a;
    private String MediaDescriptionCompat = "";
    private boolean MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token = "";
    private boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private addDelayedShutdownHook PlaybackStateCompat$CustomAction;
    private wrapPosition RatingCompat;
    @BindView
    public CustomAddressInput alley;
    @BindView
    public Button confirmButton;
    @BindView
    public TextView districtLabel;
    @BindView
    public CustomAddressInput floor;
    @BindView
    public CustomAddressInput houseNo;
    @BindView
    public CustomAddressInput moo;
    @BindView
    public Button nextButton;
    @BindView
    public TextView postalCodeLabel;
    @HmlPinActivity
    public AppStatsDataStore.C3032b presenter;
    @BindView
    public TextView provinceLabel;
    @BindView
    public CustomAddressInput road;
    @BindView
    public RelativeLayout selectProvince;
    private boolean setHasDecor;
    @BindView
    public TextView subDistrictLabel;
    @BindView
    public TextView textAddressTitle;
    @BindView
    public LinearLayout typeOfAddressLayout;
    @BindView
    public CustomAddressInput unit;
    @BindView
    public CustomAddressInput village;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(wrapPosition wrapposition) {
        this.RatingCompat = wrapposition;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final wrapPosition mo38654x50fd9e4a() {
        return this.RatingCompat;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(wrapPosition wrapposition) {
        this.MediaBrowserCompat$MediaItem = wrapposition;
    }

    /* access modifiers changed from: protected */
    public final wrapPosition MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public final addDelayedShutdownHook setContentView() {
        return this.PlaybackStateCompat$CustomAction;
    }

    /* access modifiers changed from: protected */
    public final void write(addDelayedShutdownHook adddelayedshutdownhook) {
        this.PlaybackStateCompat$CustomAction = adddelayedshutdownhook;
    }

    /* access modifiers changed from: protected */
    public final String MediaSessionCompat$Token() {
        return this.MediaSessionCompat$Token;
    }

    /* access modifiers changed from: protected */
    public final void AppCompatActivity() {
        this.AlertController$RecycleListView = true;
    }

    public static final class IconCompatParcelizer implements OnDeviceIdExtractor {
        public Locale IconCompatParcelizer;
        public final FragmentBuilder_BindPrepaidTravelServicesTabFragment MediaBrowserCompat$CustomActionResultReceiver;
        private final Resources MediaBrowserCompat$ItemReceiver;
        private final Context read;
        public keys write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(Context context, FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment, keys keys, Resources resources, requestGoogleAccountsAccess requestgoogleaccountsaccess) {
            this.read = context;
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindPrepaidTravelServicesTabFragment;
            this.MediaBrowserCompat$ItemReceiver = resources;
            this.write = keys;
        }

        public Locale IconCompatParcelizer() {
            if (Build.VERSION.SDK_INT >= 24) {
                return this.MediaBrowserCompat$ItemReceiver.getConfiguration().getLocales().get(0);
            }
            return this.MediaBrowserCompat$ItemReceiver.getConfiguration().locale;
        }

        public final DebitCardResetOtpActivity<zzro> write() {
            zzro zzro;
            Locale locale;
            FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            zzro zzro2 = null;
            if (SystemClock.elapsedRealtime() - fragmentBuilder_BindPrepaidTravelServicesTabFragment.write > 600000) {
                zzro = null;
            } else {
                zzro = fragmentBuilder_BindPrepaidTravelServicesTabFragment.read;
            }
            if (zzro == null || (locale = this.IconCompatParcelizer) == null || !locale.equals(IconCompatParcelizer())) {
                BillPaymentSearchAdapter$BillPaymentSearchViewHolder billPaymentSearchAdapter$BillPaymentSearchViewHolder = new BillPaymentSearchAdapter$BillPaymentSearchViewHolder(this.read);
                return CameraSourcePreview.write(billPaymentSearchAdapter$BillPaymentSearchViewHolder.read, billPaymentSearchAdapter$BillPaymentSearchViewHolder.MediaBrowserCompat$ItemReceiver).map(serializeToString.read).doOnNext(new serializeToBytes(this));
            }
            FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (SystemClock.elapsedRealtime() - fragmentBuilder_BindPrepaidTravelServicesTabFragment2.write <= 600000) {
                zzro2 = fragmentBuilder_BindPrepaidTravelServicesTabFragment2.read;
            }
            return DebitCardResetOtpActivity.just(zzro2);
        }

        public final DebitCardResetOtpActivity<setStartCap> MediaBrowserCompat$CustomActionResultReceiver(zzro zzro) {
            setStartCap setstartcap;
            Locale locale;
            FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            setStartCap setstartcap2 = null;
            if (SystemClock.elapsedRealtime() - fragmentBuilder_BindPrepaidTravelServicesTabFragment.write > 600000) {
                setstartcap = null;
            } else {
                setstartcap = fragmentBuilder_BindPrepaidTravelServicesTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (setstartcap == null || (locale = this.IconCompatParcelizer) == null || !locale.equals(IconCompatParcelizer())) {
                BillPaymentSearchAdapter$BillPaymentSearchViewHolder billPaymentSearchAdapter$BillPaymentSearchViewHolder = new BillPaymentSearchAdapter$BillPaymentSearchViewHolder(this.read);
                return BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding.IconCompatParcelizer(billPaymentSearchAdapter$BillPaymentSearchViewHolder.read.write, billPaymentSearchAdapter$BillPaymentSearchViewHolder.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer(), zzro.IconCompatParcelizer, zzro.write, 20).flatMap(new Common(this)).doOnNext(new serializeToIntentExtra(this));
            }
            FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (SystemClock.elapsedRealtime() - fragmentBuilder_BindPrepaidTravelServicesTabFragment2.write <= 600000) {
                setstartcap2 = fragmentBuilder_BindPrepaidTravelServicesTabFragment2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            return DebitCardResetOtpActivity.just(setstartcap2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88292131494056, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        AppCompatDialogFragment();
        AppStatsDataStore.C3032b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bVar.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        super.setTransitioning();
        setActionBarVisibilityCallback();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
    }

    public final void MediaSessionCompat$Token(boolean z) {
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String string = getString(AppStatsDataStore.C3032b.write(z));
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(presenter.getTitle(isConfirmPage))");
        this.MediaDescriptionCompat = string;
        ParcelableVolumeInfo(string);
        TextView textView = this.textAddressTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textAddressTitle");
        }
        if (this.presenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        textView.setText(getString(AppStatsDataStore.C3032b.IconCompatParcelizer(z)));
    }

    static final class write implements CustomAddressInput.IconCompatParcelizer {
        private /* synthetic */ BaseMailingAddressFragment IconCompatParcelizer;

        write(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.IconCompatParcelizer = baseMailingAddressFragment;
        }

        public final void write(boolean z) {
            AppStatsDataStore.C3032b bVar = this.IconCompatParcelizer.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer appStatsDataStore$b$MediaBrowserCompat$ItemReceiver = new AppStatsDataStore$b$MediaBrowserCompat$ItemReceiver(z);
            if (bVar.RatingCompat != null) {
                appStatsDataStore$b$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void AppCompatDialogFragment() {
        CustomAddressInput customAddressInput = this.houseNo;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        customAddressInput.setOnValueChangeListener(new write(this));
        CustomAddressInput customAddressInput2 = this.floor;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput2.setOnValueChangeListener(new C6084x88cd1d58(this));
        CustomAddressInput customAddressInput3 = this.village;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput3.setOnValueChangeListener(new RatingCompat(this));
        CustomAddressInput customAddressInput4 = this.unit;
        if (customAddressInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput4.setOnValueChangeListener(new MediaDescriptionCompat(this));
        CustomAddressInput customAddressInput5 = this.moo;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput5.setOnValueChangeListener(new MediaMetadataCompat(this));
        CustomAddressInput customAddressInput6 = this.alley;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput6.setOnValueChangeListener(new C6086x7a98d451(this));
        CustomAddressInput customAddressInput7 = this.road;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput7.setOnValueChangeListener(new ParcelableVolumeInfo(this));
        CustomAddressInput customAddressInput8 = this.moo;
        if (customAddressInput8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput8.setOnFocusChanged(new BaseMailingAddressFragment$MediaSessionCompat$Token(this));
        CustomAddressInput customAddressInput9 = this.alley;
        if (customAddressInput9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput9.setOnFocusChanged(new C6085x2d58ee10(this));
        CustomAddressInput customAddressInput10 = this.road;
        if (customAddressInput10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput10.setOnFocusChanged(new read(this));
        CustomAddressInput customAddressInput11 = this.floor;
        if (customAddressInput11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput11.setOnFocusChanged(new BaseMailingAddressFragment$MediaBrowserCompat$ItemReceiver(this));
        CustomAddressInput customAddressInput12 = this.unit;
        if (customAddressInput12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput12.setOnFocusChanged(new C6083x8e32e777(this));
        CustomAddressInput customAddressInput13 = this.village;
        if (customAddressInput13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput13.setOnFocusChanged(new BaseMailingAddressFragment$MediaBrowserCompat$MediaItem(this));
    }

    static final class RatingCompat implements CustomAddressInput.IconCompatParcelizer {
        private /* synthetic */ BaseMailingAddressFragment IconCompatParcelizer;

        RatingCompat(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.IconCompatParcelizer = baseMailingAddressFragment;
        }

        public final void write(boolean z) {
            AppStatsDataStore.C3032b bVar = this.IconCompatParcelizer.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new AppStatsDataStore.C3032b.RatingCompat(z);
            if (bVar.RatingCompat != null) {
                ratingCompat.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    static final class MediaDescriptionCompat implements CustomAddressInput.IconCompatParcelizer {
        private /* synthetic */ BaseMailingAddressFragment MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.MediaBrowserCompat$ItemReceiver = baseMailingAddressFragment;
        }

        public final void write(boolean z) {
            AppStatsDataStore.C3032b bVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer appStatsDataStore$b$MediaBrowserCompat$MediaItem = new AppStatsDataStore$b$MediaBrowserCompat$MediaItem(z);
            if (bVar.RatingCompat != null) {
                appStatsDataStore$b$MediaBrowserCompat$MediaItem.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    static final class MediaMetadataCompat implements CustomAddressInput.IconCompatParcelizer {
        private /* synthetic */ BaseMailingAddressFragment IconCompatParcelizer;

        MediaMetadataCompat(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.IconCompatParcelizer = baseMailingAddressFragment;
        }

        public final void write(boolean z) {
            AppStatsDataStore.C3032b bVar = this.IconCompatParcelizer.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer write = new AppStatsDataStore.C3032b.write(z);
            if (bVar.RatingCompat != null) {
                write.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    static final class ParcelableVolumeInfo implements CustomAddressInput.IconCompatParcelizer {
        private /* synthetic */ BaseMailingAddressFragment IconCompatParcelizer;

        ParcelableVolumeInfo(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.IconCompatParcelizer = baseMailingAddressFragment;
        }

        public final void write(boolean z) {
            AppStatsDataStore.C3032b bVar = this.IconCompatParcelizer.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer appStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver = new AppStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver(z);
            if (bVar.RatingCompat != null) {
                appStatsDataStore$b$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    static final class read implements CustomAddressInput.write {
        private /* synthetic */ BaseMailingAddressFragment MediaBrowserCompat$ItemReceiver;

        read(BaseMailingAddressFragment baseMailingAddressFragment) {
            this.MediaBrowserCompat$ItemReceiver = baseMailingAddressFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            BaseMailingAddressFragment.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, z);
        }
    }

    @OnClick
    public final void onAddressRadioButtonClicked(RadioButton radioButton) {
        onGetStartedClick.write((Object) radioButton, "radioButton");
        boolean isChecked = radioButton.isChecked();
        this.AlertController$RecycleListView = isChecked;
        int id = radioButton.getId();
        if (id != R.id.home_address_radio_button) {
            if (id == R.id.work_address_radio_button && isChecked) {
                AppStatsDataStore.C3032b bVar = this.presenter;
                if (bVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                bVar.MediaBrowserCompat$ItemReceiver("WORK");
            }
        } else if (isChecked) {
            AppStatsDataStore.C3032b bVar2 = this.presenter;
            if (bVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bVar2.MediaBrowserCompat$ItemReceiver("HOME");
        }
        AppStatsDataStore.C3032b bVar3 = this.presenter;
        if (bVar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bVar3.MediaBrowserCompat$ItemReceiver(this.setHasDecor, this.MediaBrowserCompat$SearchResultReceiver, this.ParcelableVolumeInfo, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaSessionCompat$QueueItem);
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    private void AppCompatDelegateImpl$ListMenuDecorView() {
        AppStatsDataStore.C3032b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.f3093x50fd9e4a;
        boolean z3 = this.IconCompatParcelizer;
        boolean z4 = this.PlaybackStateCompat;
        boolean z5 = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z6 = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z7 = this.setHasDecor;
        boolean z8 = this.Keep;
        boolean z9 = this.ParcelableVolumeInfo;
        boolean z10 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z11 = this.MediaSessionCompat$QueueItem;
        boolean z12 = this.AlertController$RecycleListView;
        if (!bVar.read) {
            z = z & z2 & z3 & z4 & z5 & z12;
        }
        if ((z6 | z7) && z) {
            z = z6 & z7 & z8 & (z9 | z10 | z11);
        }
        boolean z13 = true;
        if (z) {
            if (bVar.write != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = AppStatsDataStore$b$MediaSessionCompat$QueueItem.read;
                if (bVar.RatingCompat == null) {
                    z13 = false;
                }
                if (z13) {
                    iconCompatParcelizer.IconCompatParcelizer(bVar.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = AppStatsDataStore$b$MediaSessionCompat$ResultReceiverWrapper.write;
            if (bVar.RatingCompat == null) {
                z13 = false;
            }
            if (z13) {
                iconCompatParcelizer2.IconCompatParcelizer(bVar.RatingCompat);
            }
        } else if (bVar.write != null) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = AppStatsDataStore.C3032b.ParcelableVolumeInfo.write;
            if (bVar.RatingCompat == null) {
                z13 = false;
            }
            if (z13) {
                iconCompatParcelizer3.IconCompatParcelizer(bVar.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = C3034x420047fd.read;
            if (bVar.RatingCompat == null) {
                z13 = false;
            }
            if (z13) {
                iconCompatParcelizer4.IconCompatParcelizer(bVar.RatingCompat);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002 && i2 == -1 && intent != null) {
            addDelayedShutdownHook adddelayedshutdownhook = (addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY");
            AppStatsDataStore.C3032b bVar = this.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bVar.MediaBrowserCompat$MediaItem = adddelayedshutdownhook;
            writeUInt64NoTag.IconCompatParcelizer appStatsDataStore$b$MediaSessionCompat$Token = new AppStatsDataStore$b$MediaSessionCompat$Token(bVar);
            if (bVar.RatingCompat != null) {
                appStatsDataStore$b$MediaSessionCompat$Token.IconCompatParcelizer(bVar.RatingCompat);
            }
            this.PlaybackStateCompat = true;
            this.IconCompatParcelizer = true;
            this.f3093x50fd9e4a = true;
            this.MediaSessionCompat$ResultReceiverWrapper = true;
            AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    @OnClick
    public void onSelectProvinceClick() {
        AppStatsDataStore.C3032b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = AppStatsDataStore.C3032b.MediaDescriptionCompat.IconCompatParcelizer;
        if (bVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(bVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaBrowserCompat$SearchResultReceiver(boolean z) {
        this.Keep = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaDescriptionCompat(boolean z) {
        this.setHasDecor = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaMetadataCompat(boolean z) {
        this.ParcelableVolumeInfo = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void RatingCompat(boolean z) {
        this.MediaSessionCompat$QueueItem = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaBrowserCompat$MediaItem(boolean z) {
        this.MediaMetadataCompat = z;
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void read(String str, String str2, String str3, String str4, addDelayedShutdownHook adddelayedshutdownhook) {
        onGetStartedClick.write((Object) str, "subDistrictLabel");
        onGetStartedClick.write((Object) str2, "districtLabel");
        onGetStartedClick.write((Object) str3, "provinceLabel");
        onGetStartedClick.write((Object) str4, "postalCodeLabel");
        onGetStartedClick.write((Object) adddelayedshutdownhook, "subDistrictDisplay");
        TextView textView = this.subDistrictLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subDistrictLabel");
        }
        textView.setText(str);
        TextView textView2 = this.districtLabel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("districtLabel");
        }
        textView2.setText(str2);
        TextView textView3 = this.provinceLabel;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("provinceLabel");
        }
        textView3.setText(str3);
        TextView textView4 = this.postalCodeLabel;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("postalCodeLabel");
        }
        textView4.setText(str4);
        this.PlaybackStateCompat$CustomAction = adddelayedshutdownhook;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaSessionCompat$Token = str;
    }

    public final void write(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "houseNo");
        onGetStartedClick.write((Object) str2, "floor");
        onGetStartedClick.write((Object) str3, "village");
        CustomAddressInput customAddressInput = this.houseNo;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        customAddressInput.setTextValue(str);
        boolean z = false;
        this.MediaMetadataCompat = str.length() > 0;
        CustomAddressInput customAddressInput2 = this.floor;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput2.setTextValue(str2);
        this.MediaBrowserCompat$SearchResultReceiver = str2.length() > 0;
        if (str3.length() > 0) {
            z = true;
        }
        this.Keep = z;
        CustomAddressInput customAddressInput3 = this.village;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput3.setTextValue(str3);
        this.AlertController$RecycleListView = true;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "unit");
        onGetStartedClick.write((Object) str2, "moo");
        onGetStartedClick.write((Object) str3, "road");
        onGetStartedClick.write((Object) str4, "alley");
        boolean z = true;
        this.setHasDecor = str.length() > 0;
        this.ParcelableVolumeInfo = str2.length() > 0;
        this.MediaSessionCompat$QueueItem = str3.length() > 0;
        if (str4.length() <= 0) {
            z = false;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        CustomAddressInput customAddressInput = this.unit;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput.setTextValue(str);
        CustomAddressInput customAddressInput2 = this.moo;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput2.setTextValue(str2);
        CustomAddressInput customAddressInput3 = this.road;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput3.setTextValue(str3);
        CustomAddressInput customAddressInput4 = this.alley;
        if (customAddressInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput4.setTextValue(str4);
    }

    public final void write(boolean z, boolean z2) {
        if (z2) {
            CustomAddressInput customAddressInput = this.village;
            if (customAddressInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
            }
            customAddressInput.MediaBrowserCompat$CustomActionResultReceiver(this.Keep);
            CustomAddressInput customAddressInput2 = this.moo;
            if (customAddressInput2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
            }
            customAddressInput2.MediaBrowserCompat$CustomActionResultReceiver(z);
            CustomAddressInput customAddressInput3 = this.alley;
            if (customAddressInput3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
            }
            customAddressInput3.MediaBrowserCompat$CustomActionResultReceiver(z);
            CustomAddressInput customAddressInput4 = this.road;
            if (customAddressInput4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
            }
            customAddressInput4.MediaBrowserCompat$CustomActionResultReceiver(z);
            return;
        }
        CustomAddressInput customAddressInput5 = this.unit;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput5.MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor);
        CustomAddressInput customAddressInput6 = this.village;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput6.MediaBrowserCompat$CustomActionResultReceiver(this.Keep);
        CustomAddressInput customAddressInput7 = this.floor;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput7.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver);
        CustomAddressInput customAddressInput8 = this.moo;
        if (customAddressInput8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput8.MediaBrowserCompat$CustomActionResultReceiver(z);
        CustomAddressInput customAddressInput9 = this.alley;
        if (customAddressInput9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput9.MediaBrowserCompat$CustomActionResultReceiver(z);
        CustomAddressInput customAddressInput10 = this.road;
        if (customAddressInput10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput10.MediaBrowserCompat$CustomActionResultReceiver(z);
    }

    public final void read(boolean z) {
        if (z) {
            CustomAddressInput customAddressInput = this.village;
            if (customAddressInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
            }
            customAddressInput.errorInline.setVisibility(8);
            customAddressInput.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput.getContext(), R.drawable.shape_gray_rounded_rectangle));
            CustomAddressInput customAddressInput2 = this.moo;
            if (customAddressInput2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
            }
            customAddressInput2.errorInline.setVisibility(8);
            customAddressInput2.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput2.getContext(), R.drawable.shape_gray_rounded_rectangle));
            CustomAddressInput customAddressInput3 = this.alley;
            if (customAddressInput3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
            }
            customAddressInput3.errorInline.setVisibility(8);
            customAddressInput3.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput3.getContext(), R.drawable.shape_gray_rounded_rectangle));
            CustomAddressInput customAddressInput4 = this.road;
            if (customAddressInput4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
            }
            customAddressInput4.errorInline.setVisibility(8);
            customAddressInput4.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput4.getContext(), R.drawable.shape_gray_rounded_rectangle));
            return;
        }
        CustomAddressInput customAddressInput5 = this.unit;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput5.errorInline.setVisibility(8);
        customAddressInput5.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput5.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput6 = this.floor;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput6.errorInline.setVisibility(8);
        customAddressInput6.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput6.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput7 = this.village;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput7.errorInline.setVisibility(8);
        customAddressInput7.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput7.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput8 = this.moo;
        if (customAddressInput8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput8.errorInline.setVisibility(8);
        customAddressInput8.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput8.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput9 = this.alley;
        if (customAddressInput9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput9.errorInline.setVisibility(8);
        customAddressInput9.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput9.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput10 = this.road;
        if (customAddressInput10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput10.errorInline.setVisibility(8);
        customAddressInput10.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput10.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public final void write(boolean z) {
        if (!z) {
            CustomAddressInput customAddressInput = this.floor;
            if (customAddressInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
            }
            customAddressInput.inputTextField.removeTextChangedListener(customAddressInput);
            customAddressInput.inputTextField.setText("");
            CustomAddressInput customAddressInput2 = this.unit;
            if (customAddressInput2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
            }
            customAddressInput2.inputTextField.removeTextChangedListener(customAddressInput2);
            customAddressInput2.inputTextField.setText("");
            CustomAddressInput customAddressInput3 = this.village;
            if (customAddressInput3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
            }
            customAddressInput3.inputTextField.removeTextChangedListener(customAddressInput3);
            customAddressInput3.inputTextField.setText("");
            CustomAddressInput customAddressInput4 = this.moo;
            if (customAddressInput4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
            }
            customAddressInput4.inputTextField.removeTextChangedListener(customAddressInput4);
            customAddressInput4.inputTextField.setText("");
            CustomAddressInput customAddressInput5 = this.alley;
            if (customAddressInput5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
            }
            customAddressInput5.inputTextField.removeTextChangedListener(customAddressInput5);
            customAddressInput5.inputTextField.setText("");
            CustomAddressInput customAddressInput6 = this.road;
            if (customAddressInput6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
            }
            customAddressInput6.inputTextField.removeTextChangedListener(customAddressInput6);
            customAddressInput6.inputTextField.setText("");
        }
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaSessionCompat$QueueItem() {
        LinearLayout linearLayout = this.typeOfAddressLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("typeOfAddressLayout");
        }
        linearLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(false);
    }

    public final void write() {
        Button button = this.confirmButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button.setEnabled(false);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(true);
        Button button2 = this.nextButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button2.setVisibility(0);
        Button button3 = this.confirmButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button3.setVisibility(8);
    }

    public final void MediaBrowserCompat$MediaItem() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setVisibility(8);
        Button button2 = this.confirmButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button2.setEnabled(true);
        Button button3 = this.confirmButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button3.setVisibility(0);
    }

    public final void read() {
        RelativeLayout relativeLayout = this.selectProvince;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectProvince");
        }
        relativeLayout.setClickable(false);
        RelativeLayout relativeLayout2 = this.selectProvince;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectProvince");
        }
        relativeLayout2.setEnabled(false);
        Context context = getContext();
        if (context != null) {
            RelativeLayout relativeLayout3 = this.selectProvince;
            if (relativeLayout3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectProvince");
            }
            relativeLayout3.setBackground(setLastBaselineToBottomHeight.write(context, R.drawable.bg_rounded_rectangle_border_enable_state));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            CustomAddressInput customAddressInput = this.houseNo;
            if (customAddressInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
            }
            customAddressInput.IconCompatParcelizer();
            CustomAddressInput customAddressInput2 = this.moo;
            if (customAddressInput2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
            }
            customAddressInput2.IconCompatParcelizer();
            CustomAddressInput customAddressInput3 = this.road;
            if (customAddressInput3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
            }
            customAddressInput3.IconCompatParcelizer();
            CustomAddressInput customAddressInput4 = this.floor;
            if (customAddressInput4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
            }
            customAddressInput4.IconCompatParcelizer();
            CustomAddressInput customAddressInput5 = this.unit;
            if (customAddressInput5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
            }
            customAddressInput5.IconCompatParcelizer();
            CustomAddressInput customAddressInput6 = this.village;
            if (customAddressInput6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
            }
            customAddressInput6.IconCompatParcelizer();
            CustomAddressInput customAddressInput7 = this.alley;
            if (customAddressInput7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
            }
            customAddressInput7.IconCompatParcelizer();
            return;
        }
        CustomAddressInput customAddressInput8 = this.houseNo;
        if (customAddressInput8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        customAddressInput8.MediaBrowserCompat$CustomActionResultReceiver();
        CustomAddressInput customAddressInput9 = this.moo;
        if (customAddressInput9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput9.MediaBrowserCompat$CustomActionResultReceiver();
        CustomAddressInput customAddressInput10 = this.road;
        if (customAddressInput10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput10.MediaBrowserCompat$CustomActionResultReceiver();
        CustomAddressInput customAddressInput11 = this.alley;
        if (customAddressInput11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput11.MediaBrowserCompat$CustomActionResultReceiver();
        CustomAddressInput customAddressInput12 = this.floor;
        if (customAddressInput12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput12.write();
        CustomAddressInput customAddressInput13 = this.unit;
        if (customAddressInput13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput13.write();
        CustomAddressInput customAddressInput14 = this.village;
        if (customAddressInput14 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput14.write();
    }

    public final void IconCompatParcelizer() {
        CustomAddressInput customAddressInput = this.houseNo;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        customAddressInput.write();
        CustomAddressInput customAddressInput2 = this.moo;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        customAddressInput2.write();
        CustomAddressInput customAddressInput3 = this.road;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        customAddressInput3.write();
        CustomAddressInput customAddressInput4 = this.floor;
        if (customAddressInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput4.write();
        CustomAddressInput customAddressInput5 = this.unit;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput5.write();
        CustomAddressInput customAddressInput6 = this.village;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        customAddressInput6.write();
        CustomAddressInput customAddressInput7 = this.alley;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        customAddressInput7.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomAddressInput customAddressInput = this.unit;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        customAddressInput.setReadOnly(Boolean.TRUE);
        CustomAddressInput customAddressInput2 = this.floor;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        customAddressInput2.setReadOnly(Boolean.TRUE);
    }

    public final void MediaMetadataCompat() {
        Intent read2 = AddressSearchActivity.read(requireContext(), this.MediaDescriptionCompat);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read2 = setTapText.write(activity, read2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(BaseMailingAddressFragment baseMailingAddressFragment, boolean z) {
        if (!z) {
            AppStatsDataStore.C3032b bVar = baseMailingAddressFragment.presenter;
            if (bVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bVar.MediaBrowserCompat$ItemReceiver(baseMailingAddressFragment.setHasDecor, baseMailingAddressFragment.MediaBrowserCompat$SearchResultReceiver, baseMailingAddressFragment.ParcelableVolumeInfo, baseMailingAddressFragment.MediaBrowserCompat$CustomActionResultReceiver, baseMailingAddressFragment.MediaSessionCompat$QueueItem);
        }
    }
}
