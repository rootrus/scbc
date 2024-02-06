package com.scb.phone.view.fragment.profilemanagement;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class LanguageSettingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private LanguageSettingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public LanguageSettingFragment_ViewBinding(LanguageSettingFragment languageSettingFragment, View view) {
        super(languageSettingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = languageSettingFragment;
        languageSettingFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.language_setting_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        LanguageSettingFragment languageSettingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (languageSettingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            languageSettingFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
