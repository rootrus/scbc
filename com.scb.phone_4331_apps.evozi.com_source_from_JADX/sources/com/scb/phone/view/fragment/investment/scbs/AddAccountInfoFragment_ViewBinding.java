package com.scb.phone.view.fragment.investment.scbs;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AddAccountInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private AddAccountInfoFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public AddAccountInfoFragment_ViewBinding(final AddAccountInfoFragment addAccountInfoFragment, View view) {
        super(addAccountInfoFragment, view);
        this.IconCompatParcelizer = addAccountInfoFragment;
        addAccountInfoFragment.emptyIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_empty_icon, "field 'emptyIcon'", ImageView.class);
        addAccountInfoFragment.addIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_add_icon, "field 'addIcon'", ImageView.class);
        addAccountInfoFragment.textBody = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_text_body, "field 'textBody'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_add, "field 'buttonAdd' and method 'onAddButtonClicked'");
        addAccountInfoFragment.buttonAdd = (Button) onStart.write(IconCompatParcelizer2, R.id.button_add, "field 'buttonAdd'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddAccountInfoFragment.this.onAddButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_open_account, "field 'buttonOpenAccount' and method 'onOpenButtonClicked'");
        addAccountInfoFragment.buttonOpenAccount = (Button) onStart.write(IconCompatParcelizer3, R.id.button_open_account, "field 'buttonOpenAccount'", Button.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddAccountInfoFragment.this.onOpenButtonClicked();
            }
        });
    }

    public final void read() {
        AddAccountInfoFragment addAccountInfoFragment = this.IconCompatParcelizer;
        if (addAccountInfoFragment != null) {
            this.IconCompatParcelizer = null;
            addAccountInfoFragment.emptyIcon = null;
            addAccountInfoFragment.addIcon = null;
            addAccountInfoFragment.textBody = null;
            addAccountInfoFragment.buttonAdd = null;
            addAccountInfoFragment.buttonOpenAccount = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
