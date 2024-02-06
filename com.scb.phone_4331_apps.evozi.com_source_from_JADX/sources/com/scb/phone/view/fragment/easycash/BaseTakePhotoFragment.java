package com.scb.phone.view.fragment.easycash;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.JuristicService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.setTapText;

public abstract class BaseTakePhotoFragment extends BreadcrumbFragment {
    public String MediaBrowserCompat$CustomActionResultReceiver;

    public int ParcelableVolumeInfo() {
        return 0;
    }

    public String PlaybackStateCompat() {
        return null;
    }

    public boolean setHasDecor() {
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bundle.getString("IMAGE_PATH");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("IMAGE_PATH", this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062 A[Catch:{ all -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatDialogFragment() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00a0 }
            android.content.Context r1 = r6.getContext()     // Catch:{ Exception -> 0x00a0 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ Exception -> 0x00a0 }
            android.content.ComponentName r1 = r0.resolveActivity(r1)     // Catch:{ Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = "mounted"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00a0 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00a0 }
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = "mounted_ro"
            java.lang.String r2 = android.os.Environment.getExternalStorageState()     // Catch:{ Exception -> 0x00a0 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r1 = 0
            goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            android.content.Context r2 = r6.getContext()     // Catch:{ Exception -> 0x00a0 }
            java.io.File r2 = p040o.FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer((android.content.Context) r2, (boolean) r1)     // Catch:{ Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x0046
            android.content.Context r1 = r6.getContext()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri r1 = p040o.AppCompatTextView.IconCompatParcelizer(r1, r3, r2)     // Catch:{ Exception -> 0x00a0 }
            goto L_0x0050
        L_0x0046:
            android.content.Context r1 = r6.getContext()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = p040o.RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri r1 = p040o.AppCompatTextView.IconCompatParcelizer(r1, r3, r2)     // Catch:{ Exception -> 0x00a0 }
        L_0x0050:
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r3 = "output"
            r0.putExtra(r3, r1)     // Catch:{ Exception -> 0x00a0 }
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()     // Catch:{ Exception -> 0x00a0 }
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x006a
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r1, r0)     // Catch:{ all -> 0x0096 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x0096 }
        L_0x006a:
            o.MyECouponActivity_ViewBinding$write r3 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: "
            r4.<init>(r5)     // Catch:{ all -> 0x0096 }
            android.net.Uri r5 = r0.getData()     // Catch:{ all -> 0x0096 }
            r4.append(r5)     // Catch:{ all -> 0x0096 }
            java.lang.String r5 = "\n with context "
            r4.append(r5)     // Catch:{ all -> 0x0096 }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x0096 }
            r4.append(r1)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0096 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r3, (java.lang.String) r1)     // Catch:{ all -> 0x0096 }
            r1 = r6
            com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment r1 = (com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment) r1     // Catch:{ all -> 0x0096 }
            r3 = 10003(0x2713, float:1.4017E-41)
            r1.startActivityForResult(r0, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x009d
        L_0x0096:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x00a0 }
            goto L_0x009d
        L_0x009b:
            java.lang.String r2 = ""
        L_0x009d:
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ Exception -> 0x00a0 }
            return
        L_0x00a0:
            r0 = move-exception
            java.lang.String r1 = "Catch Exception"
            java.lang.String r2 = "Error in dispatchTakePictureIntent(), BaseTakePhotoFragment Class"
            android.util.Log.d(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment.AppCompatDialogFragment():void");
    }

    public final void AppCompatViewInflater() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 10005);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setCheckable() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void setChecked() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public static void setExpandedFormat() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void ActionMenuItemView() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        JuristicService.write(this, i, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && getContext() != null && i != 10003 && i == 10005) {
            this.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindDepositSelectorFragment.read(getContext(), intent.getData());
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
