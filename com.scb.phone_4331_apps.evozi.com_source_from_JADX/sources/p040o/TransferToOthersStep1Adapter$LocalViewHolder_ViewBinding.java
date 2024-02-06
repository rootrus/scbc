package p040o;

import android.location.Address;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.TransferToOthersStep1Adapter$LocalViewHolder_ViewBinding */
final class TransferToOthersStep1Adapter$LocalViewHolder_ViewBinding implements AccountSummaryDeepLinkActivity<List<Address>> {
    private final Locale MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private final double read;
    private final double write;

    TransferToOthersStep1Adapter$LocalViewHolder_ViewBinding(Locale locale, double d, double d2, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = locale;
        this.write = d;
        this.read = d2;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void read(onOkClick<List<Address>> onokclick) throws Exception {
        try {
            List<Address> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            if (!onokclick.isDisposed()) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                onokclick.MediaBrowserCompat$CustomActionResultReceiver();
            }
        } catch (Exception e) {
            if (!onokclick.isDisposed()) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver((Throwable) e);
            }
        }
    }

    private List<Address> MediaBrowserCompat$ItemReceiver() throws IOException, JSONException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(String.format(Locale.ENGLISH, "http://maps.googleapis.com/maps/api/geocode/json?latlng=%1$f,%2$f&sensor=true&language=%3$s", new Object[]{Double.valueOf(this.write), Double.valueOf(this.read), this.MediaBrowserCompat$CustomActionResultReceiver.getLanguage()})).openConnection();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            JSONObject jSONObject = new JSONObject(sb.toString());
            if ("ZERO_RESULTS".equalsIgnoreCase(jSONObject.getString("status"))) {
                return Collections.emptyList();
            }
            if ("OK".equalsIgnoreCase(jSONObject.getString("status"))) {
                JSONArray jSONArray = jSONObject.getJSONArray("results");
                int i = 0;
                while (i < jSONArray.length() && i < this.MediaBrowserCompat$ItemReceiver) {
                    Address address = new Address(Locale.getDefault());
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("address_components");
                    String str = "";
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        String string = jSONArray2.getJSONObject(i2).getString("long_name");
                        String string2 = jSONArray2.getJSONObject(i2).getString("short_name");
                        String string3 = jSONArray2.getJSONObject(i2).getJSONArray("types").getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            if (string3.equalsIgnoreCase("street_number")) {
                                if (!TextUtils.isEmpty(str)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append(" ");
                                    sb2.append(string);
                                    str = sb2.toString();
                                }
                            } else if (string3.equalsIgnoreCase("route")) {
                                if (!TextUtils.isEmpty(str)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(string);
                                    sb3.append(" ");
                                    sb3.append(str);
                                    str = sb3.toString();
                                }
                            } else if (string3.equalsIgnoreCase("sublocality")) {
                                address.setSubLocality(string);
                            } else if (string3.equalsIgnoreCase("locality")) {
                                address.setLocality(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_2")) {
                                address.setSubAdminArea(string);
                            } else if (string3.equalsIgnoreCase("administrative_area_level_1")) {
                                address.setAdminArea(string);
                            } else if (string3.equalsIgnoreCase("country")) {
                                address.setCountryName(string);
                                address.setCountryCode(string2);
                            } else if (string3.equalsIgnoreCase("postal_code")) {
                                address.setPostalCode(string);
                            }
                            str = string;
                        }
                    }
                    String string4 = jSONObject2.getString("formatted_address");
                    if (!TextUtils.isEmpty(string4)) {
                        String[] split = string4.split(",");
                        for (int i3 = 0; i3 < split.length; i3++) {
                            address.setAddressLine(i3, split[i3].trim());
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        address.setAddressLine(0, str);
                    }
                    arrayList.add(address);
                    i++;
                }
                httpURLConnection.disconnect();
                return Collections.unmodifiableList(arrayList);
            }
            throw new RuntimeException("Wrong API response");
        } finally {
            httpURLConnection.disconnect();
        }
    }
}
