package com.scb.phone.view.custom.investment;

import android.content.Context;
import android.text.Html;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class CustomHyperLinkTextView extends AppCompatTextView {
    public CustomHyperLinkTextView(Context context) {
        super(context);
    }

    public CustomHyperLinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomHyperLinkTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTextViewHTML(String str) {
        setText(new SpannableStringBuilder(Html.fromHtml(str)));
    }

    public static class IconCompatParcelizer extends LinkMovementMethod {
        private write write;

        public interface write {
            void MediaSessionCompat$QueueItem();
        }

        public IconCompatParcelizer(write write2) {
            this.write = write2;
        }

        public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 0) {
                return Touch.onTouchEvent(textView, spannable, motionEvent);
            }
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - totalPaddingTop) + scrollY), (float) ((((int) motionEvent.getX()) - totalPaddingLeft) + scrollX));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                    write write2 = this.write;
                    if (write2 != null) {
                        write2.MediaSessionCompat$QueueItem();
                    }
                } else {
                    Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            }
            Selection.removeSelection(spannable);
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
    }
}
