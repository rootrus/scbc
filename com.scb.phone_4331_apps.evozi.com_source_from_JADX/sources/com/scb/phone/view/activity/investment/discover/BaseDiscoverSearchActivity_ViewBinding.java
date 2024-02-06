package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class BaseDiscoverSearchActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseDiscoverSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

    public BaseDiscoverSearchActivity_ViewBinding(BaseDiscoverSearchActivity baseDiscoverSearchActivity, View view) {
        super(baseDiscoverSearchActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseDiscoverSearchActivity;
        baseDiscoverSearchActivity.btClear = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btClear, "field 'btClear'", ImageButton.class);
        baseDiscoverSearchActivity.btFilter = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btFilter, "field 'btFilter'", ImageButton.class);
        baseDiscoverSearchActivity.customProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.customProgress, "field 'customProgress'", ViewGroup.class);
        baseDiscoverSearchActivity.etSearch = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etSearch, "field 'etSearch'", EditText.class);
        baseDiscoverSearchActivity.ivError = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivError, "field 'ivError'", ImageView.class);
        baseDiscoverSearchActivity.ivFilterFlag = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivFilterFlag, "field 'ivFilterFlag'", ImageView.class);
        baseDiscoverSearchActivity.layoutContainer = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutContainer, "field 'layoutContainer'", ViewGroup.class);
        baseDiscoverSearchActivity.layoutEmpty = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutEmpty, "field 'layoutEmpty'", ViewGroup.class);
        baseDiscoverSearchActivity.layoutFunds = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutFunds, "field 'layoutFunds'", ViewGroup.class);
        baseDiscoverSearchActivity.layoutSearchHint = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSearchHint, "field 'layoutSearchHint'", ViewGroup.class);
        baseDiscoverSearchActivity.layoutSortOptions = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSortOptions, "field 'layoutSortOptions'", ViewGroup.class);
        baseDiscoverSearchActivity.layoutTxnLoading = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutTxnLoading, "field 'layoutTxnLoading'", ViewGroup.class);
        baseDiscoverSearchActivity.rcvFunds = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcvFunds, "field 'rcvFunds'", RecyclerView.class);
        baseDiscoverSearchActivity.scrollContainer = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scrollContainer, "field 'scrollContainer'", NestedScrollView.class);
        baseDiscoverSearchActivity.spnPeriod = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spnPeriod, "field 'spnPeriod'", Spinner.class);
        baseDiscoverSearchActivity.spnSortingType = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spnSortingType, "field 'spnSortingType'", Spinner.class);
        baseDiscoverSearchActivity.toolbar = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        baseDiscoverSearchActivity.tvErrorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorDescription, "field 'tvErrorDescription'", TextView.class);
        baseDiscoverSearchActivity.tvErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvErrorTitle, "field 'tvErrorTitle'", TextView.class);
        baseDiscoverSearchActivity.tvToolbarTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvToolbarTitle, "field 'tvToolbarTitle'", TextView.class);
        baseDiscoverSearchActivity.tvTotalRecords = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvTotalRecords, "field 'tvTotalRecords'", TextView.class);
    }

    public final void read() {
        BaseDiscoverSearchActivity baseDiscoverSearchActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseDiscoverSearchActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseDiscoverSearchActivity.btClear = null;
            baseDiscoverSearchActivity.btFilter = null;
            baseDiscoverSearchActivity.customProgress = null;
            baseDiscoverSearchActivity.etSearch = null;
            baseDiscoverSearchActivity.ivError = null;
            baseDiscoverSearchActivity.ivFilterFlag = null;
            baseDiscoverSearchActivity.layoutContainer = null;
            baseDiscoverSearchActivity.layoutEmpty = null;
            baseDiscoverSearchActivity.layoutFunds = null;
            baseDiscoverSearchActivity.layoutSearchHint = null;
            baseDiscoverSearchActivity.layoutSortOptions = null;
            baseDiscoverSearchActivity.layoutTxnLoading = null;
            baseDiscoverSearchActivity.rcvFunds = null;
            baseDiscoverSearchActivity.scrollContainer = null;
            baseDiscoverSearchActivity.spnPeriod = null;
            baseDiscoverSearchActivity.spnSortingType = null;
            baseDiscoverSearchActivity.toolbar = null;
            baseDiscoverSearchActivity.tvErrorDescription = null;
            baseDiscoverSearchActivity.tvErrorTitle = null;
            baseDiscoverSearchActivity.tvToolbarTitle = null;
            baseDiscoverSearchActivity.tvTotalRecords = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
