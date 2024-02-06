package com.scb.phone.view.activity.scheduledtransaction;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import p040o.AlertController$RecycleListView;
import p040o.C5057nd;
import p040o.HmlPinActivity;
import p040o.TitleChanger;
import p040o.change;
import p040o.doChange;
import p040o.doTranslation;
import p040o.getDiskUsed;
import p040o.getImageFocusScore;
import p040o.getTitleFormatter;
import p040o.setUuidFromUtf8Bytes;

public class ScheduleTransactionActivity extends ReviewActivity implements getImageFocusScore {
    @HmlPinActivity
    public C5057nd scheduleTransactionPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.scheduleTransactionPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C5057nd ndVar = this.scheduleTransactionPresenter;
        if (ndVar != null) {
            ndVar.onDestroy();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String MediaSessionCompat$QueueItem() {
        /*
            r5 = this;
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r1 = "com.scb.phone.EXTRA_REVIEW"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            o.setUuidFromUtf8Bytes r0 = (p040o.setUuidFromUtf8Bytes) r0
            java.lang.String r0 = r0.MediaDescriptionCompat()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 2
            r4 = -68698650(0xfffffffffbe7bde6, float:-2.4065443E36)
            if (r1 == r4) goto L_0x0039
            r4 = 80008848(0x4c4d690, float:4.6276423E-36)
            if (r1 == r4) goto L_0x002f
            r4 = 2063509483(0x7afea7eb, float:6.611246E35)
            if (r1 != r4) goto L_0x0043
            java.lang.String r1 = "TRANSFER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            goto L_0x0044
        L_0x002f:
            java.lang.String r1 = "TOPUP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = r2
            goto L_0x0044
        L_0x0039:
            java.lang.String r1 = "PAYMENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0043
            r0 = r3
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            if (r0 == 0) goto L_0x005c
            if (r0 == r2) goto L_0x0054
            if (r0 == r3) goto L_0x004c
            r0 = 0
            return r0
        L_0x004c:
            r0 = 2131760754(0x7f101672, float:1.9152537E38)
            java.lang.String r0 = r5.getString(r0)
            return r0
        L_0x0054:
            r0 = 2131760753(0x7f101671, float:1.9152535E38)
            java.lang.String r0 = r5.getString(r0)
            return r0
        L_0x005c:
            r0 = 2131760751(0x7f10166f, float:1.9152531E38)
            java.lang.String r0 = r5.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity.MediaSessionCompat$QueueItem():java.lang.String");
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        MediaSessionCompat$ResultReceiverWrapper();
        if (setuuidfromutf8bytes.setShowingForActionMode != null) {
            String str = setuuidfromutf8bytes.setShowingForActionMode.IconCompatParcelizer;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 77) {
                if (hashCode == 79 && str.equals("O")) {
                    c = 0;
                }
            } else if (str.equals("M")) {
                c = 1;
            }
            if (c == 0) {
                CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
                String string = IconCompatParcelizer.read.getString(R.string.schedule_details_delete_001);
                if (!(string == null || string.length() == 0)) {
                    IconCompatParcelizer.mTitleTextView.setVisibility(0);
                    IconCompatParcelizer.mTitleTextView.setText(string);
                }
                String string2 = IconCompatParcelizer.read.getString(R.string.schedule_details_delete_002);
                if (!(string2 == null || string2.length() == 0)) {
                    IconCompatParcelizer.mTextTextView.setVisibility(0);
                    IconCompatParcelizer.mTextTextView.setText(string2);
                }
                CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.schedule_details_delete_004), new getTitleFormatter(this, setuuidfromutf8bytes));
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.schedule_details_delete_003), TitleChanger.C98301.write).show();
            } else if (c == 1) {
                CustomDialog IconCompatParcelizer3 = CustomDialog.IconCompatParcelizer((Context) this);
                String string3 = IconCompatParcelizer3.read.getString(R.string.schedule_details_delete_001);
                if (!(string3 == null || string3.length() == 0)) {
                    IconCompatParcelizer3.mTitleTextView.setVisibility(0);
                    IconCompatParcelizer3.mTitleTextView.setText(string3);
                }
                String string4 = IconCompatParcelizer3.read.getString(R.string.schedule_details_delete_002);
                if (!(string4 == null || string4.length() == 0)) {
                    IconCompatParcelizer3.mTextTextView.setVisibility(0);
                    IconCompatParcelizer3.mTextTextView.setText(string4);
                }
                IconCompatParcelizer3.RatingCompat(getString(R.string.schedule_details_delete_005), new doTranslation(this, setuuidfromutf8bytes)).MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.schedule_details_delete_006), new change(this, setuuidfromutf8bytes)).read(getString(R.string.schedule_details_delete_003), doChange.read).show();
            }
        }
    }

    public final void IconCompatParcelizer(getDiskUsed getdiskused) {
        setResult(201);
        finish();
    }
}
