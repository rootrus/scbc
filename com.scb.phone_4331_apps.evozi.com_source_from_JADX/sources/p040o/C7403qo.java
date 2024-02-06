package p040o;

import com.scb.phone.view.activity.fastpay.FastPaySettingActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.qo */
public final /* synthetic */ class C7403qo implements AmountEditText$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ FastPaySettingActivity IconCompatParcelizer;

    public /* synthetic */ C7403qo(FastPaySettingActivity fastPaySettingActivity) {
        this.IconCompatParcelizer = fastPaySettingActivity;
    }

    public final boolean read(AmountEditText amountEditText, String str) {
        this.IconCompatParcelizer.cdiFastPaySettingLimitAmount.setActualValue(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str.replaceAll("[^.0-9]", "").split("\\.")[0]).doubleValue());
        return true;
    }
}
