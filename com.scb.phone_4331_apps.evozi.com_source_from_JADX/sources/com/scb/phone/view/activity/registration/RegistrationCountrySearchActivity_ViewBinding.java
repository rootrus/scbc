package com.scb.phone.view.activity.registration;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ClearableEditText;
import p040o.onStart;

public final class RegistrationCountrySearchActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RegistrationCountrySearchActivity IconCompatParcelizer;

    public RegistrationCountrySearchActivity_ViewBinding(RegistrationCountrySearchActivity registrationCountrySearchActivity, View view) {
        super(registrationCountrySearchActivity, view);
        this.IconCompatParcelizer = registrationCountrySearchActivity;
        registrationCountrySearchActivity.countrySearchEditText = (ClearableEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_country_search, "field 'countrySearchEditText'", ClearableEditText.class);
        registrationCountrySearchActivity.countryRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_country, "field 'countryRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        RegistrationCountrySearchActivity registrationCountrySearchActivity = this.IconCompatParcelizer;
        if (registrationCountrySearchActivity != null) {
            this.IconCompatParcelizer = null;
            registrationCountrySearchActivity.countrySearchEditText = null;
            registrationCountrySearchActivity.countryRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
