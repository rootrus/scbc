package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.quicktopup.ModifyQuickTopUpActivity;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayStatus;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class BaseReviewFragment extends BaseFragment {
    public setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CustomNoteItem billerNote;
    @BindView
    View customAdditionalFeeLayout;
    @BindView
    CustomTransferAndPayItem customAmount;
    @BindView
    protected CustomTransferAndPayItem customDue;
    @BindView
    public CustomTransferAndPayItem customFees;
    @BindView
    CustomScheduleView customScheduleView;
    @BindView
    protected CustomTransferAndPaySource customSource;
    @BindView
    CustomTransferAndPayStatus customStatus;
    @BindView
    public CustomTransferAndPayTarget customTarget;
    @BindView
    CustomTransferAndPayItem fixedTransferInterest;
    @BindView
    CustomTransferAndPayItem fixedTransferWithholdingTax;
    @BindView
    public View fullDivider;
    @BindView
    TextView modifyQuickTopUpButton;
    @BindView
    TextView quickTopUpTextView;
    @BindView
    LinearLayout scheduleContainer;
    @BindView
    public CustomNoteItem userNote;

    /* JADX WARNING: Removed duplicated region for block: B:220:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0589  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(p040o.setUuidFromUtf8Bytes r17, android.view.View r18, android.content.Context r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            butterknife.ButterKnife.IconCompatParcelizer(r0, r2)
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = write(r2)
            java.lang.String r4 = "RTP_EBILL_PAYMENT_FUNCTION"
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r1.MenuItemWrapperICS$CollapsibleActionViewWrapper
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0030
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r1.AbsActionBarView
            r2.setSourceName(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            android.content.Context r5 = r16.getContext()
            r2.setSourceNameGrayColor(r5)
            goto L_0x0074
        L_0x0030:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r1.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r2.setSourceName(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r1.AbsActionBarView
            r2.setAccountNumber(r5)
            goto L_0x0074
        L_0x003f:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 == 0) goto L_0x0058
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r1.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r2.setSourceName(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r1.AbsActionBarView
            r2.setAccountNumber(r5)
            goto L_0x0074
        L_0x0058:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r17.MediaBrowserCompat$ItemReceiver()
            r2.setSourceName(r5)
            java.lang.String r2 = r17.MediaBrowserCompat$CustomActionResultReceiver()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0074
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r5 = r17.MediaBrowserCompat$CustomActionResultReceiver()
            r2.setAccountNumber(r5)
        L_0x0074:
            android.net.Uri r2 = r1.setGroupDividerEnabled
            r5 = 2131231401(0x7f0802a9, float:1.8078882E38)
            r6 = 2131231402(0x7f0802aa, float:1.8078884E38)
            java.lang.String r7 = "CID"
            java.lang.String r8 = "MOB"
            if (r2 == 0) goto L_0x0098
            android.net.Uri r2 = r1.setGroupDividerEnabled
            if (r2 == 0) goto L_0x00df
            android.net.Uri r9 = android.net.Uri.EMPTY
            boolean r9 = r9.equals(r2)
            if (r9 != 0) goto L_0x00df
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r9 = r0.customSource
            java.lang.String r2 = r2.toString()
            r9.setAvatar(r2)
            goto L_0x00df
        L_0x0098:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = write(r2)
            if (r2 != 0) goto L_0x00ac
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 == 0) goto L_0x00df
        L_0x00ac:
            java.lang.String r2 = r1.ActionBarContainer
            boolean r2 = android.text.TextUtils.equals(r8, r2)
            if (r2 == 0) goto L_0x00c6
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            android.content.Context r9 = r16.getContext()
            android.net.Uri r9 = p040o.getICheckDeserializerRtti.write((android.content.Context) r9, (int) r6)
            java.lang.String r9 = r9.toString()
            r2.setAvatar(r9)
            goto L_0x00df
        L_0x00c6:
            java.lang.String r2 = r1.ActionBarContainer
            boolean r2 = android.text.TextUtils.equals(r7, r2)
            if (r2 == 0) goto L_0x00df
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            android.content.Context r9 = r16.getContext()
            android.net.Uri r9 = p040o.getICheckDeserializerRtti.write((android.content.Context) r9, (int) r5)
            java.lang.String r9 = r9.toString()
            r2.setAvatar(r9)
        L_0x00df:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            java.lang.String r9 = "QTOPUP"
            boolean r2 = r9.equals(r2)
            java.lang.String r9 = "rtp.payer.notification"
            java.lang.String r10 = "rtp.payer"
            if (r2 != 0) goto L_0x0103
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L_0x0103
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0109
        L_0x0103:
            java.lang.String r2 = r1.MediaSessionCompat$QueueItem
            if (r2 == 0) goto L_0x0109
            r2 = 1
            goto L_0x010a
        L_0x0109:
            r2 = 0
        L_0x010a:
            if (r2 == 0) goto L_0x0113
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            java.lang.String r13 = r1.MediaSessionCompat$QueueItem
            r2.setAccountBalance(r13)
        L_0x0113:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = write(r2)
            java.lang.String r13 = "PURCHASE_CREDIT_CARD_FUNCTION"
            java.lang.String r14 = "PURCHASE_BILL_PAYMENT_FUNCTION"
            java.lang.String r15 = "PURCHASE_TOPUP_FUNCTION"
            java.lang.String r12 = "PURCHASE_TRANSFER_FUNCTION"
            if (r2 == 0) goto L_0x014f
            java.lang.String r2 = r1.setContentHeight
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x013f
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setVisibility
            r2.setTargetName(r11)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r11 = r16.getContext()
            r2.setTargetNameGrayColor(r11)
            goto L_0x0207
        L_0x013f:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setContentHeight
            r2.setTargetName(r11)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setVisibility
            r2.setReferenceNumbers(r11)
            goto L_0x0207
        L_0x014f:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x01c0
            java.lang.String r2 = r17.MediaDescriptionCompat()
            java.lang.String r11 = "BSCANC_SUCCESS_FUNCTION"
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 != 0) goto L_0x01c0
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r17.IconCompatParcelizer()
            r2.setTargetName(r11)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setHasDecor
            if (r11 == 0) goto L_0x017f
            java.lang.String r11 = r1.setHasDecor
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x017f
            java.lang.String r11 = r1.setHasDecor
            goto L_0x0181
        L_0x017f:
            java.lang.String r11 = r1.AlertController$RecycleListView
        L_0x0181:
            r2.setReferenceNumbers(r11)
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r12, r2)
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r15, r2)
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x0207
        L_0x01ac:
            java.lang.String r2 = r1.setTitleOptional
            if (r2 == 0) goto L_0x0207
            java.lang.String r2 = r1.setTitleOptional
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0207
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setTitleOptional
            r2.setReferenceNo1(r11)
            goto L_0x0207
        L_0x01c0:
            java.lang.String r2 = r1.setSubtitle
            if (r2 == 0) goto L_0x01d3
            java.lang.String r2 = r1.setSubtitle
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01d3
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setTitleOptional
            r2.setReferenceNo1(r11)
        L_0x01d3:
            java.lang.String r2 = r1.ActionBarContextView
            if (r2 == 0) goto L_0x01e6
            java.lang.String r2 = r1.ActionBarContextView
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01e6
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setCustomView
            r2.setReferenceNo2(r11)
        L_0x01e6:
            java.lang.String r2 = r1.setHideOnContentScrollEnabled
            if (r2 == 0) goto L_0x01f9
            java.lang.String r2 = r1.setHideOnContentScrollEnabled
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01f9
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.setHasNonEmbeddedTabs
            r2.setReferenceNo3(r11)
        L_0x01f9:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.Keep
            r2.setTargetName(r11)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r11 = r1.AppCompatDialogFragment
            r2.setReferenceNumbers(r11)
        L_0x0207:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = write(r2)
            java.lang.String r11 = "LOANPAYMENT"
            java.lang.String r5 = "BILLPAYMENT"
            if (r2 == 0) goto L_0x024e
            java.lang.String r2 = r1.MenuItemImpl
            boolean r2 = android.text.TextUtils.equals(r8, r2)
            if (r2 == 0) goto L_0x0230
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r7 = r16.getContext()
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r7, (int) r6)
            java.lang.String r6 = r6.toString()
            r2.setAvatar(r6)
            goto L_0x02d2
        L_0x0230:
            java.lang.String r2 = r1.MenuItemImpl
            boolean r2 = android.text.TextUtils.equals(r7, r2)
            if (r2 == 0) goto L_0x02d2
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r6 = r16.getContext()
            r7 = 2131231401(0x7f0802a9, float:1.8078882E38)
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r6, (int) r7)
            java.lang.String r6 = r6.toString()
            r2.setAvatar(r6)
            goto L_0x02d2
        L_0x024e:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x02be
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x02be
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 != 0) goto L_0x02be
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r12, r2)
            if (r2 != 0) goto L_0x02a9
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r15, r2)
            if (r2 != 0) goto L_0x02a9
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 != 0) goto L_0x02a9
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 != 0) goto L_0x02a9
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r6 = r16.getContext()
            r7 = 2131230844(0x7f08007c, float:1.8077752E38)
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r6, (int) r7)
            java.lang.String r6 = r6.toString()
            r2.setAvatar(r6)
            goto L_0x02d2
        L_0x02a9:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r6 = r16.getContext()
            r7 = 2131231615(0x7f08037f, float:1.8079316E38)
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r6, (int) r7)
            java.lang.String r6 = r6.toString()
            r2.setAvatar(r6)
            goto L_0x02d2
        L_0x02be:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.content.Context r6 = r16.getContext()
            r7 = 2131230900(0x7f0800b4, float:1.8077866E38)
            android.net.Uri r6 = p040o.getICheckDeserializerRtti.write((android.content.Context) r6, (int) r7)
            java.lang.String r6 = r6.toString()
            r2.setAvatar(r6)
        L_0x02d2:
            android.net.Uri r2 = r1.AppCompatActivity
            if (r2 == 0) goto L_0x0320
            android.net.Uri r2 = android.net.Uri.EMPTY
            android.net.Uri r6 = r1.AppCompatActivity
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0320
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r12, r2)
            if (r2 != 0) goto L_0x0314
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r15, r2)
            if (r2 != 0) goto L_0x0314
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 != 0) goto L_0x0314
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 != 0) goto L_0x0314
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.net.Uri r5 = r1.AppCompatActivity
            java.lang.String r5 = r5.toString()
            r2.setAvatar(r5)
            goto L_0x037f
        L_0x0314:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            android.net.Uri r5 = r1.AppCompatActivity
            java.lang.String r5 = r5.toString()
            r2.setShopAvatar(r5)
            goto L_0x037f
        L_0x0320:
            java.lang.String r2 = r1.setContentView
            if (r2 == 0) goto L_0x035a
            java.lang.String r2 = r1.setContentView
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x035a
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 != 0) goto L_0x0352
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r5 = r1.setContentView
            r2.setAvatar(r5)
            goto L_0x037f
        L_0x0352:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r5 = r1.setContentView
            r2.setBillerAvatar(r5)
            goto L_0x037f
        L_0x035a:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x0378
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L_0x0378
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 == 0) goto L_0x037f
        L_0x0378:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            java.lang.String r5 = r1.ParcelableVolumeInfo
            r2.setBillerAvatar(r5)
        L_0x037f:
            java.lang.String r2 = r1.setBackgroundResource
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x038d
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r5 = r0.customTarget
            r5.setFavoriteName(r2)
            goto L_0x0397
        L_0x038d:
            boolean r2 = r3 instanceof com.scb.phone.view.activity.transferandpay.SuccessActivity
            if (r2 == 0) goto L_0x0397
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            r5 = 1
            r2.setAddFavoriteButtonVisible(r5)
        L_0x0397:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            o.CrashlyticsReport$Session$Application r5 = r1.f2965x50fd9e4a
            java.lang.String r5 = r5.MediaBrowserCompat$ItemReceiver
            r2.setValue(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            o.CrashlyticsReport$Session$Application r5 = r1.f2965x50fd9e4a
            com.scb.phone.view.custom.transferandpay.CustomAmountInfo r6 = r2.amountInfo
            r7 = 0
            r6.setVisibility(r7)
            com.scb.phone.view.custom.transferandpay.CustomAmountInfo r2 = r2.amountInfo
            r2.setValues(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            android.view.View r2 = r2.mBottomSpace
            r5 = 8
            r2.setVisibility(r5)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            java.lang.String r6 = r17.MediaMetadataCompat()
            r2.setValue(r6)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customDue
            java.lang.String r6 = r1.AppCompatDelegateImpl$ListMenuDecorView
            r2.setValue(r6)
            java.lang.String r2 = r1.setForceShowIcon
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x03ed
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            r2.setVisibility(r5)
            androidx.fragment.app.FragmentActivity r2 = r16.getActivity()
            boolean r2 = r2 instanceof com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity
            if (r2 != 0) goto L_0x03e5
            java.lang.String r2 = r1.setOnMenuItemClickListener
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x041d
        L_0x03e5:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            android.view.View r2 = r2.mDividerView
            r2.setVisibility(r5)
            goto L_0x041d
        L_0x03ed:
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            r6 = 2131760630(0x7f1015f6, float:1.9152286E38)
            java.lang.String r6 = r3.getString(r6)
            r2.setTitle(r6)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            java.lang.String r6 = r1.setForceShowIcon
            r2.setText(r6)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            r6 = 0
            r2.setVisibility(r6)
            androidx.fragment.app.FragmentActivity r2 = r16.getActivity()
            boolean r2 = r2 instanceof com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity
            if (r2 != 0) goto L_0x0416
            java.lang.String r2 = r1.setOnMenuItemClickListener
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x041d
        L_0x0416:
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            android.view.View r2 = r2.divider
            r2.setVisibility(r5)
        L_0x041d:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            java.lang.String r6 = "QTOPUPSETUP"
            boolean r2 = r6.equals(r2)
            r7 = 2131760586(0x7f1015ca, float:1.9152197E38)
            java.lang.String r8 = "rtp.requester"
            if (r2 == 0) goto L_0x0436
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            r2.setVisibility(r5)
        L_0x0433:
            r9 = 1
            goto L_0x055d
        L_0x0436:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r8, r2)
            java.lang.String r11 = "rtp.detail"
            if (r2 != 0) goto L_0x04e0
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 != 0) goto L_0x04e0
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r10, r2)
            if (r2 != 0) goto L_0x0499
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r9, r2)
            if (r2 != 0) goto L_0x0499
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 != 0) goto L_0x0499
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            r4 = 0
            r2.setVisibility(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            java.lang.String r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x048d
            java.lang.String r4 = r1.setOnMenuItemClickListener
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x048d
            java.lang.String r4 = r1.setForceShowIcon
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x048b
            goto L_0x048d
        L_0x048b:
            r4 = 0
            goto L_0x048e
        L_0x048d:
            r4 = 1
        L_0x048e:
            android.view.View r2 = r2.mDividerView
            if (r4 == 0) goto L_0x0494
            r4 = 0
            goto L_0x0495
        L_0x0494:
            r4 = r5
        L_0x0495:
            r2.setVisibility(r4)
            goto L_0x0433
        L_0x0499:
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            java.lang.String r4 = r3.getString(r7)
            r2.setTitle(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            r4 = 2131760605(0x7f1015dd, float:1.9152235E38)
            java.lang.String r4 = r3.getString(r4)
            r2.setText(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            java.lang.String r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x04c3
            java.lang.String r4 = r1.setForceShowIcon
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04c1
            goto L_0x04c3
        L_0x04c1:
            r4 = 0
            goto L_0x04c4
        L_0x04c3:
            r4 = 1
        L_0x04c4:
            android.view.View r2 = r2.mDividerView
            if (r4 == 0) goto L_0x04ca
            r4 = 0
            goto L_0x04cb
        L_0x04ca:
            r4 = r5
        L_0x04cb:
            r2.setVisibility(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customDue
            java.lang.String r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04da
            r4 = 0
            goto L_0x04db
        L_0x04da:
            r4 = r5
        L_0x04db:
            r2.setVisibility(r4)
            goto L_0x0433
        L_0x04e0:
            java.lang.String r2 = r17.MediaMetadataCompat()
            if (r2 != 0) goto L_0x04eb
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            r2.setVisibility(r5)
        L_0x04eb:
            java.lang.String r2 = r1.AppCompatDelegateImpl$ListMenuDecorView
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x050e
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            java.lang.String r4 = r1.AppCompatDelegateImpl$ListMenuDecorView
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r9 = 1
            r4 = r4 ^ r9
            android.view.View r2 = r2.mDividerView
            if (r4 == 0) goto L_0x0503
            r4 = 0
            goto L_0x0504
        L_0x0503:
            r4 = r5
        L_0x0504:
            r2.setVisibility(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customDue
            r4 = 0
            r2.setVisibility(r4)
            goto L_0x050f
        L_0x050e:
            r9 = 1
        L_0x050f:
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource r2 = r0.customSource
            r4 = 2131760604(0x7f1015dc, float:1.9152233E38)
            java.lang.String r4 = r3.getString(r4)
            r2.setText(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget r2 = r0.customTarget
            r4 = 2131760607(0x7f1015df, float:1.915224E38)
            java.lang.String r4 = r3.getString(r4)
            r2.setText(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            r4 = 2131760601(0x7f1015d9, float:1.9152227E38)
            java.lang.String r4 = r3.getString(r4)
            r2.setText(r4)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            r4 = 2131760603(0x7f1015db, float:1.9152231E38)
            java.lang.String r4 = r3.getString(r4)
            r2.setTitle(r4)
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = android.text.TextUtils.equals(r11, r2)
            if (r2 == 0) goto L_0x055d
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayStatus r2 = r0.customStatus
            r4 = 0
            r2.setVisibility(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayStatus r2 = r0.customStatus
            java.lang.String r4 = r1.setLogo
            r2.setRequestDateText(r4)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayStatus r2 = r0.customStatus
            java.lang.String r4 = r1.setWindowCallback
            r2.setStatusText(r4)
        L_0x055d:
            java.lang.String r2 = r1.setOnMenuItemClickListener
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0589
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            java.lang.String r3 = r3.getString(r7)
            r2.setTitle(r3)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            java.lang.String r3 = r1.setOnMenuItemClickListener
            r2.setText(r3)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            o.CrashlyticsReport$Session$Event$Device r3 = r1.setShortcut
            if (r3 == 0) goto L_0x057d
            r3 = r9
            goto L_0x057e
        L_0x057d:
            r3 = 0
        L_0x057e:
            android.view.View r2 = r2.divider
            if (r3 == 0) goto L_0x0584
            r3 = 0
            goto L_0x0585
        L_0x0584:
            r3 = r5
        L_0x0585:
            r2.setVisibility(r3)
            goto L_0x058e
        L_0x0589:
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.userNote
            r2.setVisibility(r5)
        L_0x058e:
            java.lang.String r2 = r1.setExpandedFormat
            if (r2 == 0) goto L_0x05b9
            java.lang.String r2 = r1.setExpandedFormat
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b9
            android.widget.TextView r2 = r0.quickTopUpTextView
            r3 = 0
            r2.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            android.view.View r2 = r2.mDividerView
            r2.setVisibility(r5)
            java.lang.String r2 = r17.MediaDescriptionCompat()
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x05b9
            android.widget.TextView r2 = r0.quickTopUpTextView
            r3 = 2131760654(0x7f10160e, float:1.9152335E38)
            r2.setText(r3)
        L_0x05b9:
            boolean r2 = r1.setPadding
            if (r2 == 0) goto L_0x05d6
            android.content.Context r2 = r16.getContext()
            boolean r2 = r2 instanceof com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity
            if (r2 == 0) goto L_0x05cd
            android.content.Context r2 = r16.getContext()
            boolean r2 = r2 instanceof com.scb.phone.view.activity.transferandpay.SuccessActivity
            if (r2 != 0) goto L_0x05d6
        L_0x05cd:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            android.widget.TextView r2 = r0.modifyQuickTopUpButton
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x05d7
        L_0x05d6:
            r3 = 0
        L_0x05d7:
            o.getRamUsed r2 = r1.setShowingForActionMode
            if (r2 == 0) goto L_0x05fc
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            com.scb.phone.view.custom.common.ThaiTextView r2 = r2.scheduleFeeText
            r2.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            android.view.View r2 = r2.mDividerView
            r2.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r2 = r0.billerNote
            android.view.View r2 = r2.divider
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r0.scheduleContainer
            r2.setVisibility(r3)
            com.scb.phone.view.custom.common.CustomScheduleView r2 = r0.customScheduleView
            o.getRamUsed r4 = r1.setShowingForActionMode
            r2.setScheduleView((p040o.getRamUsed) r4, (boolean) r3)
        L_0x05fc:
            java.lang.String r2 = r17.MediaDescriptionCompat()
            java.lang.String r4 = "FIXED_TRANSFER"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x063b
            android.view.View r2 = r0.customAdditionalFeeLayout
            r2.setVisibility(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customAmount
            android.content.Context r3 = r16.getContext()
            r4 = 2131757604(0x7f100a24, float:1.9146148E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.customFees
            android.content.Context r3 = r16.getContext()
            r4 = 2131757605(0x7f100a25, float:1.914615E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.fixedTransferInterest
            java.lang.String r3 = r1.setWindowTitle
            r2.setValue(r3)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r2 = r0.fixedTransferWithholdingTax
            java.lang.String r3 = r1.setOverflowIcon
            r2.setValue(r3)
        L_0x063b:
            java.lang.String r1 = r17.MediaDescriptionCompat()
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0664
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r1 = r0.customFees
            android.view.View r1 = r1.mDividerView
            r2 = 0
            r1.setVisibility(r2)
            com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem r1 = r0.customDue
            com.scb.phone.view.custom.transferandpay.CustomNoteItem r3 = r0.billerNote
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0659
            r11 = r9
            goto L_0x065a
        L_0x0659:
            r11 = r2
        L_0x065a:
            android.view.View r1 = r1.mDividerView
            if (r11 == 0) goto L_0x0660
            r12 = r2
            goto L_0x0661
        L_0x0660:
            r12 = r5
        L_0x0661:
            r1.setVisibility(r12)
        L_0x0664:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.BaseReviewFragment.MediaBrowserCompat$ItemReceiver(o.setUuidFromUtf8Bytes, android.view.View, android.content.Context):void");
    }

    private static boolean write(String str) {
        return TextUtils.equals("rtp.requester", str) || TextUtils.equals("rtp.payer", str) || TextUtils.equals("rtp.payer.notification", str) || TextUtils.equals("rtp.detail", str);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, Context context) {
        this.customSource.setText(context.getString(R.string.from));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onModifyButtonClick() {
        Intent intent = new Intent(getActivity(), ModifyQuickTopUpActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", this.MediaBrowserCompat$CustomActionResultReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
