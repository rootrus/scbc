package p040o;

import com.scb.phone.view.activity.prepaid.C8902x24e4e8fb;
import p040o.GoogleApi;

/* renamed from: o.format */
public final /* synthetic */ class C9942format implements DirectDebitDeepLinkActivity {
    public /* synthetic */ C9942format(GoogleApi.Settings settings) {
    }

    public final Object write(Object obj) {
        String str;
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        if ("3024".equalsIgnoreCase(setcurrentiteminternal.getStatus().write())) {
            str = "EXISTS";
        } else {
            str = "3025".equalsIgnoreCase(setcurrentiteminternal.getStatus().write()) ? "DOPA" : "SUCCESS";
        }
        return new C8902x24e4e8fb(str);
    }
}
