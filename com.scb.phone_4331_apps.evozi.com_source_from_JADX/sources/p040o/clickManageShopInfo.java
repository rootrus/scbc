package p040o;

import p040o.clickManagePin;

/* renamed from: o.clickManageShopInfo */
public abstract class clickManageShopInfo<J extends clickManagePin> extends MwManageWalletActivity_ViewBinding<J> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public clickManageShopInfo(J j) {
        super(j);
        onGetStartedClick.write((Object) j, "job");
    }
}
