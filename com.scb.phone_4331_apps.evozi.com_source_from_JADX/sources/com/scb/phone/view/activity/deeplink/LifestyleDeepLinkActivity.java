package com.scb.phone.view.activity.deeplink;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.bscanc.MyQRMenuActivity;
import com.scb.phone.view.activity.contactus.ContactUsActivity;
import com.scb.phone.view.activity.deeplink.LifestyleDeepLinkActivity;
import com.scb.phone.view.activity.donations.DonationsLandingActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.etb.ETBCheckEligibilityActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import com.scb.phone.view.activity.juristic.JuristicOnboardingLandingActivity;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;
import com.scb.phone.view.activity.p038tc.MutualFundTermsAndConditionsActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.requesttopay.GoManagePromptPayActivity;
import com.scb.phone.view.activity.requesttopay.RequestToPayActivity;
import com.scb.phone.view.activity.sme.SMELandingPageActivity;
import com.scb.phone.view.activity.sme.gifting.GiftSelectionActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C5040x13546cad;
import p040o.CaptureServer;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdExtractor;
import p040o.LinkedListMultimap;
import p040o.LinkedListMultimap$Node$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Utils;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getIdType;
import p040o.nativeIsTargetRectangleFilled;
import p040o.noneOf$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setCurrentSession;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzjx;
import p040o.zzmd;

public class LifestyleDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractor {
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @HmlPinActivity
    public nativeIsTargetRectangleFilled presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        String stringExtra = intent.getStringExtra("tileId");
        String MediaBrowserCompat$ItemReceiver = nativeIsTargetRectangleFilled.MediaBrowserCompat$ItemReceiver(intent.getData());
        nativeIsTargetRectangleFilled nativeistargetrectanglefilled = this.presenter;
        boolean z = false;
        if (stringExtra != null) {
            if (stringExtra.length() > 0) {
                LinkedListMultimap.Node node = nativeistargetrectanglefilled.MediaBrowserCompat$ItemReceiver;
                FundFactSheetActivity nativeistargetrectanglefilled_mediabrowsercompat_searchresultreceiver = new C5040x13546cad(nativeistargetrectanglefilled, MediaBrowserCompat$ItemReceiver);
                FundFactSheetActivity mediaDescriptionCompat = new nativeIsTargetRectangleFilled.MediaDescriptionCompat(nativeistargetrectanglefilled);
                onGetStartedClick.write((Object) nativeistargetrectanglefilled_mediabrowsercompat_searchresultreceiver, "onSuccess");
                onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
                onGetStartedClick.write((Object) stringExtra, "tileId");
                node.MediaBrowserCompat$ItemReceiver(node.read, nativeistargetrectanglefilled_mediabrowsercompat_searchresultreceiver, mediaDescriptionCompat, new noneOf$MediaBrowserCompat$ItemReceiver(stringExtra), new LinkedListMultimap$Node$MediaBrowserCompat$ItemReceiver(node));
                return;
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = nativeIsTargetRectangleFilled.AbsActionBarView.IconCompatParcelizer;
        if (nativeistargetrectanglefilled.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(nativeistargetrectanglefilled.RatingCompat);
        }
    }

    public final void write(Intent intent) {
        read(intent);
    }

    public final void write() {
        read(new Intent(this, ContactUsActivity.class));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        read(new Intent(this, DonationsLandingActivity.class));
    }

    /* renamed from: Y_ */
    public final void mo33807Y_() {
        read(new Intent(this, GoManagePromptPayActivity.class));
    }

    public final void RatingCompat() {
        read(FindUsActivity.IconCompatParcelizer(this, false));
    }

    public final void setChecked() {
        read(new Intent(this, PersonalLimitActivity.class));
    }

    public final void write(boolean z) {
        read(TransferActivity.IconCompatParcelizer((Context) this, z ? "favourite" : "tile"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        read(TopUpActivity.write(this, z ? "favourite" : "tile"));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        read(BillPaymentActivity.write(this, z ? "favourite" : "tile"));
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        read(RequestToPayActivity.MediaBrowserCompat$ItemReceiver((Context) this, ""));
    }

    public final void read() {
        read(CardlessATMTutorialActivity.write(this, "bankingservice"));
    }

    public final void setExpandedFormat() {
        if (this.iDeviceCompatibilityHelper.read()) {
            read(new Intent(this, ScanPaymentActivity.class));
        }
    }

    public final void AppCompatActivity() {
        read(MyQRMenuActivity.MediaBrowserCompat$ItemReceiver(this));
    }

    public final void MediaBrowserCompat$MediaItem() {
        read(new Intent(this, GiftSelectionActivity.class));
    }

    public final void AppCompatViewInflater() {
        read(new Intent(this, EasycashLandingActivity.class));
    }

    public final void AppCompatDialogFragment() {
        read(ETBCheckEligibilityActivity.read(this));
    }

    public final void MediaSessionCompat$QueueItem() {
        read(MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
        read(C5607x23cfbb87.IconCompatParcelizer(this, zzjx.zza.zzb.GENERAL));
    }

    public final void setContentView() {
        read(JuristicRequestFormActivity.MediaBrowserCompat$ItemReceiver(this));
    }

    public final void write(Uri uri, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        try {
            read(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Uri uri, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            finish();
        } catch (ActivityNotFoundException unused) {
            MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    public final void MediaDescriptionCompat() {
        write(zzmd.zzm.zzb.zza.INDIVIDUAL);
        MediaSessionCompat$Token(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        read(PartnerLandingActivity.MediaBrowserCompat$ItemReceiver(this, j));
    }

    public final void IconCompatParcelizer(String str) {
        read(PartnerAuthorizationActivity.MediaBrowserCompat$ItemReceiver(this, str));
    }

    public final void MediaBrowserCompat$ItemReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        Intent intent = new Intent(this, PartnerWebViewActivity.class);
        setCurrentSession write = setCurrentSession.write();
        write.MediaMetadataCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$ResultReceiverWrapper;
        write.MediaBrowserCompat$MediaItem = discardoldlogfiles_mediabrowsercompat_itemreceiver.ListMenuItemView;
        write.IconCompatParcelizer = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        write.write = 3;
        intent.putExtra("com.scb.phone.EXTRA_DISPLAY", write);
        read(intent);
    }

    public final void write(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        read(SMELandingPageActivity.MediaBrowserCompat$CustomActionResultReceiver(this, list));
    }

    public final void read(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        read(SMELandingPageActivity.MediaBrowserCompat$CustomActionResultReceiver(this, list));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Utils.C39323.C12941 r1) {
        read(JuristicOnboardingLandingActivity.read(this, r1));
    }

    /* renamed from: X_ */
    public final void mo33806X_() {
        setMenuPrepared();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5004 && i2 == -1) {
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (i == 5005 && i2 == -1) {
            this.presenter.write();
        } else if (i == 5006 && i2 == -1) {
            onGetStartedClick.write((Object) this, "context");
            read(new Intent(this, FriendsLandingActivity.class));
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void setItemInvoker() {
        read(new Intent(this, InvestmentDetailsActivity.class));
    }

    public final void setPopupCallback() {
        read(new Intent(this, FundOnboardingLandingActivity.class));
    }

    public final void setIcon() {
        read(new Intent(this, MutualFundTermsAndConditionsActivity.class));
    }

    public final void setPadding() {
        read(new Intent(this, ScbsLandingActivity.class));
    }

    public final void setShortcut() {
        read(new Intent(this, AddAccountInfoActivity.class));
    }

    public final void IconCompatParcelizer() {
        read(new Intent(this, HomeActivity.class).addFlags(603979776).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab).putExtra("FROM_LINK_TAG", true).setAction("ACTION_DEEP_LINK_LAND"));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_FROM_BANKING_ACTION", true);
        read(intent);
    }

    public final void setCheckable() {
        read((int) R.string.auto_save_dialog_text);
    }

    public final void read(int i) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.auto_save_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(i);
        if (!(string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.auto_save_dialog_go_settings), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                LifestyleDeepLinkActivity lifestyleDeepLinkActivity = LifestyleDeepLinkActivity.this;
                Intent intent = new Intent(lifestyleDeepLinkActivity, HomeActivity.class);
                intent.addFlags(603979776);
                intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.more_options_tab);
                intent.putExtra("com.scb.phone.EXTRA_FROM_BANKING_ACTION", true);
                lifestyleDeepLinkActivity.write(intent);
                dialogInterface.dismiss();
            }
        });
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.auto_save_dialog_cancel), CaptureServer.C635914.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void MediaMetadataCompat() {
        if (!setGroupDividerEnabled() || mo13022E_()) {
            super.startActivityForResult(PinLoginActivity.write((Context) this), 5006);
            setSubtitle();
            return;
        }
        onGetStartedClick.write((Object) this, "context");
        read(new Intent(this, FriendsLandingActivity.class));
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (!setGroupDividerEnabled() || mo13022E_()) {
            super.startActivityForResult(PinLoginActivity.write((Context) this), 5004);
            setSubtitle();
            return;
        }
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void ActionMenuItemView() {
        if (!setGroupDividerEnabled() || mo13022E_()) {
            super.startActivityForResult(PinLoginActivity.write((Context) this), 5005);
            setSubtitle();
            return;
        }
        this.presenter.write();
    }
}
