package p040o;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.gms.common.internal.ImagesContract;

/* renamed from: o.PrepaidActivationService */
public final class PrepaidActivationService extends LinkMovementMethod {
    private final C6992x633f693d MediaBrowserCompat$CustomActionResultReceiver;

    public PrepaidActivationService(C6992x633f693d prepaidActivationService$MediaBrowserCompat$CustomActionResultReceiver) {
        onGetStartedClick.write((Object) prepaidActivationService$MediaBrowserCompat$CustomActionResultReceiver, "onLinkClickedListener");
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidActivationService$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        onGetStartedClick.write((Object) textView, "widget");
        onGetStartedClick.write((Object) spannable, "buffer");
        onGetStartedClick.write((Object) motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int totalPaddingTop = textView.getTotalPaddingTop();
            int scrollX = textView.getScrollX();
            int scrollY = textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - totalPaddingTop) + scrollY), (float) ((((int) motionEvent.getX()) - totalPaddingLeft) + scrollX));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
            onGetStartedClick.IconCompatParcelizer((Object) uRLSpanArr, "link");
            if (!(uRLSpanArr.length == 0)) {
                URLSpan uRLSpan = uRLSpanArr[0];
                onGetStartedClick.IconCompatParcelizer((Object) uRLSpan, "link[0]");
                String url = uRLSpan.getURL();
                C6992x633f693d prepaidActivationService$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) url, ImagesContract.URL);
                prepaidActivationService$MediaBrowserCompat$CustomActionResultReceiver.read(url);
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
