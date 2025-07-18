<<<<<<< HEAD
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package util;

import java.util.Locale;
import java.util.StringTokenizer;

/**
 * Processes a cookie header and attempts to obfuscate any cookie values that
 * represent session IDs from other web applications. Since session cookie names
 * are configurable, as are session ID lengths, this filter is not expected to
 * be 100% effective.
 *
 * It is required that the examples web application is removed in security
 * conscious environments as documented in the Security How-To. This filter is
 * intended to reduce the impact of failing to follow that advice. A failure by
 * this filter to obfuscate a session ID or similar value is not a security
 * vulnerability. In such instances the vulnerability is the failure to remove
 * the examples web application.
 */
public class CookieFilter {

    private static final String OBFUSCATED = "[obfuscated]";

    private CookieFilter() {
        // Hide default constructor
    }

    public static String filter(String cookieHeader, String sessionId) {

        StringBuilder sb = new StringBuilder(cookieHeader.length());

        // Cookie name value pairs are ';' separated.
        // Session IDs don't use ; in the value so don't worry about quoted
        // values that contain ;
        StringTokenizer st = new StringTokenizer(cookieHeader, ";");

        boolean first = true;
        while (st.hasMoreTokens()) {
            if (first) {
                first = false;
            } else {
                sb.append(';');
            }
            sb.append(filterNameValuePair(st.nextToken(), sessionId));
        }


        return sb.toString();
    }

    private static String filterNameValuePair(String input, String sessionId) {
        int i = input.indexOf('=');
        if (i == -1) {
            return input;
        }
        String name = input.substring(0, i);
        String value = input.substring(i + 1);

        return name + "=" + filter(name, value, sessionId);
    }

    public static String filter(String cookieName, String cookieValue, String sessionId) {
        if (cookieName.toLowerCase(Locale.ENGLISH).contains("jsessionid") &&
                (sessionId == null || !cookieValue.contains(sessionId))) {
            cookieValue = OBFUSCATED;
        }

        return cookieValue;
    }
}
=======
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package util;

import java.util.Locale;
import java.util.StringTokenizer;

/**
 * Processes a cookie header and attempts to obfuscate any cookie values that
 * represent session IDs from other web applications. Since session cookie names
 * are configurable, as are session ID lengths, this filter is not expected to
 * be 100% effective.
 *
 * It is required that the examples web application is removed in security
 * conscious environments as documented in the Security How-To. This filter is
 * intended to reduce the impact of failing to follow that advice. A failure by
 * this filter to obfuscate a session ID or similar value is not a security
 * vulnerability. In such instances the vulnerability is the failure to remove
 * the examples web application.
 */
public class CookieFilter {

    private static final String OBFUSCATED = "[obfuscated]";

    private CookieFilter() {
        // Hide default constructor
    }

    public static String filter(String cookieHeader, String sessionId) {

        StringBuilder sb = new StringBuilder(cookieHeader.length());

        // Cookie name value pairs are ';' separated.
        // Session IDs don't use ; in the value so don't worry about quoted
        // values that contain ;
        StringTokenizer st = new StringTokenizer(cookieHeader, ";");

        boolean first = true;
        while (st.hasMoreTokens()) {
            if (first) {
                first = false;
            } else {
                sb.append(';');
            }
            sb.append(filterNameValuePair(st.nextToken(), sessionId));
        }


        return sb.toString();
    }

    private static String filterNameValuePair(String input, String sessionId) {
        int i = input.indexOf('=');
        if (i == -1) {
            return input;
        }
        String name = input.substring(0, i);
        String value = input.substring(i + 1);

        return name + "=" + filter(name, value, sessionId);
    }

    public static String filter(String cookieName, String cookieValue, String sessionId) {
        if (cookieName.toLowerCase(Locale.ENGLISH).contains("jsessionid") &&
                (sessionId == null || !cookieValue.contains(sessionId))) {
            cookieValue = OBFUSCATED;
        }

        return cookieValue;
    }
}
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
