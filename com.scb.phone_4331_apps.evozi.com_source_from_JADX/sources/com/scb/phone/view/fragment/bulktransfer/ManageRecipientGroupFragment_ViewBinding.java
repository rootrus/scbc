package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManageRecipientGroupFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ManageRecipientGroupFragment MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View write;

    public ManageRecipientGroupFragment_ViewBinding(final ManageRecipientGroupFragment manageRecipientGroupFragment, View view) {
        super(manageRecipientGroupFragment, view);
        this.MediaBrowserCompat$ItemReceiver = manageRecipientGroupFragment;
        manageRecipientGroupFragment.groupName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_name, "field 'groupName'", TextView.class);
        manageRecipientGroupFragment.counterRecipients = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter_recipients_group, "field 'counterRecipients'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_add_from_favourite, "field 'buttonAddFromFavourite' and method 'onAddFromFavourite'");
        manageRecipientGroupFragment.buttonAddFromFavourite = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_add_from_favourite, "field 'buttonAddFromFavourite'", DefaultButton.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageRecipientGroupFragment.this.onAddFromFavourite();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_add_new_recipient, "field 'buttonAddNewRecipient' and method 'onAddNewRecipient'");
        manageRecipientGroupFragment.buttonAddNewRecipient = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.button_add_new_recipient, "field 'buttonAddNewRecipient'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageRecipientGroupFragment.this.onAddNewRecipient();
            }
        });
        manageRecipientGroupFragment.recipientsNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.number_of_recipients, "field 'recipientsNumber'", TextView.class);
        manageRecipientGroupFragment.recipientsRecycler = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipients_recycler_view, "field 'recipientsRecycler'", RecyclerView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.edit_group_name, "method 'onEdit'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageRecipientGroupFragment.this.onEdit();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.button_done_recipient_group, "method 'onDone'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageRecipientGroupFragment.this.onDone();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.button_delete_recipient_group, "method 'onDelete'");
        this.IconCompatParcelizer = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageRecipientGroupFragment.this.onDelete();
            }
        });
    }

    public final void read() {
        ManageRecipientGroupFragment manageRecipientGroupFragment = this.MediaBrowserCompat$ItemReceiver;
        if (manageRecipientGroupFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            manageRecipientGroupFragment.groupName = null;
            manageRecipientGroupFragment.counterRecipients = null;
            manageRecipientGroupFragment.buttonAddFromFavourite = null;
            manageRecipientGroupFragment.buttonAddNewRecipient = null;
            manageRecipientGroupFragment.recipientsNumber = null;
            manageRecipientGroupFragment.recipientsRecycler = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
