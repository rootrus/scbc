package com.scb.phone.view.custom.item;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemRevampSeparatorCustom_ViewBinding implements Unbinder {
    private ItemRevampSeparatorCustom IconCompatParcelizer;

    public ItemRevampSeparatorCustom_ViewBinding(ItemRevampSeparatorCustom itemRevampSeparatorCustom, View view) {
        this.IconCompatParcelizer = itemRevampSeparatorCustom;
        itemRevampSeparatorCustom.viewSeparator = onStart.IconCompatParcelizer(view, R.id.view_separator, "field 'viewSeparator'");
        itemRevampSeparatorCustom.viewFullSeparator = onStart.IconCompatParcelizer(view, R.id.view_full_separator, "field 'viewFullSeparator'");
    }

    public final void read() {
        ItemRevampSeparatorCustom itemRevampSeparatorCustom = this.IconCompatParcelizer;
        if (itemRevampSeparatorCustom != null) {
            this.IconCompatParcelizer = null;
            itemRevampSeparatorCustom.viewSeparator = null;
            itemRevampSeparatorCustom.viewFullSeparator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
