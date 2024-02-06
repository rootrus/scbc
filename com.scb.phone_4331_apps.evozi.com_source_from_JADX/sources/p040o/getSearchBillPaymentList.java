package p040o;

import android.view.View;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.adapter.easycash.viewholder.AccountSelectorViewHolder;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import java.util.List;

/* renamed from: o.getSearchBillPaymentList */
public final class getSearchBillPaymentList extends AccountSelectorViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getSearchBillPaymentList(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void write(getStream getstream, FundFactSheetActivity<? super getBatteryLevel, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) getstream, "display");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onSelectedReceivingAccount");
        CLSUUID clsuuid = getstream;
        onGetStartedClick.write((Object) clsuuid, "display");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.textHeader;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textHeader");
        }
        customEasyCashSectionLabel.setText(clsuuid.MediaBrowserCompat$CustomActionResultReceiver);
        List<getBatteryLevel> list = getstream.write;
        if (this.PlaybackStateCompat) {
            CustomAccountSelector customAccountSelector = this.accountSelector;
            if (customAccountSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
            }
            customAccountSelector.IconCompatParcelizer(list, new read(list, fundFactSheetActivity));
            fundFactSheetActivity.invoke(list.get(0));
            this.PlaybackStateCompat = false;
        }
    }

    /* renamed from: o.getSearchBillPaymentList$read */
    static final class read implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ FundFactSheetActivity write;

        read(List list, FundFactSheetActivity fundFactSheetActivity) {
            this.IconCompatParcelizer = list;
            this.write = fundFactSheetActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            this.write.invoke(this.IconCompatParcelizer.get(i));
        }
    }
}
