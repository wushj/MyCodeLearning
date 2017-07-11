package refactor.Day31;

import java.util.Date;
import java.util.List;

/**
 * Created by WU on 2017/7/3.
 * 把原来复杂的条件判断等语句用尽快返回等方式简化代码。
 */
public class Day_24_ArrowheadAntipattern {

    /*---------------------------before--------------------------*/
    public class Security {
        public List list;

        public Security(List list) {
            this.list = list;
        }

        public boolean HasAccess(Date date, String[] arrs, List<String> exemptions) {
            boolean hasPermission = false;

            if (date != null) {
                if (arrs != null) {
                    if (arrs.length == 0) {
                        if (null != exemptions && exemptions.get(0).equals("abc")) {
                            hasPermission = true;
                        }
                    }
                }
            }

            return hasPermission;
        }
    }

    /*---------------------------after---------------------------*/
    public boolean HasAccess2(Date date, String[] arrs, List<String> exemptions) {
        boolean hasPermission = false;

        if (date == null || arrs == null) {
            return false;
        }
        if (arrs.length != 0) {
            return false;
        }
        if (null != exemptions && exemptions.get(0).equals("abc")) {
            return true;
        }

        return false;
    }
}
