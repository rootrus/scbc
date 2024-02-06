package p040o;

import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.OneRuntimeServiceApi;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ECouponCommonActivity_ViewBinding */
public final class ECouponCommonActivity_ViewBinding {
    public URI AlertController$RecycleListView;
    boolean IconCompatParcelizer;
    String Keep;
    DeviceInfo MediaBrowserCompat$CustomActionResultReceiver;
    FundFactSheetActivity<FragmentBuilder_BindHomeAddressFragment, Boolean> MediaBrowserCompat$ItemReceiver;
    public List<C6437x1b3a90a2> MediaBrowserCompat$MediaItem = Collections.synchronizedList(new ArrayList());
    String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f3133x50fd9e4a = false;
    public Boolean MediaDescriptionCompat = Boolean.FALSE;
    public List<C6437x1b3a90a2> MediaMetadataCompat = Collections.synchronizedList(new ArrayList());
    FragmentBuilder_BindHmlOperatingBankFragment MediaSessionCompat$QueueItem;
    public FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaSessionCompat$ResultReceiverWrapper;
    String MediaSessionCompat$Token;
    public FragmentBuilder_BindHmlNTBDocumentListFragment ParcelableVolumeInfo = new FragmentBuilder_BindHmlNTBDocumentListFragment();
    private OneRuntimeServiceApi PlaybackStateCompat;
    private FragmentBuilder_BindHmlETBBusinessInformationFragment PlaybackStateCompat$CustomAction;
    boolean RatingCompat;
    public boolean read;
    public boolean write;

    private static boolean write(int i) {
        return i == 16 || i == 17 || i == 18 || i == 19;
    }

    public ECouponCommonActivity_ViewBinding(OneRuntimeServiceApi oneRuntimeServiceApi, FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment, FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.PlaybackStateCompat = oneRuntimeServiceApi;
        this.PlaybackStateCompat$CustomAction = fragmentBuilder_BindHmlETBBusinessInformationFragment;
        HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new DeejungTransferInstallmentOtpActivity(this));
    }

    public final void read(C6437x1b3a90a2 eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        String str;
        if (this.MediaDescriptionCompat.booleanValue()) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, C6557x2438d01c.MediaBrowserCompat$ItemReceiver("QueueManager", "addToQueue"));
        } else if (this.write || write(eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver)) {
            this.MediaBrowserCompat$MediaItem.add(IconCompatParcelizer(eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver));
            if (!this.f3133x50fd9e4a && !this.IconCompatParcelizer && !this.write && this.read) {
                MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem.get(0));
            }
        } else {
            int i = eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver != null ? eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write : -1;
            String uri = (eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver == null || eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == null) ? "missing uri" : eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getUri();
            FragmentBuilder_BindLoanFragment fragmentBuilder_BindLoanFragment = FragmentBuilder_BindLoanFragment.DENIED_INTERACTION;
            Object[] objArr = new Object[4];
            objArr[0] = uri;
            objArr[1] = Integer.valueOf(i);
            FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaSessionCompat$ResultReceiverWrapper;
            String str2 = "";
            if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null) {
                str = fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read;
            } else {
                str = str2;
            }
            objArr[2] = str;
            URI uri2 = this.AlertController$RecycleListView;
            if (uri2 != null) {
                str2 = uri2.toString();
            }
            objArr[3] = str2;
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindLoanFragment, objArr);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.f3133x50fd9e4a = false;
        if (z) {
            if (!this.MediaMetadataCompat.isEmpty()) {
                this.MediaMetadataCompat.remove(0);
            }
        } else if (!this.MediaBrowserCompat$MediaItem.isEmpty()) {
            this.MediaBrowserCompat$MediaItem.remove(0);
        }
        if (!this.MediaBrowserCompat$MediaItem.isEmpty()) {
            MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem.get(0));
        } else if (!this.MediaMetadataCompat.isEmpty()) {
            MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.get(0));
        }
    }

    private String write(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaSessionCompat$Token);
        sb.append("/one/oauth1/rt/api/2.0/interaction?sk=");
        sb.append(str);
        String obj = sb.toString();
        String str2 = this.Keep;
        if (str2 == null || str2.isEmpty()) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("&tid=");
        sb2.append(this.Keep);
        return sb2.toString();
    }

    private String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        BaseResponse MediaBrowserCompat$CustomActionResultReceiver2 = this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver(str);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null && (this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver instanceof BaseResponse)) {
            MediaBrowserCompat$CustomActionResultReceiver2 = (BaseResponse) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            if (!((MediaBrowserCompat$CustomActionResultReceiver2 == null || MediaBrowserCompat$CustomActionResultReceiver2.getCaptures() == null || MediaBrowserCompat$CustomActionResultReceiver2.getCaptures().length == 0) ? false : true)) {
                return null;
            }
            for (Captures captures : MediaBrowserCompat$CustomActionResultReceiver2.getCaptures()) {
                if (captures.getPath() != null && !captures.getPath().isEmpty() && captures.getPath().equals(str2)) {
                    return captures.getId();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Send captures point error: capture point with path ");
        sb.append(str2);
        sb.append(" not found in the interaction context");
        MyECouponActivity_ViewBinding.write(sb.toString());
        return null;
    }

    private String read(String str, String str2) {
        BaseResponse MediaBrowserCompat$CustomActionResultReceiver2 = this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver(str);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null && (this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver instanceof BaseResponse)) {
            MediaBrowserCompat$CustomActionResultReceiver2 = (BaseResponse) this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            if (!((MediaBrowserCompat$CustomActionResultReceiver2 == null || MediaBrowserCompat$CustomActionResultReceiver2.getTrackers() == null || MediaBrowserCompat$CustomActionResultReceiver2.getTrackers().length == 0) ? false : true)) {
                return null;
            }
            for (Trackers trackers : MediaBrowserCompat$CustomActionResultReceiver2.getTrackers()) {
                if (trackers.getPath() != null && trackers.getPattern().matcher(str2).matches()) {
                    return trackers.getId();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Send tracking point error: tracking point with path ");
        sb.append(str2);
        sb.append(" not found in the interaction context");
        MyECouponActivity_ViewBinding.write(sb.toString());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0202 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0227 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0240 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x028f A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02de A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0333 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0385 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03d7 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0450 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04c9 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0105 A[SYNTHETIC, Splitter:B:80:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0109 A[SYNTHETIC, Splitter:B:82:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0170 A[Catch:{ Exception -> 0x0527 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x0039=Splitter:B:18:0x0039, B:76:0x00fb=Splitter:B:76:0x00fb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.C6437x1b3a90a2 r15) {
        /*
            r14 = this;
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0527 }
            java.lang.Boolean r2 = r14.MediaDescriptionCompat     // Catch:{ Exception -> 0x0527 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x0019
            o.MyECouponActivity_ViewBinding$write r15 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = "QueueManager"
            java.lang.String r2 = "sendRequest"
            java.lang.String r1 = p040o.C6557x2438d01c.MediaBrowserCompat$ItemReceiver(r1, r2)     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r15, (java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0019:
            boolean r1 = r14.write((p040o.C6437x1b3a90a2) r15)     // Catch:{ Exception -> 0x0527 }
            r2 = 15
            java.lang.String r3 = ""
            r4 = 1
            if (r1 != 0) goto L_0x006f
            if (r15 == 0) goto L_0x0029
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            goto L_0x002a
        L_0x0029:
            r1 = -1
        L_0x002a:
            if (r15 == 0) goto L_0x0037
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r5 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            if (r5 == 0) goto L_0x0037
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r15 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r15 = r15.getUri()     // Catch:{ Exception -> 0x0527 }
            goto L_0x0039
        L_0x0037:
            java.lang.String r15 = "missing uri"
        L_0x0039:
            o.FragmentBuilder_BindLoanFragment r5 = p040o.FragmentBuilder_BindLoanFragment.DENIED_INTERACTION     // Catch:{ Exception -> 0x0527 }
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0527 }
            r6[r0] = r15     // Catch:{ Exception -> 0x0527 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0527 }
            r6[r4] = r15     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r15 = r14.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ Exception -> 0x0527 }
            if (r15 == 0) goto L_0x004f
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r15 = r14.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ Exception -> 0x0527 }
            java.lang.String r15 = r15.read     // Catch:{ Exception -> 0x0527 }
            goto L_0x0050
        L_0x004f:
            r15 = r3
        L_0x0050:
            r7 = 2
            r6[r7] = r15     // Catch:{ Exception -> 0x0527 }
            java.net.URI r15 = r14.AlertController$RecycleListView     // Catch:{ Exception -> 0x0527 }
            if (r15 == 0) goto L_0x005d
            java.net.URI r15 = r14.AlertController$RecycleListView     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x0527 }
        L_0x005d:
            r15 = 3
            r6[r15] = r3     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)     // Catch:{ Exception -> 0x0527 }
            if (r1 == r2) goto L_0x006b
            r15 = 17
            if (r1 != r15) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r4 = r0
        L_0x006b:
            r14.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x006f:
            r14.f3133x50fd9e4a = r4     // Catch:{ Exception -> 0x0527 }
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            r5 = 12
            if (r1 == r5) goto L_0x0084
            com.thunderhead.connectivity.NetworkOperationCallback r1 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            boolean r1 = r1 instanceof p040o.AmortizationActivity_ViewBinding     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x0084
            com.thunderhead.connectivity.NetworkOperationCallback r1 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            o.AmortizationActivity_ViewBinding r1 = (p040o.AmortizationActivity_ViewBinding) r1     // Catch:{ Exception -> 0x0527 }
            r1.MediaBrowserCompat$CustomActionResultReceiver(r15)     // Catch:{ Exception -> 0x0527 }
        L_0x0084:
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            r5 = 8
            if (r1 == r5) goto L_0x0097
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            if (r1 == r2) goto L_0x0097
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            r2 = 14
            if (r1 != r2) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r1 = r0
            goto L_0x0098
        L_0x0097:
            r1 = r4
        L_0x0098:
            if (r1 == 0) goto L_0x00d3
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x00d3
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r2 = r2.getDeviceInfo()     // Catch:{ Exception -> 0x0527 }
            if (r2 != 0) goto L_0x00b2
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r5 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            if (r5 == 0) goto L_0x00b2
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r2 = new com.thunderhead.android.infrastructure.server.entitys.DeviceInfo     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r5 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0527 }
            goto L_0x00b9
        L_0x00b2:
            if (r2 != 0) goto L_0x00b9
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r2 = new com.thunderhead.android.infrastructure.server.entitys.DeviceInfo     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
        L_0x00b9:
            java.lang.String r5 = r2.getPushToken()     // Catch:{ Exception -> 0x0527 }
            if (r5 == 0) goto L_0x00c9
            java.lang.String r5 = r2.getPushToken()     // Catch:{ Exception -> 0x0527 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r5 == 0) goto L_0x00ce
        L_0x00c9:
            java.lang.String r5 = r14.MediaBrowserCompat$SearchResultReceiver     // Catch:{ Exception -> 0x0527 }
            r2.setPushToken(r5)     // Catch:{ Exception -> 0x0527 }
        L_0x00ce:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r5 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            r5.setDeviceInfo(r2)     // Catch:{ Exception -> 0x0527 }
        L_0x00d3:
            if (r1 == 0) goto L_0x00ee
            boolean r1 = r14.RatingCompat     // Catch:{ Exception -> 0x0527 }
            if (r1 != 0) goto L_0x00ee
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x00ee
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r1 = r1.getDeviceInfo()     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x00ee
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.entitys.DeviceInfo r1 = r1.getDeviceInfo()     // Catch:{ Exception -> 0x0527 }
            r1.setPushToken(r3)     // Catch:{ Exception -> 0x0527 }
        L_0x00ee:
            int r1 = r15.write     // Catch:{ Exception -> 0x0527 }
            boolean r1 = write((int) r1)     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x00f9
            java.lang.String r1 = "programmatic"
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r1 = "automatic"
        L_0x00fb:
            int r2 = r15.write     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send "
            java.lang.String r5 = "; "
            r6 = 0
            switch(r2) {
                case 1: goto L_0x04c9;
                case 2: goto L_0x0105;
                case 3: goto L_0x0450;
                case 4: goto L_0x03d7;
                case 5: goto L_0x0385;
                case 6: goto L_0x0333;
                case 7: goto L_0x0105;
                case 8: goto L_0x02de;
                case 9: goto L_0x028f;
                case 10: goto L_0x0240;
                case 11: goto L_0x0227;
                case 12: goto L_0x0202;
                case 13: goto L_0x01b3;
                case 14: goto L_0x0170;
                case 15: goto L_0x0109;
                case 16: goto L_0x02de;
                case 17: goto L_0x0109;
                case 18: goto L_0x04c9;
                case 19: goto L_0x0333;
                default: goto L_0x0105;
            }
        L_0x0105:
            o.MyECouponActivity_ViewBinding$write r15 = p040o.MyECouponActivity_ViewBinding.write     // Catch:{ Exception -> 0x0527 }
            goto L_0x0521
        L_0x0109:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0168 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0168 }
            r7.<init>()     // Catch:{ Exception -> 0x0168 }
            r7.append(r3)     // Catch:{ Exception -> 0x0168 }
            r7.append(r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = " offline interaction request. Body:"
            r7.append(r1)     // Catch:{ Exception -> 0x0168 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0168 }
            r7.append(r1)     // Catch:{ Exception -> 0x0168 }
            r7.append(r5)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = r14.write((java.lang.String) r1)     // Catch:{ Exception -> 0x0168 }
            r7.append(r1)     // Catch:{ Exception -> 0x0168 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0168 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x0168 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r1 = r15.read     // Catch:{ Exception -> 0x0168 }
            if (r1 != 0) goto L_0x0140
            o.FragmentBuilder_BindManageNotificationFragment r1 = p040o.FragmentBuilder_BindManageNotificationFragment.OFFLINE_INTERACTION_HOST_MISSING     // Catch:{ Exception -> 0x0168 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ Exception -> 0x0168 }
        L_0x0140:
            com.thunderhead.connectivity.OneRuntimeServiceApi r5 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0168 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r1 = r15.read     // Catch:{ Exception -> 0x0168 }
            java.lang.String r7 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0168 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r2 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0168 }
            java.lang.Object r2 = r2.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0168 }
            o.OnBoardingTutorialActivity r2 = (p040o.OnBoardingTutorialActivity) r2     // Catch:{ Exception -> 0x0168 }
            java.lang.String r2 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ Exception -> 0x0168 }
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x0168 }
            if (r3 == 0) goto L_0x015c
            r8 = r6
            goto L_0x015d
        L_0x015c:
            r8 = r2
        L_0x015d:
            java.lang.String r9 = r14.Keep     // Catch:{ Exception -> 0x0168 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r10 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0168 }
            com.thunderhead.connectivity.NetworkOperationCallback r11 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0168 }
            r6 = r1
            r5.sendOfflineInteraction(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0168 }
            return
        L_0x0168:
            r15 = move-exception
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r15)     // Catch:{ Exception -> 0x0527 }
            r14.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0170:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send one-appinstall interaction request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x01a8
            r10 = r6
            goto L_0x01a9
        L_0x01a8:
            r10 = r1
        L_0x01a9:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendInteraction(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x01b3:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send push token request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x01f7
            r10 = r6
            goto L_0x01f8
        L_0x01f7:
            r10 = r1
        L_0x01f8:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendPushToken(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0202:
            com.thunderhead.connectivity.OneRuntimeServiceApi r1 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r2 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r4 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r4 = r4.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r4 = (p040o.OnBoardingTutorialActivity) r4     // Catch:{ Exception -> 0x0527 }
            java.lang.String r4 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ Exception -> 0x0527 }
            boolean r5 = r4.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r5 == 0) goto L_0x021d
            r4 = r6
        L_0x021d:
            java.lang.String r5 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r6 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r7 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r1.sendAnalyticsData(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0227:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = "Clear User Profile"
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r1 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            if (r1 == 0) goto L_0x023c
            com.thunderhead.connectivity.NetworkOperationCallback r15 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = new java.lang.Object     // Catch:{ Exception -> 0x0527 }
            r1.<init>()     // Catch:{ Exception -> 0x0527 }
            r15.onSuccess(r1)     // Catch:{ Exception -> 0x0527 }
        L_0x023c:
            r14.MediaBrowserCompat$CustomActionResultReceiver(r0)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0240:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send tracking point key(s) request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x0284
            r10 = r6
            goto L_0x0285
        L_0x0284:
            r10 = r1
        L_0x0285:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendAnalyticsData(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x028f:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send captures bundle request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x02d3
            r10 = r6
            goto L_0x02d4
        L_0x02d3:
            r10 = r1
        L_0x02d4:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendAnalyticsData(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x02de:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r4.<init>()     // Catch:{ Exception -> 0x0527 }
            r4.append(r3)     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = " track interaction request. Body:"
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            r4.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r14.write((java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x0328
            r10 = r6
            goto L_0x0329
        L_0x0328:
            r10 = r1
        L_0x0329:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendInteraction(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0333:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send properties request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x0377
            r10 = r6
            goto L_0x0378
        L_0x0377:
            r10 = r1
        L_0x0378:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            r12 = r1
            com.thunderhead.android.infrastructure.server.requests.PropertiesRequest r12 = (com.thunderhead.android.infrastructure.server.requests.PropertiesRequest) r12     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendInteractionProperties(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0385:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send Response optimization points. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x03c9
            r10 = r6
            goto L_0x03ca
        L_0x03c9:
            r10 = r1
        L_0x03ca:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            r12 = r1
            com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest r12 = (com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest) r12     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendResponseForOptimizationPoint(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x03d7:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r1 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r1.getInteractionName()     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r2 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r2     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.getPathForMatching()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r14.read(r1, r2)     // Catch:{ Exception -> 0x0527 }
            if (r1 != 0) goto L_0x03f3
            com.thunderhead.connectivity.NetworkOperationCallback r15 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r15.onFailure(r6)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x03f3:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r2 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r2     // Catch:{ Exception -> 0x0527 }
            r2.setElementId(r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r1 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r1     // Catch:{ Exception -> 0x0527 }
            r1.setJsonBody()     // Catch:{ Exception -> 0x0527 }
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send tracking point key request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x0445
            r10 = r6
            goto L_0x0446
        L_0x0445:
            r10 = r1
        L_0x0446:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendAnalyticsData(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0450:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r1 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r1.getInteractionName()     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r2 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r2     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.getPathForMatching()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r14.MediaBrowserCompat$CustomActionResultReceiver(r1, r2)     // Catch:{ Exception -> 0x0527 }
            if (r1 != 0) goto L_0x046c
            com.thunderhead.connectivity.NetworkOperationCallback r15 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r15.onFailure(r6)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x046c:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r2 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r2 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r2     // Catch:{ Exception -> 0x0527 }
            r2.setElementId(r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.ElementDataRequest r1 = (com.thunderhead.android.infrastructure.server.requests.ElementDataRequest) r1     // Catch:{ Exception -> 0x0527 }
            r1.setJsonBody()     // Catch:{ Exception -> 0x0527 }
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r2.<init>()     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = "Send capture point key request. Body:"
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r3 = r14.write((java.lang.String) r3)     // Catch:{ Exception -> 0x0527 }
            r2.append(r3)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x04be
            r10 = r6
            goto L_0x04bf
        L_0x04be:
            r10 = r1
        L_0x04bf:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r12 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendAnalyticsData(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x04c9:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0527 }
            r4.<init>()     // Catch:{ Exception -> 0x0527 }
            r4.append(r3)     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = " touchpoint properties request. Body:"
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            r4.append(r5)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r14.write((java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            r4.append(r1)     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0527 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.OneRuntimeServiceApi r7 = r14.PlaybackStateCompat     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r15.read     // Catch:{ Exception -> 0x0527 }
            java.lang.String r9 = r15.IconCompatParcelizer     // Catch:{ Exception -> 0x0527 }
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()     // Catch:{ Exception -> 0x0527 }
            java.lang.Object r1 = r1.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x0527 }
            o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1     // Catch:{ Exception -> 0x0527 }
            java.lang.String r1 = p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(r1)     // Catch:{ Exception -> 0x0527 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0527 }
            if (r2 == 0) goto L_0x0513
            r10 = r6
            goto L_0x0514
        L_0x0513:
            r10 = r1
        L_0x0514:
            java.lang.String r11 = r14.Keep     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r1 = r15.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0527 }
            r12 = r1
            com.thunderhead.android.infrastructure.server.requests.PropertiesRequest r12 = (com.thunderhead.android.infrastructure.server.requests.PropertiesRequest) r12     // Catch:{ Exception -> 0x0527 }
            com.thunderhead.connectivity.NetworkOperationCallback r13 = r15.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0527 }
            r7.sendBaseTouchpointProperties(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0521:
            java.lang.String r1 = "Unknown request type"
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r15, (java.lang.String) r1)     // Catch:{ Exception -> 0x0527 }
            return
        L_0x0527:
            r15 = move-exception
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r15)
            r14.MediaBrowserCompat$CustomActionResultReceiver(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ECouponCommonActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver):void");
    }

    public final boolean write(C6437x1b3a90a2 eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        if (eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver == null || eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        int i = eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write;
        if (i == 11 || i == 13 || i == 12 || i == 16 || i == 17 || i == 18 || i == 19) {
            return true;
        }
        String uri = eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getUri();
        if (uri != null && !uri.isEmpty()) {
            try {
                return this.MediaBrowserCompat$ItemReceiver.invoke(new FragmentBuilder_BindHomeAddressFragment(URI.create(uri))).booleanValue();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
        return false;
    }

    private C6437x1b3a90a2 IconCompatParcelizer(C6437x1b3a90a2 eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) {
        return new C6437x1b3a90a2(eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write, eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.read == null ? new FragmentBuilder_BindHmlOperatingBankFragment(this.MediaSessionCompat$QueueItem) : eCouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.read);
    }
}
