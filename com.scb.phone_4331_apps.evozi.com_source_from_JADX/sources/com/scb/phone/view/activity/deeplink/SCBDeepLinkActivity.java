package com.scb.phone.view.activity.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.AreAllEdgesConfident;
import p040o.C6505x27b2fe35;
import p040o.HmlNdidSelectIdpActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.removeAllOccurrences;

public class SCBDeepLinkActivity extends DeepLinkActivity {
    @HmlPinActivity
    public AreAllEdgesConfident presenter;

    public void onCreate(Bundle bundle) {
        Uri data;
        String str;
        super.onCreate(bundle);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        AreAllEdgesConfident areAllEdgesConfident = this.presenter;
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) data, "uri");
            boolean z = false;
            if (!data.isOpaque()) {
                removeAllOccurrences removealloccurrences = areAllEdgesConfident.write;
                Set<String> queryParameterNames = data.getQueryParameterNames();
                onGetStartedClick.IconCompatParcelizer((Object) queryParameterNames, "uri.queryParameterNames");
                Iterable iterable = queryParameterNames;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                Iterator it = iterable.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = (String) it.next();
                    String queryParameter = data.getQueryParameter(str2);
                    if (queryParameter != null) {
                        str = queryParameter;
                    }
                    arrayList.add(new HmlVerifyEmailSuccessfulActivity(str2, str));
                }
                Map read = HmlNdidSelectIdpActivity.read((List) arrayList);
                onGetStartedClick.write((Object) read, "params");
                String[] strArr = {"name", "source"};
                onGetStartedClick.write((Object) strArr, "elements");
                onGetStartedClick.write((Object) strArr, "$this$asList");
                List asList = Arrays.asList(strArr);
                onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                if (read.keySet().containsAll(asList)) {
                    String str3 = (String) read.get("name");
                    if (str3 == null) {
                        str3 = str;
                    }
                    if (str3.length() > 0) {
                        String str4 = (String) read.get("source");
                        if (str4 != null) {
                            str = str4;
                        }
                        if (str.length() > 0) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    OffsetDateTime now = OffsetDateTime.now();
                    onGetStartedClick.IconCompatParcelizer((Object) now, "now");
                    removealloccurrences.write(new C6505x27b2fe35((String) read.get("name"), "external", (String) read.get("source"), now));
                    return;
                }
                return;
            }
            onCheckBoxClick.read("Cannot save sticky params due to URI is not a hierarchical URI.", new Object[0]);
        }
    }
}
