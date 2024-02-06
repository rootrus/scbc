package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.MwCoachMarkActivity */
public class MwCoachMarkActivity<T> extends SmeLoanDetailActivity_ViewBinding<T> implements MwCoachMarkActivity_ViewBinding<T>, TouchPointAccountDetailActivity<T> {

    /* renamed from: o.MwCoachMarkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends HmlDocumentSubmissionTutorialsActivity {
        int IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ MwCoachMarkActivity MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(MwCoachMarkActivity mwCoachMarkActivity, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.MediaBrowserCompat$ItemReceiver = mwCoachMarkActivity;
        }

        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver = obj;
            this.IconCompatParcelizer |= PKIFailureInfo.systemUnavail;
            return MwCoachMarkActivity.read(this.MediaBrowserCompat$ItemReceiver, this);
        }
    }

    public final Object write(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        return read(this, hmlNTBPromptPayNotFoundActivity);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MwCoachMarkActivity(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, boolean z) {
        super(hmlPromptPayVerificationActivity, z);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "parentContext");
    }

    public final <R> void MediaBrowserCompat$ItemReceiver(OccupationSearchActivity<? super R> occupationSearchActivity, BaseDiscoverFundFilterActivity<? super T, ? super HmlNTBPromptPayNotFoundActivity<? super R>, ? extends Object> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        read(occupationSearchActivity, baseDiscoverFundFilterActivity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object read(p040o.MwCoachMarkActivity r4, p040o.HmlNTBPromptPayNotFoundActivity r5) {
        /*
            boolean r0 = r5 instanceof p040o.MwCoachMarkActivity.IconCompatParcelizer
            if (r0 == 0) goto L_0x0014
            r0 = r5
            o.MwCoachMarkActivity$IconCompatParcelizer r0 = (p040o.MwCoachMarkActivity.IconCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.IconCompatParcelizer
            int r5 = r5 + r2
            r0.IconCompatParcelizer = r5
            goto L_0x0019
        L_0x0014:
            o.MwCoachMarkActivity$IconCompatParcelizer r0 = new o.MwCoachMarkActivity$IconCompatParcelizer
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            boolean r4 = r5 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r4 != 0) goto L_0x0029
            goto L_0x0043
        L_0x0029:
            o.HmlVerifyIdentifyActivity$write r5 = (p040o.HmlVerifyIdentifyActivity.write) r5
            java.lang.Throwable r4 = r5.read
            throw r4
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            boolean r2 = r5 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0044
            r0.IconCompatParcelizer = r3
            java.lang.Object r5 = r4.MediaBrowserCompat$ItemReceiver((p040o.HmlNTBPromptPayNotFoundActivity<java.lang.Object>) r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            return r5
        L_0x0044:
            o.HmlVerifyIdentifyActivity$write r5 = (p040o.HmlVerifyIdentifyActivity.write) r5
            java.lang.Throwable r4 = r5.read
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MwCoachMarkActivity.read(o.MwCoachMarkActivity, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
