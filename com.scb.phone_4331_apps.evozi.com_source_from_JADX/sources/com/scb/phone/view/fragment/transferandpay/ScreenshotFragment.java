package com.scb.phone.view.fragment.transferandpay;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.view.custom.transferandpay.CustomMovieTicket;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.getUuidUtf8Bytes;

public class ScreenshotFragment extends BaseSuccessFragment implements FragmentBuilder_BindBaseFragment {
    @BindView
    RecyclerView additionalRecyclerView;
    @BindView
    ImageView leftCircleDivider;
    @BindView
    CustomMovieTicket movieTicket;
    @BindView
    ImageView rightCircleDivider;
    @BindView
    ViewGroup ticketDivider;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.getUuidUtf8Bytes r11, android.view.View r12, android.content.Context r13) {
        /*
            r10 = this;
            super.read(r11, r12, r13)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r0 = r10.customTarget
            r1 = 0
            r0.setAddFavoriteButtonVisible(r1)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r0 = r10.customTarget
            android.widget.ImageView r2 = r0.mFavouriteIcon
            r3 = 8
            r2.setVisibility(r3)
            android.widget.TextView r0 = r0.mFavouriteName
            r0.setVisibility(r3)
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            int r2 = r0.hashCode()
            r4 = -1
            java.lang.String r5 = "TRANSFER"
            java.lang.String r6 = "BILLPAYMENT"
            r7 = 1
            r8 = -486974465(0xffffffffe2f95bff, float:-2.2999341E21)
            if (r2 == r8) goto L_0x0039
            r8 = 2063509483(0x7afea7eb, float:6.611246E35)
            if (r2 != r8) goto L_0x0041
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0039:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0041
            r0 = r7
            goto L_0x0042
        L_0x0041:
            r0 = r4
        L_0x0042:
            if (r0 == 0) goto L_0x0046
            if (r0 != r7) goto L_0x013a
        L_0x0046:
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            o.CrashlyticsReport$Session$Event$Device r0 = r0.setShortcut
            if (r0 == 0) goto L_0x00a7
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r0 = r10.customTarget
            r0.setAddFavoriteButtonVisible(r1)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r0 = r10.userNote
            android.view.View r0 = r0.divider
            r0.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r0 = r10.userNote
            android.view.View r0 = r0.bottomSpace
            r0.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r0 = r10.movieTicket
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r10.ticketDivider
            r0.setVisibility(r1)
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            o.CrashlyticsReport$Session$Event$Device r0 = r0.setShortcut
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r11.MediaSessionCompat$ResultReceiverWrapper
            r2.setQrCode(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r0.RatingCompat
            r2.setPoster(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r0.MediaSessionCompat$ResultReceiverWrapper
            r2.setTitle(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r0.MediaBrowserCompat$ItemReceiver
            r2.setCinemaLocation(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r0.write
            r2.setShowtime(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r8 = r0.IconCompatParcelizer
            r2.setCinemaNumber(r8)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r2 = r10.movieTicket
            java.lang.String r0 = r0.MediaSessionCompat$QueueItem
            r2.setSeat(r0)
            com.scb.phone.view.custom.transferandpay.CustomMovieTicket r0 = r10.movieTicket
            java.lang.String r2 = r11.MediaMetadataCompat
            r0.setBookingId(r2)
            goto L_0x013a
        L_0x00a7:
            java.lang.String r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x013a
            android.widget.RelativeLayout r0 = r10.slipQRSection
            r0.setVisibility(r1)
            java.lang.String r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<o.rsnIncObjDestroy> r8 = p040o.rsnIncObjDestroy.class
            r2.<init>(r8)
            o.rsnIncObjDestroy r8 = p040o.rsnIncObjDestroy.ERROR_CORRECTION
            o.execute r9 = p040o.execute.M
            r2.put(r8, r9)
            r8 = 600(0x258, float:8.41E-43)
            android.graphics.Bitmap r0 = p040o.getICheckDeserializerRtti.read(r0, r8, r8, r2)
            r2 = 2131760923(0x7f10171b, float:1.915288E38)
            if (r0 != 0) goto L_0x0107
            android.widget.ImageView r0 = r10.slipQRCodeImageView
            r0.setVisibility(r3)
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00f1
            android.widget.TextView r0 = r10.slipQRCodeDescriptionTextView
            r2 = 2131760924(0x7f10171c, float:1.9152882E38)
            java.lang.String r2 = r13.getString(r2)
            r0.setText(r2)
            goto L_0x013a
        L_0x00f1:
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x013a
            android.widget.TextView r0 = r10.slipQRCodeDescriptionTextView
            java.lang.String r2 = r13.getString(r2)
            r0.setText(r2)
            goto L_0x013a
        L_0x0107:
            o.setUuidFromUtf8Bytes r8 = r11.PlaybackStateCompat
            java.lang.String r8 = r8.MediaDescriptionCompat()
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0120
            android.widget.TextView r2 = r10.slipQRCodeDescriptionTextView
            r8 = 2131760925(0x7f10171d, float:1.9152884E38)
            java.lang.String r8 = r13.getString(r8)
            r2.setText(r8)
            goto L_0x0135
        L_0x0120:
            o.setUuidFromUtf8Bytes r8 = r11.PlaybackStateCompat
            java.lang.String r8 = r8.MediaDescriptionCompat()
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0135
            android.widget.TextView r8 = r10.slipQRCodeDescriptionTextView
            java.lang.String r2 = r13.getString(r2)
            r8.setText(r2)
        L_0x0135:
            android.widget.ImageView r2 = r10.slipQRCodeImageView
            r2.setImageBitmap(r0)
        L_0x013a:
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            int r2 = r0.hashCode()
            java.lang.String r8 = "LOANPAYMENT"
            switch(r2) {
                case -2142190485: goto L_0x01ac;
                case -1927841485: goto L_0x01a1;
                case -1844260907: goto L_0x0197;
                case -562916618: goto L_0x018f;
                case -486974465: goto L_0x0187;
                case 51621: goto L_0x017c;
                case 80008848: goto L_0x0172;
                case 632725409: goto L_0x0168;
                case 739626964: goto L_0x015e;
                case 1988312228: goto L_0x0154;
                case 2063509483: goto L_0x014b;
                default: goto L_0x0149;
            }
        L_0x0149:
            goto L_0x01b5
        L_0x014b:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01b5
            r4 = r7
            goto L_0x01b5
        L_0x0154:
            java.lang.String r2 = "PROMPTPAY"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 3
            goto L_0x01b5
        L_0x015e:
            java.lang.String r2 = "PREPAID_CARD_CASHOUT_TARGET"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 6
            goto L_0x01b5
        L_0x0168:
            java.lang.String r2 = "BSCANC_SOURCE_FUNCTION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 2
            goto L_0x01b5
        L_0x0172:
            java.lang.String r2 = "TOPUP"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = r1
            goto L_0x01b5
        L_0x017c:
            java.lang.String r2 = "3RD"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 9
            goto L_0x01b5
        L_0x0187:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x01b5
            r4 = 7
            goto L_0x01b5
        L_0x018f:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01b5
            r4 = 4
            goto L_0x01b5
        L_0x0197:
            java.lang.String r2 = "rtp.payer"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = r3
            goto L_0x01b5
        L_0x01a1:
            java.lang.String r2 = "PP_SCB"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 10
            goto L_0x01b5
        L_0x01ac:
            java.lang.String r2 = "E_DONATION_FUNCTION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01b5
            r4 = 5
        L_0x01b5:
            switch(r4) {
                case 0: goto L_0x01ea;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01ea;
                case 3: goto L_0x01ea;
                case 4: goto L_0x01ea;
                case 5: goto L_0x01ea;
                case 6: goto L_0x01ea;
                case 7: goto L_0x01ea;
                case 8: goto L_0x01ea;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01cf;
                default: goto L_0x01b8;
            }
        L_0x01b8:
            boolean r0 = read(r11)
            if (r0 == 0) goto L_0x0262
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customFees
            r0.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            java.lang.String r2 = r2.setOnMenuItemClickListener
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            goto L_0x0250
        L_0x01cf:
            boolean r0 = read(r11)
            if (r0 == 0) goto L_0x0262
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customFees
            r0.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            android.view.View r0 = r0.mDividerView
            r0.setVisibility(r1)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            android.view.View r0 = r0.mBottomSpace
            r0.setVisibility(r1)
            goto L_0x0262
        L_0x01ea:
            boolean r0 = read(r11)
            if (r0 == 0) goto L_0x0262
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customFees
            r0.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            java.lang.String r2 = r2.setOnMenuItemClickListener
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x021b
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            java.lang.String r2 = r2.setForceShowIcon
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x021b
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            o.CrashlyticsReport$Session$Event$Log r2 = r2.MediaBrowserCompat$SearchResultReceiver()
            if (r2 != 0) goto L_0x021b
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            o.setJailbroken r2 = r2.setChecked
            if (r2 != 0) goto L_0x021b
            r2 = r1
            goto L_0x021c
        L_0x021b:
            r2 = r7
        L_0x021c:
            android.view.View r0 = r0.mDividerView
            if (r2 == 0) goto L_0x0222
            r2 = r1
            goto L_0x0223
        L_0x0222:
            r2 = r3
        L_0x0223:
            r0.setVisibility(r2)
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0248
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            o.setUuidFromUtf8Bytes r2 = r11.PlaybackStateCompat
            o.CrashlyticsReport$Session$Application r2 = r2.f2965x50fd9e4a
            if (r2 != 0) goto L_0x023c
            r2 = r7
            goto L_0x023d
        L_0x023c:
            r2 = r1
        L_0x023d:
            android.view.View r0 = r0.mBottomSpace
            if (r2 == 0) goto L_0x0243
            r2 = r1
            goto L_0x0244
        L_0x0243:
            r2 = r3
        L_0x0244:
            r0.setVisibility(r2)
            goto L_0x0262
        L_0x0248:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            android.view.View r0 = r0.mBottomSpace
            r0.setVisibility(r1)
            goto L_0x0262
        L_0x0250:
            r2 = r2 ^ r7
            android.view.View r0 = r0.mDividerView
            if (r2 == 0) goto L_0x0257
            r2 = r1
            goto L_0x0258
        L_0x0257:
            r2 = r3
        L_0x0258:
            r0.setVisibility(r2)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r0 = r10.customAmount
            android.view.View r0 = r0.mBottomSpace
            r0.setVisibility(r1)
        L_0x0262:
            java.lang.String r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02fe
            o.AutoValue_CrashlyticsReport_Session_Application r0 = r11.RatingCompat
            if (r0 == 0) goto L_0x02fe
            o.AutoValue_CrashlyticsReport_Session_Application r0 = r11.RatingCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x02fe
            o.AutoValue_CrashlyticsReport_Session_Application r0 = r11.RatingCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r0 = r0.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02fe
            o.setUuidFromUtf8Bytes r0 = r11.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02f5
            boolean r0 = MediaBrowserCompat$ItemReceiver(r11)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r10.customFees
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x02b7
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r10.customFees
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r4 = r10.userNote
            int r4 = r4.getVisibility()
            if (r4 != r3) goto L_0x02ab
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r4 = r10.billerNote
            int r4 = r4.getVisibility()
            if (r4 == r3) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r4 = r1
            goto L_0x02ac
        L_0x02ab:
            r4 = r7
        L_0x02ac:
            android.view.View r2 = r2.mDividerView
            if (r4 == 0) goto L_0x02b2
            r4 = r1
            goto L_0x02b3
        L_0x02b2:
            r4 = r3
        L_0x02b3:
            r2.setVisibility(r4)
            goto L_0x02e9
        L_0x02b7:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r10.customAmount
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r4 = r10.userNote
            int r4 = r4.getVisibility()
            if (r4 != r3) goto L_0x02cb
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r4 = r10.billerNote
            int r4 = r4.getVisibility()
            if (r4 != r3) goto L_0x02cb
            r4 = r1
            goto L_0x02cc
        L_0x02cb:
            r4 = r7
        L_0x02cc:
            android.view.View r2 = r2.mDividerView
            if (r4 == 0) goto L_0x02d2
            r4 = r1
            goto L_0x02d3
        L_0x02d2:
            r4 = r3
        L_0x02d3:
            r2.setVisibility(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r10.customAmount
            r2.setFullDivider(r7)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r10.customAmount
            android.view.View r2 = r2.mBottomSpace
            r2.setVisibility(r1)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r10.userNote
            android.view.View r2 = r2.divider
            r2.setVisibility(r3)
        L_0x02e9:
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r10.userNote
            r0 = r0 ^ r7
            android.view.View r2 = r2.divider
            if (r0 == 0) goto L_0x02f1
            goto L_0x02f2
        L_0x02f1:
            r1 = r3
        L_0x02f2:
            r2.setVisibility(r1)
        L_0x02f5:
            androidx.recyclerview.widget.RecyclerView r0 = r10.additionalRecyclerView
            o.AutoValue_CrashlyticsReport_Session_Application r1 = r11.RatingCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r1 = r1.MediaBrowserCompat$ItemReceiver
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.content.Context) r13, (androidx.recyclerview.widget.RecyclerView) r0, (java.util.List<p040o.CrashlyticsReport.Session.OperatingSystem.Builder>) r1, (p040o.FragmentBuilder_BindBaseFragment) r10, (boolean) r7)
        L_0x02fe:
            o.setUuidFromUtf8Bytes r13 = r11.PlaybackStateCompat
            o.CrashlyticsReport$Session$Event$Device r13 = r13.setShortcut
            if (r13 != 0) goto L_0x0314
            o.setUuidFromUtf8Bytes r13 = r11.PlaybackStateCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r13 = r13.setPrimaryBackground
            if (r13 == 0) goto L_0x0330
            o.setUuidFromUtf8Bytes r11 = r11.PlaybackStateCompat
            java.util.List<o.CrashlyticsReport$Session$OperatingSystem$Builder> r11 = r11.setPrimaryBackground
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0330
        L_0x0314:
            android.graphics.drawable.Drawable r11 = r12.getBackground()
            boolean r12 = r11 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x0330
            android.widget.ImageView r12 = r10.leftCircleDivider
            android.graphics.drawable.ColorDrawable r11 = (android.graphics.drawable.ColorDrawable) r11
            int r13 = r11.getColor()
            r12.setColorFilter(r13)
            android.widget.ImageView r12 = r10.rightCircleDivider
            int r11 = r11.getColor()
            r12.setColorFilter(r11)
        L_0x0330:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.ScreenshotFragment.read(o.getUuidUtf8Bytes, android.view.View, android.content.Context):void");
    }

    private static boolean read(getUuidUtf8Bytes getuuidutf8bytes) {
        return getuuidutf8bytes.PlaybackStateCompat == null || TextUtils.isEmpty(getuuidutf8bytes.PlaybackStateCompat.MediaMetadataCompat()) || getuuidutf8bytes.PlaybackStateCompat.MediaMetadataCompat().equals("0.00");
    }
}
