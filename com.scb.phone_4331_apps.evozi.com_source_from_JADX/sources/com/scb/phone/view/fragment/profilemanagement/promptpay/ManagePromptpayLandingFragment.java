package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.profilemanagement.promptpay.LinkAndUnlinkPromptPayActivity;
import com.scb.phone.view.adapter.profilemanagement.ManagePromptpayProxyAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeLinkAndUnlinkPromptpayActivity;
import p040o.HmlPinActivity;
import p040o.OnDeviceIdExtractor_MembersInjector;
import p040o.VideoPlayerCameraPlayer;
import p040o.setExecution;

public class ManagePromptpayLandingFragment extends BaseFragment implements OnDeviceIdExtractor_MembersInjector {
    private ManagePromptpayProxyAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public VideoPlayerCameraPlayer.C3947c managePromptpayLandingPresenter;
    @BindView
    RecyclerView recyclerView;

    public static ManagePromptpayLandingFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new ManagePromptpayLandingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.f88322131494059, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ManagePromptpayProxyAdapter managePromptpayProxyAdapter = new ManagePromptpayProxyAdapter(new ActivityBuilder_ContributeLinkAndUnlinkPromptpayActivity(this.managePromptpayLandingPresenter));
        this.MediaBrowserCompat$CustomActionResultReceiver = managePromptpayProxyAdapter;
        this.recyclerView.setAdapter(managePromptpayProxyAdapter);
        this.managePromptpayLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onDestroyView() {
        this.managePromptpayLandingPresenter.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(List<setExecution> list) {
        ManagePromptpayProxyAdapter managePromptpayProxyAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        managePromptpayProxyAdapter.MediaBrowserCompat$ItemReceiver = list;
        managePromptpayProxyAdapter.IconCompatParcelizer.write();
    }

    public final void IconCompatParcelizer(setExecution setexecution) {
        LinkAndUnlinkPromptPayActivity.read(getContext(), setexecution);
    }
}
