package p040o;

/* renamed from: o.btnScanAgainClicked */
public final class btnScanAgainClicked implements ProfileManagementActivity {
    public static final btnScanAgainClicked MediaBrowserCompat$CustomActionResultReceiver = new btnScanAgainClicked();
    private static final String[][] write;

    static {
        String[][] strArr = {null, new String[3], new String[8], new String[8], new String[25], new String[8]};
        write = strArr;
        strArr[2][0] = "OK";
        strArr[2][1] = "Created";
        strArr[2][2] = "Accepted";
        strArr[2][4] = "No Content";
        strArr[3][1] = "Moved Permanently";
        strArr[3][2] = "Moved Temporarily";
        strArr[3][4] = "Not Modified";
        strArr[4][0] = "Bad Request";
        strArr[4][1] = "Unauthorized";
        strArr[4][3] = "Forbidden";
        strArr[4][4] = "Not Found";
        strArr[5][0] = "Internal Server Error";
        strArr[5][1] = "Not Implemented";
        strArr[5][2] = "Bad Gateway";
        strArr[5][3] = "Service Unavailable";
        strArr[1][0] = "Continue";
        strArr[3][7] = "Temporary Redirect";
        strArr[4][5] = "Method Not Allowed";
        strArr[4][9] = "Conflict";
        strArr[4][12] = "Precondition Failed";
        strArr[4][13] = "Request Too Long";
        strArr[4][14] = "Request-URI Too Long";
        strArr[4][15] = "Unsupported Media Type";
        strArr[3][0] = "Multiple Choices";
        strArr[3][3] = "See Other";
        strArr[3][5] = "Use Proxy";
        strArr[4][2] = "Payment Required";
        strArr[4][6] = "Not Acceptable";
        strArr[4][7] = "Proxy Authentication Required";
        strArr[4][8] = "Request Timeout";
        strArr[1][1] = "Switching Protocols";
        strArr[2][3] = "Non Authoritative Information";
        strArr[2][5] = "Reset Content";
        strArr[2][6] = "Partial Content";
        strArr[5][4] = "Gateway Timeout";
        strArr[5][5] = "Http Version Not Supported";
        strArr[4][10] = "Gone";
        strArr[4][11] = "Length Required";
        strArr[4][16] = "Requested Range Not Satisfiable";
        strArr[4][17] = "Expectation Failed";
        strArr[1][2] = "Processing";
        strArr[2][7] = "Multi-Status";
        strArr[4][22] = "Unprocessable Entity";
        strArr[4][19] = "Insufficient Space On Resource";
        strArr[4][20] = "Method Failure";
        strArr[4][23] = "Locked";
        strArr[5][7] = "Insufficient Storage";
        strArr[4][24] = "Failed Dependency";
    }

    protected btnScanAgainClicked() {
    }

    public final String IconCompatParcelizer(int i) {
        boolean z = i >= 100 && i < 600;
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown category for status code ");
        sb.append(i);
        String obj = sb.toString();
        if (z) {
            int i2 = i / 100;
            int i3 = i - (i2 * 100);
            String[][] strArr = write;
            if (strArr[i2].length > i3) {
                return strArr[i2][i3];
            }
            return null;
        }
        throw new IllegalArgumentException(obj);
    }
}
