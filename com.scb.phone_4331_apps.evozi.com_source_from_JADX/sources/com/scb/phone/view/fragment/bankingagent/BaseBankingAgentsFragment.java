package com.scb.phone.view.fragment.bankingagent;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.bankingagent.BankingAgentAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.C6380xa0b57534;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.onGetStartedClick;
import p040o.sameThreadExecutor;

public abstract class BaseBankingAgentsFragment extends BaseFragment implements C6380xa0b57534, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private write IconCompatParcelizer;
    private BankingAgentAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$MediaItem;
    @BindView
    protected RelativeLayout mEmptyCard;
    @BindView
    protected TextView mEmptyDescription;
    @BindView
    protected TextView mEmptyTitle;
    @BindView
    protected View mFooterView;
    @BindView
    protected RecyclerView mRecyclerView;
    @BindView
    protected View mTopView;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(sameThreadExecutor samethreadexecutor);
    }

    public abstract void MediaBrowserCompat$ItemReceiver();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof write) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                this.IconCompatParcelizer = (write) parentFragment;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.fragment.bankingagent.BaseBankingAgentsFragment.OnBankingAgentChangeListener");
        }
    }

    public void onDetach() {
        this.IconCompatParcelizer = null;
        super.onDetach();
    }

    public final void read(List<sameThreadExecutor> list) {
        onGetStartedClick.write((Object) list, "agentsList");
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        recyclerView.setVisibility(0);
        View view = this.mFooterView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFooterView");
        }
        view.setVisibility(0);
        View view2 = this.mTopView;
        if (view2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTopView");
        }
        view2.setVisibility(0);
        BankingAgentAdapter bankingAgentAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingAgentAdapter == null) {
            Context requireContext = requireContext();
            onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
            Collection collection = list;
            onGetStartedClick.write((Object) collection, "$this$toMutableList");
            this.MediaBrowserCompat$CustomActionResultReceiver = new BankingAgentAdapter(requireContext, new ArrayList(collection), this);
        } else {
            if (bankingAgentAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            onGetStartedClick.write((Object) list, "agentDisplayList");
            bankingAgentAdapter.write.clear();
            bankingAgentAdapter.write.addAll(list);
            bankingAgentAdapter.IconCompatParcelizer.write();
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        recyclerView3.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void read(int i) {
        write write2;
        if (SystemClock.elapsedRealtime() - this.MediaBrowserCompat$MediaItem >= 300) {
            BankingAgentAdapter bankingAgentAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bankingAgentAdapter != null) {
                sameThreadExecutor samethreadexecutor = !bankingAgentAdapter.write.isEmpty() ? bankingAgentAdapter.write.get(i) : null;
                if (!(samethreadexecutor == null || (write2 = this.IconCompatParcelizer) == null)) {
                    write2.MediaBrowserCompat$CustomActionResultReceiver(samethreadexecutor);
                }
            }
            this.MediaBrowserCompat$MediaItem = SystemClock.elapsedRealtime();
        }
    }

    public final void write() {
        TextView textView = this.mEmptyTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEmptyTitle");
        }
        textView.setText(getResources().getString(R.string.banking_select_agent_error_title));
        TextView textView2 = this.mEmptyDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEmptyDescription");
        }
        textView2.setText(getResources().getString(R.string.banking_select_agent_error_description));
        RelativeLayout relativeLayout = this.mEmptyCard;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEmptyCard");
        }
        relativeLayout.setVisibility(0);
    }

    @OnClick
    public final void onEmptyLayoutClick() {
        RelativeLayout relativeLayout = this.mEmptyCard;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mEmptyCard");
        }
        relativeLayout.setVisibility(8);
        MediaBrowserCompat$ItemReceiver();
    }
}
