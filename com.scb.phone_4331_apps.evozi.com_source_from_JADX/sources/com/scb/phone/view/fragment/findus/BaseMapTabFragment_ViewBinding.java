package com.scb.phone.view.fragment.findus;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseMapTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseMapTabFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View ParcelableVolumeInfo;
    private View RatingCompat;
    private View write;

    public BaseMapTabFragment_ViewBinding(final BaseMapTabFragment baseMapTabFragment, View view) {
        super(baseMapTabFragment, view);
        this.IconCompatParcelizer = baseMapTabFragment;
        baseMapTabFragment.mMapView = (MapView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.map_view, "field 'mMapView'", MapView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.my_location_floating_button, "field 'mMyLocationButton' and method 'onMyLocationClick'");
        baseMapTabFragment.mMyLocationButton = (FloatingActionButton) onStart.write(IconCompatParcelizer2, R.id.my_location_floating_button, "field 'mMyLocationButton'", FloatingActionButton.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onMyLocationClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.search_floating_button, "field 'mSearchButton' and method 'onSearchFloatingButtonClick'");
        baseMapTabFragment.mSearchButton = (FloatingActionButton) onStart.write(IconCompatParcelizer3, R.id.search_floating_button, "field 'mSearchButton'", FloatingActionButton.class);
        this.ParcelableVolumeInfo = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onSearchFloatingButtonClick();
            }
        });
        baseMapTabFragment.mSearchLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_layout, "field 'mSearchLayout'", RelativeLayout.class);
        baseMapTabFragment.mDistrict = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.district_text_view, "field 'mDistrict'", TextView.class);
        baseMapTabFragment.mProvince = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.province_text_view, "field 'mProvince'", TextView.class);
        baseMapTabFragment.mInfoLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.info_layout, "field 'mInfoLayout'", RelativeLayout.class);
        baseMapTabFragment.mMarkerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.marker_name, "field 'mMarkerName'", TextView.class);
        baseMapTabFragment.mMarkerAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.marker_address, "field 'mMarkerAddress'", TextView.class);
        baseMapTabFragment.mMarkerOpenHour = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.marker_openHour, "field 'mMarkerOpenHour'", TextView.class);
        baseMapTabFragment.mMarkerPhone = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.marker_phone, "field 'mMarkerPhone'", TextView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.call_button, "field 'mCallButton' and method 'onCallButtonClicked'");
        baseMapTabFragment.mCallButton = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.call_button, "field 'mCallButton'", DefaultButton.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onCallButtonClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.province_relative_layout, "method 'onProvinceClick'");
        this.MediaDescriptionCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onProvinceClick();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.district_relative_layout, "method 'onDistrictClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onDistrictClick();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.search_close_btn_relative_layout, "method 'onSearchCloseClick'");
        this.MediaMetadataCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onSearchCloseClick();
            }
        });
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.info_close_btn_relative_layout, "method 'onInfoCloseClick'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onInfoCloseClick();
            }
        });
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view, R.id.search_button, "method 'onSearchButtonClick'");
        this.RatingCompat = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onSearchButtonClick();
            }
        });
        View IconCompatParcelizer10 = onStart.IconCompatParcelizer(view, R.id.direction_button, "method 'onDirectionButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer10;
        IconCompatParcelizer10.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseMapTabFragment.this.onDirectionButtonClicked();
            }
        });
    }

    public void read() {
        BaseMapTabFragment baseMapTabFragment = this.IconCompatParcelizer;
        if (baseMapTabFragment != null) {
            this.IconCompatParcelizer = null;
            baseMapTabFragment.mMapView = null;
            baseMapTabFragment.mMyLocationButton = null;
            baseMapTabFragment.mSearchButton = null;
            baseMapTabFragment.mSearchLayout = null;
            baseMapTabFragment.mDistrict = null;
            baseMapTabFragment.mProvince = null;
            baseMapTabFragment.mInfoLayout = null;
            baseMapTabFragment.mMarkerName = null;
            baseMapTabFragment.mMarkerAddress = null;
            baseMapTabFragment.mMarkerOpenHour = null;
            baseMapTabFragment.mMarkerPhone = null;
            baseMapTabFragment.mCallButton = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.ParcelableVolumeInfo.setOnClickListener((View.OnClickListener) null);
            this.ParcelableVolumeInfo = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
