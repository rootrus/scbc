package com.scb.phone.view.activity.mwpartner;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.scb.phone.R;
import com.scb.phone.view.activity.ScbMapActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MwPinShopLocationActivity_ViewBinding extends ScbMapActivity_ViewBinding {
    private MwPinShopLocationActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private TextWatcher MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public MwPinShopLocationActivity_ViewBinding(final MwPinShopLocationActivity mwPinShopLocationActivity, View view) {
        super(mwPinShopLocationActivity, view);
        this.IconCompatParcelizer = mwPinShopLocationActivity;
        mwPinShopLocationActivity.layoutShopLocation = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_shop_location, "field 'layoutShopLocation'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.auto_complete_edit_text, "field 'autoCompleteEditText' and method 'handleTextChange'");
        mwPinShopLocationActivity.autoCompleteEditText = (EditText) onStart.write(IconCompatParcelizer2, R.id.auto_complete_edit_text, "field 'autoCompleteEditText'", EditText.class);
        this.write = IconCompatParcelizer2;
        C88521 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                MwPinShopLocationActivity.this.handleTextChange((Editable) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) charSequence, "onTextChanged", "handleTextChange", Editable.class));
            }
        };
        this.MediaBrowserCompat$ItemReceiver = r0;
        ((TextView) IconCompatParcelizer2).addTextChangedListener(r0);
        mwPinShopLocationActivity.layoutSearchResult = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_search_result, "field 'layoutSearchResult'", RelativeLayout.class);
        mwPinShopLocationActivity.rvItemSearchResult = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_item_search_result, "field 'rvItemSearchResult'", RecyclerView.class);
        mwPinShopLocationActivity.layoutNoResult = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_no_result, "field 'layoutNoResult'", LinearLayout.class);
        mwPinShopLocationActivity.layoutSearchEditText = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_search_edit_text, "field 'layoutSearchEditText'", RelativeLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ic_delete, "field 'btnDelete' and method 'clearAutoCompleteEditText'");
        mwPinShopLocationActivity.btnDelete = (ImageView) onStart.write(IconCompatParcelizer3, R.id.ic_delete, "field 'btnDelete'", ImageView.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.clearAutoCompleteEditText();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.my_location_floating_button, "field 'fabMyLocation' and method 'moveCameraToCurrentLocation'");
        mwPinShopLocationActivity.fabMyLocation = (FloatingActionButton) onStart.write(IconCompatParcelizer4, R.id.my_location_floating_button, "field 'fabMyLocation'", FloatingActionButton.class);
        this.RatingCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.moveCameraToCurrentLocation();
            }
        });
        mwPinShopLocationActivity.tvDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_description, "field 'tvDescription'", TextView.class);
        mwPinShopLocationActivity.layoutEditLocation = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_edit_location, "field 'layoutEditLocation'", LinearLayout.class);
        mwPinShopLocationActivity.layoutPinLocation = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_pin_location, "field 'layoutPinLocation'", LinearLayout.class);
        mwPinShopLocationActivity.tvNamePinLocation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name_pin_location, "field 'tvNamePinLocation'", TextView.class);
        mwPinShopLocationActivity.tvAddressPinLocation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address_pin_location, "field 'tvAddressPinLocation'", TextView.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.btn_delete_pin_location, "method 'showDialogDeletePinLocation'");
        this.MediaMetadataCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.showDialogDeletePinLocation();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.btn_edit_pin_location, "method 'editPinLocation'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.editPinLocation();
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view, R.id.btn_close_pin_location, "method 'closePinLocation'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.closePinLocation();
            }
        });
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view, R.id.btn_pin_location, "method 'confirmPinLocation'");
        this.MediaDescriptionCompat = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinShopLocationActivity.this.confirmPinLocation();
            }
        });
    }

    public final void read() {
        MwPinShopLocationActivity mwPinShopLocationActivity = this.IconCompatParcelizer;
        if (mwPinShopLocationActivity != null) {
            this.IconCompatParcelizer = null;
            mwPinShopLocationActivity.layoutShopLocation = null;
            mwPinShopLocationActivity.autoCompleteEditText = null;
            mwPinShopLocationActivity.layoutSearchResult = null;
            mwPinShopLocationActivity.rvItemSearchResult = null;
            mwPinShopLocationActivity.layoutNoResult = null;
            mwPinShopLocationActivity.layoutSearchEditText = null;
            mwPinShopLocationActivity.btnDelete = null;
            mwPinShopLocationActivity.fabMyLocation = null;
            mwPinShopLocationActivity.tvDescription = null;
            mwPinShopLocationActivity.layoutEditLocation = null;
            mwPinShopLocationActivity.layoutPinLocation = null;
            mwPinShopLocationActivity.tvNamePinLocation = null;
            mwPinShopLocationActivity.tvAddressPinLocation = null;
            ((TextView) this.write).removeTextChangedListener(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
