package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.TabWidget;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.lang.ref.WeakReference;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment */
public final class FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment implements OnBoardingTutorialActivity_ViewBinding, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment, ViewGroup.OnHierarchyChangeListener {
    FragmentBuilder_BindHmlDocumentReviewTutorialFragment IconCompatParcelizer;
    FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
    boolean MediaBrowserCompat$ItemReceiver = false;
    private FragmentBuilder_BindHmlETBBusinessInformationFragment MediaMetadataCompat;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read RatingCompat;
    FragmentBuilder_BindHmlDocumentReviewTutorialFragment read;
    WeakReference<Activity> write;

    public FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment(Activity activity, FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment) {
        FragmentBuilder_BindHmlDocumentReviewTutorialFragment fragmentBuilder_BindHmlDocumentReviewTutorialFragment;
        this.MediaMetadataCompat = fragmentBuilder_BindHmlETBBusinessInformationFragment;
        this.write = new WeakReference<>(activity);
        if (activity instanceof FragmentActivity) {
            fragmentBuilder_BindHmlDocumentReviewTutorialFragment = new FragmentBuilder_BindHmlBusinessOwnerOutcomeApproveFragment(activity, this);
        } else {
            fragmentBuilder_BindHmlDocumentReviewTutorialFragment = new FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment(activity, this);
        }
        this.read = fragmentBuilder_BindHmlDocumentReviewTutorialFragment;
        this.IconCompatParcelizer = new FragmentBuilder_BindHmlDocumentKofaxTutorialFragment(activity, this);
        this.RatingCompat = HomeActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver, new FragmentBuilder_BindFundSwitchReviewFragment(this));
    }

    public final void onChildViewAdded(View view, View view2) {
        DeejungTransferLandingActivity read2;
        BaseResponse IconCompatParcelizer2;
        DeejungTransferLandingActivity deejungTransferLandingActivity;
        this.read.IconCompatParcelizer(view2);
        if (!this.IconCompatParcelizer.IconCompatParcelizer(view2) && !(view instanceof AbsListView)) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                onClickEditSelectedPurchases IconCompatParcelizer3 = BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer(recyclerView);
                if (IconCompatParcelizer3 != null) {
                    IconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver(recyclerView, view2);
                    return;
                }
                return;
            }
            FragmentBuilder_BindHmlExternalAuthenticationFragment read3 = FragmentBuilder_BindHmlExternalAuthenticationFragment.read();
            String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null && !FragmentBuilder_BindHmlBusinessURLInfoFragment.write(view) && read3.write.get(MediaBrowserCompat$CustomActionResultReceiver2) != null && read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2) != null) {
                DeejungTransferLandingActivity deejungTransferLandingActivity2 = (DeejungTransferLandingActivity) read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2).get(view);
                while (deejungTransferLandingActivity2 == null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    deejungTransferLandingActivity2 = (DeejungTransferLandingActivity) read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2).get(viewGroup);
                    ViewGroup viewGroup2 = viewGroup;
                    view2 = view;
                    view = viewGroup2;
                }
                if (deejungTransferLandingActivity2 != null && (read2 = read3.read(deejungTransferLandingActivity2, view2)) != null) {
                    String str = read2.MediaBrowserCompat$MediaItem;
                    View view3 = read2.IconCompatParcelizer;
                    if (!(view3 instanceof AdapterView) && !(view3 instanceof RecyclerView)) {
                        if (view3 instanceof TabWidget) {
                            read3.write(read2);
                            read3.read(str, read2.MediaSessionCompat$ResultReceiverWrapper, (TabWidget) read2.IconCompatParcelizer, read3.write.get(str), read3.read.get(str));
                        } else {
                            read3.MediaBrowserCompat$CustomActionResultReceiver(str, read2, view2, read3.write.get(str), read3.read.get(str), false);
                        }
                    }
                    DeejungTransferLandingActivity deejungTransferLandingActivity3 = (DeejungTransferLandingActivity) read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2).get(view2);
                    while (deejungTransferLandingActivity3 == null && view2 != null && view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                        view2 = (ViewGroup) view.getParent();
                        deejungTransferLandingActivity3 = (DeejungTransferLandingActivity) read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2).get(view2);
                    }
                    DeejungTransferLandingActivity deejungTransferLandingActivity4 = (DeejungTransferLandingActivity) read3.read.get(MediaBrowserCompat$CustomActionResultReceiver2).get(view2);
                    if (deejungTransferLandingActivity4 != null && (IconCompatParcelizer2 = FragmentBuilder_BindHmlIssuerLandingFragment.IconCompatParcelizer(deejungTransferLandingActivity4.MediaBrowserCompat$MediaItem)) != null && read3.write.containsKey(deejungTransferLandingActivity4.MediaBrowserCompat$MediaItem)) {
                        Trackers[] trackers = IconCompatParcelizer2.getTrackers();
                        Captures[] captures = IconCompatParcelizer2.getCaptures();
                        setTextAppearance settextappearance = new setTextAppearance();
                        read3.MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity4, (setTextAppearance<String, DeejungTransferLandingActivity>) settextappearance);
                        if (trackers != null && trackers.length > 0) {
                            for (int i = 0; i < trackers.length; i++) {
                                if (settextappearance.containsKey(trackers[i].getPath()) && (deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance.get(trackers[i].getPath())) != null) {
                                    deejungTransferLandingActivity.MediaSessionCompat$Token = true;
                                    FragmentBuilder_BindHmlExternalAuthenticationFragment.write(deejungTransferLandingActivity, captures, trackers[i]);
                                }
                            }
                        }
                        if (captures != null && captures.length > 0) {
                            ((FragmentBuilder_BindHmlIssuerInputFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setSubtitle().MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer).MediaDescriptionCompat.IconCompatParcelizer(deejungTransferLandingActivity4.MediaBrowserCompat$MediaItem, captures, settextappearance);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = (androidx.recyclerview.widget.RecyclerView) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChildViewRemoved(android.view.View r2, android.view.View r3) {
        /*
            r1 = this;
            o.FragmentBuilder_BindHmlDocumentReviewTutorialFragment r0 = r1.IconCompatParcelizer
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver(r3)
            if (r0 != 0) goto L_0x001c
            boolean r0 = r2 instanceof android.widget.AbsListView
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x001c
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            o.onClickEditSelectedPurchases r0 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer(r2)
            if (r0 == 0) goto L_0x001c
            r0.read(r2, r3)
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.onChildViewRemoved(android.view.View, android.view.View):void");
    }

    public final void read(String str, View view) {
        FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment;
        if (!this.MediaBrowserCompat$ItemReceiver && (fragmentBuilder_BindHmlETBBusinessInformationFragment = this.MediaMetadataCompat) != null) {
            fragmentBuilder_BindHmlETBBusinessInformationFragment.IconCompatParcelizer(str, view);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, View view) {
        FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment;
        if (!this.MediaBrowserCompat$ItemReceiver && (fragmentBuilder_BindHmlETBBusinessInformationFragment = this.MediaMetadataCompat) != null) {
            fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$ItemReceiver(str, view);
        }
    }

    public final void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.RatingCompat;
        if (read2 != null) {
            read2.read();
        }
        this.RatingCompat = null;
    }
}
