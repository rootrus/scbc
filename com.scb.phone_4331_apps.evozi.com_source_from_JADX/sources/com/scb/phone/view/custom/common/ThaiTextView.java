package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.text.BreakIterator;
import java.util.Locale;

public class ThaiTextView extends AppCompatTextView {
    private String IconCompatParcelizer;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$CustomActionResultReceiver;

    public ThaiTextView(Context context) {
        this(context, (AttributeSet) null);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (!ThaiTextView.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    ThaiTextView thaiTextView = ThaiTextView.this;
                    ThaiTextView.MediaBrowserCompat$CustomActionResultReceiver(thaiTextView, thaiTextView.getWidth());
                }
                ThaiTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public ThaiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (!ThaiTextView.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    ThaiTextView thaiTextView = ThaiTextView.this;
                    ThaiTextView.MediaBrowserCompat$CustomActionResultReceiver(thaiTextView, thaiTextView.getWidth());
                }
                ThaiTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public ThaiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (!ThaiTextView.this.MediaBrowserCompat$CustomActionResultReceiver) {
                    ThaiTextView thaiTextView = ThaiTextView.this;
                    ThaiTextView.MediaBrowserCompat$CustomActionResultReceiver(thaiTextView, thaiTextView.getWidth());
                }
                ThaiTextView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.IconCompatParcelizer = charSequence != null ? charSequence.toString() : "";
        super.setText(charSequence, bufferType);
    }

    private static String IconCompatParcelizer(BreakIterator breakIterator, String str) {
        StringBuilder sb = new StringBuilder();
        int first = breakIterator.first();
        while (true) {
            int next = breakIterator.next();
            if (next == -1) {
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(first, next));
            sb2.append("!split!");
            sb.append(sb2.toString());
            first = next;
        }
    }

    static /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver(ThaiTextView thaiTextView, int i) {
        StringBuilder sb;
        if (i == 0) {
            return 0;
        }
        int paddingLeft = i - (thaiTextView.getPaddingLeft() + thaiTextView.getPaddingRight());
        String str = thaiTextView.IconCompatParcelizer;
        if (!thaiTextView.MediaBrowserCompat$CustomActionResultReceiver) {
            float f = (float) paddingLeft;
            if (thaiTextView.getPaint().measureText(str) > f && !(thaiTextView.getText() instanceof SpannableString)) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(new Locale("th"));
                wordInstance.setText(str);
                String[] split = IconCompatParcelizer(wordInstance, str).split("!split!");
                int length = split.length;
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                for (int i2 = 0; i2 < length; i2++) {
                    if (sb3.toString().endsWith("\n")) {
                        sb3 = new StringBuilder();
                    }
                    sb3.append(split[i2]);
                    int i3 = (f > thaiTextView.getPaint().measureText(sb3.toString()) ? 1 : (f == thaiTextView.getPaint().measureText(sb3.toString()) ? 0 : -1));
                    if (i3 > 0) {
                        sb2.append(split[i2]);
                    } else {
                        if (i3 == 0) {
                            String str2 = split[i2];
                            sb = new StringBuilder();
                            sb2.append(str2);
                            if (!sb2.toString().endsWith(" ") && !sb2.toString().endsWith("\n")) {
                                sb2.append("\n");
                            }
                        } else {
                            String str3 = split[i2];
                            sb = new StringBuilder();
                            sb.append(str3);
                            if (!sb2.toString().endsWith(" ") && !sb2.toString().endsWith("\n") && !str3.startsWith(" ") && !str3.startsWith("\n") && !sb2.toString().endsWith(":") && !sb2.toString().isEmpty()) {
                                sb2.append("\n");
                            }
                            sb2.append(str3);
                        }
                        sb3 = sb;
                    }
                }
                thaiTextView.MediaBrowserCompat$CustomActionResultReceiver = true;
                thaiTextView.setText(sb2.toString());
            }
        }
        return paddingLeft;
    }
}
