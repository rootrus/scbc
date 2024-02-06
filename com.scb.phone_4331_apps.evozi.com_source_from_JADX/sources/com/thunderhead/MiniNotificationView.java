package com.thunderhead;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.LinearLayout;
import p040o.MyECouponActivity_ViewBinding;

public class MiniNotificationView extends LinearLayout {
    public /* synthetic */ MiniNotificationView(Context context, Bitmap bitmap, String str, int i, String str2, String str3, int i2, byte b) {
        this(context, bitmap, str, i, str2, str3, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private MiniNotificationView(android.content.Context r16, android.graphics.Bitmap r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = 0
            r5 = r22
            r15.<init>(r1, r4, r5)
            r4 = 0
            r15.setOrientation(r4)
            int r5 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.thunderhead_notification_root
            r15.setId(r5)
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            android.content.Context r6 = r15.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            r7 = 1
            r8 = 1117782016(0x42a00000, float:80.0)
            float r6 = android.util.TypedValue.applyDimension(r7, r8, r6)
            int r6 = (int) r6
            r8 = -1
            r5.<init>(r8, r6)
            r15.setLayoutParams(r5)
            android.content.Context r5 = r15.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r6 = 1095761920(0x41500000, float:13.0)
            float r5 = android.util.TypedValue.applyDimension(r7, r6, r5)
            int r5 = (int) r5
            r15.setPadding(r5, r5, r5, r5)
            r6 = -13882324(0xffffffffff2c2c2c, float:-2.2885657E38)
            r9 = r21
            int r6 = write(r9, r6)
            r15.setBackgroundColor(r6)
            android.content.Context r9 = r15.getContext()
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            r10 = 1112801280(0x42540000, float:53.0)
            float r7 = android.util.TypedValue.applyDimension(r7, r10, r9)
            int r7 = (int) r7
            if (r2 == 0) goto L_0x009c
            int r9 = r17.getWidth()
            int r10 = r17.getHeight()
            if (r7 >= r10) goto L_0x007b
            double r11 = (double) r9
            double r13 = (double) r7
            double r9 = (double) r10
            double r13 = r13 / r9
            double r11 = r11 * r13
            int r9 = (int) r11
            r10 = r7
        L_0x007b:
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r10)
            r11.rightMargin = r5
            r5 = 17
            r11.gravity = r5
            android.widget.ImageView r5 = new android.widget.ImageView
            r5.<init>(r1)
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.notificationContent
            r5.setId(r9)
            r5.setLayoutParams(r11)
            r5.setImageBitmap(r2)
            r5.setBackgroundColor(r6)
            r15.addView(r5)
        L_0x009c:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r4, r7, r5)
            r2.setBackgroundColor(r6)
            r2.setLayoutParams(r1)
            r1 = 2
            r2.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r1)
            if (r3 > 0) goto L_0x00bf
            r1 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r1)
            goto L_0x00c3
        L_0x00bf:
            float r1 = (float) r3
            r2.setTextSize(r1)
        L_0x00c3:
            r1 = r20
            int r1 = write(r1, r8)
            r2.setTextColor(r1)
            r1 = r18
            r2.setText(r1)
            r1 = 16
            r2.setGravity(r1)
            r15.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.MiniNotificationView.<init>(android.content.Context, android.graphics.Bitmap, java.lang.String, int, java.lang.String, java.lang.String, int):void");
    }

    private static int write(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse background color. Expected #RRGGBB, got: ");
                sb.append(str);
                MyECouponActivity_ViewBinding.write(sb.toString());
                MyECouponActivity_ViewBinding.IconCompatParcelizer((Exception) e);
            }
        }
        return (16777215 & i) | -134217728;
    }

    public static class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public Context MediaBrowserCompat$ItemReceiver;
        public int MediaMetadataCompat;
        public Bitmap read;
        public String write;

        public write(Context context) {
            this.MediaBrowserCompat$ItemReceiver = context;
        }
    }
}
