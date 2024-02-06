package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.forgotpin.ForgotPinOtpActivity;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.C4949mB;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickExtractorListener;
import p040o.getKernelIDDstOver;
import p040o.immediateFailedFuture;
import p040o.mB$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.mB$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RegistrationTermsAndConsActivity extends BaseActivityWithFragment implements QuickExtractorListener, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    private getKernelIDDstOver MediaBrowserCompat$SearchResultReceiver = new getKernelIDDstOver();
    @HmlPinActivity
    public C4949mB presenter;

    public static final Intent read(Context context, mB$MediaBrowserCompat$ItemReceiver mb_mediabrowsercompat_itemreceiver) {
        return write.write(context, mb_mediabrowsercompat_itemreceiver);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent read(Context context, mB$MediaBrowserCompat$ItemReceiver mb_mediabrowsercompat_itemreceiver) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) mb_mediabrowsercompat_itemreceiver, "flowType");
            Intent intent = new Intent(context, RegistrationTermsAndConsActivity.class);
            intent.putExtra("FLOW_TYPE", mb_mediabrowsercompat_itemreceiver);
            return intent;
        }

        public static Intent write(Context context, mB$MediaBrowserCompat$ItemReceiver mb_mediabrowsercompat_itemreceiver) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) mb_mediabrowsercompat_itemreceiver, "flowType");
            Intent intent = new Intent(context, RegistrationTermsAndConsActivity.class);
            intent.putExtra("FLOW_TYPE", mb_mediabrowsercompat_itemreceiver);
            intent.setFlags(268468224);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4949mB mBVar = this.presenter;
        if (mBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        mBVar.MediaBrowserCompat$ItemReceiver(this);
        C4949mB mBVar2 = this.presenter;
        if (mBVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String D_ = mo3026D_();
        onGetStartedClick.IconCompatParcelizer((Object) D_, "language");
        mB$MediaBrowserCompat$ItemReceiver mb_mediabrowsercompat_itemreceiver = (mB$MediaBrowserCompat$ItemReceiver) AlertController$RecycleListView.read(new RegistrationTermsAndConsActivity$MediaBrowserCompat$ItemReceiver(this), mB$MediaBrowserCompat$ItemReceiver.EASYAPP);
        onGetStartedClick.write((Object) D_, "lang");
        onGetStartedClick.write((Object) mb_mediabrowsercompat_itemreceiver, "flowType");
        mBVar2.IconCompatParcelizer = mb_mediabrowsercompat_itemreceiver;
        mBVar2.write = D_;
        writeUInt64NoTag.IconCompatParcelizer write2 = new C4949mB.write(mBVar2);
        if (mBVar2.RatingCompat != null) {
            write2.IconCompatParcelizer(mBVar2.RatingCompat);
        }
        super.setStackedBackground();
        setTitle(R.string.terms_and_conditions);
        ListMenuItemView();
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_termsconditions");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.terms_and_conditions);
        ListMenuItemView();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        String string = getString(R.string.terms_and_conditions);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(com.scb.phone.…ing.terms_and_conditions)");
        return string;
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "policy");
        Intent MediaBrowserCompat$ItemReceiver = RegistrationOtpActivity.MediaBrowserCompat$ItemReceiver(this, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        Intent intent = new Intent(this, ForgotPinOtpActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(String str) {
        C4949mB mBVar = this.presenter;
        if (mBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        String str2 = mBVar.write;
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            objArr[0] = upperCase;
            String format = MessageFormat.format("FastEasyRegisteration_{0}", objArr);
            mBVar.MediaBrowserCompat$ItemReceiver.write.MediaBrowserCompat$CustomActionResultReceiver(mBVar.read);
            onGetStartedClick.IconCompatParcelizer((Object) format, "policy");
            writeUInt64NoTag.IconCompatParcelizer read = new C4949mB.read(mBVar, format);
            if (mBVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                read.IconCompatParcelizer(mBVar.RatingCompat);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void write(String str) {
        C4949mB mBVar = this.presenter;
        if (mBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = mB$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (mBVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(mBVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindDepositMoreInfoFragment.write((WeakReference<BaseActivity>) new WeakReference(this));
        finish();
    }

    public final void setContentView() {
        C4949mB mBVar = this.presenter;
        if (mBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = mB$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (mBVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(mBVar.RatingCompat);
        }
    }

    public static final Intent IconCompatParcelizer(Context context) {
        return write.read(context, mB$MediaBrowserCompat$ItemReceiver.EASYAPP);
    }
}
