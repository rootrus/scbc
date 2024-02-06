package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.ntb.selectaccount.EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver;
import p040o.FragmentBuilder_BindRegistrationLandingFragment;

/* renamed from: o.DeferredLifecycleHelper */
public final /* synthetic */ class DeferredLifecycleHelper implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment.read IconCompatParcelizer;

    /* renamed from: o.DeferredLifecycleHelper$zaa */
    public final /* synthetic */ class zaa implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ SignInCredential read;

        public /* synthetic */ zaa(SignInCredential signInCredential) {
            this.read = signInCredential;
        }

        public final Object write(Object obj) {
            return this.read.read((getLinearCurrentKeyframeProgress) obj);
        }
    }

    public /* synthetic */ DeferredLifecycleHelper(FragmentBuilder_BindRegistrationLandingFragment.read read) {
        this.IconCompatParcelizer = read;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        boolean equals = "9003".equals(singleDataEntity.getStatus().write());
        String str3 = ((setNoDataText) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
        String str4 = ((setNoDataText) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = ((setNoDataText) singleDataEntity.getData()).read;
        String str6 = ((setNoDataText) singleDataEntity.getData()).IconCompatParcelizer;
        String str7 = ((setNoDataText) singleDataEntity.getData()).write;
        if (equals) {
            str = singleDataEntity.getStatus().MediaBrowserCompat$ItemReceiver();
        } else {
            str = "";
        }
        if (equals) {
            str2 = singleDataEntity.getStatus().IconCompatParcelizer();
        } else {
            str2 = "";
        }
        return DebitCardResetOtpActivity.just(new EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver(str3, str4, str5, str6, str7, equals, str, str2));
    }
}
