package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.scb.phone.view.activity.hml.HmlBusinessInformationActivity;
import com.scb.phone.view.activity.hml.HmlBusinessInformationActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.easycash.C5744x96c4dafb;
import java.io.ByteArrayOutputStream;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;

public final class HmlNtbBusinessOccupationInfoFragment extends HmlBusinessOccupationInfoFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write implements LocalProjectProvider.C6939a {
        private Context MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(Context context) {
            this.MediaBrowserCompat$ItemReceiver = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
            if (r8 != null) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r9.addSuppressed(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
            throw r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
            if (r1 != null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
            throw r9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap MediaBrowserCompat$ItemReceiver(android.net.Uri r8, int r9, int r10) {
            /*
                r7 = this;
                r0 = 0
                android.content.Context r1 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0069 }
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0069 }
                java.io.InputStream r1 = r1.openInputStream(r8)     // Catch:{ Exception -> 0x0069 }
                android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x005b }
                r2.<init>()     // Catch:{ all -> 0x005b }
                r3 = 1
                r2.inJustDecodeBounds = r3     // Catch:{ all -> 0x005b }
                android.graphics.BitmapFactory.decodeStream(r1, r0, r2)     // Catch:{ all -> 0x005b }
                int r4 = r2.outHeight     // Catch:{ all -> 0x005b }
                int r5 = r2.outWidth     // Catch:{ all -> 0x005b }
                if (r4 > r10) goto L_0x001e
                if (r5 <= r9) goto L_0x002c
            L_0x001e:
                r6 = 2
                int r4 = r4 / r6
                int r5 = r5 / r6
                int r4 = r4 / r10
                int r5 = r5 / r9
                int r9 = r4 + r5
                if (r9 <= r6) goto L_0x002c
                int r9 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x005b }
                int r3 = r3 + r9
            L_0x002c:
                r2.inSampleSize = r3     // Catch:{ all -> 0x005b }
                r9 = 0
                r2.inJustDecodeBounds = r9     // Catch:{ all -> 0x005b }
                android.content.Context r9 = r7.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x005b }
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ all -> 0x005b }
                java.io.InputStream r8 = r9.openInputStream(r8)     // Catch:{ all -> 0x005b }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r8, r0, r2)     // Catch:{ all -> 0x004d }
                r8.close()     // Catch:{ all -> 0x004d }
                if (r8 == 0) goto L_0x0047
                r8.close()     // Catch:{ all -> 0x005b }
            L_0x0047:
                if (r1 == 0) goto L_0x006d
                r1.close()     // Catch:{ Exception -> 0x0069 }
                goto L_0x006d
            L_0x004d:
                r9 = move-exception
                throw r9     // Catch:{ all -> 0x004f }
            L_0x004f:
                r10 = move-exception
                if (r8 == 0) goto L_0x005a
                r8.close()     // Catch:{ all -> 0x0056 }
                goto L_0x005a
            L_0x0056:
                r8 = move-exception
                r9.addSuppressed(r8)     // Catch:{ all -> 0x005b }
            L_0x005a:
                throw r10     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                if (r1 == 0) goto L_0x0068
                r1.close()     // Catch:{ all -> 0x0064 }
                goto L_0x0068
            L_0x0064:
                r10 = move-exception
                r8.addSuppressed(r10)     // Catch:{ Exception -> 0x0069 }
            L_0x0068:
                throw r9     // Catch:{ Exception -> 0x0069 }
            L_0x0069:
                r8 = move-exception
                p040o.onCheckBoxClick.write((java.lang.Throwable) r8)
            L_0x006d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.businessowner.HmlNtbBusinessOccupationInfoFragment.write.MediaBrowserCompat$ItemReceiver(android.net.Uri, int, int):android.graphics.Bitmap");
        }

        public final /* synthetic */ byte[] MediaBrowserCompat$ItemReceiver(String str, int i, int i2) throws Exception {
            Bitmap MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(Uri.parse(str), i, i2);
            byte[] bArr = new byte[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                MediaBrowserCompat$ItemReceiver2.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                onCheckBoxClick.write((Throwable) e);
            }
            MediaBrowserCompat$ItemReceiver2.recycle();
            return bArr;
        }

        public final DebitCardResetOtpActivity<byte[]> write(String str, int i, int i2) {
            return DebitCardResetOtpActivity.fromCallable(new C5744x96c4dafb(this, str, i2, i));
        }
    }

    public final Intent write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        HmlBusinessInformationActivity$MediaBrowserCompat$ItemReceiver hmlBusinessInformationActivity$MediaBrowserCompat$ItemReceiver = HmlBusinessInformationActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, HmlBusinessInformationActivity.class);
    }
}
