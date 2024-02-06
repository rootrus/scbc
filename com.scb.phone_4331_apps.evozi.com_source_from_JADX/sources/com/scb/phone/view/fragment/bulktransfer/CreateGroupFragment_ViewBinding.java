package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CreateGroupFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CreateGroupFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public CreateGroupFragment_ViewBinding(final CreateGroupFragment createGroupFragment, View view) {
        super(createGroupFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = createGroupFragment;
        createGroupFragment.createGroupEditText = (CounterEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_name_edit_text, "field 'createGroupEditText'", CounterEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_create_recipient_group, "field 'createGroupButton' and method 'onCreateButtonClick'");
        createGroupFragment.createGroupButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_create_recipient_group, "field 'createGroupButton'", DefaultButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CreateGroupFragment.this.onCreateButtonClick();
            }
        });
    }

    public final void read() {
        CreateGroupFragment createGroupFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (createGroupFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            createGroupFragment.createGroupEditText = null;
            createGroupFragment.createGroupButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
