package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomCardlessWithdrawCodeItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessScreenshotFragment;
import java.io.IOException;
import p040o.CrashlyticsReport;

/* renamed from: o.setTabTitleTextAppearance */
public class setTabTitleTextAppearance {
    final setExitButtonEnabled IconCompatParcelizer;

    @HmlPinActivity
    public setTabTitleTextAppearance(setExitButtonEnabled setexitbuttonenabled) {
        this.IconCompatParcelizer = setexitbuttonenabled;
    }

    static Uri MediaBrowserCompat$ItemReceiver(Context context, Bitmap bitmap, String str, boolean z) throws IOException {
        if (z) {
            return AlertController$RecycleListView.read(bitmap, str, context);
        }
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bitmap, context, "screen_image.jpg");
    }

    static View write(getUuidUtf8Bytes getuuidutf8bytes, Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View inflate = LayoutInflater.from(context).inflate(R.layout.f91152131494342, linearLayout, false);
        CardlessSuccessScreenshotFragment cardlessSuccessScreenshotFragment = new CardlessSuccessScreenshotFragment();
        parseEventExecution parseeventexecution = getuuidutf8bytes.MediaBrowserCompat$SearchResultReceiver;
        ButterKnife.IconCompatParcelizer(cardlessSuccessScreenshotFragment, inflate);
        cardlessSuccessScreenshotFragment.requestTime.setText(parseeventexecution.ParcelableVolumeInfo);
        cardlessSuccessScreenshotFragment.mobileNo.setText(context.getString(R.string.mobile_no).toUpperCase());
        cardlessSuccessScreenshotFragment.mobileNo.setValue(parseeventexecution.MediaDescriptionCompat);
        cardlessSuccessScreenshotFragment.customSource.setSourceName(parseeventexecution.MediaBrowserCompat$CustomActionResultReceiver);
        cardlessSuccessScreenshotFragment.customSource.setAccountNumber(parseeventexecution.MediaBrowserCompat$ItemReceiver);
        cardlessSuccessScreenshotFragment.customSource.setAvatar(parseeventexecution.read, R.drawable.logo_scb_new);
        cardlessSuccessScreenshotFragment.customSource.setAccountBalance(parseeventexecution.MediaBrowserCompat$MediaItem);
        cardlessSuccessScreenshotFragment.customAmount.setText(context.getString(R.string.cardless_atm_amount).toUpperCase());
        cardlessSuccessScreenshotFragment.customAmount.setValue(parseeventexecution.write);
        if (parseeventexecution.IconCompatParcelizer != null) {
            CustomTransferAndPayItem customTransferAndPayItem = cardlessSuccessScreenshotFragment.customAmount;
            CrashlyticsReport.Session.Application application = parseeventexecution.IconCompatParcelizer;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValuesAligned(application, true);
            cardlessSuccessScreenshotFragment.customAmount.mBottomSpace.setVisibility(8);
        }
        cardlessSuccessScreenshotFragment.customAmount.mDividerView.setVisibility(0);
        cardlessSuccessScreenshotFragment.customWithdrawCode.setText(context.getString(R.string.cardless_atm_withdraw_code).toUpperCase());
        cardlessSuccessScreenshotFragment.customWithdrawCode.setWithdrawCode(parseeventexecution.RatingCompat);
        CustomCardlessWithdrawCodeItem customCardlessWithdrawCodeItem = cardlessSuccessScreenshotFragment.customWithdrawCode;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.cardless_atm_withdraw_expire));
        sb.append(parseeventexecution.MediaMetadataCompat);
        customCardlessWithdrawCodeItem.setDateExpire(sb.toString());
        return inflate;
    }
}
