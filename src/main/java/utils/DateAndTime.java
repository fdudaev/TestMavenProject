package utils;

import org.apache.poi.hpsf.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateAndTime {

    public String getCurrentDateTime(){
        DateFormat customFormat = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss");
        Date currentDate = new Date();
        return customFormat.format(currentDate);
    }

}
