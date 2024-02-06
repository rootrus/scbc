package com.thunderhead.connectivity.transport;

import java.util.concurrent.TimeUnit;

public interface ServiceConstants {
    public static final int ALLOWED_INTERACTIONS_API_CONNECT_TIMEOUT_RUNTIME = 5;
    public static final int ALLOWED_INTERACTIONS_API_READ_TIMEOUT_RUNTIME = 20;
    public static final String ANDROID_SDK_VERSION_HEADER_VALUE_PATTERN = "ANDROID_%s";
    public static final int CONNECT_TIMEOUT = 15;
    public static final int CONNECT_TIMEOUT_RUNTIME = 5;
    public static final String CORDOVA_SDK_VERSION_HEADER_VALUE_PATTERN = "CORDOVA_%s";
    public static final String HEADER_COOKIE = "Cookie";
    public static final String HEADER_SET_COOKIE = "set-cookie";
    public static final String HEADER_X_ONE_SDKAPPNAME = "X-ONE-SdkAppName";
    public static final String HEADER_X_ONE_SDKVER = "X-ONE-SdkVer";
    public static final String HEADER_X_ONE_TIMESTAMP = "X-ONE-Timestamp";
    public static final int NOTIFICATION_CONNECT_TIMEOUT_RUNTIME = 5;
    public static final int NOTIFICATION_READ_TIMEOUT_RUNTIME = 10;
    public static final String PS_CUSTOMER_METADATA_ID = "customerMetaData-id";
    public static final String PS_WORKSPACE_ID = "workspace-id";
    public static final String PS_WORKSPACE_ID_PATH_SEGMENT = "{workspace-id}";
    public static final String REACT_NATIVE_SDK_VERSION_HEADER_VALUE_PATTERN = "REACT_NATIVE_%s";
    public static final int READ_TIMEOUT = 15;
    public static final int READ_TIMEOUT_RUNTIME = 5;
    public static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
}
