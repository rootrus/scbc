package p040o;

import com.scb.phone.view.activity.bankingagent.C5562xb3a19c4a;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import p040o.PendingResultUtil;
import p040o.ServerProjectProvider;
import p040o.zzdy;

/* renamed from: o.FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment */
public final class FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment implements ServerProjectProvider.C70695 {
    private final FragmentBuilder_BindThirdPartySlipFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final C5562xb3a19c4a MediaBrowserCompat$ItemReceiver;
    private final isEmailAddressIdentifierSupported read;

    public FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment() {
    }

    public static FragmentBuilder_BindHmlNTBOfflineSuccessFragment MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlETBAccountSetupFragment fragmentBuilder_BindHmlETBAccountSetupFragment, String str, String str2, String str3) {
        TrackingPointData trackingPointData;
        String str4 = str3;
        InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = fragmentBuilder_BindHmlETBAccountSetupFragment.MediaBrowserCompat$ItemReceiver(str2);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
            int i = 0;
            while (true) {
                if (i >= trackingPoints.length) {
                    break;
                }
                trackingPointData = trackingPoints[i];
                if (trackingPointData.getId().equals(str4)) {
                    break;
                }
                i++;
            }
        }
        trackingPointData = null;
        if (trackingPointData == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tracking point with id=");
            sb.append(str4);
            sb.append(" wasn't found in a server ");
            sb.append("response");
            MyECouponActivity_ViewBinding.write(sb.toString());
            return new FragmentBuilder_BindHmlNTBOfflineSuccessFragment(str, TrackingPointData.ON_LOAD_TYPE);
        }
        return new FragmentBuilder_BindHmlNTBOfflineSuccessFragment(trackingPointData.getName(), trackingPointData.getId(), trackingPointData.getPath(), trackingPointData.getInteractionId(), trackingPointData.getPropositionId(), trackingPointData.getPropositionName(), trackingPointData.getDataAdapterAttributeId(), trackingPointData.getDataAdapterAttributeName(), trackingPointData.getEventTypeId(), trackingPointData.getEventTypeName(), trackingPointData.getTrackingPointType(), trackingPointData.isGoalCompletion(), trackingPointData.getCreatedDate(), trackingPointData.isEnabled());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment MediaBrowserCompat$CustomActionResultReceiver(p040o.FragmentBuilder_BindHmlETBAccountSetupFragment r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            r0 = r20
            r1 = r22
            r2 = r23
            com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse r0 = r0.MediaBrowserCompat$ItemReceiver(r1)
            if (r0 == 0) goto L_0x002d
            com.thunderhead.android.infrastructure.server.entitys.InteractionData r0 = r0.getData()
            com.thunderhead.android.infrastructure.server.entitys.Captures[] r0 = r0.getCapturePoints()
            r1 = 0
        L_0x0015:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x002d
            r3 = r0[r1]
            java.lang.String r4 = r3.getId()
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = r3.getId()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x002e
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 != 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Capture point with id="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " wasn't found in a server "
            r0.append(r1)
            java.lang.String r1 = "response"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p040o.MyECouponActivity_ViewBinding.write(r0)
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r0 = new o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment
            r1 = r21
            r0.<init>(r1)
            return r0
        L_0x0056:
            java.lang.String r5 = r3.getAttribute()
            java.lang.String r6 = r3.getDataAdapterAttributeId()
            java.lang.String r7 = r3.getCapturePhase()
            java.lang.String r8 = r3.getPath()
            java.lang.String r9 = r3.getDomainName()
            int r10 = r3.getCaptureDelay()
            java.lang.String r11 = r3.getElementType()
            boolean r12 = r3.isEnabled()
            java.lang.String r13 = r3.getCaptureType()
            java.lang.String r14 = r3.getPropositionId()
            java.lang.String r15 = r3.getElementName()
            java.lang.String r16 = r3.getInteractionId()
            java.lang.String r17 = r3.getName()
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r0 = new o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment
            java.lang.String r18 = r3.getTypeName()
            java.lang.String r19 = r3.getId()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.thunderhead.android.infrastructure.server.entitys.AttributeData r1 = r3.getDataAdapterAttribute()
            r0.write(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$CustomActionResultReceiver(o.FragmentBuilder_BindHmlETBAccountSetupFragment, java.lang.String, java.lang.String, java.lang.String):o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment");
    }

    @HmlPinActivity
    public FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment(C5562xb3a19c4a bankingAgentTCActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindThirdPartySlipFragment fragmentBuilder_BindThirdPartySlipFragment, isEmailAddressIdentifierSupported isemailaddressidentifiersupported) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentTCActivity$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindThirdPartySlipFragment;
        this.read = isemailaddressidentifiersupported;
    }

    public final DebitCardResetOtpActivity<setOnCameraIdleListener> MediaBrowserCompat$CustomActionResultReceiver(softKeys softkeys) {
        return this.MediaBrowserCompat$ItemReceiver.write.getEkycOtpCode(softkeys).map(new PendingResultUtil.zaa(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<setLocationSource> write(weakKeys weakkeys) {
        return this.MediaBrowserCompat$ItemReceiver.write.getLoanoriginationOtpCode(weakkeys).map(zaau.read).map(new zzcn(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<setOnCameraIdleListener> read(softKeys softkeys) {
        return this.MediaBrowserCompat$ItemReceiver.write.getOtpCode(softkeys).map(new PendingResultUtil.zaa(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<zzdy.zzb> MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.write.requestEmailOtp().map(new writeStringSparseArray(this.read));
    }
}
