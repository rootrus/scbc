package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import java.util.ArrayList;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.setCardElevation;
import p040o.setTitleMarginStart;

class CardlessWithdrawAmountFragment$MediaBrowserCompat$ItemReceiver extends setCardElevation {
    private /* synthetic */ CardlessWithdrawAmountFragment read;

    public final int getCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CardlessWithdrawAmountFragment$MediaBrowserCompat$ItemReceiver(CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment, setTitleMarginStart settitlemarginstart) {
        super(settitlemarginstart);
        this.read = cardlessWithdrawAmountFragment;
    }

    public final Fragment read(int i) {
        if (i == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("CARDLESS_ATM_SOURCE");
            return CardlessCreditCardSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((ArrayList<String>) arrayList);
        }
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.CARDLESS_ATM_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.RatingCompat = false;
        return AccountSourceSelectFragment.MediaBrowserCompat$CustomActionResultReceiver(new CrashlyticsReport.FilesPayload.File(write, (byte) 0), this.read.MediaMetadataCompat);
    }

    public final CharSequence getPageTitle(int i) {
        CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment;
        int i2;
        if (i == 0) {
            cardlessWithdrawAmountFragment = this.read;
            i2 = R.string.cardless_atm_tab_deposit;
        } else {
            cardlessWithdrawAmountFragment = this.read;
            i2 = R.string.cardless_atm_tab_cards;
        }
        return cardlessWithdrawAmountFragment.getString(i2);
    }
}
