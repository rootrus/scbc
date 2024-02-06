package p040o;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import java.util.ArrayList;
import java.util.List;
import p040o.BondErrorNoAccountsActivity;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.clickQRForWithdrawal */
public final /* synthetic */ class clickQRForWithdrawal implements FragmentBuilder_BindIpoTabFragment {
    private final /* synthetic */ BondErrorNoAccountsActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ clickQRForWithdrawal(BondErrorNoAccountsActivity bondErrorNoAccountsActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bondErrorNoAccountsActivity;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.ArrayList<java.lang.String>, o.DeejungTransferLandingActivity] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    public final void MediaBrowserCompat$ItemReceiver() {
        String str;
        ? r0;
        DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver2;
        BondErrorNoAccountsActivity bondErrorNoAccountsActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        Activity activity = bondErrorNoAccountsActivity.read;
        if (activity != null && activity != null) {
            BondSelectionActivity bondSelectionActivity = bondErrorNoAccountsActivity.MediaBrowserCompat$SearchResultReceiver;
            boolean z = true;
            boolean z2 = false;
            if (activity != null) {
                Point point = new Point();
                activity.getWindowManager().getDefaultDisplay().getSize(point);
                View read = BondSelectionActivity.read(activity, point.x, point.y, 0, 0, new int[]{0, point.y});
                read.setBackgroundResource(17170445);
                read.setOnClickListener(BankingAgentTCActivity.IconCompatParcelizer);
                bondSelectionActivity.write(activity, "transparent_view", read);
            }
            List<View> backgroundResource = FragmentBuilder_BindHmlIssuerLandingFragment.setBackgroundResource();
            int i = 0;
            View view = null;
            while (true) {
                if (i >= backgroundResource.size()) {
                    str = "";
                    break;
                }
                str = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(backgroundResource.get(i));
                if (FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$ItemReceiver(str) && (view = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(activity, backgroundResource.get(i))) != null) {
                    backgroundResource.add(view);
                    break;
                }
                i++;
            }
            List<BondLandingActivity> IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(activity, backgroundResource);
            bondErrorNoAccountsActivity.write.MediaBrowserCompat$CustomActionResultReceiver = bondErrorNoAccountsActivity.ParcelableVolumeInfo;
            bondErrorNoAccountsActivity.MediaBrowserCompat$MediaItem.clear();
            bondErrorNoAccountsActivity.RatingCompat.clear();
            bondErrorNoAccountsActivity.MediaDescriptionCompat.clear();
            int i2 = 0;
            while (i2 < IconCompatParcelizer.size()) {
                if ((view == null || !IconCompatParcelizer.get(i2).MediaBrowserCompat$ItemReceiver.equals(view)) && IconCompatParcelizer.get(i2).read) {
                    if (IconCompatParcelizer.get(i2).MediaBrowserCompat$CustomActionResultReceiver() > 90 ? z : z2) {
                        bondErrorNoAccountsActivity.write(activity);
                        bondErrorNoAccountsActivity.MediaDescriptionCompat.clear();
                    }
                    String MediaBrowserCompat$CustomActionResultReceiver3 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.get(i2).MediaBrowserCompat$ItemReceiver);
                    bondErrorNoAccountsActivity.MediaBrowserCompat$MediaItem.add(MediaBrowserCompat$CustomActionResultReceiver3);
                    InteractionRegionResponse MediaBrowserCompat$ItemReceiver = bondErrorNoAccountsActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver3);
                    if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.getData() == null) {
                        DeejungTransferLandingActivity deejungTransferLandingActivity = new DeejungTransferLandingActivity(IconCompatParcelizer.get(i2).MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver3, FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.get(i2).MediaBrowserCompat$ItemReceiver));
                        deejungTransferLandingActivity.MediaSessionCompat$Token = true;
                        deejungTransferLandingActivity.MediaSessionCompat$QueueItem = true;
                        deejungTransferLandingActivity.f3129x50fd9e4a = new ECouponSuccessfulActivity(MediaBrowserCompat$CustomActionResultReceiver3, false, false, false);
                        bondErrorNoAccountsActivity.RatingCompat.put(deejungTransferLandingActivity.ParcelableVolumeInfo, deejungTransferLandingActivity);
                        bondErrorNoAccountsActivity.IconCompatParcelizer(activity, deejungTransferLandingActivity, bondErrorNoAccountsActivity.ParcelableVolumeInfo);
                        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response for interaction ");
                        sb.append(MediaBrowserCompat$CustomActionResultReceiver3);
                        sb.append(" is empty");
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                        return;
                    }
                    TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver.getData().getTrackingPoints();
                    Captures[] capturePoints = MediaBrowserCompat$ItemReceiver.getData().getCapturePoints();
                    setTextAppearance settextappearance = new setTextAppearance();
                    setTextAppearance settextappearance2 = new setTextAppearance();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    setTextAppearance settextappearance3 = new setTextAppearance();
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = arrayList;
                    setTextAppearance settextappearance4 = settextappearance;
                    TrackingPointData[] trackingPointDataArr = trackingPoints;
                    bondErrorNoAccountsActivity.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3, IconCompatParcelizer.get(i2).MediaBrowserCompat$ItemReceiver, (setTextAppearance<String, DeejungTransferLandingActivity>) settextappearance4, (setTextAppearance<View, DeejungTransferLandingActivity>) settextappearance2, (setTextAppearance<String, DeejungTransferLandingActivity>) settextappearance3);
                    DeejungTransferLandingActivity deejungTransferLandingActivity2 = (DeejungTransferLandingActivity) settextappearance3.get(MediaBrowserCompat$CustomActionResultReceiver3);
                    deejungTransferLandingActivity2.MediaSessionCompat$Token = true;
                    deejungTransferLandingActivity2.MediaSessionCompat$QueueItem = true;
                    deejungTransferLandingActivity2.f3129x50fd9e4a = new ECouponSuccessfulActivity(MediaBrowserCompat$CustomActionResultReceiver3, false, false, false);
                    if (!(view == null || !MediaBrowserCompat$CustomActionResultReceiver3.equals(str) || (MediaBrowserCompat$CustomActionResultReceiver2 = bondErrorNoAccountsActivity.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3, deejungTransferLandingActivity2, view, settextappearance4, settextappearance2, false)) == null)) {
                        deejungTransferLandingActivity2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
                        deejungTransferLandingActivity2.write = true;
                    }
                    bondErrorNoAccountsActivity.RatingCompat.put(deejungTransferLandingActivity2.ParcelableVolumeInfo, deejungTransferLandingActivity2);
                    bondErrorNoAccountsActivity.IconCompatParcelizer(activity, deejungTransferLandingActivity2, bondErrorNoAccountsActivity.ParcelableVolumeInfo);
                    int i3 = 0;
                    while (i3 < trackingPointDataArr.length) {
                        setTextAppearance settextappearance5 = settextappearance4;
                        if (settextappearance5.containsKey(trackingPointDataArr[i3].getPath())) {
                            arrayList4.add(trackingPointDataArr[i3].getPath());
                        } else if (trackingPointDataArr[i3].getPath() != null && trackingPointDataArr[i3].getPath().contains("*")) {
                            DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(deejungTransferLandingActivity2, arrayList3, trackingPointDataArr[i3].getPath());
                        }
                        i3++;
                        settextappearance4 = settextappearance5;
                    }
                    setTextAppearance settextappearance6 = settextappearance4;
                    for (int i4 = 0; i4 < capturePoints.length; i4++) {
                        if (settextappearance6.containsKey(capturePoints[i4].getPath())) {
                            arrayList4.add(capturePoints[i4].getPath());
                        } else if (capturePoints[i4].getPath() != null && capturePoints[i4].getPath().contains("*")) {
                            DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(deejungTransferLandingActivity2, arrayList3, capturePoints[i4].getPath());
                        }
                    }
                    bondErrorNoAccountsActivity.MediaDescriptionCompat.add(new BondErrorNoAccountsActivity.read(deejungTransferLandingActivity2, arrayList4, arrayList3));
                }
                i2++;
                z = true;
                z2 = false;
            }
            bondErrorNoAccountsActivity.write(activity);
            DeejungTransferLandingActivity deejungTransferLandingActivity3 = bondErrorNoAccountsActivity.IconCompatParcelizer;
            if (deejungTransferLandingActivity3 != null) {
                bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity3, new ArrayList(), new ArrayList());
                r0 = 0;
                bondErrorNoAccountsActivity.IconCompatParcelizer = null;
            } else {
                r0 = 0;
            }
            DeejungTransferLandingActivity deejungTransferLandingActivity4 = bondErrorNoAccountsActivity.MediaSessionCompat$Token;
            if (deejungTransferLandingActivity4 != null) {
                bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity4, bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver, new ArrayList());
                bondErrorNoAccountsActivity.MediaSessionCompat$Token = r0;
                bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver = r0;
            }
        }
    }
}
