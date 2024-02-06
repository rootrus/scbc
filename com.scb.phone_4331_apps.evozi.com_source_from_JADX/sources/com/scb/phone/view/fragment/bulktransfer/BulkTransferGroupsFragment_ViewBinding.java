package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BulkTransferGroupsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BulkTransferGroupsFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public BulkTransferGroupsFragment_ViewBinding(final BulkTransferGroupsFragment bulkTransferGroupsFragment, View view) {
        super(bulkTransferGroupsFragment, view);
        this.IconCompatParcelizer = bulkTransferGroupsFragment;
        bulkTransferGroupsFragment.groupsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.groups_recycler_view, "field 'groupsRecyclerView'", RecyclerView.class);
        bulkTransferGroupsFragment.counterRecipientsTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.counter_recipients_group, "field 'counterRecipientsTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_create_recipient_group, "field 'createRecipientButton' and method 'createButtonClicked'");
        bulkTransferGroupsFragment.createRecipientButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_create_recipient_group, "field 'createRecipientButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BulkTransferGroupsFragment.this.createButtonClicked();
            }
        });
    }

    public final void read() {
        BulkTransferGroupsFragment bulkTransferGroupsFragment = this.IconCompatParcelizer;
        if (bulkTransferGroupsFragment != null) {
            this.IconCompatParcelizer = null;
            bulkTransferGroupsFragment.groupsRecyclerView = null;
            bulkTransferGroupsFragment.counterRecipientsTextView = null;
            bulkTransferGroupsFragment.createRecipientButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
