package com.scb.phone.view.activity.ccrredemption.search;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RewardSearchActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RewardSearchActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public RewardSearchActivity_ViewBinding(final RewardSearchActivity rewardSearchActivity, View view) {
        super(rewardSearchActivity, view);
        this.IconCompatParcelizer = rewardSearchActivity;
        rewardSearchActivity.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'tvTitle'", TextView.class);
        rewardSearchActivity.tvCardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'tvCardPoints'", TextView.class);
        rewardSearchActivity.rvSuggestion = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_suggestion, "field 'rvSuggestion'", RecyclerView.class);
        rewardSearchActivity.rvHistory = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_history, "field 'rvHistory'", RecyclerView.class);
        rewardSearchActivity.historyContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_history, "field 'historyContainer'", LinearLayout.class);
        rewardSearchActivity.suggestionContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_suggestion, "field 'suggestionContainer'", LinearLayout.class);
        rewardSearchActivity.etSearch = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_search, "field 'etSearch'", EditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_clear, "field 'btClear' and method 'onButtonClearClick'");
        rewardSearchActivity.btClear = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.bt_clear, "field 'btClear'", ImageButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RewardSearchActivity.this.onButtonClearClick();
            }
        });
        rewardSearchActivity.spinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_category, "field 'spinner'", Spinner.class);
    }

    public final void read() {
        RewardSearchActivity rewardSearchActivity = this.IconCompatParcelizer;
        if (rewardSearchActivity != null) {
            this.IconCompatParcelizer = null;
            rewardSearchActivity.tvTitle = null;
            rewardSearchActivity.tvCardPoints = null;
            rewardSearchActivity.rvSuggestion = null;
            rewardSearchActivity.rvHistory = null;
            rewardSearchActivity.historyContainer = null;
            rewardSearchActivity.suggestionContainer = null;
            rewardSearchActivity.etSearch = null;
            rewardSearchActivity.btClear = null;
            rewardSearchActivity.spinner = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
