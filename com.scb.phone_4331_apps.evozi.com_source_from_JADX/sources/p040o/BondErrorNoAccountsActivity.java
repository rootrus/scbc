package p040o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encoding;
import p040o.DeejungTransferLandingActivity;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.BondErrorNoAccountsActivity */
public final class BondErrorNoAccountsActivity implements OnBoardingTutorialActivity_ViewBinding {
    private boolean AlertController$RecycleListView = false;
    DeejungTransferLandingActivity IconCompatParcelizer;
    private boolean Keep = false;
    public FragmentBuilder_BindHmlAboutFragment MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.read();
    ArrayList<String> MediaBrowserCompat$ItemReceiver;
    ArrayList<String> MediaBrowserCompat$MediaItem = new ArrayList<>();
    BondSelectionActivity MediaBrowserCompat$SearchResultReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.Keep();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public List<View> f3125x50fd9e4a;
    LinkedList<read> MediaDescriptionCompat = new LinkedList<>();
    BaseAmortizationActivity MediaMetadataCompat = BaseAmortizationActivity.ELEMENT_TAB;
    FragmentBuilder_BindHmlExternalAuthenticationFragment MediaSessionCompat$QueueItem = FragmentBuilder_BindHmlIssuerLandingFragment.setItemInvoker();
    final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaSessionCompat$ResultReceiverWrapper;
    DeejungTransferLandingActivity MediaSessionCompat$Token;
    int[] ParcelableVolumeInfo = new int[2];
    private boolean PlaybackStateCompat = false;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read PlaybackStateCompat$CustomAction;
    setTextAppearance<String, DeejungTransferLandingActivity> RatingCompat = new setTextAppearance<>();
    Activity read;
    private boolean setHasDecor = false;
    BondPurchaseReviewActivity write;

    public BondErrorNoAccountsActivity(BondPurchaseReviewActivity bondPurchaseReviewActivity, FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.write = bondPurchaseReviewActivity;
        this.MediaSessionCompat$ResultReceiverWrapper = fragmentBuilder_BindJuristicOnboardingLandingFragment;
        this.PlaybackStateCompat$CustomAction = HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new ServiceAtBankingAgentActivity_ViewBinding(this));
    }

    /* access modifiers changed from: package-private */
    public final HmlVerifyPhoneValidateOtpActivity write(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        try {
            int MediaBrowserCompat$CustomActionResultReceiver2 = EasycashNcbCaseModule.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
            int read2 = EasycashNcbCaseModule.read(onBoardingTutorialActivity);
            boolean z = false;
            if (!((this.ParcelableVolumeInfo[0] == MediaBrowserCompat$CustomActionResultReceiver2 || MediaBrowserCompat$CustomActionResultReceiver2 == -9999999) && (this.ParcelableVolumeInfo[1] == read2 || read2 == -9999999))) {
                this.ParcelableVolumeInfo = new int[]{MediaBrowserCompat$CustomActionResultReceiver2, read2};
                z = true;
            }
            Activity MediaBrowserCompat$CustomActionResultReceiver3 = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
            boolean MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindPrepaidFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
            boolean IconCompatParcelizer2 = FragmentBuilder_BindPrepaidFragment.IconCompatParcelizer(onBoardingTutorialActivity);
            boolean MediaBrowserCompat$CustomActionResultReceiver4 = FragmentBuilder_BindTopHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
            boolean MediaBrowserCompat$CustomActionResultReceiver5 = FragmentBuilder_BindPersonalizeFragment.MediaBrowserCompat$CustomActionResultReceiver(onBoardingTutorialActivity);
            DeejungTransferLandingActivity IconCompatParcelizer3 = FragmentBuilder_BindTopHistoryFragment.IconCompatParcelizer(onBoardingTutorialActivity);
            BaseAmortizationActivity write2 = FragmentBuilder_BindTopHistoryFragment.write(onBoardingTutorialActivity);
            FragmentBuilder_BindVerifyIdentityFragment write3 = FragmentBuilder_BindTransferToOthersStep1Fragment.write(onBoardingTutorialActivity);
            if (MediaBrowserCompat$ItemReceiver2 == this.AlertController$RecycleListView && IconCompatParcelizer2 == this.setHasDecor && MediaBrowserCompat$CustomActionResultReceiver3 == this.read && MediaBrowserCompat$CustomActionResultReceiver4 == this.Keep && write2 == this.MediaMetadataCompat && write3 != FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF && MediaBrowserCompat$CustomActionResultReceiver5 == this.PlaybackStateCompat && !z) {
                return null;
            }
            MediaBrowserCompat$ItemReceiver(this.read);
            this.PlaybackStateCompat = MediaBrowserCompat$CustomActionResultReceiver5;
            if (MediaBrowserCompat$CustomActionResultReceiver5) {
                new Handler(Looper.getMainLooper()).postDelayed(new GenerateQRActivity_ViewBinding(this), 120);
                return null;
            }
            if (!MediaBrowserCompat$CustomActionResultReceiver4 || write3 == FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF) {
                this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            }
            this.AlertController$RecycleListView = MediaBrowserCompat$ItemReceiver2;
            this.setHasDecor = IconCompatParcelizer2;
            this.read = MediaBrowserCompat$CustomActionResultReceiver3;
            this.Keep = MediaBrowserCompat$CustomActionResultReceiver4;
            this.MediaMetadataCompat = write2;
            ArrayList arrayList = new ArrayList();
            if (this.AlertController$RecycleListView || this.Keep) {
                arrayList.add(new clickQRForWithdrawal(this));
            }
            if (this.setHasDecor) {
                arrayList.add(new clickQRForDeposit(this));
            }
            if (this.Keep) {
                arrayList.add(new BankingEnterAmountActivity(this, IconCompatParcelizer3));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new ServiceAtBankingAgentActivity(arrayList), 100);
            return null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Activity activity) {
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(activity);
        this.MediaBrowserCompat$MediaItem.clear();
        this.RatingCompat.clear();
        this.MediaDescriptionCompat.clear();
        List<View> list = this.f3125x50fd9e4a;
        if (list != null) {
            list.clear();
        }
        ArrayList<String> arrayList = this.MediaBrowserCompat$ItemReceiver;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(Activity activity) {
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            DeejungTransferLandingActivity deejungTransferLandingActivity = this.MediaDescriptionCompat.get(i).write;
            for (int i2 = 0; i2 < deejungTransferLandingActivity.read.size(); i2++) {
                MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity.read.get(i2), this.MediaDescriptionCompat.get(i).IconCompatParcelizer, this.MediaDescriptionCompat.get(i).MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:10:0x0036, LOOP_START, PHI: r1 
      PHI: (r1v1 o.DeejungTransferLandingActivity) = (r1v0 o.DeejungTransferLandingActivity), (r1v5 o.DeejungTransferLandingActivity) binds: [B:0:0x0000, B:10:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p040o.DeejungTransferLandingActivity> MediaBrowserCompat$SearchResultReceiver(p040o.DeejungTransferLandingActivity r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r7
        L_0x0006:
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            java.lang.String r3 = "LI"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0038
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            java.lang.String r3 = "STI"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0038
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            java.lang.String r4 = "TI"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0038
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0038
            o.DeejungTransferLandingActivity r1 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r1 != 0) goto L_0x0006
        L_0x0038:
            if (r1 == 0) goto L_0x006c
            o.DeejungTransferLandingActivity r2 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r1.ParcelableVolumeInfo
            java.lang.String r3 = "/"
            java.lang.String[] r2 = r2.split(r3)
            int r2 = r2.length
            java.lang.String r7 = r7.ParcelableVolumeInfo
            java.lang.String[] r7 = r7.split(r3)
            o.DeejungTransferLandingActivity r1 = r1.MediaSessionCompat$ResultReceiverWrapper
            java.util.ArrayList<o.DeejungTransferLandingActivity> r1 = r1.read
            int r3 = r1.size()
            r4 = 0
        L_0x0056:
            if (r4 >= r3) goto L_0x006c
            java.lang.Object r5 = r1.get(r4)
            o.DeejungTransferLandingActivity r5 = (p040o.DeejungTransferLandingActivity) r5
            int r6 = r2 + -1
            o.DeejungTransferLandingActivity r5 = p040o.DeejungTransferMinFullConfirmationActivity_ViewBinding.read(r5, r7, r6)
            if (r5 == 0) goto L_0x0069
            r0.add(r5)
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondErrorNoAccountsActivity.MediaBrowserCompat$SearchResultReceiver(o.DeejungTransferLandingActivity):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final void write(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, List<View> list) {
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        List<DeejungTransferLandingActivity> MediaBrowserCompat$SearchResultReceiver2 = MediaBrowserCompat$SearchResultReceiver(deejungTransferLandingActivity);
        for (int i = 0; i < MediaBrowserCompat$SearchResultReceiver2.size(); i++) {
            DeejungTransferLandingActivity deejungTransferLandingActivity3 = MediaBrowserCompat$SearchResultReceiver2.get(i);
            if (deejungTransferLandingActivity3 != null) {
                int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3.IconCompatParcelizer);
                View MediaBrowserCompat$ItemReceiver3 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver((deejungTransferLandingActivity2.MediaMetadataCompat || (deejungTransferLandingActivity2.MediaDescriptionCompat && deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper != null && deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper.MediaMetadataCompat)) ? 5 : 6, activity, deejungTransferLandingActivity3.IconCompatParcelizer.getWidth(), deejungTransferLandingActivity3.IconCompatParcelizer.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], this.ParcelableVolumeInfo);
                list.add(MediaBrowserCompat$ItemReceiver3);
                if (!deejungTransferLandingActivity3.ParcelableVolumeInfo.equals(deejungTransferLandingActivity2.ParcelableVolumeInfo)) {
                    this.MediaBrowserCompat$SearchResultReceiver.write(activity, deejungTransferLandingActivity3.ParcelableVolumeInfo, MediaBrowserCompat$ItemReceiver3);
                } else {
                    Activity activity2 = activity;
                }
            } else {
                Activity activity3 = activity;
                List<View> list2 = list;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
        for (int i = 0; i < this.MediaBrowserCompat$MediaItem.size(); i++) {
            BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
            String str = this.MediaBrowserCompat$MediaItem.get(i);
            if (bondSelectionActivity.RatingCompat.containsKey(str)) {
                bondSelectionActivity.RatingCompat.get(str).setVisibility(0);
            }
        }
    }

    public static void write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        List<DeejungTransferLandingActivity> MediaBrowserCompat$SearchResultReceiver2 = MediaBrowserCompat$SearchResultReceiver(deejungTransferLandingActivity);
        for (int i = 0; i < MediaBrowserCompat$SearchResultReceiver2.size(); i++) {
            MediaBrowserCompat$SearchResultReceiver2.get(i).MediaMetadataCompat = false;
        }
    }

    public final boolean read(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (RatingCompat(deejungTransferLandingActivity)) {
            return true;
        }
        if (!deejungTransferLandingActivity.MediaDescriptionCompat || !RatingCompat(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        return true;
    }

    /* renamed from: o.BondErrorNoAccountsActivity$5 */
    static /* synthetic */ class C63445 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.BaseAmortizationActivity[] r0 = p040o.BaseAmortizationActivity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.ELEMENT_TAB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.REGION_TAB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.GROUP_TAB     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.BondErrorNoAccountsActivity.C63445.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        MediaBrowserCompat$CustomActionResultReceiver();
        if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
            BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
            sb.append("_border");
            String obj = sb.toString();
            if (bondSelectionActivity.RatingCompat.containsKey(obj)) {
                bondSelectionActivity.RatingCompat.get(obj).setVisibility(0);
            }
        } else {
            LinkedList linkedList = new LinkedList();
            read(activity, deejungTransferLandingActivity, linkedList);
            MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity, linkedList);
            IconCompatParcelizer(activity, deejungTransferLandingActivity, (LinkedList<View>) linkedList);
            this.f3125x50fd9e4a = linkedList;
            read(activity, deejungTransferLandingActivity, linkedList, false);
        }
        this.write.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity);
    }

    /* access modifiers changed from: package-private */
    public final void write(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        View MediaBrowserCompat$CustomActionResultReceiver2;
        this.write.MediaBrowserCompat$CustomActionResultReceiver(activity);
        if (deejungTransferLandingActivity != null) {
            if (!((deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) || (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity)) == null || deejungTransferLandingActivity == null)) {
                if (!deejungTransferLandingActivity.MediaSessionCompat$Token || !MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity)) {
                    deejungTransferLandingActivity.MediaSessionCompat$Token = false;
                } else {
                    deejungTransferLandingActivity.MediaSessionCompat$Token = true;
                }
                if (deejungTransferLandingActivity.MediaSessionCompat$Token) {
                    MediaBrowserCompat$CustomActionResultReceiver2.setBackgroundResource(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_tracked_element_background);
                } else {
                    MediaBrowserCompat$CustomActionResultReceiver2.setBackgroundResource(17170445);
                }
            }
        }
        List<View> list = this.f3125x50fd9e4a;
        if (!(list == null || list.size() == 0)) {
            for (int i = 0; i < this.f3125x50fd9e4a.size(); i++) {
                BondSelectionActivity.IconCompatParcelizer(activity, this.f3125x50fd9e4a.get(i));
            }
            this.f3125x50fd9e4a.clear();
        }
        BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
        for (int i2 = 0; i2 < bondSelectionActivity.MediaMetadataCompat.size(); i2++) {
            bondSelectionActivity.MediaMetadataCompat.get(i2).setVisibility(0);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
        if (!(MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.getData() == null)) {
            TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
            Captures[] capturePoints = MediaBrowserCompat$ItemReceiver2.getData().getCapturePoints();
            for (int i = 0; i < trackingPoints.length; i++) {
                if (trackingPoints[i].getPath() != null && trackingPoints[i].getPath().equals(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
                    return true;
                }
            }
            if (!(deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem))) {
                for (int i2 = 0; i2 < capturePoints.length; i2++) {
                    if (capturePoints[i2].getPath() != null && capturePoints[i2].getPath().equals(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean RatingCompat(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
        TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
        Captures[] capturePoints = MediaBrowserCompat$ItemReceiver2.getData().getCapturePoints();
        int MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.ParcelableVolumeInfo);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == -1) {
            return false;
        }
        for (int i = 0; i < trackingPoints.length; i++) {
            if (trackingPoints[i].getPath() != null && trackingPoints[i].getPath().contains("*") && DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(trackingPoints[i].getPath(), MediaBrowserCompat$CustomActionResultReceiver2).equals(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
                return true;
            }
        }
        for (int i2 = 0; i2 < capturePoints.length; i2++) {
            if (capturePoints[i2].getPath() != null && capturePoints[i2].getPath().contains("*") && DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(capturePoints[i2].getPath(), MediaBrowserCompat$CustomActionResultReceiver2).equals(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.BondErrorNoAccountsActivity$read */
    static class read {
        ArrayList<String> IconCompatParcelizer;
        ArrayList<String> MediaBrowserCompat$CustomActionResultReceiver;
        DeejungTransferLandingActivity write;

        read(DeejungTransferLandingActivity deejungTransferLandingActivity, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
            this.write = deejungTransferLandingActivity;
            this.IconCompatParcelizer = arrayList;
            this.MediaBrowserCompat$CustomActionResultReceiver = arrayList2;
        }
    }

    public final void disconnect() {
        try {
            if (this.PlaybackStateCompat$CustomAction != null) {
                this.PlaybackStateCompat$CustomAction.read();
            }
            MediaBrowserCompat$ItemReceiver(this.read);
            this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        } catch (Throwable th) {
            this.read = null;
            this.PlaybackStateCompat$CustomAction = null;
            throw th;
        }
        this.read = null;
        this.PlaybackStateCompat$CustomAction = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver(android.app.Activity r13, p040o.DeejungTransferLandingActivity r14, java.util.LinkedList<android.view.View> r15) {
        /*
            r12 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.util.ArrayList<o.DeejungTransferLandingActivity> r2 = r14.read
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0062
            java.util.ArrayList<o.DeejungTransferLandingActivity> r2 = r14.read
            java.lang.Object r2 = r2.get(r1)
            o.DeejungTransferLandingActivity r2 = (p040o.DeejungTransferLandingActivity) r2
            o.ECouponSuccessfulActivity r3 = r2.f3129x50fd9e4a
            boolean r3 = r3.write
            if (r3 == 0) goto L_0x005f
            boolean r3 = r2.MediaSessionCompat$Token
            r4 = -1
            if (r3 != 0) goto L_0x0033
            boolean r3 = r12.MediaBrowserCompat$ItemReceiver((p040o.DeejungTransferLandingActivity) r2)
            if (r3 != 0) goto L_0x0033
            o.ECouponSuccessfulActivity r3 = r2.f3129x50fd9e4a
            boolean r3 = r3.MediaBrowserCompat$ItemReceiver
            if (r3 != 0) goto L_0x0031
            o.ECouponSuccessfulActivity r3 = r2.f3129x50fd9e4a
            boolean r3 = r3.read
            if (r3 != 0) goto L_0x0031
            r5 = r4
            goto L_0x0035
        L_0x0031:
            r3 = 6
            goto L_0x0034
        L_0x0033:
            r3 = 5
        L_0x0034:
            r5 = r3
        L_0x0035:
            android.view.View r3 = r2.IconCompatParcelizer
            int[] r3 = p040o.BondSelectionActivity.MediaBrowserCompat$ItemReceiver(r3)
            if (r5 == r4) goto L_0x005f
            android.view.View r4 = r2.IconCompatParcelizer
            int r7 = r4.getWidth()
            android.view.View r4 = r2.IconCompatParcelizer
            int r8 = r4.getHeight()
            r9 = r3[r0]
            r4 = 1
            r10 = r3[r4]
            int[] r11 = r12.ParcelableVolumeInfo
            r6 = r13
            android.view.View r3 = p040o.BondSelectionActivity.MediaBrowserCompat$ItemReceiver(r5, r6, r7, r8, r9, r10, r11)
            r15.add(r3)
            o.BondSelectionActivity r4 = r12.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r2 = r2.ParcelableVolumeInfo
            r4.write(r13, r2, r3)
        L_0x005f:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(android.app.Activity, o.DeejungTransferLandingActivity, java.util.LinkedList):void");
    }

    private void read(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, LinkedList<View> linkedList) {
        View view;
        View view2;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
        if (deejungTransferLandingActivity2 != null && deejungTransferLandingActivity2.f3129x50fd9e4a != null) {
            ECouponSuccessfulActivity eCouponSuccessfulActivity = deejungTransferLandingActivity2.f3129x50fd9e4a;
            if (!eCouponSuccessfulActivity.write) {
                return;
            }
            if ((eCouponSuccessfulActivity.read || eCouponSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver || eCouponSuccessfulActivity.MediaBrowserCompat$ItemReceiver) && (view = deejungTransferLandingActivity2.IconCompatParcelizer) != null) {
                int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(view);
                if (deejungTransferLandingActivity2.MediaSessionCompat$Token) {
                    view2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(5, activity, view.getWidth(), view.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], this.ParcelableVolumeInfo);
                } else {
                    view2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(6, activity, view.getWidth(), view.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], this.ParcelableVolumeInfo);
                }
                linkedList.add(view2);
                this.MediaBrowserCompat$SearchResultReceiver.write(activity, deejungTransferLandingActivity2.ParcelableVolumeInfo, view2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void IconCompatParcelizer(android.app.Activity r17, p040o.DeejungTransferLandingActivity r18, java.util.LinkedList<android.view.View> r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            java.lang.String r3 = "TI"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0094
            o.ECouponSuccessfulActivity r2 = r1.f3129x50fd9e4a
            java.lang.String r2 = r2.MediaMetadataCompat
            java.lang.String r3 = "STI"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0094
            o.DeejungTransferLandingActivity r2 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r2 != 0) goto L_0x0021
            return
        L_0x0021:
            r3 = 0
            r4 = r3
        L_0x0023:
            java.util.ArrayList<o.DeejungTransferLandingActivity> r5 = r2.read
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0094
            java.util.ArrayList<o.DeejungTransferLandingActivity> r5 = r2.read
            java.lang.Object r5 = r5.get(r4)
            o.DeejungTransferLandingActivity r5 = (p040o.DeejungTransferLandingActivity) r5
            java.lang.String r6 = r1.ParcelableVolumeInfo
            java.lang.String r7 = r5.ParcelableVolumeInfo
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x008d
            o.ECouponSuccessfulActivity r6 = r5.f3129x50fd9e4a
            boolean r6 = r6.write
            if (r6 == 0) goto L_0x008d
            android.view.View r6 = r5.IconCompatParcelizer
            int[] r6 = p040o.BondSelectionActivity.MediaBrowserCompat$ItemReceiver(r6)
            boolean r7 = r0.MediaBrowserCompat$ItemReceiver((p040o.DeejungTransferLandingActivity) r5)
            r8 = -1
            if (r7 == 0) goto L_0x0053
            r7 = 5
        L_0x0051:
            r9 = r7
            goto L_0x0063
        L_0x0053:
            o.ECouponSuccessfulActivity r7 = r5.f3129x50fd9e4a
            boolean r7 = r7.MediaBrowserCompat$ItemReceiver
            if (r7 != 0) goto L_0x0061
            o.ECouponSuccessfulActivity r7 = r5.f3129x50fd9e4a
            boolean r7 = r7.read
            if (r7 != 0) goto L_0x0061
            r9 = r8
            goto L_0x0063
        L_0x0061:
            r7 = 6
            goto L_0x0051
        L_0x0063:
            if (r9 == r8) goto L_0x008d
            android.view.View r7 = r5.IconCompatParcelizer
            int r11 = r7.getWidth()
            android.view.View r7 = r5.IconCompatParcelizer
            int r12 = r7.getHeight()
            r13 = r6[r3]
            r7 = 1
            r14 = r6[r7]
            int[] r15 = r0.ParcelableVolumeInfo
            r10 = r17
            android.view.View r6 = p040o.BondSelectionActivity.MediaBrowserCompat$ItemReceiver(r9, r10, r11, r12, r13, r14, r15)
            r7 = r19
            r7.add(r6)
            o.BondSelectionActivity r8 = r0.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r5 = r5.ParcelableVolumeInfo
            r9 = r17
            r8.write(r9, r5, r6)
            goto L_0x0091
        L_0x008d:
            r9 = r17
            r7 = r19
        L_0x0091:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondErrorNoAccountsActivity.IconCompatParcelizer(android.app.Activity, o.DeejungTransferLandingActivity, java.util.LinkedList):void");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, int[] iArr) {
        int i;
        int i2;
        int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
        if (deejungTransferLandingActivity.IconCompatParcelizer.isShown()) {
            ECouponSuccessfulActivity eCouponSuccessfulActivity = deejungTransferLandingActivity.f3129x50fd9e4a;
            if (eCouponSuccessfulActivity.MediaBrowserCompat$ItemReceiver || eCouponSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver || eCouponSuccessfulActivity.read) {
                if (deejungTransferLandingActivity.MediaSessionCompat$Token && !deejungTransferLandingActivity.RatingCompat) {
                    i2 = 2;
                } else if (deejungTransferLandingActivity.MediaSessionCompat$Token && deejungTransferLandingActivity.RatingCompat) {
                    i2 = 3;
                } else if (deejungTransferLandingActivity.MediaMetadataCompat) {
                    i2 = 10;
                } else {
                    i = 0;
                    View MediaBrowserCompat$ItemReceiver3 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(i, activity, deejungTransferLandingActivity.IconCompatParcelizer.getWidth(), deejungTransferLandingActivity.IconCompatParcelizer.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], iArr);
                    MediaBrowserCompat$ItemReceiver3.setOnClickListener(new ServiceAtBankingAgentCoachMarkActivity_ViewBinding(this, deejungTransferLandingActivity));
                    this.MediaBrowserCompat$SearchResultReceiver.write(activity, deejungTransferLandingActivity.ParcelableVolumeInfo, MediaBrowserCompat$ItemReceiver3);
                }
                i = i2;
                View MediaBrowserCompat$ItemReceiver32 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(i, activity, deejungTransferLandingActivity.IconCompatParcelizer.getWidth(), deejungTransferLandingActivity.IconCompatParcelizer.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], iArr);
                MediaBrowserCompat$ItemReceiver32.setOnClickListener(new ServiceAtBankingAgentCoachMarkActivity_ViewBinding(this, deejungTransferLandingActivity));
                this.MediaBrowserCompat$SearchResultReceiver.write(activity, deejungTransferLandingActivity.ParcelableVolumeInfo, MediaBrowserCompat$ItemReceiver32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, int[] iArr) {
        boolean z = false;
        if ((deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) && deejungTransferLandingActivity.IconCompatParcelizer.getVisibility() != 8 && deejungTransferLandingActivity.IconCompatParcelizer.getVisibility() != 4) {
            int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
            DeejungTransferLandingActivity.write write2 = deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver;
            write2.IconCompatParcelizer[0] = MediaBrowserCompat$ItemReceiver2[0];
            write2.IconCompatParcelizer[1] = MediaBrowserCompat$ItemReceiver2[1];
            write2.write[0] = deejungTransferLandingActivity.IconCompatParcelizer.getWidth();
            write2.write[1] = deejungTransferLandingActivity.IconCompatParcelizer.getHeight();
            if (deejungTransferLandingActivity.write) {
                int[] MediaBrowserCompat$ItemReceiver3 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
                DeejungTransferLandingActivity.write write3 = deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver;
                int[] MediaBrowserCompat$ItemReceiver4 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                if (MediaBrowserCompat$ItemReceiver4[1] < MediaBrowserCompat$ItemReceiver3[1]) {
                    int i = MediaBrowserCompat$ItemReceiver3[1] - MediaBrowserCompat$ItemReceiver4[1];
                    write3.write[1] = write3.write[1] + i;
                    write3.IconCompatParcelizer[1] = MediaBrowserCompat$ItemReceiver4[1];
                    deejungTransferLandingActivity.MediaBrowserCompat$CustomActionResultReceiver = i;
                }
            }
            View IconCompatParcelizer2 = BondSelectionActivity.IconCompatParcelizer(1, activity, deejungTransferLandingActivity, iArr);
            this.MediaBrowserCompat$SearchResultReceiver.write(activity, deejungTransferLandingActivity.ParcelableVolumeInfo, IconCompatParcelizer2);
            InteractionRegionResponse MediaBrowserCompat$ItemReceiver5 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
            if (MediaBrowserCompat$ItemReceiver5 != null && MediaBrowserCompat$ItemReceiver5.getData().getTrackingPoints().length > 0) {
                TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver5.getData().getTrackingPoints();
                int i2 = 0;
                while (true) {
                    if (i2 >= trackingPoints.length) {
                        break;
                    } else if (trackingPoints[i2].getTrackingPointType().equals(TrackingPointData.ON_LOAD_TYPE)) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
            sb.append("_border");
            bondSelectionActivity.write(activity, sb.toString(), BondSelectionActivity.IconCompatParcelizer(z ? 7 : 9, activity, deejungTransferLandingActivity, iArr));
            IconCompatParcelizer2.setOnClickListener(new GenerateQRActivity(this, deejungTransferLandingActivity, activity));
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, List<View> list, boolean z) {
        int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.IconCompatParcelizer);
        View MediaBrowserCompat$ItemReceiver3 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(((!z || !IconCompatParcelizer(deejungTransferLandingActivity)) && (z || !MediaDescriptionCompat(deejungTransferLandingActivity))) ? 4 : 3, activity, deejungTransferLandingActivity.IconCompatParcelizer.getWidth(), deejungTransferLandingActivity.IconCompatParcelizer.getHeight(), MediaBrowserCompat$ItemReceiver2[0], MediaBrowserCompat$ItemReceiver2[1], this.ParcelableVolumeInfo);
        list.add(MediaBrowserCompat$ItemReceiver3);
        BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
        sb.append("_copy");
        bondSelectionActivity.write(activity, sb.toString(), MediaBrowserCompat$ItemReceiver3);
    }

    private static boolean IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        return deejungTransferLandingActivity.MediaMetadataCompat || (deejungTransferLandingActivity.MediaDescriptionCompat && deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.MediaMetadataCompat);
    }

    private boolean MediaDescriptionCompat(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (!deejungTransferLandingActivity.MediaSessionCompat$Token && ((!deejungTransferLandingActivity.MediaDescriptionCompat || !deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$Token) && !MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity))) {
            if (!(deejungTransferLandingActivity.MediaDescriptionCompat && MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper))) {
                return false;
            }
        }
        return true;
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
            BondSelectionActivity bondSelectionActivity = this.MediaBrowserCompat$SearchResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
            sb.append("_border");
            return bondSelectionActivity.RatingCompat.get(sb.toString());
        }
        BondSelectionActivity bondSelectionActivity2 = this.MediaBrowserCompat$SearchResultReceiver;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
        sb2.append("_copy");
        return bondSelectionActivity2.RatingCompat.get(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        View IconCompatParcelizer2;
        if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("NV")) {
            this.MediaSessionCompat$Token = deejungTransferLandingActivity;
            this.MediaBrowserCompat$ItemReceiver = new ArrayList<>(arrayList);
        } else if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("FAB")) {
            this.IconCompatParcelizer = deejungTransferLandingActivity;
        } else if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals(ASN1Encoding.f5569DL) && this.MediaSessionCompat$Token == null && (IconCompatParcelizer2 = AlertController$RecycleListView.IconCompatParcelizer((DrawerLayout) deejungTransferLandingActivity.IconCompatParcelizer)) != null) {
            this.MediaSessionCompat$Token = DeejungTransferMinFullConfirmationActivity_ViewBinding.write(deejungTransferLandingActivity, IconCompatParcelizer2);
            this.MediaBrowserCompat$ItemReceiver = new ArrayList<>(arrayList);
        }
        if (arrayList.contains(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
            deejungTransferLandingActivity.MediaSessionCompat$Token = true;
        }
        if (arrayList2.contains(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
            deejungTransferLandingActivity.MediaMetadataCompat = true;
        }
        MediaBrowserCompat$CustomActionResultReceiver(activity, deejungTransferLandingActivity, this.ParcelableVolumeInfo);
        Collections.sort(deejungTransferLandingActivity.read, new Comparator<DeejungTransferLandingActivity>() {
            public final /* synthetic */ int compare(
/*
Method generation error in method: o.DeejungTransferLandingActivity.4.compare(java.lang.Object, java.lang.Object):int, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.DeejungTransferLandingActivity.4.compare(java.lang.Object, java.lang.Object):int, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
            MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity.read.get(i), arrayList, arrayList2);
        }
    }
}
