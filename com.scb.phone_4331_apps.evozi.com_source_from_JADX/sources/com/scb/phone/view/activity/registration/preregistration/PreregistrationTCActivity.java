package com.scb.phone.view.activity.registration.preregistration;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.registration.RegistrationSuccessActivity;
import com.scb.phone.view.activity.registration.friends.FriendsRegistrationActivity;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.C4995nA;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.ImmutableSetMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.copyOfSorted;
import p040o.delegate;
import p040o.getFileSHA;
import p040o.getKernelIDDstOver;
import p040o.immediateFailedFuture;
import p040o.nA$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nA$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setFaceRightPadding;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PreregistrationTCActivity extends BaseActivityWithFragment implements setFaceRightPadding, FragmentBuilder_BindCustomizeYourPageFragment {
    private getKernelIDDstOver MediaBrowserCompat$MediaItem = new getKernelIDDstOver();
    @HmlPinActivity
    public C4995nA presenter;

    public static final Intent write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, PreregistrationTCActivity.class);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4995nA nAVar = this.presenter;
        if (nAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nAVar.MediaBrowserCompat$ItemReceiver(this);
        C4995nA nAVar2 = this.presenter;
        if (nAVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C4995nA.IconCompatParcelizer(nAVar2);
        if (nAVar2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nAVar2.RatingCompat);
        }
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_termsconditions");
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

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        write("EASYAPP");
    }

    public final void read() {
        PreregistrationLandingActivity.IconCompatParcelizer(this);
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        String str2;
        String str3;
        C4995nA nAVar = this.presenter;
        if (nAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        boolean z2 = !AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        if (nAVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nAVar.RatingCompat.AlertController$RecycleListView();
        }
        delegate delegate = nAVar.IconCompatParcelizer;
        String IconCompatParcelizer = nAVar.read.RatingCompat.IconCompatParcelizer();
        String str4 = (IconCompatParcelizer == null || IconCompatParcelizer == null) ? "" : IconCompatParcelizer;
        String str5 = Build.BRAND;
        String str6 = (str5 == null || str5 == null) ? "" : str5;
        String str7 = Build.MODEL;
        if (str7 == null || str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = Build.VERSION.RELEASE;
        if (str8 == null || str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        delegate.write(new ImmutableSetMultimap.SortedKeyBuilderMultimap(new copyOfSorted(str4, "", str6, str2, str3, nAVar.read.RatingCompat.MediaBrowserCompat$ItemReceiver() ? DiskLruCache.VERSION_1 : "0"), ""), z2);
        nAVar.IconCompatParcelizer.IconCompatParcelizer(new nA$MediaBrowserCompat$ItemReceiver(nAVar));
    }

    public final void write(String str) {
        C4995nA nAVar = this.presenter;
        if (nAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = nA$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (nAVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nAVar.RatingCompat);
        }
    }

    public final void setContentView() {
        C4995nA nAVar = this.presenter;
        if (nAVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = nA$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (nAVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nAVar.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        if (getApplication() instanceof AndroidApplication) {
            ((AndroidApplication) getApplication()).IconCompatParcelizer = false;
        }
        FriendsRegistrationActivity.read read = FriendsRegistrationActivity.MediaMetadataCompat;
        Context context = this;
        getFileSHA getfilesha = getFileSHA.REGULAR;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, FriendsRegistrationActivity.class);
        intent.putExtra("SUCCESS_PAGE_DYNAMIC_TYPE", getfilesha);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        if (getApplication() instanceof AndroidApplication) {
            ((AndroidApplication) getApplication()).IconCompatParcelizer = false;
        }
        RegistrationSuccessActivity.write write = RegistrationSuccessActivity.MediaDescriptionCompat;
        Context context = this;
        getFileSHA getfilesha = getFileSHA.REGULAR;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, RegistrationSuccessActivity.class);
        intent.putExtra("SUCCESS_PAGE_DYNAMIC_TYPE", getfilesha);
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
}
