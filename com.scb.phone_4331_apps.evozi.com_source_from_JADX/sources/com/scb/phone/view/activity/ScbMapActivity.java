package com.scb.phone.view.activity;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import butterknife.BindView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.HistoryAdapter$GroupFooterViewHolder_ViewBinding;
import p040o.ServerBuilder;
import p040o.onGetStartedClick;

public abstract class ScbMapActivity extends BaseActivity implements OnMapReadyCallback, GoogleApiClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks {
    private Marker MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private GoogleApiClient MediaMetadataCompat;
    private GoogleMap MediaSessionCompat$Token;
    @BindView
    protected MapView mMapView;

    public abstract void IconCompatParcelizer(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding);

    public void onConnectionFailed(ConnectionResult connectionResult) {
        onGetStartedClick.write((Object) connectionResult, "result");
    }

    public abstract void setIcon();

    public abstract void setItemInvoker();

    public abstract void setMenu();

    /* access modifiers changed from: protected */
    public final MapView AppCompatDelegateImpl$ListMenuDecorView() {
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        return mapView;
    }

    public final GoogleMap MediaSessionCompat$QueueItem() {
        GoogleMap googleMap = this.MediaSessionCompat$Token;
        if (googleMap == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        return googleMap;
    }

    /* access modifiers changed from: protected */
    public final GoogleApiClient MediaSessionCompat$ResultReceiverWrapper() {
        GoogleApiClient googleApiClient = this.MediaMetadataCompat;
        if (googleApiClient == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleApiClient");
        }
        return googleApiClient;
    }

    public final Marker MediaSessionCompat$Token() {
        return this.MediaBrowserCompat$MediaItem;
    }

    /* access modifiers changed from: protected */
    public final boolean AppCompatActivity() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    /* access modifiers changed from: protected */
    public final void setUiOptions() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    /* access modifiers changed from: protected */
    public final boolean setContentView() {
        return this.MediaDescriptionCompat;
    }

    public void onMapReady(GoogleMap googleMap) {
        onGetStartedClick.write((Object) googleMap, "googleMap");
        this.MediaSessionCompat$Token = googleMap;
        if (googleMap == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        UiSettings uiSettings = googleMap.getUiSettings();
        onGetStartedClick.IconCompatParcelizer((Object) uiSettings, "mGoogleMap.uiSettings");
        uiSettings.setMyLocationButtonEnabled(false);
        GoogleMap googleMap2 = this.MediaSessionCompat$Token;
        if (googleMap2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        UiSettings uiSettings2 = googleMap2.getUiSettings();
        onGetStartedClick.IconCompatParcelizer((Object) uiSettings2, "mGoogleMap.uiSettings");
        uiSettings2.setMapToolbarEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final void setOverlayMode() {
        GoogleMap googleMap = this.MediaSessionCompat$Token;
        if (googleMap == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        googleMap.setMyLocationEnabled(true);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ServerBuilder.MediaBrowserCompat$ItemReceiver(this, i, iArr);
    }

    public final void IconCompatParcelizer(LatLng latLng) {
        onGetStartedClick.write((Object) latLng, "latLng");
        MediaBrowserCompat$ItemReceiver(latLng);
        GoogleMap googleMap = this.MediaSessionCompat$Token;
        if (googleMap == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 15.0f));
    }

    /* access modifiers changed from: protected */
    public final void write(LatLng latLng) {
        onGetStartedClick.write((Object) latLng, "latLng");
        MediaBrowserCompat$ItemReceiver(latLng);
        GoogleMap googleMap = this.MediaSessionCompat$Token;
        if (googleMap == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
        }
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
    }

    private void MediaBrowserCompat$ItemReceiver(LatLng latLng) {
        onGetStartedClick.write((Object) latLng, "latLng");
        Marker marker = this.MediaBrowserCompat$MediaItem;
        if (marker != null) {
            marker.remove();
        }
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            GoogleMap googleMap = this.MediaSessionCompat$Token;
            if (googleMap == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mGoogleMap");
            }
            this.MediaBrowserCompat$MediaItem = googleMap.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mw_pin)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13836x50fd9e4a() {
        GoogleApiClient build = new GoogleApiClient.Builder(this).addApi(Places.GEO_DATA_API).enableAutoManage(this, 0, this).addConnectionCallbacks(this).build();
        onGetStartedClick.IconCompatParcelizer((Object) build, "GoogleApiClient.Builder(…\n                .build()");
        this.MediaMetadataCompat = build;
    }

    public void onConnected(Bundle bundle) {
        setIcon();
    }

    public void onConnectionSuspended(int i) {
        setMenu();
    }

    protected static boolean MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public void onResume() {
        super.onResume();
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onResume();
    }

    public void onStart() {
        super.onStart();
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onStart();
    }

    public void onStop() {
        super.onStop();
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onStop();
    }

    public void onPause() {
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onPause();
        super.onPause();
    }

    public void onDestroy() {
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onDestroy();
        super.onDestroy();
    }

    public void onLowMemory() {
        super.onLowMemory();
        MapView mapView = this.mMapView;
        if (mapView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mMapView");
        }
        mapView.onLowMemory();
    }
}
