package com.scb.phone.view.fragment.address;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AddressSearchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private AddressSearchFragment write;

    public AddressSearchFragment_ViewBinding(final AddressSearchFragment addressSearchFragment, View view) {
        super(addressSearchFragment, view);
        this.write = addressSearchFragment;
        addressSearchFragment.tvAddressLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.address_label, "field 'tvAddressLabel'", TextView.class);
        addressSearchFragment.searchEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'searchEditText'", EditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "field 'searchClearButton' and method 'onClearButtonClick'");
        addressSearchFragment.searchClearButton = (ImageButton) onStart.write(IconCompatParcelizer, R.id.search_edit_clear, "field 'searchClearButton'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddressSearchFragment.this.onClearButtonClick();
            }
        });
        addressSearchFragment.recyclerViewAddress = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_address_result, "field 'recyclerViewAddress'", RecyclerView.class);
    }

    public final void read() {
        AddressSearchFragment addressSearchFragment = this.write;
        if (addressSearchFragment != null) {
            this.write = null;
            addressSearchFragment.tvAddressLabel = null;
            addressSearchFragment.searchEditText = null;
            addressSearchFragment.searchClearButton = null;
            addressSearchFragment.recyclerViewAddress = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
