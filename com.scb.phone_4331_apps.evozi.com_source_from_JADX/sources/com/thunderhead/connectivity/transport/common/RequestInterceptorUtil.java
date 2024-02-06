package com.thunderhead.connectivity.transport.common;

import com.thunderhead.connectivity.transport.ServiceConstants;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessURLInfoFragment;

public final class RequestInterceptorUtil {
    public static String composeSdkVersionHeader() {
        FragmentBuilder_BindHmlNTBBusinessURLInfoFragment PlaybackStateCompat = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat();
        String format = String.format(ServiceConstants.ANDROID_SDK_VERSION_HEADER_VALUE_PATTERN, new Object[]{"8.1.0"});
        if (PlaybackStateCompat == null) {
            return format;
        }
        String str = PlaybackStateCompat.write.get("react-native-version");
        if (!(str == null || str.trim().length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(ServiceConstants.REACT_NATIVE_SDK_VERSION_HEADER_VALUE_PATTERN, new Object[]{str}));
            sb.append("_");
            sb.append(format);
            format = sb.toString();
        }
        String str2 = PlaybackStateCompat.write.get("cordova-version");
        if (str2 == null || str2.trim().length() == 0) {
            return format;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(ServiceConstants.CORDOVA_SDK_VERSION_HEADER_VALUE_PATTERN, new Object[]{str2}));
        sb2.append("_");
        sb2.append(format);
        return sb2.toString();
    }
}
