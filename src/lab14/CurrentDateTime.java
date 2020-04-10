package lab14;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CurrentDateTime extends SimpleTagSupport{
	private String color;
    private String size;
    @Override
    public void doTag() throws JspException, IOException {
    	LocalDate dNow = LocalDate.now();
        JspWriter out = getJspContext().getOut();
        out.write("<span style='color:"+ color +"; fontSize: "+ size +"'>"+ dNow.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy")) +"</span>");
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public void setSize(String size) {
    	this.size = size;
    }
}
