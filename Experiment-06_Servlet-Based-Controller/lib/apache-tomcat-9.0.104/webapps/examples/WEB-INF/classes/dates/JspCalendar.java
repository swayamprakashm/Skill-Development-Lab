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
package dates;

import java.util.Calendar;
import java.util.Date;

public class JspCalendar {
    final Calendar calendar;

    public JspCalendar() {
        calendar = Calendar.getInstance();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public String getMonth() {
        int m = getMonthInt();
        String[] months = new String [] { "January", "February", "March",
                                        "April", "May", "June",
                                        "July", "August", "September",
                                        "October", "November", "December" };
        if (m > 12) {
            return "Unknown to Man";
        }

        return months[m - 1];

    }

    public String getDay() {
        int x = getDayOfWeek();
        String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday",
                                      "Thursday", "Friday", "Saturday"};

        if (x > 7) {
            return "Unknown to Man";
        }

        return days[x - 1];

    }

    public int getMonthInt() {
        return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDate() {
        return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();

    }

    public String getTime() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }


    public int getSecond() {
        return calendar.get(Calendar.SECOND);
    }

    public static void main(String args[]) {
        JspCalendar db = new JspCalendar();
        p("date: " + db.getDayOfMonth());
        p("year: " + db.getYear());
        p("month: " + db.getMonth());
        p("time: " + db.getTime());
        p("date: " + db.getDate());
        p("Day: " + db.getDay());
        p("DayOfYear: " + db.getDayOfYear());
        p("WeekOfYear: " + db.getWeekOfYear());
        p("era: " + db.getEra());
        p("ampm: " + db.getAMPM());
        p("DST: " + db.getDSTOffset());
        p("ZONE Offset: " + db.getZoneOffset());
        p("TIMEZONE: " + db.getUSTimeZone());
    }

    private static void p(String x) {
        System.out.println(x);
    }


    public int getEra() {
        return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
        String[] zones = new String[] {"Hawaii", "Alaskan", "Pacific",
                                       "Mountain", "Central", "Eastern"};

        return zones[10 + getZoneOffset()];
    }

    public int getZoneOffset() {
        return calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000);
    }


    public int getDSTOffset() {
        return calendar.get(Calendar.DST_OFFSET)/(60*60*1000);
    }


    public int getAMPM() {
        return calendar.get(Calendar.AM_PM);
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
package dates;

import java.util.Calendar;
import java.util.Date;

public class JspCalendar {
    final Calendar calendar;

    public JspCalendar() {
        calendar = Calendar.getInstance();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public String getMonth() {
        int m = getMonthInt();
        String[] months = new String [] { "January", "February", "March",
                                        "April", "May", "June",
                                        "July", "August", "September",
                                        "October", "November", "December" };
        if (m > 12) {
            return "Unknown to Man";
        }

        return months[m - 1];

    }

    public String getDay() {
        int x = getDayOfWeek();
        String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday",
                                      "Thursday", "Friday", "Saturday"};

        if (x > 7) {
            return "Unknown to Man";
        }

        return days[x - 1];

    }

    public int getMonthInt() {
        return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDate() {
        return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();

    }

    public String getTime() {
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }


    public int getSecond() {
        return calendar.get(Calendar.SECOND);
    }

    public static void main(String args[]) {
        JspCalendar db = new JspCalendar();
        p("date: " + db.getDayOfMonth());
        p("year: " + db.getYear());
        p("month: " + db.getMonth());
        p("time: " + db.getTime());
        p("date: " + db.getDate());
        p("Day: " + db.getDay());
        p("DayOfYear: " + db.getDayOfYear());
        p("WeekOfYear: " + db.getWeekOfYear());
        p("era: " + db.getEra());
        p("ampm: " + db.getAMPM());
        p("DST: " + db.getDSTOffset());
        p("ZONE Offset: " + db.getZoneOffset());
        p("TIMEZONE: " + db.getUSTimeZone());
    }

    private static void p(String x) {
        System.out.println(x);
    }


    public int getEra() {
        return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
        String[] zones = new String[] {"Hawaii", "Alaskan", "Pacific",
                                       "Mountain", "Central", "Eastern"};

        return zones[10 + getZoneOffset()];
    }

    public int getZoneOffset() {
        return calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000);
    }


    public int getDSTOffset() {
        return calendar.get(Calendar.DST_OFFSET)/(60*60*1000);
    }


    public int getAMPM() {
        return calendar.get(Calendar.AM_PM);
    }
}

>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
