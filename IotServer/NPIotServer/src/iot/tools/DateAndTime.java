package iot.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    public static String getCurrentTimeAsStr() {
        //TODO ���Ǵ��������ֱ����ʱ���
        return df.format(new Date());
    }
    
}
