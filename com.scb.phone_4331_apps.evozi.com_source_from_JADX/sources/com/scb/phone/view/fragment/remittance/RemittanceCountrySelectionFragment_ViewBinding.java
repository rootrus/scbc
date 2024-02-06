package com.scb.phone.view.fragment.remittance;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceCountrySelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RemittanceCountrySelectionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private TextWatcher write;

    public RemittanceCountrySelectionFragment_ViewBinding(final RemittanceCountrySelectionFragment remittanceCountrySelectionFragment, View view) {
        super(remittanceCountrySelectionFragment, view);
        this.IconCompatParcelizer = remittanceCountrySelectionFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.et_country_list_search, "field 'etCountryListSearch', method 'onSearchEditAction', and method 'onSearchTextChanged'");
        remittanceCountrySelectionFragment.etCountryListSearch = (EditText) onStart.write(IconCompatParcelizer2, R.id.et_country_list_search, "field 'etCountryListSearch'", EditText.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        TextView textView = (TextView) IconCompatParcelizer2;
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return RemittanceCountrySelectionFragment.this.onSearchEditAction(i);
            }
        });
        C95043 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                RemittanceCountrySelectionFragment.this.onSearchTextChanged(charSequence);
            }
        };
        this.write = r0;
        textView.addTextChangedListener(r0);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.iv_clear, "field 'ivClear' and method 'onClearClicked'");
        remittanceCountrySelectionFragment.ivClear = (ImageView) onStart.write(IconCompatParcelizer3, R.id.iv_clear, "field 'ivClear'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceCountrySelectionFragment.this.onClearClicked();
            }
        });
        remittanceCountrySelectionFragment.rvCountryList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_country_list, "field 'rvCountryList'", RecyclerView.class);
        remittanceCountrySelectionFragment.errorView = onStart.IconCompatParcelizer(view, R.id.include_error, "field 'errorView'");
        remittanceCountrySelectionFragment.groupCountryList = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_country_list, "field 'groupCountryList'", Group.class);
    }

    public final void read() {
        RemittanceCountrySelectionFragment remittanceCountrySelectionFragment = this.IconCompatParcelizer;
        if (remittanceCountrySelectionFragment != null) {
            this.IconCompatParcelizer = null;
            remittanceCountrySelectionFragment.etCountryListSearch = null;
            remittanceCountrySelectionFragment.ivClear = null;
            remittanceCountrySelectionFragment.rvCountryList = null;
            remittanceCountrySelectionFragment.errorView = null;
            remittanceCountrySelectionFragment.groupCountryList = null;
            ((TextView) this.MediaBrowserCompat$CustomActionResultReceiver).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            ((TextView) this.MediaBrowserCompat$CustomActionResultReceiver).removeTextChangedListener(this.write);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
