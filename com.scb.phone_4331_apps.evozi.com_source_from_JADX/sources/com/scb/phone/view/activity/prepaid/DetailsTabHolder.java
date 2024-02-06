package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.view.adapter.prepaid.PrepaidTransactionAdapter;
import java.util.List;
import java.util.Map;
import p040o.getModel;
import p040o.setSimulator;
import p040o.validateGER;

public class DetailsTabHolder {
    public validateGER IconCompatParcelizer;
    public Context MediaBrowserCompat$CustomActionResultReceiver;
    public Map<String, getModel> MediaBrowserCompat$ItemReceiver;
    public PrepaidTransactionAdapter MediaBrowserCompat$MediaItem;
    public RecyclerView.IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;
    @BindView
    LinearLayout customError;
    @BindView
    RelativeLayout mEmptyCard;
    @BindView
    TextView mEmptyDescriptionPrepaid;
    @BindView
    ImageView mEmptyImagePrepaid;
    @BindView
    TextView mEmptyTitlePrepaid;
    @BindView
    View mLoadingView;
    @BindView
    public RecyclerView mRecyclerViewPrepaid;
    @BindView
    TextView mTextMessagePrepaid;
    @BindView
    public TextView mTextTxnMonthPrepaid;
    @BindView
    public TextView mTextTxnPrepaid;
    @BindView
    public Toolbar mToolbarTxnPrepaid;
    public final IconCompatParcelizer read;
    public LinearLayoutManager write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(getModel getmodel);
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public DetailsTabHolder(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void read(List<setSimulator> list) {
        this.mLoadingView.setVisibility(8);
        this.mTextMessagePrepaid.setVisibility(8);
        this.customError.setVisibility(8);
        this.mRecyclerViewPrepaid.setVisibility(0);
        PrepaidTransactionAdapter prepaidTransactionAdapter = this.MediaBrowserCompat$MediaItem;
        prepaidTransactionAdapter.read.clear();
        if (list != null) {
            prepaidTransactionAdapter.read.addAll(list);
        }
        prepaidTransactionAdapter.IconCompatParcelizer.write();
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
