package com.scb.phone.view.fragment.findus;

import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.findus.SelectProvinceOrDistrictActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C1434x826de606;
import p040o.CheckExtractor_MembersInjector;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkModule_ContributeScanCameraDeepLinkActivity;
import p040o.DeepLinkModule_ContributeScbDeepLinkActivity;
import p040o.DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity;
import p040o.DeepLinkModule_EasycashDeepLinkActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.ensureFileArrayNotNull;
import p040o.getOversizeImage;
import p040o.isSupportFragmentClass;
import p040o.onCheckBoxClick;
import p040o.rsnAllocationSyncAll;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.show;
import p040o.writePngImage;

public abstract class BaseMapTabFragment extends BaseFragment implements CheckExtractor_MembersInjector.IconCompatParcelizer, OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, rsnAllocationSyncAll.write<ensureFileArrayNotNull> {
    private Location AlertController$RecycleListView;
    protected String IconCompatParcelizer;
    private double Keep;
    /* access modifiers changed from: private */
    public BitmapDescriptor MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private double MediaBrowserCompat$SearchResultReceiver = -99.0d;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private rsnAllocationSyncAll<ensureFileArrayNotNull> f3083x50fd9e4a;
    private double MediaDescriptionCompat = -189.0d;
    private boolean MediaMetadataCompat = false;
    private BulkTransferDeepLinkActivity MediaSessionCompat$QueueItem;
    private GoogleMap MediaSessionCompat$ResultReceiverWrapper;
    private GoogleApiClient MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private int PlaybackStateCompat = 0;
    private LocationManager PlaybackStateCompat$CustomAction;
    private long RatingCompat = 0;
    @BindView
    protected DefaultButton mCallButton;
    @BindView
    protected TextView mDistrict;
    @BindView
    protected RelativeLayout mInfoLayout;
    @BindView
    protected MapView mMapView;
    @BindView
    protected TextView mMarkerAddress;
    @BindView
    protected TextView mMarkerName;
    @BindView
    protected TextView mMarkerOpenHour;
    @BindView
    protected TextView mMarkerPhone;
    @BindView
    protected FloatingActionButton mMyLocationButton;
    @BindView
    protected TextView mProvince;
    @BindView
    protected FloatingActionButton mSearchButton;
    @BindView
    protected RelativeLayout mSearchLayout;
    @HmlPinActivity
    public writePngImage mapTabPresenter;
    private double setHasDecor;

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public void onConnectionSuspended(int i) {
    }

    public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(IdCaptureBackActivity_MembersInjector idCaptureBackActivity_MembersInjector) {
        ensureFileArrayNotNull ensurefilearraynotnull = (ensureFileArrayNotNull) idCaptureBackActivity_MembersInjector;
        IconCompatParcelizer(new LatLng(ensurefilearraynotnull.MediaBrowserCompat$CustomActionResultReceiver, ensurefilearraynotnull.MediaBrowserCompat$ItemReceiver));
        if (!TextUtils.isEmpty(ensurefilearraynotnull.read)) {
            this.mMarkerName.setText(String.format(getString(R.string.marker_title_value), new Object[]{ensurefilearraynotnull.MediaMetadataCompat, ensurefilearraynotnull.read}));
        } else {
            this.mMarkerName.setText(ensurefilearraynotnull.MediaMetadataCompat);
        }
        this.mMarkerAddress.setText(ensurefilearraynotnull.IconCompatParcelizer);
        if (ensurefilearraynotnull.MediaDescriptionCompat == null || !ensurefilearraynotnull.MediaDescriptionCompat.isEmpty()) {
            this.mMarkerOpenHour.setText(ensurefilearraynotnull.MediaDescriptionCompat);
        }
        if (ensurefilearraynotnull.MediaBrowserCompat$MediaItem == null || !ensurefilearraynotnull.MediaBrowserCompat$MediaItem.isEmpty()) {
            this.mMarkerPhone.setText(ensurefilearraynotnull.MediaBrowserCompat$MediaItem);
        }
        RelativeLayout relativeLayout = this.mInfoLayout;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f64172130771984);
        loadAnimation.setDuration(300);
        relativeLayout.startAnimation(loadAnimation);
        relativeLayout.setVisibility(0);
        this.mCallButton.setVisibility("ATM".equals(this.IconCompatParcelizer) ? 8 : 0);
        this.mSearchLayout.setVisibility(8);
        this.mMyLocationButton.setVisibility(8);
        this.mSearchButton.setVisibility(8);
        this.Keep = ensurefilearraynotnull.MediaBrowserCompat$CustomActionResultReceiver;
        this.setHasDecor = ensurefilearraynotnull.MediaBrowserCompat$ItemReceiver;
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LocationManager locationManager = (LocationManager) getContext().getSystemService("location");
        this.PlaybackStateCompat$CustomAction = locationManager;
        boolean z = false;
        this.ParcelableVolumeInfo = locationManager != null && locationManager.isProviderEnabled("gps");
        LocationManager locationManager2 = this.PlaybackStateCompat$CustomAction;
        if (locationManager2 != null && locationManager2.isProviderEnabled("gps")) {
            z = true;
        }
        if (!z) {
            this.PlaybackStateCompat = 1;
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.gps_disabled), getOversizeImage.ERROR);
        }
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onCreate(bundle);
            if (getUserVisibleHint()) {
                this.mMapView.getMapAsync(this);
            }
        }
        this.MediaSessionCompat$QueueItem = DebitCardResetOtpActivity.interval(5, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new DeepLinkModule_ContributeScbDeepLinkActivity(this), DeepLinkModule_EasycashDeepLinkActivity.write);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_UPDATE_SELECTED_ITEM")).subscribe(new DeepLinkModule_ContributeScanCameraDeepLinkActivity(this), DeepLinkModule_EasycashDeepLinkActivity.write);
    }

    public void setUserVisibleHint(boolean z) {
        MapView mapView;
        super.setUserVisibleHint(z);
        if (z && (mapView = this.mMapView) != null && !this.MediaBrowserCompat$MediaItem) {
            mapView.getMapAsync(this);
        }
    }

    public void onResume() {
        super.onResume();
        boolean z = false;
        this.MediaMetadataCompat = false;
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onResume();
        }
        LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
        if (locationManager != null && locationManager.isProviderEnabled("gps")) {
            z = true;
        }
        if (!z) {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.gps_disabled), getOversizeImage.ERROR);
        }
    }

    public void onPause() {
        super.onPause();
        this.MediaMetadataCompat = true;
    }

    public void onDestroy() {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onDestroy();
        }
        GoogleApiClient googleApiClient = this.MediaSessionCompat$Token;
        if (googleApiClient != null && googleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(this.MediaSessionCompat$Token, (LocationListener) this);
        }
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaSessionCompat$QueueItem;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaSessionCompat$QueueItem.dispose();
        }
        writePngImage writepngimage = this.mapTabPresenter;
        if (writepngimage != null) {
            writepngimage.onDestroy();
        }
        super.onDestroy();
    }

    public void onLowMemory() {
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onLowMemory();
        }
        super.onLowMemory();
    }

    public void onMapReady(GoogleMap googleMap) {
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.fromResource("Branch".equals(this.IconCompatParcelizer) ? R.drawable.ic_pin_branch : R.drawable.ic_pin_atm);
        this.MediaSessionCompat$ResultReceiverWrapper = googleMap;
        rsnAllocationSyncAll<ensureFileArrayNotNull> rsnallocationsyncall = new rsnAllocationSyncAll<>(getContext(), this.MediaSessionCompat$ResultReceiverWrapper);
        this.f3083x50fd9e4a = rsnallocationsyncall;
        BaseMapTabFragment$MediaBrowserCompat$ItemReceiver baseMapTabFragment$MediaBrowserCompat$ItemReceiver = new BaseMapTabFragment$MediaBrowserCompat$ItemReceiver(this, getContext(), this.MediaSessionCompat$ResultReceiverWrapper, this.f3083x50fd9e4a);
        rsnallocationsyncall.RatingCompat.IconCompatParcelizer((rsnAllocationSyncAll.read) null);
        rsnallocationsyncall.RatingCompat.MediaBrowserCompat$ItemReceiver((rsnAllocationSyncAll.write) null);
        rsnallocationsyncall.MediaBrowserCompat$CustomActionResultReceiver.write();
        rsnallocationsyncall.MediaBrowserCompat$ItemReceiver.write();
        rsnallocationsyncall.RatingCompat.read();
        rsnallocationsyncall.RatingCompat = baseMapTabFragment$MediaBrowserCompat$ItemReceiver;
        baseMapTabFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        rsnallocationsyncall.RatingCompat.IconCompatParcelizer((rsnAllocationSyncAll.read) null);
        rsnallocationsyncall.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver((C1434x826de606) null);
        rsnallocationsyncall.RatingCompat.MediaBrowserCompat$ItemReceiver(rsnallocationsyncall.MediaDescriptionCompat);
        rsnallocationsyncall.RatingCompat.MediaBrowserCompat$ItemReceiver((rsnAllocationSyncAll.IconCompatParcelizer) null);
        rsnallocationsyncall.MediaBrowserCompat$CustomActionResultReceiver();
        rsnAllocationSyncAll<ensureFileArrayNotNull> rsnallocationsyncall2 = this.f3083x50fd9e4a;
        rsnallocationsyncall2.MediaDescriptionCompat = this;
        rsnallocationsyncall2.RatingCompat.MediaBrowserCompat$ItemReceiver(this);
        this.MediaSessionCompat$ResultReceiverWrapper.getUiSettings().setMyLocationButtonEnabled(false);
        this.MediaSessionCompat$ResultReceiverWrapper.getUiSettings().setMapToolbarEnabled(false);
        this.MediaSessionCompat$ResultReceiverWrapper.setOnMarkerClickListener(this.f3083x50fd9e4a);
        this.MediaSessionCompat$ResultReceiverWrapper.setOnCameraIdleListener(this.f3083x50fd9e4a);
        DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    private void MediaDescriptionCompat() {
        if (this.AlertController$RecycleListView != null) {
            LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
            if (locationManager != null && locationManager.isProviderEnabled("gps")) {
                IconCompatParcelizer(new LatLng(this.AlertController$RecycleListView.getLatitude(), this.AlertController$RecycleListView.getLongitude()));
                return;
            }
        }
        IconCompatParcelizer(new LatLng(13.75d, 100.5d));
    }

    private void IconCompatParcelizer(LatLng latLng) {
        LatLng latLng2 = latLng;
        int i = this.PlaybackStateCompat;
        if (i < 2) {
            this.PlaybackStateCompat = i + 1;
            this.MediaSessionCompat$ResultReceiverWrapper.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng2, 15.0f));
            if (this.AlertController$RecycleListView != null) {
                writePngImage writepngimage = this.mapTabPresenter;
                double d = latLng2.latitude;
                double d2 = latLng2.longitude;
                double latitude = this.AlertController$RecycleListView.getLatitude();
                double longitude = this.AlertController$RecycleListView.getLongitude();
                String str = this.IconCompatParcelizer;
                LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
                writepngimage.write(d, d2, latitude, longitude, str, locationManager != null && locationManager.isProviderEnabled("gps"));
                return;
            }
            writePngImage writepngimage2 = this.mapTabPresenter;
            double d3 = latLng2.latitude;
            double d4 = latLng2.longitude;
            String str2 = this.IconCompatParcelizer;
            LocationManager locationManager2 = this.PlaybackStateCompat$CustomAction;
            writepngimage2.write(d3, d4, -99.0d, -189.0d, str2, locationManager2 != null && locationManager2.isProviderEnabled("gps"));
        }
    }

    private void IconCompatParcelizer(String str) {
        Intent intent = new Intent(getContext(), SelectProvinceOrDistrictActivity.class);
        if (str == null) {
            str = "";
        }
        intent.putExtra("PROVINCE_NAME", str);
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
    }

    /* JADX INFO: finally extract failed */
    public final void write(List<ensureFileArrayNotNull> list) {
        GoogleMap googleMap = this.MediaSessionCompat$ResultReceiverWrapper;
        if (googleMap != null && this.f3083x50fd9e4a != null) {
            googleMap.clear();
            rsnAllocationSyncAll<ensureFileArrayNotNull> rsnallocationsyncall = this.f3083x50fd9e4a;
            rsnallocationsyncall.write.writeLock().lock();
            try {
                rsnallocationsyncall.read.read();
                rsnallocationsyncall.write.writeLock().unlock();
                rsnAllocationSyncAll<ensureFileArrayNotNull> rsnallocationsyncall2 = this.f3083x50fd9e4a;
                rsnallocationsyncall2.write.writeLock().lock();
                try {
                    rsnallocationsyncall2.read.IconCompatParcelizer(list);
                    rsnallocationsyncall2.write.writeLock().unlock();
                    this.f3083x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver();
                } catch (Throwable th) {
                    rsnallocationsyncall2.write.writeLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                rsnallocationsyncall.write.writeLock().unlock();
                throw th2;
            }
        }
    }

    public void onLocationChanged(Location location) {
        this.AlertController$RecycleListView = location;
        MediaDescriptionCompat();
    }

    private void MediaMetadataCompat() {
        synchronized (this) {
            if (this.MediaSessionCompat$Token != null && this.MediaSessionCompat$Token.isConnected()) {
                LocationServices.FusedLocationApi.removeLocationUpdates(this.MediaSessionCompat$Token, (LocationListener) this);
            }
            GoogleApiClient build = new GoogleApiClient.Builder(getContext()).addConnectionCallbacks(this).addOnConnectionFailedListener(this).addApi(LocationServices.API).build();
            this.MediaSessionCompat$Token = build;
            if (!build.isConnecting()) {
                this.MediaSessionCompat$Token.connect();
            }
        }
    }

    public void onConnected(Bundle bundle) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(5000);
        locationRequest.setFastestInterval(5000);
        locationRequest.setPriority(100);
        try {
            LocationServices.FusedLocationApi.requestLocationUpdates(this.MediaSessionCompat$Token, locationRequest, (LocationListener) this);
        } catch (SecurityException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "requestPermission exception", new Object[0]);
        } catch (IllegalStateException e2) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e2, "GoogleApi not connected exception", new Object[0]);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        DeepLinkModule_CreditCardServiceDefaultCardDeepLinkActivity.IconCompatParcelizer(this, i, iArr);
    }

    public final void write() {
        if (getUserVisibleHint()) {
            MediaDescriptionCompat();
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.permission_location_denied), getOversizeImage.ERROR);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getUserVisibleHint()) {
            MediaDescriptionCompat();
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.permission_location_never_ask_again), getOversizeImage.ERROR);
        }
    }

    public final void IconCompatParcelizer() {
        boolean z = this.ParcelableVolumeInfo;
        LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
        if (z != (locationManager != null && locationManager.isProviderEnabled("gps")) && getUserVisibleHint()) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("gps status changed...", new Object[0]);
            LocationManager locationManager2 = this.PlaybackStateCompat$CustomAction;
            this.ParcelableVolumeInfo = locationManager2 != null && locationManager2.isProviderEnabled("gps");
            if (getUserVisibleHint() && this.mMapView != null) {
                this.MediaBrowserCompat$MediaItem = false;
                LocationManager locationManager3 = this.PlaybackStateCompat$CustomAction;
                if (locationManager3 != null && locationManager3.isProviderEnabled("gps")) {
                    this.PlaybackStateCompat = 0;
                } else {
                    this.PlaybackStateCompat = 1;
                }
                this.mMapView.getMapAsync(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSearchFloatingButtonClick() {
        RelativeLayout relativeLayout = this.mSearchLayout;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f64172130771984);
        loadAnimation.setDuration(300);
        relativeLayout.startAnimation(loadAnimation);
        relativeLayout.setVisibility(0);
        this.mInfoLayout.setVisibility(8);
        this.mMyLocationButton.setVisibility(8);
        this.mSearchButton.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onProvinceClick() {
        IconCompatParcelizer((String) null);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDistrictClick() {
        if (getString(R.string.province_place_holder).equals(this.mProvince.getText().toString()) || this.mProvince.getText().toString().isEmpty()) {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.province_place_holder), getOversizeImage.ERROR);
        } else {
            IconCompatParcelizer(this.mProvince.getText() != null ? this.mProvince.getText().toString() : "");
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSearchCloseClick() {
        if (SystemClock.elapsedRealtime() - this.RatingCompat >= 300) {
            this.RatingCompat = SystemClock.elapsedRealtime();
            RelativeLayout relativeLayout = this.mSearchLayout;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f64152130771982);
            loadAnimation.setDuration(300);
            relativeLayout.startAnimation(loadAnimation);
            relativeLayout.setVisibility(8);
            this.mMyLocationButton.setVisibility(0);
            this.mSearchButton.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onInfoCloseClick() {
        if (SystemClock.elapsedRealtime() - this.RatingCompat >= 300) {
            this.RatingCompat = SystemClock.elapsedRealtime();
            RelativeLayout relativeLayout = this.mInfoLayout;
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.f64152130771982);
            loadAnimation.setDuration(300);
            relativeLayout.startAnimation(loadAnimation);
            relativeLayout.setVisibility(8);
            this.mMyLocationButton.setVisibility(0);
            this.mSearchButton.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSearchButtonClick() {
        if (this.MediaBrowserCompat$SearchResultReceiver == -99.0d || this.MediaDescriptionCompat == -189.0d) {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.invalid_lat_long), getOversizeImage.ERROR);
            return;
        }
        onSearchCloseClick();
        this.PlaybackStateCompat = 1;
        IconCompatParcelizer(new LatLng(this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDirectionButtonClicked() {
        if (this.AlertController$RecycleListView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://maps.google.com/maps?f=d&hl=en&saddr=");
            sb.append(this.AlertController$RecycleListView.getLatitude());
            sb.append(",");
            sb.append(this.AlertController$RecycleListView.getLongitude());
            sb.append("&daddr=");
            sb.append(this.Keep);
            sb.append(",");
            sb.append(this.setHasDecor);
            Intent createChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())), "Select an application");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    createChooser = setTapText.write(activity, createChooser).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(createChooser.getData());
                sb2.append("\n with context ");
                sb2.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb2.toString());
                startActivity(createChooser);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.gps_initializing), getOversizeImage.ERROR);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, getOversizeImage getoversizeimage) {
        FragmentActivity activity = getActivity();
        if (activity != null && getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.find_us_container_view, str, getoversizeimage);
        }
    }

    public static /* synthetic */ void read(BaseMapTabFragment baseMapTabFragment, Intent intent) {
        if (intent != null) {
            baseMapTabFragment.mProvince.setText(intent.getStringExtra("PROVINCE_NAME"));
            baseMapTabFragment.mDistrict.setText(intent.getStringExtra("DISTRICT_NAME"));
            baseMapTabFragment.MediaBrowserCompat$SearchResultReceiver = intent.getDoubleExtra("DISTRICT_LAT", -99.0d);
            baseMapTabFragment.MediaDescriptionCompat = intent.getDoubleExtra("DISTRICT_LON", -189.0d);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onCallButtonClicked() {
        String str;
        isSupportFragmentClass issupportfragmentclass;
        String charSequence = this.mMarkerPhone.getText().toString();
        if (!TextUtils.isEmpty(charSequence)) {
            if (charSequence.contains(",")) {
                show IconCompatParcelizer2 = show.IconCompatParcelizer((T[]) charSequence.split(","));
                if (IconCompatParcelizer2.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(IconCompatParcelizer2.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (issupportfragmentclass.IconCompatParcelizer != null) {
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        charSequence = (String) t;
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                } else {
                    charSequence = "";
                }
            }
            str = charSequence.replaceAll("\\D+", "");
            if (str.length() > 9) {
                str = str.substring(0, 9);
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.marker_phone), getOversizeImage.ERROR);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(str.trim().replaceAll("-", ""));
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
        intent.addFlags(268435456);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb2.append(intent.getData());
            sb2.append("\n with context ");
            sb2.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb2.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        MediaBrowserCompat$CustomActionResultReceiver(access_2200.IconCompatParcelizer, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z = true;
        try {
            this.MediaBrowserCompat$MediaItem = true;
            this.MediaSessionCompat$ResultReceiverWrapper.setMyLocationEnabled(true);
            LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
            if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
                z = false;
            }
            if (!z) {
                if (!this.MediaMetadataCompat) {
                    MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.gps_disabled), getOversizeImage.ERROR);
                }
                MediaDescriptionCompat();
                return;
            }
            MediaMetadataCompat();
        } catch (SecurityException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "requestPermission exception", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onMyLocationClick() {
        LocationManager locationManager = this.PlaybackStateCompat$CustomAction;
        if (!(locationManager != null && locationManager.isProviderEnabled("gps"))) {
            MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.gps_disabled), getOversizeImage.ERROR);
            return;
        }
        this.PlaybackStateCompat = 1;
        MediaDescriptionCompat();
    }
}
