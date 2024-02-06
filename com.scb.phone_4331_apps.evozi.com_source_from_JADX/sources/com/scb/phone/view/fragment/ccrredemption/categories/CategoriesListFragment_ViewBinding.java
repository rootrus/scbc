package com.scb.phone.view.fragment.ccrredemption.categories;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CategoriesListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CategoriesListFragment MediaBrowserCompat$ItemReceiver;

    public CategoriesListFragment_ViewBinding(CategoriesListFragment categoriesListFragment, View view) {
        super(categoriesListFragment, view);
        this.MediaBrowserCompat$ItemReceiver = categoriesListFragment;
        categoriesListFragment.rcvCategoriesList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_categories_list, "field 'rcvCategoriesList'", RecyclerView.class);
        categoriesListFragment.rewardsErrorLayout = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_rewards_error, "field 'rewardsErrorLayout'", ViewGroup.class);
        categoriesListFragment.txvErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'txvErrorMessage'", TextView.class);
        categoriesListFragment.txvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'txvErrorTitle'", TextView.class);
        categoriesListFragment.txvErrorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'txvErrorIcon'", ImageView.class);
    }

    public final void read() {
        CategoriesListFragment categoriesListFragment = this.MediaBrowserCompat$ItemReceiver;
        if (categoriesListFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            categoriesListFragment.rcvCategoriesList = null;
            categoriesListFragment.rewardsErrorLayout = null;
            categoriesListFragment.txvErrorMessage = null;
            categoriesListFragment.txvErrorTitle = null;
            categoriesListFragment.txvErrorIcon = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
