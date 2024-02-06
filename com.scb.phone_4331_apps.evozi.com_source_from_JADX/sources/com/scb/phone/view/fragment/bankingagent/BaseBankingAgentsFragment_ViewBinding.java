package com.scb.phone.view.fragment.bankingagent;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseBankingAgentsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseBankingAgentsFragment IconCompatParcelizer;
    private View write;

    public BaseBankingAgentsFragment_ViewBinding(final BaseBankingAgentsFragment baseBankingAgentsFragment, View view) {
        super(baseBankingAgentsFragment, view);
        this.IconCompatParcelizer = baseBankingAgentsFragment;
        baseBankingAgentsFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.agents_grid_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.empty_container_relative_layout, "field 'mEmptyCard' and method 'onEmptyLayoutClick'");
        baseBankingAgentsFragment.mEmptyCard = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseBankingAgentsFragment.this.onEmptyLayoutClick();
            }
        });
        baseBankingAgentsFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        baseBankingAgentsFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        baseBankingAgentsFragment.mFooterView = onStart.IconCompatParcelizer(view, R.id.footer_view, "field 'mFooterView'");
        baseBankingAgentsFragment.mTopView = onStart.IconCompatParcelizer(view, R.id.top_view, "field 'mTopView'");
    }

    public final void read() {
        BaseBankingAgentsFragment baseBankingAgentsFragment = this.IconCompatParcelizer;
        if (baseBankingAgentsFragment != null) {
            this.IconCompatParcelizer = null;
            baseBankingAgentsFragment.mRecyclerView = null;
            baseBankingAgentsFragment.mEmptyCard = null;
            baseBankingAgentsFragment.mEmptyTitle = null;
            baseBankingAgentsFragment.mEmptyDescription = null;
            baseBankingAgentsFragment.mFooterView = null;
            baseBankingAgentsFragment.mTopView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
