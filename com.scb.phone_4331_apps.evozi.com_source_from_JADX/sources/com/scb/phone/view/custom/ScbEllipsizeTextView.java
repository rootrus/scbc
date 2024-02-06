package com.scb.phone.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class ScbEllipsizeTextView extends AppCompatTextView {
    private CharSequence IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private CharSequence MediaBrowserCompat$SearchResultReceiver;
    private boolean read;

    public ScbEllipsizeTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScbEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.EllipsizeTextView);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getInt(0, 0);
        CharSequence text = obtainStyledAttributes.getText(1);
        this.IconCompatParcelizer = text;
        if (text == null) {
            this.IconCompatParcelizer = "...";
        }
        obtainStyledAttributes.recycle();
    }

    public void setMaxLines(int i) {
        if (this.MediaBrowserCompat$MediaItem != i) {
            super.setMaxLines(i);
            this.MediaBrowserCompat$MediaItem = i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r15 > r2 && r2 > 0) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            java.lang.CharSequence r0 = r13.MediaBrowserCompat$SearchResultReceiver
            r13.setText(r0)
            super.onMeasure(r14, r15)
            int r14 = android.view.View.MeasureSpec.getMode(r14)     // Catch:{ Exception -> 0x0164 }
            r15 = 1073741824(0x40000000, float:2.0)
            r0 = 1
            r1 = 0
            if (r14 != r15) goto L_0x0014
            r14 = r0
            goto L_0x0015
        L_0x0014:
            r14 = r1
        L_0x0015:
            r13.MediaBrowserCompat$ItemReceiver = r14     // Catch:{ Exception -> 0x0164 }
            android.text.Layout r14 = r13.getLayout()     // Catch:{ Exception -> 0x0164 }
            if (r14 == 0) goto L_0x002c
            int r15 = r14.getLineCount()     // Catch:{ Exception -> 0x0164 }
            int r2 = r13.MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0164 }
            if (r15 <= r2) goto L_0x0029
            if (r2 <= 0) goto L_0x0029
            r15 = r0
            goto L_0x002a
        L_0x0029:
            r15 = r1
        L_0x002a:
            if (r15 != 0) goto L_0x0045
        L_0x002c:
            int r15 = r14.getHeight()     // Catch:{ Exception -> 0x0164 }
            int r2 = r13.getMeasuredHeight()     // Catch:{ Exception -> 0x0164 }
            int r3 = r13.getPaddingBottom()     // Catch:{ Exception -> 0x0164 }
            int r2 = r2 - r3
            int r3 = r13.getPaddingTop()     // Catch:{ Exception -> 0x0164 }
            int r2 = r2 - r3
            if (r15 <= r2) goto L_0x0042
            r15 = r0
            goto L_0x0043
        L_0x0042:
            r15 = r1
        L_0x0043:
            if (r15 == 0) goto L_0x0168
        L_0x0045:
            java.lang.CharSequence r15 = r13.MediaBrowserCompat$SearchResultReceiver     // Catch:{ Exception -> 0x0164 }
            int r2 = r15.length()     // Catch:{ Exception -> 0x0164 }
            int r3 = r13.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0164 }
            int r2 = r2 - r3
            int r3 = r15.length()     // Catch:{ Exception -> 0x0164 }
            java.lang.CharSequence r2 = r15.subSequence(r2, r3)     // Catch:{ Exception -> 0x0164 }
            int r3 = r14.getWidth()     // Catch:{ Exception -> 0x0164 }
            int r4 = r13.getPaddingLeft()     // Catch:{ Exception -> 0x0164 }
            int r3 = r3 - r4
            int r4 = r13.getPaddingRight()     // Catch:{ Exception -> 0x0164 }
            int r3 = r3 - r4
            int r4 = r13.getMeasuredHeight()     // Catch:{ Exception -> 0x0164 }
            int r5 = r13.getPaddingTop()     // Catch:{ Exception -> 0x0164 }
            int r6 = r13.getPaddingBottom()     // Catch:{ Exception -> 0x0164 }
            r7 = r1
        L_0x0071:
            int r8 = r14.getLineCount()     // Catch:{ Exception -> 0x0164 }
            if (r7 >= r8) goto L_0x0084
            int r8 = r4 - r5
            int r8 = r8 - r6
            int r9 = r14.getLineBottom(r7)     // Catch:{ Exception -> 0x0164 }
            if (r8 >= r9) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            int r7 = r7 + 1
            goto L_0x0071
        L_0x0084:
            int r7 = r14.getLineCount()     // Catch:{ Exception -> 0x0164 }
        L_0x0088:
            int r4 = java.lang.Math.max(r0, r7)     // Catch:{ Exception -> 0x0164 }
            int r4 = r4 - r0
            float r5 = r14.getLineWidth(r4)     // Catch:{ Exception -> 0x0164 }
            int r5 = (int) r5     // Catch:{ Exception -> 0x0164 }
            int r14 = r14.getLineEnd(r4)     // Catch:{ Exception -> 0x0164 }
            java.lang.CharSequence r4 = r13.IconCompatParcelizer     // Catch:{ Exception -> 0x0164 }
            android.text.TextPaint r6 = r13.getPaint()     // Catch:{ Exception -> 0x0164 }
            float r4 = android.text.Layout.getDesiredWidth(r4, r6)     // Catch:{ Exception -> 0x0164 }
            android.text.TextPaint r6 = r13.getPaint()     // Catch:{ Exception -> 0x0164 }
            float r6 = android.text.Layout.getDesiredWidth(r2, r6)     // Catch:{ Exception -> 0x0164 }
            float r4 = r4 + r6
            int r4 = (int) r4     // Catch:{ Exception -> 0x0164 }
            r13.read = r1     // Catch:{ Exception -> 0x0164 }
            int r4 = r4 + r0
            int r5 = r5 + r4
            if (r5 <= r3) goto L_0x0152
            java.lang.CharSequence r4 = r15.subSequence(r1, r14)     // Catch:{ Exception -> 0x0164 }
            int r5 = r5 - r3
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0164 }
            if (r3 == 0) goto L_0x00be
            r4 = r1
            goto L_0x0141
        L_0x00be:
            android.text.SpannableStringBuilder r3 = android.text.SpannableStringBuilder.valueOf(r4)     // Catch:{ Exception -> 0x0164 }
            int r6 = r3.length()     // Catch:{ Exception -> 0x0164 }
            java.lang.Class<android.text.style.CharacterStyle> r7 = android.text.style.CharacterStyle.class
            java.lang.Object[] r6 = r3.getSpans(r1, r6, r7)     // Catch:{ Exception -> 0x0164 }
            android.text.style.CharacterStyle[] r6 = (android.text.style.CharacterStyle[]) r6     // Catch:{ Exception -> 0x0164 }
            if (r6 == 0) goto L_0x00f9
            int r7 = r6.length     // Catch:{ Exception -> 0x0164 }
            if (r7 == 0) goto L_0x00f9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0164 }
            r7.<init>()     // Catch:{ Exception -> 0x0164 }
            int r8 = r6.length     // Catch:{ Exception -> 0x0164 }
            r9 = r1
        L_0x00da:
            if (r9 >= r8) goto L_0x00fd
            r10 = r6[r9]     // Catch:{ Exception -> 0x0164 }
            com.scb.phone.view.custom.ScbEllipsizeTextView$MediaBrowserCompat$CustomActionResultReceiver r11 = new com.scb.phone.view.custom.ScbEllipsizeTextView$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0164 }
            int r12 = r3.getSpanStart(r10)     // Catch:{ Exception -> 0x0164 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0164 }
            int r10 = r3.getSpanEnd(r10)     // Catch:{ Exception -> 0x0164 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0164 }
            r11.<init>(r12, r10)     // Catch:{ Exception -> 0x0164 }
            r7.add(r11)     // Catch:{ Exception -> 0x0164 }
            int r9 = r9 + 1
            goto L_0x00da
        L_0x00f9:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x0164 }
        L_0x00fd:
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0164 }
            int r6 = r4.length()     // Catch:{ Exception -> 0x0164 }
            int r6 = r3.codePointCount(r1, r6)     // Catch:{ Exception -> 0x0164 }
            r8 = r1
        L_0x010a:
            if (r6 <= 0) goto L_0x0138
            if (r5 <= r8) goto L_0x0138
            int r6 = r6 + -1
            int r8 = r3.offsetByCodePoints(r1, r6)     // Catch:{ Exception -> 0x0164 }
            com.scb.phone.view.custom.ScbEllipsizeTextView$MediaBrowserCompat$CustomActionResultReceiver r9 = MediaBrowserCompat$CustomActionResultReceiver(r7, r8)     // Catch:{ Exception -> 0x0164 }
            if (r9 == 0) goto L_0x0126
            T r6 = r9.write     // Catch:{ Exception -> 0x0164 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0164 }
            int r8 = r6.intValue()     // Catch:{ Exception -> 0x0164 }
            int r6 = r3.codePointCount(r1, r8)     // Catch:{ Exception -> 0x0164 }
        L_0x0126:
            int r9 = r4.length()     // Catch:{ Exception -> 0x0164 }
            java.lang.CharSequence r8 = r4.subSequence(r8, r9)     // Catch:{ Exception -> 0x0164 }
            android.text.TextPaint r9 = r13.getPaint()     // Catch:{ Exception -> 0x0164 }
            float r8 = android.text.Layout.getDesiredWidth(r8, r9)     // Catch:{ Exception -> 0x0164 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x0164 }
            goto L_0x010a
        L_0x0138:
            int r4 = r4.length()     // Catch:{ Exception -> 0x0164 }
            int r3 = r3.offsetByCodePoints(r1, r6)     // Catch:{ Exception -> 0x0164 }
            int r4 = r4 - r3
        L_0x0141:
            int r14 = r14 - r4
            java.lang.CharSequence r14 = r15.subSequence(r1, r14)     // Catch:{ Exception -> 0x0164 }
            r13.setText(r14)     // Catch:{ Exception -> 0x0164 }
            java.lang.CharSequence r14 = r13.IconCompatParcelizer     // Catch:{ Exception -> 0x0164 }
            r13.append(r14)     // Catch:{ Exception -> 0x0164 }
            r13.append(r2)     // Catch:{ Exception -> 0x0164 }
            goto L_0x0161
        L_0x0152:
            java.lang.CharSequence r14 = r15.subSequence(r1, r14)     // Catch:{ Exception -> 0x0164 }
            r13.setText(r14)     // Catch:{ Exception -> 0x0164 }
            java.lang.CharSequence r14 = r13.IconCompatParcelizer     // Catch:{ Exception -> 0x0164 }
            r13.append(r14)     // Catch:{ Exception -> 0x0164 }
            r13.append(r2)     // Catch:{ Exception -> 0x0164 }
        L_0x0161:
            r13.read = r0     // Catch:{ Exception -> 0x0164 }
            return
        L_0x0164:
            r14 = move-exception
            p040o.onCheckBoxClick.IconCompatParcelizer(r14)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.ScbEllipsizeTextView.onMeasure(int, int):void");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.read) {
            this.MediaBrowserCompat$SearchResultReceiver = charSequence;
        }
        super.setText(charSequence, bufferType);
        if (this.MediaBrowserCompat$ItemReceiver) {
            requestLayout();
        }
    }

    private static C5797xf282671a<Integer> MediaBrowserCompat$CustomActionResultReceiver(List<C5797xf282671a<Integer>> list, int i) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (C5797xf282671a<Integer> next : list) {
            Integer valueOf = Integer.valueOf(i);
            boolean z = false;
            boolean z2 = valueOf.compareTo(next.write) >= 0;
            boolean z3 = valueOf.compareTo(next.MediaBrowserCompat$CustomActionResultReceiver) < 0;
            if (z2 && z3) {
                z = true;
                continue;
            }
            if (z) {
                return next;
            }
        }
        return null;
    }

    public void setEllipsizeText(CharSequence charSequence, int i) {
        this.IconCompatParcelizer = charSequence;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }
}
