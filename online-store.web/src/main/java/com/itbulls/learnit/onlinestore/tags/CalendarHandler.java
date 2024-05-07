package com.itbulls.learnit.onlinestore.tags;

import java.util.Calendar;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CalendarHandler extends SimpleTagSupport {

    public int doStartTag() {
        JspWriter out = getJspContext().getOut();

        try {
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Mon</th>");
            out.println("<th>Tue</th>");
            out.println("<th>Wed</th>");
            out.println("<th>Thu</th>");
            out.println("<th>Fri</th>");
            out.println("<th>Sat</th>");
            out.println("<th>Sun</th>");
            out.println("</tr>");

            out.println(Calendar.getInstance().getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }

}
