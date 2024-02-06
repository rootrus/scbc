package p040o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.DeejungTransferMinFullReviewActivity */
public final class DeejungTransferMinFullReviewActivity {
    private static final Map<Integer, Integer> read = new HashMap();
    private static final Map<Integer, Integer> write = new HashMap();

    static {
        read.put(17, Integer.valueOf(C6555xdccae8ee.th_something_went_wrong));
        read.put(4, Integer.valueOf(C6555xdccae8ee.th_authentication_error));
        read.put(3, Integer.valueOf(C6555xdccae8ee.th_session_expired));
        read.put(6, Integer.valueOf(C6555xdccae8ee.th_authorization_error));
        read.put(21, Integer.valueOf(C6555xdccae8ee.th_session_expired));
        read.put(18, Integer.valueOf(C6555xdccae8ee.th_something_went_wrong));
        read.put(8, Integer.valueOf(C6555xdccae8ee.th_conflict));
        read.put(9, Integer.valueOf(C6555xdccae8ee.th_one_is_unavailable));
        read.put(16, Integer.valueOf(C6555xdccae8ee.th_one_is_unavailable));
        read.put(19, Integer.valueOf(C6555xdccae8ee.th_connection_error));
        read.put(2, Integer.valueOf(C6555xdccae8ee.th_connection_error));
        read.put(5, Integer.valueOf(C6555xdccae8ee.th_unable_to_submit_request));
        read.put(20, Integer.valueOf(C6555xdccae8ee.th_error));
        read.put(7, Integer.valueOf(C6555xdccae8ee.th_no_interactions_detected_title));
        write.put(17, Integer.valueOf(C6555xdccae8ee.th_unknown_request));
        write.put(4, Integer.valueOf(C6555xdccae8ee.th_incorrect_username_or_password_message));
        write.put(3, Integer.valueOf(C6555xdccae8ee.th_your_session_has_expired));
        write.put(6, Integer.valueOf(C6555xdccae8ee.th_you_do_not_have_permission));
        write.put(21, Integer.valueOf(C6555xdccae8ee.th_your_session_has_expired));
        write.put(18, Integer.valueOf(C6555xdccae8ee.th_your_request_has_timed_out));
        write.put(8, Integer.valueOf(C6555xdccae8ee.th_please_check_your_parameters_send));
        write.put(9, Integer.valueOf(C6555xdccae8ee.th_one_is_currently_experiencing_difficulties));
        write.put(16, Integer.valueOf(C6555xdccae8ee.th_one_is_currently_being_serviced));
        write.put(19, Integer.valueOf(C6555xdccae8ee.th_please_check_your_internet_connection));
        write.put(2, Integer.valueOf(C6555xdccae8ee.th_please_check_your_internet_connection));
        write.put(5, Integer.valueOf(C6555xdccae8ee.th_server_cannot_accept_this_request));
        write.put(20, Integer.valueOf(C6555xdccae8ee.th_empty_workspace_id));
        write.put(7, Integer.valueOf(C6555xdccae8ee.th_no_interactions_detected_message));
    }

    public static String write(Context context, int i) {
        if (i == 22) {
            return context.getString(C6555xdccae8ee.th_get_fragment_failure_title, new Object[]{22});
        } else if (read.containsKey(Integer.valueOf(i))) {
            return context.getString(read.get(Integer.valueOf(i)).intValue());
        } else {
            return context.getString(C6555xdccae8ee.th_something_went_wrong);
        }
    }

    public static String read(Context context, int i) {
        if (i == 22) {
            return context.getString(C6555xdccae8ee.th_get_fragment_failure_message, new Object[]{22});
        } else if (write.containsKey(Integer.valueOf(i))) {
            return context.getString(write.get(Integer.valueOf(i)).intValue());
        } else {
            return context.getString(C6555xdccae8ee.th_an_error_has_occurred);
        }
    }
}
